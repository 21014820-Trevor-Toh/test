
import java.util.Date;

public class Appointment extends Buyer{
private String description;
private String Date;
private String AppointmentID;

public Appointment(String UserID,String Username, String Password,String description, String date2,String AppointmentID) {
  super(UserID,Username, Password);
  this.description = description;
  this.Date = date2;
  this.AppointmentID = AppointmentID;
  // TODO Auto-generated constructor stub
}



public String getAppointmentID() {
	return AppointmentID;
}



public void setAppointmentID(String appointmentID) {
	AppointmentID = appointmentID;
}



public String getDescription() {
  return description;
}

public String getDate() {
  return Date;
}

public void setDescription(String description) {
  this.description = description;
}

public void setDate(String date) {
  Date = date;
}




}
