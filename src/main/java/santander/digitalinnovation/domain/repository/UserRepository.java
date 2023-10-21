package santander.digitalinnovation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import santander.digitalinnovation.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsByAccountNumber(String accounNumber);
}
