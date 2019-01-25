package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.model.generator.Customer;

public interface CustomerRepository {
    
    /**
     * from～toの間に登録/更新のあった顧客情報を取得する
     */
    List<Customer> select(LocalDateTime from, LocalDateTime to);
    
    /**
     * CSVファイルに保存する
     */
    void saveCsv(List<Customer> customers);
    
}
