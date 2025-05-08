package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Message;
import java.util.List;

/**
 * Repository interface for Message entity operations.
 * Extends JpaRepository to provide standard data access operations.
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
    /**
     * Finds and retrieves a list of Message entities that were posted by a specific account.
     *
     * @param accountId the ID of the account that posted the messages
     * @return a list of Message objects posted by the specified account
     */
    List<Message> findMessagesByPostedBy(Integer accountId);
}
