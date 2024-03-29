package com.springboot.example.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table retailer
 */
public class Retailer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column retailer.retailer_id_
     *
     * @mbg.generated
     */
    private String retailerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column retailer.name_
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column retailer.telephone_
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column retailer.assress_
     *
     * @mbg.generated
     */
    private String assress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column retailer.status_
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column retailer.create_time_
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column retailer.retailer_id_
     *
     * @return the value of retailer.retailer_id_
     *
     * @mbg.generated
     */
    public String getRetailerId() {
        return retailerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column retailer.retailer_id_
     *
     * @param retailerId the value for retailer.retailer_id_
     *
     * @mbg.generated
     */
    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column retailer.name_
     *
     * @return the value of retailer.name_
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column retailer.name_
     *
     * @param name the value for retailer.name_
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column retailer.telephone_
     *
     * @return the value of retailer.telephone_
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column retailer.telephone_
     *
     * @param telephone the value for retailer.telephone_
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column retailer.assress_
     *
     * @return the value of retailer.assress_
     *
     * @mbg.generated
     */
    public String getAssress() {
        return assress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column retailer.assress_
     *
     * @param assress the value for retailer.assress_
     *
     * @mbg.generated
     */
    public void setAssress(String assress) {
        this.assress = assress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column retailer.status_
     *
     * @return the value of retailer.status_
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column retailer.status_
     *
     * @param status the value for retailer.status_
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column retailer.create_time_
     *
     * @return the value of retailer.create_time_
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column retailer.create_time_
     *
     * @param createTime the value for retailer.create_time_
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}