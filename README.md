# Overview
This repository demonstrates how to implement JWT (JSON Web Token) based authentication and authorization using Spring Security 6. The project showcases how to secure RESTful APIs, manage user roles and permissions, and handle token-based authentication in a Spring Boot application.

# Features
Spring Security 6 Integration: Utilizes the latest Spring Security 6 features for robust security.
JWT Authentication: Implements JWT for stateless authentication, providing secure access to APIs.
Role-Based Authorization: Demonstrates role-based access control (RBAC) to restrict resources based on user roles.
Custom Exception Handling: Centralized exception handling for security-related issues.
Token Management: Handles token creation, validation, and expiration.
# Endpoints
/auth/login: Authenticates a user and returns a JWT token.
/auth/register: Registers a new user in the system.
/api/user: Accessible by users with the USER role.
/api/admin: Accessible only by users with the ADMIN role.
# Testing the API
Use a tool like Postman or cURL to test the API endpoints.
