package web.djunqueirao.app_rh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.djunqueirao.app_rh.repositories.ExampleRepository;

@Service
public class ExampleService {

	@Autowired
	private ExampleRepository exampleRepository;
}
