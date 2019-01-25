package com.example.demo.service;

public interface ExportService {
    
    /**
     * 顧客情報と製品情報をCSV出力する<br>
     * 前回正常終了した実行時刻から、今回実行時刻の間に新規登録or更新されたデータを対象とする
     */
    void exportCsv();
}
