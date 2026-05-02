package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/supplierorders")
public class SupplierOrderController {

    @Autowired
    private SupplierOrderService supplierOrderService;

    // POST - Add SupplierOrder
    @PostMapping("/add")
    public ResponseEntity<?> addSupplierOrder(@RequestBody SupplierOrder supplierOrder) {
        try {
            SupplierOrder saved = supplierOrderService.addSupplierOrder(supplierOrder);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    // GET - All SupplierOrders
    @GetMapping("/all")
    public ResponseEntity<List<SupplierOrder>> getAllSupplierOrders() {
        return new ResponseEntity<>(supplierOrderService.getAllSupplierOrders(), HttpStatus.OK);
    }

    // GET - By ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getSupplierOrderById(@PathVariable Long id) {
        Optional<SupplierOrder> order = supplierOrderService.getSupplierOrderById(id);
        return order.<ResponseEntity<?>>map(o -> new ResponseEntity<>(o, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>("Supplier Order not found with ID: " + id, HttpStatus.NOT_FOUND));
    }
}
