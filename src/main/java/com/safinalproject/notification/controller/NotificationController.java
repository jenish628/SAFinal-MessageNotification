package com.safinalproject.notification.controller;

import com.safinalproject.notification.dto.NotificationDto;
import com.safinalproject.notification.dto.NotificationResponseDto;
import com.safinalproject.notification.service.NotificationService;
import com.safinalproject.notification.util.AppUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PreDestroy;
import java.util.List;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/")
    public List<NotificationResponseDto> getAllNotifications(){
        return notificationService.getAll();
    }

    @GetMapping("/customer/{cusId}")
    public List<NotificationResponseDto> getByCustomer(@PathVariable Long cusId){
        return notificationService.getByCustomer(cusId);
    }
    @PostMapping("/")
    public void add (@RequestBody NotificationDto notificationDto){
        if (notificationDto.getCustomerId()== null){
            notificationDto.setCustomerId(AppUtil.getCustomerId());
        }
        if(notificationDto.getVin()== null){
            notificationDto.setVin(AppUtil.getVin());
        }
        if(notificationDto.getUser()== null){
            notificationDto.setUser(AppUtil.getCurrentUser());
        }

        notificationService.add(notificationDto);
    }
}
