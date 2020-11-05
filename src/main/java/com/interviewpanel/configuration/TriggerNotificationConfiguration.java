package com.interviewpanel.configuration;

 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.interviewpanel.notification.TriggerNotification;
@Configuration
public class TriggerNotificationConfiguration {
    @Bean
    public TriggerNotification triggerNotification() {
        return new TriggerNotification();
    }
}
