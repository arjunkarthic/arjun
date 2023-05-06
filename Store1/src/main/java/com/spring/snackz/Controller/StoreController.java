package com.spring.snackz.Controller;
		
	import java.util.List;

				import org.springframework.beans.factory.annotation.Autowired;
				import org.springframework.web.bind.annotation.DeleteMapping;
				import org.springframework.web.bind.annotation.GetMapping;
				import org.springframework.web.bind.annotation.PathVariable;
				import org.springframework.web.bind.annotation.PostMapping;
				import org.springframework.web.bind.annotation.PutMapping;
				import org.springframework.web.bind.annotation.RequestBody;
				import org.springframework.web.bind.annotation.RequestMapping;
				import org.springframework.web.bind.annotation.RestController;

import com.spring.snackz.Model.Store;
import com.spring.snackz.service.StoreService;



				@RestController
				@RequestMapping("/question")
				public class StoreController 
				{
			
					@Autowired
					 public StoreService qser;
					 @PostMapping("")
					 public String saveDetails(@RequestBody Store q)
					 {
						 qser.save(q);
						 return "Data is saved";
					 }
					 @GetMapping(value="/fetch1")
						public List<Store> getAll()
						{
							List<Store> railList=qser.getAll();
							return railList;
						}
						
						
						@PutMapping(value="/update1")
						public Store update(@RequestBody Store r)
						{
							return qser.update(r);
						}
						
						@DeleteMapping(value="/delete1/{sno}")
						public void delete(@PathVariable("sno") int sno)
						{
							qser.delete(sno);
						}
					 
				      
				}		
		
		
	

