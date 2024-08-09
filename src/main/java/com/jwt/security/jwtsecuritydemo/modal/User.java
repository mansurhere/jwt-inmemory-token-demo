package com.jwt.security.jwtsecuritydemo.modal;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class User {
    private String userId;
    private String name;
    private String email;
}
