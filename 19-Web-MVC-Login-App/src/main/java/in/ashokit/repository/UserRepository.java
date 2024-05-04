package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import in.ashokit.entity.User;


public interface UserRepository extends JpaRepository<User,Integer>{
	
	public List<User> findByName(String name);
}
