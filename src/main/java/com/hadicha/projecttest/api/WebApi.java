package com.hadicha.projecttest.api;

import com.hadicha.projecttest.dto.WebSocketRequest;
import com.hadicha.projecttest.dto.WebSocketResponse;
import com.hadicha.projecttest.model.WebSocket;
import com.hadicha.projecttest.service.Service;
import com.hadicha.projecttest.service.serviceimpl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/web")
public class WebApi {
    private final ServiceImpl service;
    @PostMapping
    public WebSocketResponse crete(@RequestBody WebSocketRequest request){
        return service.save(request);

    }
    @PostMapping("/baza")
    public List<WebSocket> save(WebSocketResponse response){

        if (response.getContent().equals("logs")){
            return service.get();
        }
        return service.get();
    }
}
