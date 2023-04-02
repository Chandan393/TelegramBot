package com.telegrambot.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

@Component
@Slf4j
public class TelegramNotification {

    public void sendTelegramNotificationToAdmin(String errorMessage) {
        String textMessage = null;

            textMessage = errorMessage;

        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        urlString = String.format(urlString, "5895107265:AAGnAejQevhiwiYEZTqlGo657IlOJZV0syw",
               "-1001831532269", textMessage);
        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
