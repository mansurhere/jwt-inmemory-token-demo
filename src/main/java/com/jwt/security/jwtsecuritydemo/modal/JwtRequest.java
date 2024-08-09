package com.jwt.security.jwtsecuritydemo.modal;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String user;
    private String password;
}
