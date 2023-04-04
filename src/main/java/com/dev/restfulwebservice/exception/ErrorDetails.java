package com.dev.restfulwebservice.exception;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
    // Timestamp, message, details
    private LocalDateTime timeStamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timeStamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
