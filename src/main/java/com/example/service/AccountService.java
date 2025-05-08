package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.exception.DuplicateUsernameException;
import com.example.exception.InvalidPasswordException;
import com.example.exception.InvalidUsernameException;
import com.example.repository.AccountRepository;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account registerAccount(Account account) {
        // check if the username is blank
        if (account.getUsername() == null || account.getUsername().isBlank()) {
            throw new InvalidUsernameException("Username cannot be blank");
        }
        // check if the password is at least 4 characters
        if (account.getPassword().length() < 4) {
            throw new InvalidPasswordException("Password must be at least 4 characters");
        }
        // check if the username exists
        Account existingAccount = accountRepository.findByUsername(account.getUsername());
        if (existingAccount != null) {
            throw new DuplicateUsernameException("Username already exists");
        }
        // save the account and return it with the generated ID
        return accountRepository.save(account);
    }
}
