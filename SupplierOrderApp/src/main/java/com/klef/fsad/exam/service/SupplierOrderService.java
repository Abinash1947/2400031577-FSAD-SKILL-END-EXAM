package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.SupplierOrder;
import java.util.List;
import java.util.Optional;

public interface SupplierOrderService {
    SupplierOrder addSupplierOrder(SupplierOrder supplierOrder);
    List<SupplierOrder> getAllSupplierOrders();
    Optional<SupplierOrder> getSupplierOrderById(Long id);
}
