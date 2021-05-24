package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.JobPositionService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.JobPosition;
@RestController
@RequestMapping("/api/jobpositions")
public class jobPositionController {
	
	private JobPositionService jobPositionService;
	
	
	@Autowired
	public jobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>>getAll(){
		return this.jobPositionService.getAll();
	}
}
