package com.safinalproject.notification.service;

import com.safinalproject.notification.dto.NotificationDto;
import com.safinalproject.notification.dto.NotificationResponseDto;
import com.safinalproject.notification.repository.NotificationRepository;

import java.util.List;

public interface NotificationService {

//    public NotificationRepository sendEmail(NotificationDto notificationDto);
//
//    public Long addNotification(NotificationDto notificationDto);

    public List<NotificationResponseDto> getAll();

    public List<NotificationResponseDto> getByCustomer(Long customerId);

    void add(NotificationDto notificationDto);
}
