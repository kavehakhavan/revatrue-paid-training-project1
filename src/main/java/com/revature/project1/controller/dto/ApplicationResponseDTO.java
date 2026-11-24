
package com.revature.project1.controller.dto;

import java.time.OffsetDateTime;

public class ApplicationResponseDTO {

    private Long applicationId;
    private Long userId;
    private String status;
    private Long employeeId;
    private String applicationTimestamp;

    // Constructors
    public ApplicationResponseDTO() {
    }

    public ApplicationResponseDTO(Long applicationId, Long userId, String status, Long employeeId, String applicationTimestamp) {
        this.applicationId = applicationId;
        this.userId = userId;
        this.status = status;
        this.employeeId = employeeId;
        this.applicationTimestamp = applicationTimestamp;
    }

    // Getters and Setters
    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationTimestamp() {
        return applicationTimestamp;
    }

    public void setApplicationTimestamp(String applicationTimestamp) {
        this.applicationTimestamp = applicationTimestamp;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
