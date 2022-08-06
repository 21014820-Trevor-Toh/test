import java.util.ArrayList;
import java.util.Random;

public class feedbackmenu {
	ArrayList<Feedback> FeedbackArrayList = new ArrayList<Feedback>();
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Feedback Feedback = new Feedback(null, null, null, null, null);
  feedbackmenu feedbackmenu = new feedbackmenu() ;
  feedbackmenu.Start();
 }
 public void Start() {
  int option = -1 ;
  
  while(option != 4) {
   feedbackmenu Menu = new feedbackmenu();
   Menu.MenuBeforeLogin();
    option = Helper.readInt("Enter the option > ");
   if(option == 1) {
    Menu.addFeedbackadding(FeedbackArrayList, Menu.addFeedback());
   }
   if(option == 2) {
    System.out.println(Menu.ViewAllFeedback(FeedbackArrayList));
    
   }
   if(option == 3) {
    Menu.deleteFeedback(FeedbackArrayList,Menu.deletingallFeedback());
    
   }
   if(option == 4) {
    System.out.println("Thanks you for using the system and have a good day , good bye !");
   }
  }
 }
 public void MenuBeforeLogin() {
  Helper.line(50, "=");
  System.out.println("My App ");
  Helper.line(50, "=");
  System.out.println("1.Create Feedback ");
  System.out.println("2.View all Feedback  ");
  System.out.println("3.Delete Feedback  ");
  System.out.println("4.Quit");
  Helper.line(50, "=");
 }
 public Feedback addFeedback() {
	String FeedbackID =  generate();
   String FeedbackDescription = Helper.readString("Enter Feedback Description >");
   String FeedbackUserID = Helper.readString("Enter Feedback UserID >");
   String FeedbackUsername = Helper.readString("Enter Your Username  >");
   String FeedbackPassword = Helper.readString("Enter Your Password  >");

   Feedback Feedback = new Feedback(FeedbackUserID,FeedbackUsername,FeedbackPassword,FeedbackID,FeedbackDescription);
  return Feedback;
 }
 public void addFeedbackadding(ArrayList<Feedback> FeedbackArrayList, Feedback Feedback) {
  FeedbackArrayList.add(Feedback);
  }
 public  String ViewAllFeedback(ArrayList<Feedback> FeedbackArrayList) {
  Feedback you = null ;
  String output = "";
  if(FeedbackArrayList.isEmpty()==false) {
  output = String.format("%-10s %-30s %-10s\n", "User ID" , "Username", "Feedback");
  for(Feedback userlist : FeedbackArrayList) {
   output += String.format("%-10s %-30s %-10s\n",userlist.getFeedback_ID()  ,userlist.getUsername(),userlist.getFeedback_Description());
  }
  }
  return output;
 }
 public Feedback deletingallFeedback() {
  String FeedbackUsername = Helper.readString("Enter your Username  > ");
   String FeedbackID = Helper.readString("Enter Feedback ID >");
   String FeedbackUserID = Helper.readString("Enter  User ID >");
   
   Feedback Feedback = new Feedback(FeedbackUserID,FeedbackUsername,"",FeedbackID,"");
   return Feedback;
 }
 public void deleteFeedback(ArrayList<Feedback> FeedbackArrayList,Feedback Feedback) {
  for(int i = 0 ; i<FeedbackArrayList.size();i++) {
   if(FeedbackArrayList.get(i).getFeedback_ID().equalsIgnoreCase(Feedback.getFeedback_ID())&&FeedbackArrayList.get(i).getUsername().equalsIgnoreCase(Feedback.getUsername())&&FeedbackArrayList.get(i).getUserID().equalsIgnoreCase(Feedback.getUserID())){
    FeedbackArrayList.remove(i);
   }
  }
}
public String generate() {
	  Random random = new Random();
	  int count2 = random.nextInt(99) ;
	  int count1 = random.nextInt(26);
	  String alphabert = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
	  String[] Stringlist = alphabert.split(",");
	  String alphabert1 =Stringlist[count1];
	   count2 = count2 + 1;
	   String FeedbackID = alphabert1+Integer.toString(count2);
	   return FeedbackID;
}
}
