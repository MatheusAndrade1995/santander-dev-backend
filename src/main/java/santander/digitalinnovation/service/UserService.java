package santander.digitalinnovation.service;

import santander.digitalinnovation.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User userToCreate);
}
