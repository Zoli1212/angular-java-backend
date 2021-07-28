package com.sha.socialsiteangular;

import com.sha.socialsiteangular.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
public class SocialSiteAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialSiteAngularApplication.class, args);
    }

}
