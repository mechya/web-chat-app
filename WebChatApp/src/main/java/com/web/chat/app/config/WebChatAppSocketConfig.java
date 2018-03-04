package com.web.chat.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;


@Configuration
@EnableWebSocketMessageBroker
@ComponentScan("com.web.chat.app")
public class WebChatAppSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	  @Override
	    public void configureMessageBroker(MessageBrokerRegistry config) {
	        config.enableSimpleBroker("/topic");//I think sending point
	        config.setApplicationDestinationPrefixes("/app");//I think its like Mapping Point to get messages form Borusers 
	    }
	 
	    @Override
	    public void registerStompEndpoints(StompEndpointRegistry registry) {
	         registry.addEndpoint("/chat").withSockJS();//Connecting Point
	    }
}
