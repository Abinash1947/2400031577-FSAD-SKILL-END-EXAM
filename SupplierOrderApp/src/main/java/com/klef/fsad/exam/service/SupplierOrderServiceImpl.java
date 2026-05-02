package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierOrderServiceImpl implements SupplierOrderService {

    @Autowired
    private SupplierOrderRepository supplierOrderRepository;

    @Override
    public SupplierOrder addSupplierOrder(SupplierOrder supplierOrder) {
        if (supplierOrder.getSupplierOrderId() == null) {
            throw new IllegalArgumentException("Supplier Order ID must not be null. Please provide an ID.");
        }
        return supplierOrderRepository.save(supplierOrder);
    }

    @Override
    public List<SupplierOrder> getAllSupplierOrders() {
        return supplierOrderRepository.findAll();
    }

    @Override
    public Optional<SupplierOrder> getSupplierOrderById(Long id) {
        return supplierOrderRepository.findById(id);
    }
}
