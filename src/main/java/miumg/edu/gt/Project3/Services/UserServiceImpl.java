package miumg.edu.gt.Project3.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miumg.edu.gt.Project3.Entity.User;
import miumg.edu.gt.Project3.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
@Autowired
private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User UpdateUser(User user, long userId) {
		return null;
	}

	@Override
	public void deleteUserById(Long UserId) {
		// TODO Auto-generated method stub
		
	}
	
}
