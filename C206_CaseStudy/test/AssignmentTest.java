

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AssignmentTest {
	private Buyer buyer1;
	private Buyer buyer2;
	private Buyer buyer3;
	private Buyer buyer4;
	private  ArrayList<Buyer> arraylisttest = new ArrayList<Buyer>();
	private Menu menu = new Menu();
	

	@Before
	public void setUp() throws Exception {
		 buyer1 = new Buyer("1", "Joseph", "1234");
		 buyer2 = new Buyer("2", "tan", "1wdnknd");
		 buyer3 = new Buyer("3", "john", "1wdwdowo");
		 buyer4 = new Buyer("4", "Lim", "amomo");
	}
	@Test
	public void testAddingUser() {
		//boundary
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		menu.addUseradding(arraylisttest, buyer1);		
		assertEquals("Test if that user arraylist size is 1?", 1, arraylisttest.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that the user  is added same as 1st item of the list?", buyer1, arraylisttest.get(0));
		
		//Add another item. test The size of the list is 2?
		menu.addUseradding(arraylisttest, buyer2);
		menu.addUseradding(arraylisttest, buyer3);
		assertEquals("Test that user arraylist size is 3?", 3, arraylisttest.size());
		assertSame("Test that user is added same as 3rd item of the list?", buyer3, arraylisttest.get(2));	
	}
	@Test
	public void testRetrieveAllUser() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String alluser= menu.ViewAllUser(arraylisttest);
		String testOutput = "";
		assertEquals("Check that user arraylist", testOutput, alluser);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		menu.addUseradding(arraylisttest, buyer2);
		menu.addUseradding(arraylisttest, buyer4);
		assertEquals("Test if that user arraylist size is 2?", 2, arraylisttest.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		alluser= menu.ViewAllUser(arraylisttest);
		testOutput += String.format("%-10s %-30s %-10s\n", "User ID" , "Username", "Password");
		testOutput += String.format("%-10s %-30s %-10s\n","2", "tan", "1wdnknd");
		testOutput += String.format("%-10s %-30s %-10s\n","4", "Lim", "amomo");
	
		assertEquals("Check that user arraylist", testOutput, alluser);
		
	}
	@Test
	public void testDeletingUser() {
		//boundary
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		menu.addUseradding(arraylisttest, buyer1);
		menu.addUseradding(arraylisttest, buyer3);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		menu.deleteuser(arraylisttest, buyer1);		
		assertEquals("Test if that user arraylist size is 1?", 1, arraylisttest.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that user is added same as 1st item of the list?", buyer3, arraylisttest.get(0));
		
		//Add another item. test The size of the list is 2?
		menu.addUseradding(arraylisttest, buyer2);
		menu.addUseradding(arraylisttest, buyer4);		
		menu.deleteuser(arraylisttest, buyer4);		
		assertEquals("Test that user arraylist size is 3?", 2, arraylisttest.size());
		assertSame("Test that user is added same as 3rd item of the list?", buyer2, arraylisttest.get(1));	
	}
	@After
	public void tearDown() throws Exception {
		buyer1 = null ;
		buyer2 = null;
		buyer3 = null;
		buyer4 =  null ;
		arraylisttest.clear();
	}

	

}
