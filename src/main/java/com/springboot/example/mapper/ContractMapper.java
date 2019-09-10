package com.springboot.example.mapper;

import com.springboot.example.model.Contract;
import java.util.List;

public interface ContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String contractId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    int insert(Contract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    Contract selectByPrimaryKey(String contractId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    List<Contract> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Contract record);
}