package com.taxback2.config;


import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * Created by Administrator on 6/14/2017.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.taxback2.backend.persistence.repositories")
@EntityScan(basePackages = "com.taxback2.backend.persistence.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {
}
