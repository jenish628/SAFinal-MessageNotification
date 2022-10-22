package com.safinalproject.notification.mapper;

import com.safinalproject.notification.dto.NotificationDto;
import com.safinalproject.notification.dto.NotificationResponseDto;
import com.safinalproject.notification.entity.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Component
public interface NotificationMapper {

    Notification toNotificationEntity (NotificationDto notificationDto);

    NotificationResponseDto toNotificationDto(Notification notification);

    List<NotificationResponseDto> toDtoList (List<Notification> notifications);

}
