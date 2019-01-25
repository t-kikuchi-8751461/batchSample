package com.example.demo.repository;

import java.time.LocalDateTime;

/**
 * 実行履歴の入出力処理
 */
public interface ExecutionHistoryRepository {
    /**
     * 最後に正常終了した実行時刻を取得
     */
    LocalDateTime lastSuccessfulTerminationExecutedTime();
    
    /**
     * 実行時刻を保存する
     */
    void saveExecutionTime(LocalDateTime executionTime);
}
