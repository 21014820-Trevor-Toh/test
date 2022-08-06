
public class Buyer extends User{
private String UserID;

public Buyer(String UserID,String Username, String password) {
	super(Username, password);
	this.UserID = UserID;
	// TODO Auto-generated constructor stub
}

public String getUserID() {
	return UserID;
}

public void setUserID(String userID) {
	UserID = userID;
}


}
