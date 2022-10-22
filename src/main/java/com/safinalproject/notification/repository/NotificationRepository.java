package com.safinalproject.notification.repository;

import com.safinalproject.notification.dto.NotificationResponseDto;
import com.safinalproject.notification.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
    List<Notification> findByCustomerId(Long customerId);

//    Optional<Notification> findByCustomerId(Long customerId);

}
