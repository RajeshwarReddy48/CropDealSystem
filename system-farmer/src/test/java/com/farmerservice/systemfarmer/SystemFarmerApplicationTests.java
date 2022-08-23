package com.farmerservice.systemfarmer;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.systemfarmer.services.FarmerService;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.systemfarmer.model.CropsDetails;
import com.systemfarmer.repo.CropsRepository;

@SpringBootTest
@RunWith(SpringRunner.class)

class SystemFarmerApplicationTests {

	
	  @Autowired
	   private FarmerService serv;
	   
	   @MockBean
	   private CropsRepository repo;

	   @Test
	   public void testUser()
	   {
		   
	   }

	  @Test
	   void contextLoads(){

	   }
	   @Test
	   public void repoTest()
	   {
		   String className = this.repo.getClass().getName();
		   String packName=this.repo.getClass().getName();
		   System.out.println(className);
		   System.out.println(packName);
	   }



		  @Test 
		  public void getFarmersTest() { 
		       when(repo.findAll()).thenReturn(Stream
					  .of(new CropsDetails("101","1001","carrots","vegetables",1,25,"hyderabad"),
					            new CropsDetails("102","1002","grapes","fruits",25,68,"noida")).collect(Collectors.toList()));

					  assertEquals(2, serv.getAllCrop().size());
					  }
		  
		  
		@Test
		public void saveFarmerTest() {
			CropsDetails user = new CropsDetails("103","1003","spinach","vegetables",1,12 ,"jaipur");
			when(repo.save(user)).thenReturn(user);
			assertEquals(user,serv.addCrop(user));
		}


		
		
		  @Test public void deleteFarmerTest(){ 
		  CropsDetails user = new CropsDetails("103","1003","spinach","vegetables",1,12 ,"jaipur");
		  serv.deleteCrop(null); 
		  verify(repo,times(1)).delete(user);
		  
		  
		  }

}
