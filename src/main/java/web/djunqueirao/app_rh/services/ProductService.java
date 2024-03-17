package web.djunqueirao.app_rh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.djunqueirao.app_rh.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository exampleRepository;
}
