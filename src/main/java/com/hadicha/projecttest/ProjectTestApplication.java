package com.hadicha.projecttest;

import com.hadicha.projecttest.dto.WebSocketResponse;
import com.hadicha.projecttest.dto.mapper.CommandMapper;
import com.hadicha.projecttest.dto.mapper.WebMapperImpl;
import com.hadicha.projecttest.model.WebSocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectTestApplication.class, args);
    }
    @Bean
    public WebMapperImpl<WebSocket, WebSocketResponse> bean(){
        return new WebMapperImpl<>(WebSocket.class,WebSocketResponse.class);
    }

}
