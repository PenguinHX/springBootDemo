package com.springboot.example.mapper;

import com.springboot.example.model.Accessory;
import java.util.List;

public interface AccessoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessory
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String accessoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessory
     *
     * @mbg.generated
     */
    int insert(Accessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessory
     *
     * @mbg.generated
     */
    Accessory selectByPrimaryKey(String accessoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessory
     *
     * @mbg.generated
     */
    List<Accessory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accessory
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Accessory record);
}