package com.hadicha.projecttest.dto.mapper;

import com.hadicha.projecttest.dto.WebSocketResponse;
import com.hadicha.projecttest.model.WebSocket;

public interface CommandMapper<E extends WebSocket, D extends WebSocketResponse> {
    E toEntity(D dto);
    D toDto(E entity);
}
