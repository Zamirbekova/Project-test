package com.hadicha.projecttest.service.serviceimpl;

import com.hadicha.projecttest.dto.WebSocketRequest;
import com.hadicha.projecttest.dto.WebSocketResponse;
import com.hadicha.projecttest.dto.mapper.WebMapperImpl;
import com.hadicha.projecttest.dto.repository.WebSocketRepository;
import com.hadicha.projecttest.model.WebSocket;
import com.hadicha.projecttest.service.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import javax.persistence.Entity;
import javax.websocket.server.ServerEndpoint;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@org.springframework.stereotype.Service
public class ServiceImpl {
    private final WebMapperImpl<WebSocket, WebSocketResponse> mapper;

    private final WebSocketRepository repository;


    public WebSocketResponse save(WebSocketRequest webSocketRequest) {
        return mapper.toDto(repository.save(mapper.create(webSocketRequest)));

    }

    public List<WebSocket> get() {
        WebSocket webSocket = new WebSocket();
        if (webSocket.getCommands().equals("logs")) {
            return repository.findAll();
        }
        return null;


    }
}
