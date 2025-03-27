package com.microservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
     private String fullName;
     private String email;
     private String phone;
     private String role;
     private LocalDateTime createdAt;
     private LocalDateTime updatedAt;

}
