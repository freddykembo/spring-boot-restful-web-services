package com.dev.restfulwebservice.exception;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
    // Timestamp, message, details
    private LocalDateTime Timestamp;
    private String mesage;
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String mesage, String details) {
        Timestamp = timestamp;
        this.mesage = mesage;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return Timestamp;
    }

    public String getMesage() {
        return mesage;
    }

    public String getDetails() {
        return details;
    }
}
