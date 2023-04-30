package NurseryService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.snacks.model.Snacks;

import Nursery.model.Nursery;
import nurseryRepository.java.nurseryStore;

@Service
public class NurService
{
      @Autowired
      public nurseryStore irepo;
      public Nursery saveInfo(Nursery im)
      {
    	  return irepo.save(im);
    			 
      }
      public List<Nursery> getInfo()
      {
    	  return irepo.findAll();
      }
      public void deleteInfo(int id)
      {
    	  irepo.deleteById(id);
      }
   ***** //Get Method
  	public List<Snacks> getSnacks() {
  		return repository.findAll();
  	}
  	//Get by ID Method
  	public Optional<Snacks> getSnackbyId(int id) {
  		return repository.findById(id);
  	}
  	//Post Method
  	public Snacks addSnacks(Snacks snacks) {
  		return repository.save(snacks);
  	}
  	*****
      
}
