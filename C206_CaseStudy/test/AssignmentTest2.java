

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//test
public class AssignmentTest2 {
	private Bike Bike1;
	private Bike Bike2;
	private Bike Bike3;
	private Bike Bike4;
	private  ArrayList<Bike> arraylisttest = new ArrayList<Bike>();
	private MenuBike menu = new MenuBike();
	

	@Before
	public void setUp() throws Exception {
		Bike1 = new Bike("1", "Joseph", 20.00, "Joseph", "Joseph", "Joseph",false);
		Bike2 = new Bike("2", "tan", 20.00, "tan", "tan", "tan",true);
		Bike3 = new Bike("3", "john", 20.00, "john", "john", "john",false);
		Bike4 = new Bike("4", "Lim", 20.00, "Lim", "Lim", "Lim",true);
	}
	@Test
	public void testAddingUser() {
		//boundary
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		menu.addBikeadding(arraylisttest, Bike1);		
		assertEquals("Test if that user arraylist size is 1?", 1, arraylisttest.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that the user  is added same as 1st item of the list?", Bike1, arraylisttest.get(0));
		
		//Add another item. test The size of the list is 2?
		menu.addBikeadding(arraylisttest, Bike2);
		menu.addBikeadding(arraylisttest, Bike3);
		assertEquals("Test that user arraylist size is 3?", 3, arraylisttest.size());
		assertSame("Test that user is added same as 3rd item of the list?", Bike3, arraylisttest.get(2));	
	}
	@Test
	public void testRetrieveAllUser() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String alluser= menu.ViewAllBike(arraylisttest);
		String testOutput = "";
		assertEquals("Check that user arraylist", testOutput, alluser);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		menu.addBikeadding(arraylisttest, Bike2);
		menu.addBikeadding(arraylisttest, Bike3);
		assertEquals("Test if that user arraylist size is 2?", 2, arraylisttest.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		alluser= menu.ViewAllBike(arraylisttest);
		testOutput += String.format("%-10s %-20s %-10s %-10s %-10s %-10s\n", "List Name:" , "List Decription:", "List Price:" , "Bike Name :" , "Asset Tag :", " Bike Availability :");
		testOutput += String.format("%-10s %-20s %-11.2f %-11s %-12s %-10s\n","tan", "tan", 20.00, "tan", "tan",true);
		testOutput += String.format("%-10s %-20s %-11.2f %-11s %-12s %-10s\n","john", "john", 20.00, "john", "john",false);
	
		assertEquals("Check that user arraylist", testOutput, alluser);
		
	}
	@Test
	public void testDeletingUser() {
		//boundary
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid user arraylist to add to", arraylisttest);
		
		menu.addBikeadding(arraylisttest, Bike1);
		menu.addBikeadding(arraylisttest, Bike3);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		menu.deleteBike(arraylisttest, Bike1.getAssetTag());		
		assertEquals("Test if that user arraylist size is 1?", 1, arraylisttest.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that user is added same as 1st item of the list?", Bike3, arraylisttest.get(0));
		
		//Add another item. test The size of the list is 2?
		menu.addBikeadding(arraylisttest, Bike2);
		menu.addBikeadding(arraylisttest, Bike4);		
		menu.deleteBike(arraylisttest, Bike4.getAssetTag());		
		assertEquals("Test that user arraylist size is 3?", 2, arraylisttest.size());
		assertSame("Test that user is added same as 3rd item of the list?", Bike2, arraylisttest.get(1));	
	}
	@After
	public void tearDown() throws Exception {
		Bike1 = null ;
		Bike2 = null;
		Bike3 = null;
		Bike4 =  null ;
		arraylisttest.clear();
	}

	

}
