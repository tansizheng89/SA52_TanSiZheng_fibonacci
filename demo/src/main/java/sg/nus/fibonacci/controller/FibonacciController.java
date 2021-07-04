package sg.nus.fibonacci.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.fibonacci.domain.Element;
import sg.nus.fibonacci.service.RequiredOutput;


@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {
	
	@Autowired
	RequiredOutput outputService;
	
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseBody
	public Map<String,List<Integer>> userInput(@RequestBody Element element) {
		
		return outputService.output(element.getElements());

	}
	

}
