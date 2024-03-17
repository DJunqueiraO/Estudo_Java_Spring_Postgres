package web.djunqueirao.app_rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import web.djunqueirao.app_rh.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}