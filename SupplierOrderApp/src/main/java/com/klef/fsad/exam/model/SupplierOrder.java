package com.klef.fsad.exam.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "supplier_orders")
public class SupplierOrder {

    @Id
    @Column(name = "supplier_order_id", nullable = false)
    private Long supplierOrderId;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "supplier_name", nullable = false, length = 150)
    private String supplierName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "delivery_address", length = 255)
    private String deliveryAddress;

    public SupplierOrder() {}

    public Long getSupplierOrderId() { return supplierOrderId; }
    public void setSupplierOrderId(Long supplierOrderId) { this.supplierOrderId = supplierOrderId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) { this.supplierName = supplierName; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }
}
