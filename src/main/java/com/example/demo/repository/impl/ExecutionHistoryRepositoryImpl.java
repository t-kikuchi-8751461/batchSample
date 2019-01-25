package com.example.demo.repository.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.ExecutionHistorySelectMapper;
import com.example.demo.mapper.generator.ExecutionHistoryMapper;
import com.example.demo.model.generator.ExecutionHistory;
import com.example.demo.repository.ExecutionHistoryRepository;

import lombok.NonNull;

@Repository
public class ExecutionHistoryRepositoryImpl implements ExecutionHistoryRepository {
    
    @Autowired
    private ExecutionHistorySelectMapper executionHistorySelectMapper;
    
    @Autowired
    private ExecutionHistoryMapper executionHistoryMapper;
    
    @Override
    public LocalDateTime lastSuccessfulTerminationExecutedTime() {
        LocalDateTime t = executionHistorySelectMapper.lastExecutedTime();
        if (t == null) {
            t = LocalDateTime.MIN;
        }
        return t;
    }
    
    @Override
    public void saveExecutionTime(@NonNull LocalDateTime executionTime) {
        ExecutionHistory record = new ExecutionHistory();
        record.setSuccessfulTerminationExecutedAt(executionTime);
        executionHistoryMapper.insertSelective(record);
    }
    
}
