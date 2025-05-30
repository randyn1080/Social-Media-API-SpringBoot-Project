# Spring Social Media Blog API

## Project Description

An enterprise-grade social media API backend rebuilt using Spring Framework to demonstrate modern development practices and framework-based architecture. Features comprehensive user authentication, message management, and social interaction capabilities leveraging Spring Boot's convention-over-configuration approach, dependency injection, and Spring Data JPA for simplified database operations. This project showcases the power of the Spring ecosystem for rapid enterprise application development.

## Technologies Used

* Spring Boot - version 2.5.5
* Spring Data JPA - version 2.5.5
* Spring Web - version 2.5.5
* H2 Database - version 2.1.214
* Java - version 11
* Maven - version 3.8
* JUnit - version 5
* Mockito - version 4.9.0
* SLF4J - version 1.7.36

## Features

List of features ready and TODOs for future development
* User account registration with comprehensive validation
* Secure user authentication and login system
* Complete message CRUD operations with JPA
* Retrieve all messages with Spring Data repositories
* Get specific messages by ID with automatic mapping
* Retrieve all messages from specific users
* Global exception handling with @RestControllerAdvice
* Dependency injection and IoC container management
* Automatic database schema generation and data initialization

To-do list:
* Implement Spring Security for JWT authentication
* Add pagination with Spring Data Pageable
* Integrate Spring Boot Actuator for monitoring
* Add caching with Spring Cache abstraction
* Implement message search with Spring Data Query Methods
* Add API documentation with SpringDoc OpenAPI

## Getting Started

### Prerequisites
* Java 11 or higher
* Maven 3.6 or higher (for command line build)
* Git
* IntelliJ IDEA (recommended) or any Java IDE

### Clone the repository
git clone https://github.com/randyn1080/Social-Media-API-SpringBoot-Project.git
cd Social-Media-API-SpringBoot-Project

### Option 1: Run with IntelliJ IDEA (Recommended)
1. Open IntelliJ IDEA
2. File → Open → Select the cloned project folder
3. Wait for Maven import to complete (IntelliJ will automatically download dependencies)
4. Navigate to `src/main/java/com/example/SocialMediaApp.java`
5. Right-click on `SocialMediaApp.java` → Run 'SocialMediaApp.main()'
6. Application will start on http://localhost:8080

### Option 2: Command Line (Windows)
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.SocialMediaApp"

### Option 3: Command Line (macOS/Linux/Unix)
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.SocialMediaApp"

> Note: Commands work on all platforms (Windows, macOS, Linux, Unix)
> Maven must be installed and configured in system PATH
> Java must be installed and JAVA_HOME configured
> Spring Boot provides auto-configuration for rapid development

The application will start on http://localhost:8080
Press Ctrl+C in the terminal to stop the application

## Usage

Once the application is running, you can interact with the API using tools like Postman, curl, or any HTTP client. The API provides the same endpoints as the Javalin version but with enhanced Spring Boot features like automatic JSON serialization, global exception handling, and comprehensive logging.

### API Endpoints

**User Registration**
POST /register
Content-Type: application/json

{
    "username": "your_username",
    "password": "your_password"
}

**User Login**
POST /login
Content-Type: application/json

{
    "username": "your_username", 
    "password": "your_password"
}

**Create Message**
POST /messages
Content-Type: application/json

{
    "postedBy": 1,
    "messageText": "Your message here",
    "timePostedEpoch": 1669947792
}

**Get All Messages**
GET /messages

**Get Message by ID**
GET /messages/{messageId}

**Update Message**
PATCH /messages/{messageId}
Content-Type: application/json

{
    "messageText": "Updated message text"
}

**Delete Message**
DELETE /messages/{messageId}

**Get Messages by User**
GET /accounts/{accountId}/messages

### Example Usage with curl

Test user registration:
curl -X POST http://localhost:8080/register -H "Content-Type: application/json" -d "{\"username\":\"testuser\",\"password\":\"password123\"}"

Test getting all messages:
curl http://localhost:8080/messages

### Spring Boot Advantages

This Spring Boot implementation provides several advantages over the Javalin version:
* Automatic dependency injection and configuration
* JPA entities with automatic database mapping
* Global exception handling with proper HTTP status codes
* Comprehensive testing with Spring Boot Test framework
* Simplified database operations with Spring Data repositories
* Built-in logging and monitoring capabilities

## Contributors

Randy Nava

## License

This project uses the following license: MIT License.
