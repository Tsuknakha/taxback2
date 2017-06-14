package com.taxback2.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 6/14/2017.
 */
@Configuration
@Profile("prod")
@PropertySource("file:D:\\.devopsbuddy\\application-prod.properties")
public class ProductionConfig {

}