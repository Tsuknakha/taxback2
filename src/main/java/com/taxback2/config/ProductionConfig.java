package com.taxback2.config;

import com.taxback2.backend.service.EmailService;
import com.taxback2.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by tedonema on 21/03/2016.
 */
@Configuration
@Profile("prod")
@PropertySource("file:C:\\Users\\Administrator\\Desktop\\.devopsbuddy\\application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}
