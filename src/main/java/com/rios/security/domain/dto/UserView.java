package com.rios.security.domain.dto;

import lombok.Data;

@Data
public class UserView {
    private Integer id;
    private String username;
    private String token;
}
