
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Menuappointment {
	 ArrayList<Appointment> UserArrayList = new ArrayList<Appointment>();
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    User User = new User(null, null);
    Menuappointment menuappointment = new Menuappointment();
    menuappointment.Start();
  }
  public void Start() {
	  
    int option = -1 ;
    
    while(option != 4) {
      Menuappointment Menu = new Menuappointment();
      Menu.MenuBeforeLogin();
       option = Helper.readInt("Enter the option > ");
      if(option == 1) {
        Menu.addUseradding(UserArrayList, Menu.addUser());
      }
      if(option == 2) {
        System.out.println(Menu.ViewAllUser(UserArrayList));
        
      }
      if(option == 3) {
        Menu.deleteuser(UserArrayList,Menu.deletingalluser());
        
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
    System.out.println("1.Create Appointment  ");
    System.out.println("2.View all Appointment  ");
    System.out.println("3.Delete a Appointment  ");
    System.out.println("4.Quit");
    Helper.line(50, "=");
  }
  public Appointment addUser() {
	 String UserID = Helper.readString("Enter User ID of User >");
     String Username = Helper.readString("Enter Username of User >");
     String Password = Helper.readString("Enter Password of User >");
     String Description = Helper.readString("Enter Description of Appointment >");
     String Date = Helper.readString("Enter the appointment date >");
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
     LocalDateTime Date1 = LocalDateTime.parse(Date, formatter);
     Date = Date1.toString();
     String AppointmentID = generate();
     Appointment Appointment = new Appointment(Username,Password,UserID,Description,Date,AppointmentID);
    return Appointment;
    
  }
  public void addUseradding(ArrayList<Appointment> UserArrayList, Appointment Appointment) {
    UserArrayList.add(Appointment);
   }
  public  String ViewAllUser(ArrayList<Appointment> UserArrayList) {
	Appointment you = null ;
    String output = "";
    if(UserArrayList.isEmpty()==false) {
    output = String.format("%-40s %-30s %-10s\n", "Appointment ID" , "Appointment Date", "Password");
    for(Appointment userlist : UserArrayList) {
      output += String.format("%-40s %-30s %-10s\n",userlist.getAppointmentID()  ,userlist.getDate(),userlist.getPassword());
    }
    }
    return output;
  }
  public Appointment deletingalluser() {
    String userid = Helper.readString("Enter the User ID > ");
     String Username = Helper.readString("Enter Username of User >");
     String Password = Helper.readString("Enter Password of User >");
     String AppointmentID = Helper.readString("Enter the Appointment ID > ");

     
     Appointment user = new Appointment(Username,Password,userid,"","",AppointmentID);
     return user;
  }
  public void deleteuser(ArrayList<Appointment> UserArrayList,Appointment buyer) {
    for(int i = 0 ; i<UserArrayList.size();i++) {
      if(UserArrayList.get(i).getUserID().equalsIgnoreCase(buyer.getUserID())&&UserArrayList.get(i).getUsername().equalsIgnoreCase(buyer.getUsername())&&UserArrayList.get(i).getPassword().equalsIgnoreCase(buyer.getPassword())&&UserArrayList.get(i).getAppointmentID().equalsIgnoreCase(buyer.getAppointmentID())){
        UserArrayList.remove(i);
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
    String UserID = alphabert1+Integer.toString(count2);
    return UserID;
}
}
