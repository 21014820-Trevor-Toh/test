

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AssignmentTest3 {
	private Appointment Appointment1;
	private Appointment Appointment2;
	private Appointment Appointment3;
	private Appointment Appointment4;
	private  ArrayList<Appointment> arraylisttest = new ArrayList<Appointment>();
	private Menuappointment menu = new Menuappointment();
	

	@Before
	public void setUp() throws Exception {
		Appointment1 = new Appointment("1", "Joseph", "1234","1", "Joseph", "1234");
		Appointment2 = new Appointment("2", "tan", "1wdnknd","2", "tan", "1wdnknd");
		Appointment3 = new Appointment("3", "john", "1wdwdowo","3", "john", "1wdwdowo");
		Appointment4 = new Appointment("4", "Lim", "amomo","4", "Lim", "amomo");
	}
	@Test
	public void testAddingUser() {
		//boundary
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		menu.addUseradding(arraylisttest, Appointment1);		
		assertEquals("Test if that user arraylist size is 1?", 1, arraylisttest.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that the user  is added same as 1st item of the list?", Appointment1, arraylisttest.get(0));
		
		//Add another item. test The size of the list is 2?
		menu.addUseradding(arraylisttest, Appointment2);
		menu.addUseradding(arraylisttest, Appointment3);
		assertEquals("Test that user arraylist size is 3?", 3, arraylisttest.size());
		assertSame("Test that user is added same as 3rd item of the list?", Appointment3, arraylisttest.get(2));	
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
		menu.addUseradding(arraylisttest, Appointment2);
		menu.addUseradding(arraylisttest, Appointment4);
		assertEquals("Test if that user arraylist size is 2?", 2, arraylisttest.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		alluser= menu.ViewAllUser(arraylisttest);
		testOutput += String.format("%-40s %-30s %-10s\n",  "Appointment ID" , "Appointment Date", "Password");
		testOutput += String.format("%-40s %-30s %-10s\n","1wdnknd", "tan", "1wdnknd","2", "tan", "1wdnknd");
		testOutput += String.format("%-40s %-30s %-10s\n","amomo", "Lim", "amomo","4", "Lim", "amomo");
	
		assertEquals("Check that user arraylist", testOutput, alluser);
		
	}
	@Test
	public void testDeletingUser() {
		//boundary
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		menu.addUseradding(arraylisttest, Appointment1);
		menu.addUseradding(arraylisttest, Appointment3);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		menu.deleteuser(arraylisttest, Appointment3);		
		assertEquals("Test if that user arraylist size is 1?", 1, arraylisttest.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that user is added same as 1st item of the list?", Appointment1, arraylisttest.get(0));
		
		//Add another item. test The size of the list is 2?
		menu.addUseradding(arraylisttest, Appointment2);
		menu.addUseradding(arraylisttest, Appointment4);		
		menu.deleteuser(arraylisttest, Appointment4);		
		assertEquals("Test that user arraylist size is 3?", 2, arraylisttest.size());
		assertSame("Test that user is added same as 3rd item of the list?", Appointment2, arraylisttest.get(1));	
	}
	@After
	public void tearDown() throws Exception {
		Appointment1 = null ;
		Appointment2 = null;
		Appointment3 = null;
		Appointment4 =  null ;
		arraylisttest.clear();
	}

	

}
