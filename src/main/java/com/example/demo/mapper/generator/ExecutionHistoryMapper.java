package com.example.demo.mapper.generator;

import com.example.demo.model.generator.ExecutionHistory;
import com.example.demo.model.generator.ExecutionHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExecutionHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    long countByExample(ExecutionHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int deleteByExample(ExecutionHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int insert(ExecutionHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int insertSelective(ExecutionHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    List<ExecutionHistory> selectByExample(ExecutionHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    ExecutionHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ExecutionHistory record, @Param("example") ExecutionHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ExecutionHistory record, @Param("example") ExecutionHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ExecutionHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table execution_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ExecutionHistory record);
}