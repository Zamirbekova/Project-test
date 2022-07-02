package com.hadicha.projecttest.dto.mapper;

import com.hadicha.projecttest.dto.WebSocketRequest;
import com.hadicha.projecttest.dto.WebSocketResponse;
import com.hadicha.projecttest.dto.repository.WebSocketRepository;
import com.hadicha.projecttest.model.WebSocket;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import javax.websocket.WebSocketContainer;
import java.util.Objects;


public class WebMapperImpl <E extends WebSocket, D extends WebSocketResponse> implements CommandMapper<E, D> {
    public WebSocket create(WebSocketRequest webRequest) {
        if (webRequest == null) {
            return null;
        }
        WebSocket webSocket = new WebSocket();
        webSocket.setCommands(webRequest.getCommands());
        webSocket.setContent(webRequest.getContent());
        webSocket.setAddLog(webRequest.getAddLog());
        webSocket.setSome_text(webRequest.getSome_text()
        );
        return webSocket;
}
    ModelMapper modelMapper;
    public WebMapperImpl(Class<E> entityClass, Class<D> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

    private final Class<E> entityClass;
    private final Class<D> dtoClass;


    @Override
    public E toEntity(D dto) {
        return Objects.isNull(entityClass) ? null : modelMapper.map(dto, entityClass);
    }

    @Override
    public D toDto(E entity) {
        return Objects.isNull(entityClass) ? null : modelMapper.map(entity, dtoClass);
    }


}
