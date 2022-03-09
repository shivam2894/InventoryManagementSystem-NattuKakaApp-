package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CompanyRepository;
import com.app.pojos.Company;

@Service
@Transactional
public class CompanyServiceImpl implements ICompanyService {
	
	@Autowired
	CompanyRepository companyRepo;

	@Override
	public void registerNewCompany(Company company) {
		
		companyRepo.save(company);

	}

}
