import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			C206_CaseStudy casestudy = new C206_CaseStudy();
			casestudy.start();
	}

	
		public void start() {
			ArrayList<Wheels> wheelsList = new ArrayList<Wheels>();
			ArrayList<Seats> seatsList = new ArrayList<Seats>();
			ArrayList<Bells> bellsList = new ArrayList<Bells>();
			
			wheelsList.add(new Wheels("W001", "Cadex 65", 3600, "Carbon"));
			wheelsList.add(new Wheels("W002", "HUNT Race Aero Wide", 580, "Aluminium Alloy"));
			seatsList.add(new Seats("S001", "WYB Speed Saddle", 42, "Steel W Gel Pad"));
			seatsList.add(new Seats("S002", "Bikeroo Oversized Bike Seat", 35, "Faux Leather"));
			bellsList.add(new Bells("BB001", "Electra Ringer", 18, "Aluminium Alloy"));
			bellsList.add(new Bells("BB002", "Schwinn Bike Bell", 28, "Plastic"));
		int option = 0;

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
		
				C206_CaseStudy.viewAllWheels(wheelsList);
				C206_CaseStudy.viewAllSeats(seatsList);
				C206_CaseStudy.viewAllBells(bellsList);

			} else if (option == 2) {
				// Add a new item
				C206_CaseStudy.setHeader("ADD");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Wheels");
				System.out.println("2. Seats");
				System.out.println("3. Bells ");
				
				int itemType = Helper.readInt("Enter option to select bike part > ");

				if (itemType == 1) {
//					// Add wheels
					Wheels wh = inputWheels();
					C206_CaseStudy.addWheels(wheelsList, wh);
					System.out.println("Wheels added!");

				} else if (itemType == 2) {
					// Add seats
					Seats st = inputSeats();
					C206_CaseStudy.addSeats(seatsList, st);
					System.out.println("Seat added!");
				} else if (itemType == 3) {
					// Add bells
					Bells bl = inputBells();
					C206_CaseStudy.addBells(bellsList, bl);
					System.out.println("Bell added!");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				//Delete item
				C206_CaseStudy.setHeader("DELETE");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Wheels");
				System.out.println("2. Seats");
				System.out.println("3. Bells ");
				
				int itemType = Helper.readInt("Enter option to select bike part > ");
				if (itemType == 1) {
					// delete wheels
					C206_CaseStudy.deleteWheels(wheelsList);
				} else if (itemType == 2) {
//					// delete seats
					C206_CaseStudy.deleteSeats(seatsList);
				} else if (itemType == 3) {
//					// delete bells
					C206_CaseStudy.deleteBells(bellsList);
				} else {
					System.out.println("Invalid type");
				}
				

			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

			

	}
		}
	
	
		//test
		//test again
		//test again again
		//test again x4
		//fifth test
		//last test
		

	

	private static void menu() {
		// TODO Auto-generated method stub
		C206_CaseStudy.setHeader("BIKE LOVER'S COMMUNITY ");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add bike parts");
		System.out.println("3. Delete bike parts");
		System.out.println("4. Quit");
		Helper.line(80, "-");
		
	}

	private static void setHeader(String header) {
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
//		Helper.line(80, "-");
		
	}
	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	} 
	//==================================================================================//
	public static String retrieveAllWheels(ArrayList<Wheels> wheelsList) {
		String output = "";

		for (int i = 0; i < wheelsList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-20s %-5s\n", wheelsList.get(i).getAssetTag(),
					wheelsList.get(i).getDescription(), wheelsList.get(i).getAmount(), wheelsList.get(i).getMaterial(),
					C206_CaseStudy.showAvailability(wheelsList.get(i).isAvailable()));
					
		}
		return output;
	}
	public static void viewAllWheels(ArrayList<Wheels> wheelsList) {
		C206_CaseStudy.setHeader("WHEELS LIST");
		String output = String.format("%-10s %-30s %-10s %-20s %-5s\n", "ASSET TAG", "DESCRIPTION",
				"PRICE($)", "MATERIAL","AVAILABLE");
		 output += retrieveAllWheels(wheelsList);	
		System.out.println(output);
	}
	
	public static String retrieveAllSeats(ArrayList<Seats> seatsList) {
		String output = "";

		for (int i = 0; i < seatsList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-20s %-5s\n", seatsList.get(i).getAssetTag(),
					seatsList.get(i).getDescription(), seatsList.get(i).getAmount(), seatsList.get(i).getMaterial(),
					C206_CaseStudy.showAvailability(seatsList.get(i).isAvailable()));
					
		}
		return output;
	}
	public static void viewAllSeats(ArrayList<Seats> seatsList) {
		C206_CaseStudy.setHeader("SEATS LIST");
		String output = String.format("%-10s %-30s %-10s %-20s %-5s\n", "ASSET TAG", "DESCRIPTION",
				"PRICE($)", "MATERIAL","AVAILABLE");
		 output += retrieveAllSeats(seatsList);	
		System.out.println(output);
	}
	
	public static String retrieveAllBells(ArrayList<Bells> bellsList) {
		String output = "";

		for (int i = 0; i < bellsList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-20s %-5s\n", bellsList.get(i).getAssetTag(),
					bellsList.get(i).getDescription(), bellsList.get(i).getAmount(), bellsList.get(i).getMaterial(),
					C206_CaseStudy.showAvailability(bellsList.get(i).isAvailable()));
					
		}
		return output;
	}
	public static void viewAllBells(ArrayList<Bells> bellsList) {
		C206_CaseStudy.setHeader("BELLS LIST");
		String output = String.format("%-10s %-30s %-10s %-20s %-5s\n", "ASSET TAG", "DESCRIPTION",
				"PRICE($)", "MATERIAL","AVAILABLE");
		 output += retrieveAllBells(bellsList);	
		System.out.println(output);
	}
	
	//========================================================================================//
	public static Wheels inputWheels() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		int amount = Helper.readInt("Enter amount > ");
		String material = Helper.readString("Enter material > ");

		Wheels wh= new Wheels(tag, description, amount, material);
		return wh;
		
	}
	public static void addWheels(ArrayList<Wheels> wheelsList, Wheels wh) {
		
		wheelsList.add(wh);
		
	}
	
	public static Seats inputSeats() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		int amount = Helper.readInt("Enter amount > ");
		String material = Helper.readString("Enter material > ");

		Seats st= new Seats(tag, description, amount, material);
		return st;
		
	}
	public static void addSeats(ArrayList<Seats> seatsList, Seats st) {
		
		seatsList.add(st);
		
	}
	
	public static Bells inputBells() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		int amount = Helper.readInt("Enter amount > ");
		String material = Helper.readString("Enter material > ");

		Bells bl= new Bells(tag, description, amount, material);
		return bl;
		
	}
	public static void addBells(ArrayList<Bells> bellsList, Bells bl) {
		
		bellsList.add(bl);
		
		
	}
	//===============================================================================//
	public static boolean doDeleteWheels(ArrayList<Wheels> wheelsList, String tag) {
		boolean isAvailable = false;
		for (int i=0; i <wheelsList.size(); i++) {
			if (wheelsList.get(i).getAssetTag().equals(tag)) {
				wheelsList.remove(i);
				isAvailable = true;
			}
		}	
		return isAvailable;
			
		
			
		}
	public static void deleteWheels(ArrayList<Wheels> wheelsList) {
		C206_CaseStudy.viewAllWheels(wheelsList);
		String tag = Helper.readString("Enter asset tag to be deleted > ");
		Boolean isAvailable = doDeleteWheels(wheelsList, tag);
		if (isAvailable == false) {
			System.out.println("Invalid asset tag entered");
		} else {
			System.out.println("Bike Part: " + tag + " deleted!");
		}
	}
	
	public static boolean doDeleteSeats(ArrayList<Seats> seatsList, String tag) {
		boolean isAvailable = false;
		for (int i=0; i <seatsList.size(); i++) {
			if (seatsList.get(i).getAssetTag().equals(tag)) {
				seatsList.remove(i);
				isAvailable = true;
			}
		}	
		return isAvailable;
			
		
			
		}
	public static void deleteSeats(ArrayList<Seats> seatsList) {
		C206_CaseStudy.viewAllSeats(seatsList);
		String tag = Helper.readString("Enter asset tag to be deleted > ");
		Boolean isAvailable = doDeleteSeats(seatsList, tag);
		if (isAvailable == false) {
			System.out.println("Invalid asset tag entered");
		} else {
			System.out.println("Bike Part: " + tag + " deleted!");
		}
	}
	public static boolean doDeleteBells(ArrayList<Bells> bellsList, String tag) {
		boolean isAvailable = false;
		for (int i=0; i <bellsList.size(); i++) {
			if (bellsList.get(i).getAssetTag().equals(tag)) {
				bellsList.remove(i);
				isAvailable = true;
			}
		}	
		return isAvailable;
			
		
			
		}
	public static void deleteBells(ArrayList<Bells> bellsList) {
		C206_CaseStudy.viewAllBells(bellsList);
		String tag = Helper.readString("Enter asset tag to be deleted > ");
		Boolean isAvailable = doDeleteBells(bellsList, tag);
		if (isAvailable == false) {
			System.out.println("Invalid asset tag entered");
		} else {
			System.out.println("Bike Part: " + tag + " deleted!");
		}
		
		
		
	}
}

