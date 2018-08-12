package com.muhacha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cleophas on 2018/08/12.
 */
@Configuration
public class AppConfig {

    @Bean(name = "helloWorld")
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
