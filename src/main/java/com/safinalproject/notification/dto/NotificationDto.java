package com.safinalproject.notification.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotificationDto {
    private String id;
    private String subject;
    private String message;
    private String receiverEmail;
    private Long customerId;
    private String user;
    private Long vin;
}
