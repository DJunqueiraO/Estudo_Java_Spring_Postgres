package web.djunqueirao.app_rh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.djunqueirao.app_rh.model.Example;
import web.djunqueirao.app_rh.services.ExampleService;
import web.djunqueirao.app_rh.utils.JacksonUtils;

@RestController
@RequestMapping("/*")
public class HomeController {
	
	@Autowired
	private ExampleService exampleService;
	
	@GetMapping
	private List<Example> getAll() {
		
		return Arrays.asList(
				JacksonUtils.instanciateByJson("{\"id\":123}", Example.class), 
				new Example(), 
				new Example()
		);
	}
}
