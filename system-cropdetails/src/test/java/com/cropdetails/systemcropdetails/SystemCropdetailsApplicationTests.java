package com.cropdetails.systemcropdetails;

import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.systemcropdetails.model.CropDetails;
import com.systemcropdetails.repo.CropDetailsRepo;
import com.systemcropdetails.services.CropServices;

@SpringBootTest
@RunWith(SpringRunner.class)

class SystemCropdetailsApplicationTests {

	
	  @Autowired
	   private CropServices serv;
	   
	   @MockBean
	   private CropDetailsRepo repo;

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
					  .of(new CropDetails("101","1001","carrots","vegetables",1,25,"hyderabad"),
					            new CropDetails("102","1002","grapes","fruits",25,68,"noida")).collect(Collectors.toList()));

					  assertEquals(2, serv.getAllCrop().size());
					  }
		  
		  
		@Test
		public void saveFarmerTest() {
			CropDetails user = new CropDetails("103","1003","spinach","vegetables",1,12 ,"jaipur");
			when(repo.save(user)).thenReturn(user);
			assertEquals(user,serv.addCrop(user));
		}


		
		
		  @Test public void deleteFarmerTest(){ 
		  CropDetails user = new CropDetails("103","1003","spinach","vegetables",1,12 ,"jaipur");
		  serv.deleteCrop(null); 
		  verify(repo,times(1)).delete(user);
		  
		  
		  }

}
