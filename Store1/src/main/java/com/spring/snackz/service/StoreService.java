package com.spring.snackz.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.spring.snackz.Model.Store;
import com.spring.snackz.Repository.StoreRepo;

	

	@Service
	
	public class StoreService
	{
		@Autowired
		public StoreRepo qrepo;
		public Store adddetails(Store iml)
		{
			
			return qrepo.save(iml);
		}
		
		public List<Store> getAll() {
			List<Store> railList=qrepo.findAll();
			return railList;
		}

		public Store save(Store r) 
		{
			Store obj=qrepo.save(r);
			return obj;
		}

		public Store update(Store r) {
			Store obj=qrepo.save(r);
			return obj;
		}

		public void delete(int sno)
		{
			qrepo.deleteById(sno);
		}

	}
