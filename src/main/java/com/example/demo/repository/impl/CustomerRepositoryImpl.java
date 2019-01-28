package com.example.demo.repository.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.generator.Customer;
import com.example.demo.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> select(LocalDateTime from, LocalDateTime to) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void saveCsv(List<Customer> customers) {
        // TODO 自動生成されたメソッド・スタブ

    }

}
