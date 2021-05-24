package kodlamaio.humanresourcesDemo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.humanresourcesDemo.business.abstracts.UserService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService usersService;

	
	@Autowired
	public UsersController(UserService usersService) {
		super();
		this.usersService = usersService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return this.usersService.getAll();
	}
}
