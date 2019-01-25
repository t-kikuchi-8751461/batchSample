package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.model.generator.Product;

public interface ProductRepository {

    /**
     * from～toの間に登録/更新のあった製品情報を取得する
     */
    List<Product> select(LocalDateTime from, LocalDateTime to);

    /**
     * CSVファイルに保存する
     */
    void saveCsv(List<Product> product);

}
