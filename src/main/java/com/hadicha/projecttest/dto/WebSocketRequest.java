package com.hadicha.projecttest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSocketRequest {
    private String commands;
    private String addLog;
    private String content;
    private String some_text;
}
