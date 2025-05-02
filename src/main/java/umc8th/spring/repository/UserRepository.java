package umc8th.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc8th.spring.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
