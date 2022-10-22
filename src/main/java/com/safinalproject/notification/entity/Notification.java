package com.safinalproject.notification.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    private String id;
    private String subject;
    private String message;
    private String receiverEmail;
    private Long customerId;
    private String user;
    private Long vin;
}
