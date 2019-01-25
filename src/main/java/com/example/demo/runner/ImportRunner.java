package com.example.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImportRunner implements ApplicationRunner {
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("ImportRunner.run()");
    }
    
    @Configuration
    public static class ExportRunnerConfig {
        @Bean
        @ConditionalOnProperty(value = { "execute" }, havingValue = "import")
        public static ImportRunner importRunner() {
            return new ImportRunner();
        }
    }
}
