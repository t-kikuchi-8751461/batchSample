package com.example.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.generator.Customer;
import com.example.demo.model.generator.Product;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ExecutionHistoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ExportService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ExportServiceImpl implements ExportService {

    @Autowired
    private ExecutionHistoryRepository executionHistoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void exportCsv() {

        LocalDateTime from = executionHistoryRepository.lastSuccessfulTerminationExecutedTime();
        LocalDateTime to = LocalDateTime.now();
        log.info("前回実行時刻[{}] 今回実行時刻[{}]", from, to);

        // 顧客データの取得
        List<Customer> customers = customerRepository.select(from, to);

        // 製品データの取得
        List<Product> products = productRepository.select(from, to);

        // TODO csv出力用に変換

        // TODO csv出力

    }

}
