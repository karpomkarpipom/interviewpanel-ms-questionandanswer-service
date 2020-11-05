package com.interviewpanel.notification;

 
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

 
public class TriggerNotification {

  private static final Logger LOGGER = LoggerFactory.getLogger(TriggerNotification.class);
  
  @Autowired
  private MessageChannel output;
	
 
  public void send(String payload) {
      LOGGER.info("sending payload='{}' to topic='{}'", payload);
      //kafkaTemplate.send(topic, payload);
      output.send(MessageBuilder.withPayload(payload).build());
      
  }
}