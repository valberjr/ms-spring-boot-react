package com.jr.dsvendas.services;

import com.jr.dsvendas.dto.SellerDTO;
import com.jr.dsvendas.entities.Seller;
import com.jr.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAdll() {
        List<Seller> result = repository.findAll();
        return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }

}
