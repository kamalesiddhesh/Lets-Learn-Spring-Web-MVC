package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository repo;
	
	
	
	public LoginService(UserRepository repo) {
		this.repo = repo;
	}


	public User getUserDetails(String name) {
		
		List<User> users= repo.findByName(name);
		User user = users.get(0);
		
		return user;
		
	}
	
	
	public boolean validateUser(String userid, String password) {
		User user = this.getUserDetails(userid); 
   
		return userid.equals(user.getName())
                && password.equals(user.getPassword());
    }

}
