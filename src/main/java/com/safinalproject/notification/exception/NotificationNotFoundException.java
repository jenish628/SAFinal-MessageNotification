package com.safinalproject.notification.exception;

import com.safinalproject.notification.dto.NotificationResponseDto;

public class NotificationNotFoundException extends RuntimeException{

    public NotificationNotFoundException() {
    }

    public NotificationNotFoundException(String message) {
        super(message);
    }
}
