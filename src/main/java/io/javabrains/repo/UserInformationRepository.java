package io.javabrains.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import io.javabrains.model.UserInformation;

public interface UserInformationRepository extends CrudRepository<UserInformation, Long>{
	List<UserInformation> findByLastName(String lastName);

}
