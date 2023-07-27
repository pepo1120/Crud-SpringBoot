package com.pepo1120.drkrpr;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepo1120.drkrpr.product.Product;

@SpringBootApplication
@RestController
public class DrkrprApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrkrprApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<Product> getNames() {

		return List.of(
				new Product(
						2541L,
						"Laptop",
						500,
						LocalDate.of(2025, Month.AUGUST, 11),
						2));
	}
}
