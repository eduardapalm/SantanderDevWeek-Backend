package com.project.SantandersQuotationSystem.repository;

import com.project.SantandersQuotationSystem.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
