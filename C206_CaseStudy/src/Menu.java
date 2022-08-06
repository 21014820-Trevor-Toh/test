import java.util.ArrayList;
import java.util.Random;

public class Menu {
	ArrayList<Buyer> UserArrayList = new ArrayList<Buyer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User User = new User(null, null);
		Menu newmenu = new Menu() ;
		newmenu.Start();
	}
	public void  Start() {
		int option = -1 ;
	
		while(option != 4) {
			Menu Menu = new Menu();
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
		System.out.println("1.Create user ");
		System.out.println("2.View all user  ");
		System.out.println("3.Delete a user  ");
		System.out.println("4.Quit");
		Helper.line(50, "=");
	}
	public Buyer addUser() {

		 String UserID = generate();
		 String  Username = Helper.readString("Enter Username of User >");
		 String Password = Helper.readString("Enter Password of User >");

		 Buyer Buyer = new Buyer(UserID,Username,Password);
		
		
		return Buyer;
	}
	public void addUseradding(ArrayList<Buyer> UserArrayList, Buyer Buyer) {
		UserArrayList.add(Buyer);
		
	 }
	public  String ViewAllUser(ArrayList<Buyer> UserArrayList) {
		Buyer you = null ;
		String output = "";
		if(UserArrayList.isEmpty()==false) {
		output = String.format("%-10s %-30s %-10s\n", "User ID" , "Username", "Password");
		for(Buyer userlist : UserArrayList) {
			output += String.format("%-10s %-30s %-10s\n",userlist.getUserID()  ,userlist.getUsername(),userlist.getPassword());
		}
		}
		return output;
	}
	public Buyer deletingalluser() {
		String userid = Helper.readString("Enter the User ID > ");
		 String Username = Helper.readString("Enter Username of User >");
		 String Password = Helper.readString("Enter Password of User >");
		 
		 Buyer user = new Buyer(userid,Username,Password);
		 return user;
	}
	public void deleteuser(ArrayList<Buyer> UserArrayList,Buyer buyer) {
		for(int i = 0 ; i<UserArrayList.size();i++) {
			if(UserArrayList.get(i).getUserID().equalsIgnoreCase(buyer.getUserID())&&UserArrayList.get(i).getUsername().equalsIgnoreCase(buyer.getUsername())&&UserArrayList.get(i).getPassword().equalsIgnoreCase(buyer.getPassword())){
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