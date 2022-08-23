package dealersservice.systemdealers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

import com.systemdealers.model.DealersDetails;
import com.systemdealers.repo.DealersRepository;
import com.systemdealers.services.DealerService;


@SpringBootTest
@RunWith(SpringRunner.class)

class SystemDealersApplicationTests {

	
	  @Autowired
	   private DealerService serv;
	   
	   @MockBean
	   private DealersRepository repo;

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
					  .of(new DealersDetails("201","vasim","vasim@gmail.com","vasi@12","9951530422"),
					            new DealersDetails("202","krishna","krishna@gamil.com","krishna@34","7879775790")).collect(Collectors.toList()));

					  assertEquals(2, serv.getAll().size());
					  }
		  
		  
		@Test
		public void saveFarmerTest() {
			DealersDetails user = new DealersDetails("201","vasim","vasim@gmail.com","vasi@12","9951530422");
			when(repo.save(user)).thenReturn(user);
		}


		
		
		  @Test 
		  public void deleteFarmerTest(){ 
		  DealersDetails user = new DealersDetails("201","vasim","vasim@gmail.com","vasi@12","9951530422");
		  serv.deleteDealer(null) ;
		  verify(repo,times(1)).delete(user);
		  
		  
		  }

}

