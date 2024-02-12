package web.djunqueirao.app_rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import web.djunqueirao.app_rh.model.Example;

public interface ExampleRepository extends JpaRepository<Example, Long> {
	
}