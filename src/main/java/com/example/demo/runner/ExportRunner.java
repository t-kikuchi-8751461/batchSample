package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.ExportService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExportRunner implements ApplicationRunner {
    
    @Autowired
    private ExportService exportService;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("ExportRunner.run()");
        exportService.exportCsv();
    }
    
    @Configuration
    public static class ExportRunnerConfig {
        @Bean
        @ConditionalOnProperty(value = { "execute" }, havingValue = "export")
        public static ExportRunner exportRunner() {
            return new ExportRunner();
        }
    }
}
