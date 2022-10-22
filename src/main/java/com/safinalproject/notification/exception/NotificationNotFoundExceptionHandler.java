package com.safinalproject.notification.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class NotificationNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({NotificationNotFoundException.class})
    public ResponseEntity<Object> handleTheException(Exception e, WebRequest request){
        return ResponseEntity.ok("Notifications not found");
    }
}
