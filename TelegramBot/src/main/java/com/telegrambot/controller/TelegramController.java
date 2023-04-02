package com.telegrambot.controller;

import com.telegrambot.dto.Request;
import com.telegrambot.notification.TelegramNotification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class TelegramController {

    @Autowired
    private TelegramNotification telegramNotification;

@RequestMapping(value= "/bot", method = RequestMethod.POST)
    public void sendNotification(@RequestBody Request request) {
    
       telegramNotification.sendTelegramNotificationToAdmin(request.getErrorMessage());
}

}
