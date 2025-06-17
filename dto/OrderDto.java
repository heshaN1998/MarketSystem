/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author ACER
 */
public class OrderDto {
    private String orderId;
    private String custId;
    private String orderData;

    public OrderDto() {
    }

    public OrderDto(String orderId, String custId, String orderData) {
        this.orderId = orderId;
        this.custId = custId;
        this.orderData = orderData;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the orderData
     */
    public String getOrderData() {
        return orderData;
    }

    /**
     * @param orderData the orderData to set
     */
    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", custId=" + custId + ", orderData=" + orderData + '}';
    }
    
    
}
