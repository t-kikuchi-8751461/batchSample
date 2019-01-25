package com.example.demo.mapper;

import java.time.LocalDateTime;

import org.apache.ibatis.annotations.Select;

public interface ExecutionHistorySelectMapper {
    
    @Select("SELECT successful_termination_executed_at FROM execution_history ORDER BY id DESC LIMIT 1")
    LocalDateTime lastExecutedTime();
}
