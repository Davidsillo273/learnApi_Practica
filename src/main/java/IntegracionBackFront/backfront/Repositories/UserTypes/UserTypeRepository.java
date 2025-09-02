package IntegracionBackFront.backfront.Repositories.UserTypes;

import IntegracionBackFront.backfront.Entities.UserTypes.UserTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserTypeEntity, Long> {

}
