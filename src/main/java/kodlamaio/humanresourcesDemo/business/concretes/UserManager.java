package kodlamaio.humanresourcesDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.humanresourcesDemo.business.abstracts.UserService;
import kodlamaio.humanresourcesDemo.core.utilities.results.DataResult;
import kodlamaio.humanresourcesDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.humanresourcesDemo.dataAccess.abstracts.UserRepository;
import kodlamaio.humanresourcesDemo.entities.concretes.User;
@Service
public class UserManager implements UserService {

	private UserRepository usersRepository;
	
	@Autowired
	public UserManager(UserRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}


	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<User>>(this.usersRepository.findAll(),"Listed Users");
	}

}
