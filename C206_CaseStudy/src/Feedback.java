
/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Joshua
 * Student ID: 21008053
 * Class: C208
 * Date/Time created: 21/10/2021
 */

/**
 * @author mjsjo
 *
 */
public class Feedback extends Buyer {
 private String Feedback_ID;
 private String Feedback_Description;
 
 
 public Feedback(String UserID, String Username, String password, String feedback_ID, String feedback_Description) {
	super(UserID, Username, password);
	Feedback_ID = feedback_ID;
	Feedback_Description = feedback_Description;
}

public String getFeedback_ID() {
  return Feedback_ID;
 }
 
 public void setFeedback_ID(String feedback_ID) {
  Feedback_ID = feedback_ID;
 }
 
 public String getFeedback_Description() {
  return Feedback_Description;
 }
 
 public void setFeedback_Description(String feedback_Description) {
  Feedback_Description = feedback_Description;
 }
 
 
 
 
 

}
