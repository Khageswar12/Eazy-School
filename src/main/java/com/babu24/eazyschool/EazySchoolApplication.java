package com.babu24.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories("com.babu24.eazyschool.Repositry")
@EntityScan("com.babu24.eazyschool.Model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class EazySchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(EazySchoolApplication.class, args);
    }

}
