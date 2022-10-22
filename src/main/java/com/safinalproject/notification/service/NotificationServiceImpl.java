package com.safinalproject.notification.service;

import com.safinalproject.notification.dto.NotificationDto;
import com.safinalproject.notification.dto.NotificationResponseDto;
import com.safinalproject.notification.entity.Notification;
import com.safinalproject.notification.exception.NotificationNotFoundException;
import com.safinalproject.notification.mapper.NotificationMapper;
import com.safinalproject.notification.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;
    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationMapper notificationMapper, NotificationRepository notificationRepository) {
        this.notificationMapper = notificationMapper;
        this.notificationRepository = notificationRepository;
    }

    @Override
    public List<NotificationResponseDto> getAll() {

        return notificationRepository.findAll()
                .stream()
                .map(a -> toNotificationDto(a))
                .collect(Collectors.toList());
    }

    @Override
    public List<NotificationResponseDto> getByCustomer(Long customerId) {
        List<Notification> notification = notificationRepository.findByCustomerId(customerId);
        if (notification.isEmpty()){
            throw new NotificationNotFoundException();
        }
        return toDtoList(notification);
//        return toDtoList(notificationRepository.findByCustomerId(customerId));
    }

    @Override
    public void add(NotificationDto notificationDto) {
        notificationRepository.save(toNotificationEntity(notificationDto));
    }


    private Notification toNotificationEntity (NotificationDto notificationDto){
        return notificationMapper.toNotificationEntity(notificationDto);
    }
    private NotificationResponseDto toNotificationDto (Notification notification){
        return notificationMapper.toNotificationDto(notification);
    }

    private List<NotificationResponseDto> toDtoList(List<Notification> notification){
        return notificationMapper.toDtoList(notification);
    }
}
