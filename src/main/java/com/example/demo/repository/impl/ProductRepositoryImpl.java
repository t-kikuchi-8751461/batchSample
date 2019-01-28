package com.example.demo.repository.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.generator.Product;
import com.example.demo.repository.ProductRepository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public List<Product> select(LocalDateTime from, LocalDateTime to) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public void saveCsv(List<Product> product) {
        // TODO 自動生成されたメソッド・スタブ

    }

}
