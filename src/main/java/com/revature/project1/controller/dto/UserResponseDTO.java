
package com.revature.project1.controller.dto;

public class UserResponseDTO {

    private Long userId;
    private String username;
    private String role;
    private String email;
    private String firstName;
    private String lastName;

    public UserResponseDTO() {
    }

    public UserResponseDTO(Long userId, String username,
                           String role, String email,
                           String firstName, String lastName) {
        this.userId = userId;
        this.username = username;
        this.role = role;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
