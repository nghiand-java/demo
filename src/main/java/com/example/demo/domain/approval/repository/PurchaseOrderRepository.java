package com.example.demo.domain.approval.repository;


import com.example.demo.domain.approval.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
    PurchaseOrder findById(long id);

}
