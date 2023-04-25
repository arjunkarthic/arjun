package nurseryRepository.java;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Nursery.model.Nursery;

@Repository
public interface nurseryStore extends JpaRepository<Nursery, Integer> {

	

	
}
