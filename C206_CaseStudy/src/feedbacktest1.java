import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class feedbacktest1 {
	 private Feedback Feedback1;
	 private Feedback Feedback2;
	 private Feedback Feedback3;
	 private Feedback Feedback4;
	 private ArrayList<Feedback> arraylisttest = new ArrayList<Feedback>();
	 private feedbackmenu menu = new feedbackmenu();
	 
	@Before
	public void setUp() throws Exception {
		 Feedback1 = new Feedback("1", "Joseph", "1234","1", "Joseph");
		  Feedback2 = new Feedback("2", "tan", "1wdnknd", "tan", "1wdnknd");
		  Feedback3 = new Feedback("3", "john", "1wdwdowo", "john", "1wdwdowo");
		  Feedback4 = new Feedback("4", "Lim", "amomo", "Lim", "amomo");
	}
	@Test
	public void test() {
		  //boundary
		  // Item list is not null, so that can add a new item
		  assertNotNull("Test if there is valid Chromebook arraylist to add to", arraylisttest);
		  
		  //Given an empty list, after adding 1 item, the size of the list is 1
		  menu.addFeedbackadding(arraylisttest, Feedback1);
		  assertEquals("Test if that Chromebook arraylist size is 1?", 1, arraylisttest.size());
		  
		  //The item just added is as same as the first item of the list
		  assertSame("Test that Chromebook is added same as 1st item of the list?", Feedback1, arraylisttest.get(0));
		  
		  //Add another item. test The size of the list is 2?
		  menu.addFeedbackadding(arraylisttest, Feedback2);
		  menu.addFeedbackadding(arraylisttest, Feedback3);
		  assertEquals("Test that Chromebook arraylist size is 3?", 3, arraylisttest.size());
		  assertSame("Test that Chromebook is added same as 3rd item of the list?", Feedback3, arraylisttest.get(2)); 
	}
	 @Test
	 public void testRetrieveAllUser() {
	  // Test if Item list is not null but empty, so that can add a new item
	    assertNotNull("Test ifSS there is valid Camcorder arraylist to add to", arraylisttest);
	    
	    //test if the list of camcorders retrieved from the SourceCentre is empty
	    String alluser= menu.ViewAllFeedback(arraylisttest);
	    String testOutput = "";
	    assertEquals("Check that ViewAllCamcorderlist", testOutput, alluser);
	      
	    //Given an empty list, after adding 2 items, test if the size of the list is 2
	    menu.addFeedbackadding(arraylisttest, Feedback2);
	    menu.addFeedbackadding(arraylisttest, Feedback4);
	    assertEquals("Test if that Camcorder arraylist size is 2?", 2, arraylisttest.size());
	    
	    //test if the expected output string same as the list of camcorders retrieved from the SourceCentre
	    alluser= menu.ViewAllFeedback(arraylisttest);
	    testOutput += String.format("%-10s %-30s %-10s\n","User ID" , "Username", "Feedback");
	    testOutput += String.format("%-10s %-30s %-10s\n","tan","tan", "1wdnknd");
	    testOutput += String.format("%-10s %-30s %-10s\n","Lim",  "Lim", "amomo");
	   
	    assertEquals("Check that ViewAllCamcorderlist", testOutput, alluser);
	  
	 }
	 public void testDeletingUser() {
		  //boundary
		  // Item list is not null, so that can add a new item
		  assertNotNull("Test if there is valid Chromebook arraylist to add to", arraylisttest);
		  
		  menu.addFeedbackadding(arraylisttest, Feedback1);
		  menu.addFeedbackadding(arraylisttest, Feedback3);
		  
		  //Given an empty list, after adding 1 item, the size of the list is 1
		  menu.deleteFeedback(arraylisttest, Feedback1);  
		  assertEquals("Test if that Chromebook arraylist size is 1?", 1, arraylisttest.size());
		  
		  //The item just added is as same as the first item of the list
		  assertSame("Test that Chromebook is added same as 1st item of the list?", Feedback3, arraylisttest.get(0));
		  
		  //Add another item. test The size of the list is 2?
		  menu.addFeedbackadding(arraylisttest, Feedback2);
		  menu.addFeedbackadding(arraylisttest, Feedback4);  
		  menu.deleteFeedback(arraylisttest, Feedback4);  
		  assertEquals("Test that Chromebook arraylist size is 3?", 2, arraylisttest.size());
		  assertSame("Test that Chromebook is added same as 3rd item of the list?", Feedback2, arraylisttest.get(1)); 
		 }
	@After
	public void tearDown() throws Exception {
		  Feedback1 = null ;
		  Feedback2 = null;
		  Feedback3 = null;
		  Feedback4 =  null ;
		  arraylisttest.clear();
	}

	

}
