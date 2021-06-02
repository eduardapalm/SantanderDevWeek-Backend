package com.project.SantandersQuotationSystem.service;

import com.project.SantandersQuotationSystem.mapper.StockMapper;
import com.project.SantandersQuotationSystem.model.Stock;
import com.project.SantandersQuotationSystem.model.dto.StockDTO;
import com.project.SantandersQuotationSystem.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    @Autowired
    private StockMapper mapper;

    public StockDTO save(StockDTO dto) {
        Stock stock = mapper.toEntity(dto);
        repository.save(stock);
        return dto;
    }
}
