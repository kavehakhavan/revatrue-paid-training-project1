package com.revature.project1.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private Long applicationId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    // possible statuses are APPROVED, DENIED, and PENDING
    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @Column(name = "time_stamp", nullable = false, length = 100)
    private String timeStamp;

    // Constructors
    public Application(){}

    // TODO: for when you need a new app, will generate a time stamp in here and auto populate the status to PENDING
    public Application(Long userId) {
        this.userId = userId;
        this.status = "PENDING";
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

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
