package com.springboot.example.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table accessory
 */
public class Accessory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessory.accessory_id_
     *
     * @mbg.generated
     */
    private String accessoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessory.fruit_id_
     *
     * @mbg.generated
     */
    private String fruitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessory.name_
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessory.price_
     *
     * @mbg.generated
     */
    private String price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessory.create_time_
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessory.accessory_id_
     *
     * @return the value of accessory.accessory_id_
     *
     * @mbg.generated
     */
    public String getAccessoryId() {
        return accessoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessory.accessory_id_
     *
     * @param accessoryId the value for accessory.accessory_id_
     *
     * @mbg.generated
     */
    public void setAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessory.fruit_id_
     *
     * @return the value of accessory.fruit_id_
     *
     * @mbg.generated
     */
    public String getFruitId() {
        return fruitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessory.fruit_id_
     *
     * @param fruitId the value for accessory.fruit_id_
     *
     * @mbg.generated
     */
    public void setFruitId(String fruitId) {
        this.fruitId = fruitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessory.name_
     *
     * @return the value of accessory.name_
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessory.name_
     *
     * @param name the value for accessory.name_
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessory.price_
     *
     * @return the value of accessory.price_
     *
     * @mbg.generated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessory.price_
     *
     * @param price the value for accessory.price_
     *
     * @mbg.generated
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessory.create_time_
     *
     * @return the value of accessory.create_time_
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessory.create_time_
     *
     * @param createTime the value for accessory.create_time_
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}