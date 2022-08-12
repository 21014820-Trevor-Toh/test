
public class MenuofMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuofMenu ok = new MenuofMenu();
		ok.Start();
	}
	public void Start() {
		int option = -1;
		while(option!=6) {
			TrueMenu();
			option = Helper.readInt("Enter the option > ");
			if(option == 1) {
				Menu menu = new Menu();
				menu.Start();
			}
			if(option == 2) {
				MenuBike menubike = new MenuBike();
				menubike.Start();
			}
			if(option == 3) {
				C206_CaseStudy casestudy = new C206_CaseStudy();
				casestudy.start();
			}
			if(option == 4) {
				Menuappointment menuappointment =  new Menuappointment();
				menuappointment.Start();
			}
			if(option == 5 ) {
				feedbackmenu feedbackmenu = new feedbackmenu();
				feedbackmenu.Start();
			}
			if(option == 6) {
				System.out.println("Thanks for Using the App !");
			}
		}
	}
	public void TrueMenu() {
		Helper.line(50, "=");
		System.out.println("Bike lover community app");
		Helper.line(50, "=");
		System.out.println("1.User ");
		System.out.println("2.Bike ");
		System.out.println("3.Bike Parts ");
		System.out.println("4.Appointment ");
		System.out.println("5.Feedback");
		System.out.println("6.Quit");
		Helper.line(50, "=");
	}
}
