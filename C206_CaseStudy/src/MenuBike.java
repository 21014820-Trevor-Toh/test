import java.util.ArrayList;
import java.util.Random;

public class MenuBike {
	ArrayList<Bike> UserArrayList = new ArrayList<Bike>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User User = new User(null, null);
		MenuBike menubike = new MenuBike();
		menubike.Start();
	}
	public void Start() {
		int option = -1 ;
		
		while(option != 4) {
			MenuBike Menu = new MenuBike();
			Menu.MenuBeforeLogin();
			 option = Helper.readInt("Enter the option > ");
			if(option == 1) {
				Menu.addBikeadding(UserArrayList, Menu.AddBike());
			}
			if(option == 2) {
				System.out.println(Menu.ViewAllBike(UserArrayList));
				
			}
			if(option == 3) {
				Menu.deleteBike(UserArrayList,Menu.deletingallBike());
				
			}
			if(option == 4) {
				System.out.println("Thanks you for using the system and have a good day, good bye!");
			}
		}
	}
	public void MenuBeforeLogin() {
		Helper.line(50, "-");
		System.out.println("Bike Listing ");
		Helper.line(50, "-");
		System.out.println("1.Create Listing ");
		System.out.println("2.View all Listing  ");
		System.out.println("3.Delete a Listing  ");
		System.out.println("4.Quit");
		Helper.line(50, "-");
	}

	public Bike AddBike() {
		 String ID = generate();
		 String ListingName = Helper.readString("Enter the Listing Name > ");
		 String AssetTag = generateAssetTag();
		 String ListingDescription = Helper.readString("Enter Listing Description > ");
		 String BikeName = Helper.readString("Enter Bike name > ");
		 Double Listingprice = Helper.readDouble("Enter List Price > $");
		 Boolean Avaibility = Helper.readBoolean("Enter Avability > ");
			

		 Bike Bike = new Bike(ID,AssetTag,Listingprice,ListingDescription,BikeName,ListingName,Avaibility);
		return Bike;
	}
	public void addBikeadding(ArrayList<Bike> UserArrayList, Bike Bike) {
		UserArrayList.add(Bike);
	 }
	public  String ViewAllBike(ArrayList<Bike> UserArrayList) {
		Buyer you = null ;
		String output = "";
		if(UserArrayList.isEmpty()==false) {
		output = String.format("%-10s %-20s %-10s %-10s %-10s %-10s\n", "List Name:" , "List Decription:", "List Price:" , "Bike Name :" , "Asset Tag :", " Bike Availability :");
		for(Bike userlist : UserArrayList) {
			output += String.format("%-10s %-20s %-11.2f %-11s %-12s %-10s\n",userlist.getListingName()  ,userlist.getDicription(),userlist.getPrice(),userlist.getBikeName(),userlist.getAssetTag(),userlist.getAvability());
		}
		}
		return output;
	}
	public String deletingallBike() {
		String AssetTag = Helper.readString("Enter the Asset Tag > ");
		 return AssetTag;
	}
	public void deleteBike(ArrayList<Bike> UserArrayList,String Bike) {
		for(int i = 0 ; i<UserArrayList.size();i++) {
			if(UserArrayList.get(i).getAssetTag().equalsIgnoreCase(Bike)){
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
		   String FeedbackID = alphabert1+Integer.toString(count2);
		   return FeedbackID;
	}
	public String generateAssetTag() {
		  Random random = new Random();
		  int count2 = random.nextInt(9);
		  int count3 = random.nextInt(9);
		  int count4 = random.nextInt(9);
		  int count5 = random.nextInt(9);
		  int count1 = random.nextInt(26);
		  String alphabert = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
		  String[] Stringlist = alphabert.split(",");
		  String alphabert1 =Stringlist[count1];
		   count2 = count2 + 1;
		   String FeedbackID = alphabert1+Integer.toString(count2)+Integer.toString(count3)+Integer.toString(count4)+Integer.toString(count5);
		   return FeedbackID;
	}
}