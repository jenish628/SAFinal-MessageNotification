package com.safinalproject.notification.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotificationResponseDto {
    private String id;
    private String subject;
    private String message;
    private String receiverEmail;
    private Long customerId;
    private String user;
    private Long vin;
}
