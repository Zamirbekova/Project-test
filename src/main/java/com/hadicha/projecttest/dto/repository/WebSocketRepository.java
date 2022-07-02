package com.hadicha.projecttest.dto.repository;

import com.hadicha.projecttest.model.WebSocket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSocketRepository extends JpaRepository<WebSocket,Long> {
}
