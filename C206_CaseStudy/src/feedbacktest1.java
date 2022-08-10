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
	 private ArrayList<Feedback> arraylistfeedback = new ArrayList<Feedback>();
	 private feedbackmenu menu = new feedbackmenu();
	 
	@Before
	public void setUp() throws Exception {
		  Feedback1 = new Feedback("1", "Jerry", "1234","1", "Jerry");
		  Feedback2 = new Feedback("2", "sus", "248", "sus", "248");
		  Feedback3 = new Feedback("3", "Dale", "T21", "Dale", "T21");
		  Feedback4 = new Feedback("4", "Hank", "P0n", "Hank", "P0n");
	}
	@Test
	public void testAddFeedback() {
		  
		  // feedback list is not null, so that can add a new feedback
		  assertNotNull("Test if there is valid Feedback arraylist to add to", arraylistfeedback);
		  
		  //Given an empty list, after adding 1 feedback, the size of the list is 1
		  menu.addFeedbackadding(arraylistfeedback, Feedback1);
		  assertEquals("Test if that feedback arraylist size is 1?", 1, arraylistfeedback.size());
		  
		  //The feedback just added is as same as the first feedback of the list
		  assertSame("Test that feedback is added same as 1st feedback of the list?", Feedback1, arraylistfeedback.get(0));
		  
		  //Add another feedback. test The size of the list is 2?
		  menu.addFeedbackadding(arraylistfeedback, Feedback2);
		  menu.addFeedbackadding(arraylistfeedback, Feedback3);
		  assertEquals("Test that feedback arraylist size is 3?", 3, arraylistfeedback.size());
		  assertSame("Test that feedback is added same as 3rd feedback of the list?", Feedback3, arraylistfeedback.get(2)); 
	}
	 @Test
	 public void testRetrieveAllFeedback() {
	  // Test if feedback list is not null but empty, so that can add a new feedback
	    assertNotNull("Test if there is a valid feedback arraylist to add to", arraylistfeedback);
	    
	    //test if the list of feedback retrieved from the Feedback is empty
	    String alluser= menu.ViewAllFeedback(arraylistfeedback);
	    String testOutput = "";
	    assertEquals("Test if there is a valid feedback arraylist to add to", testOutput, alluser);
	      
	    //Given an empty list, after adding 2 items, test if the size of the list is 2
	    menu.addFeedbackadding(arraylistfeedback, Feedback2);
	    menu.addFeedbackadding(arraylistfeedback, Feedback4);
	    assertEquals("Test if the feedback arraylist size is 2?", 2, arraylistfeedback.size());
	    
	    //test if the expected output string same as the list of feedbacks retrieved from Feedback
	    alluser= menu.ViewAllFeedback(arraylistfeedback);
	    testOutput += String.format("%-10s %-30s %-10s\n","User ID" , "Username", "Feedback");
	    testOutput += String.format("%-10s %-30s %-10s\n","sus","sus", "248");
	    testOutput += String.format("%-10s %-30s %-10s\n","Hank",  "Hank", "P0n");
	   
	    assertEquals("Check that ViewAllFeedback works", testOutput, alluser);
	  
	 }
	 public void testDeletingFeedback() {
		  //boundary
		  // feedback list is not null, so that can add a new feedback
		  assertNotNull("Test if there is valid feedback arraylist to add to", arraylistfeedback);
		  
		  menu.addFeedbackadding(arraylistfeedback, Feedback1);
		  menu.addFeedbackadding(arraylistfeedback, Feedback3);
		  
		  //Given an empty list, after adding 1 item, the size of the list is 1
		  menu.deleteFeedback(arraylistfeedback, Feedback1);  
		  assertEquals("Test if that feedback arraylist size is 1?", 1, arraylistfeedback.size());
		  
		  //The item just added is as same as the first item of the list
		  assertSame("Test that feedback is added same as 1st feedback of the list?", Feedback3, arraylistfeedback.get(0));
		  
		  //Add another item. test The size of the list is 2?
		  menu.addFeedbackadding(arraylistfeedback, Feedback2);
		  menu.addFeedbackadding(arraylistfeedback, Feedback4);  
		  menu.deleteFeedback(arraylistfeedback, Feedback4);  
		  assertEquals("Test that feedback arraylist size is 3?", 2, arraylistfeedback.size());
		  assertSame("Test that feedback is added same as 3rd feedback of the list?", Feedback2, arraylistfeedback.get(1)); 
		 }
	@After
	public void tearDown() throws Exception {
		  Feedback1 = null ;
		  Feedback2 = null;
		  Feedback3 = null;
		  Feedback4 =  null ;
		  arraylistfeedback.clear();
	}

	

}
