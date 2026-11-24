package com.revature.project1.controller.dto;

import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;

public class ApplicationRequestDTO {

    private Long applicationId;

    @NotBlank(message = "User Id is required")
    private Long userId;

    @NotBlank(message = "Status is required")
    private String status;

    private Long employeeId;

    @NotBlank(message = "Time stamp is required")
    private String timeStamp;

    // Constructors
    public ApplicationRequestDTO() {
    }

    public ApplicationRequestDTO(Long userId, String status, String  timeStamp) {
        this.userId = userId;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public ApplicationRequestDTO(Long applicationId, Long userId, String status, Long employeeId, String  timeStamp) {
        this.applicationId = applicationId;
        this.userId = userId;
        this.status = status;
        this.employeeId = employeeId;
        this.timeStamp = timeStamp;
    }

    // Getters and Setters
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String  getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String  timeStamp) {
        this.timeStamp = timeStamp;
    }
}
