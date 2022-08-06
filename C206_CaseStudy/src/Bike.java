
public class Bike extends Item {
	private String bikeName;
	private Boolean Avability;
	private String ListingName;

	
	
	public Bike(String iD, String assetTag, Double price, String Discription,String bikeName,String ListingName,boolean Avability) {
		super(iD, assetTag, price, Discription);
		this.bikeName = bikeName;
		this.Avability = Avability;
		this.ListingName = ListingName;
		// TODO Auto-generated constructor stub
	}
	
	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public Boolean getAvability() {
		return Avability;
	}

	public void setAvability(Boolean avability) {
		Avability = avability;
	}

	public String display() {
		String output = String.format("%-20s %-10s %-30s", bikeName);
		return output;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getListingName() {
		return ListingName;
	}

	public void setListingName(String listingName) {
		ListingName = listingName;
	}
	
}

