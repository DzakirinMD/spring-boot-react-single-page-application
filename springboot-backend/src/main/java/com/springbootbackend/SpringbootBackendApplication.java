package com.springbootbackend;

import com.springbootbackend.model.Companies;
import com.springbootbackend.repositories.CompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private CompaniesRepository companiesRepository;

	@Override
	public void run(String... args) {
		Companies compA = new Companies(
				"Generic Co",
				"generic@gmail.com",
				"Shah Ale, Selangor",
				"012-3456789");

		Companies compB = new Companies(
				"Kilang",
				"Kilang@gmail.com",
				"PJ, Selangor",
				"012-3456789");

		Companies compC = new Companies(
				"Cokelat",
				"cokelat@gmail.com",
				"Damansara, Selangor",
				"012-3456789");

		this.companiesRepository.saveAll(List.of(compA,compB,compC));
	}
}
