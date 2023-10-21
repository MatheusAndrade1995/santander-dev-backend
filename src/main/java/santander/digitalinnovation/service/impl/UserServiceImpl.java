package santander.digitalinnovation.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import santander.digitalinnovation.domain.model.User;
import santander.digitalinnovation.domain.repository.UserRepository;
import santander.digitalinnovation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User userToCreate) {
		// TODO Auto-generated method stub
		if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
			throw new IllegalArgumentException("This user acconunt number already exists.");
		}
		return userRepository.save(userToCreate);
	}

}
