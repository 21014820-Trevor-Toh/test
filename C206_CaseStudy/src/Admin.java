
public class Admin extends User{
public String adminid;
	public Admin(String adminid ,String Username, String Password) {
		super(Username, Password);
		this.adminid = adminid;
		// TODO Auto-generated constructor stub
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

}
