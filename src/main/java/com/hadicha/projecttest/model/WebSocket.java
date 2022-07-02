package com.hadicha.projecttest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "web_socket")
@Getter
@Setter
public class WebSocket {
    @Id
    @SequenceGenerator(
            name = "webid_socket",
        sequenceName = "webid_socket",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "webid_socket"
    )
    private Long id;
    private String commands;
    private String addLog;
    private String content;
    private String some_text;

}
