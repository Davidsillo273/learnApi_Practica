package IntegracionBackFront.backfront.Repositories.Users;

import IntegracionBackFront.backfront.Entities.User.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByCorreo(String email);
}
