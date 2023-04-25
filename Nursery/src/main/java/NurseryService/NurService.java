package NurseryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
      
}
