package com.example.demo.modules.approval.repository;


import com.example.demo.modules.approval.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    PurchaseOrder findById(long id);

}
