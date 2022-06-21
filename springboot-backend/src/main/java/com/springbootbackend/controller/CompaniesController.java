package com.springbootbackend.controller;

import com.springbootbackend.model.Companies;
import com.springbootbackend.repositories.CompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/companies")
public class CompaniesController {


    private final CompaniesRepository companiesRepository;

    @Autowired
    public CompaniesController(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }

    @GetMapping("/get-all-companies")
    public List<Companies> getAllCompanies() {
        return this.companiesRepository.findAll();
    }
}