package com.june.API.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties
@Data
public class KakaoProperties {
    private String restapi;
    private String javascript;
    private String clientSecret;
}
