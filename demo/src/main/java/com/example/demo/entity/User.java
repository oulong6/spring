package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.List;
/**
 * @author zjl
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "user")
public class User {
    private Integer id;
    private String username;
    private List<String> book;
}
