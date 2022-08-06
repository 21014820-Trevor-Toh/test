
public class Item {
public String ID;
public String AssetTag;
public Double Price ;
public String Dicription;

public Item(String iD, String assetTag, Double price,String Discription) {
	this.ID = iD;
	this.AssetTag = assetTag;
	this.Price = price;
	this.Dicription = Discription ;
}

public String getID() {
	return ID;
}

public void setID(String iD) {
	ID = iD;
}

public String getAssetTag() {
	return AssetTag;
}

public void setAssetTag(String assetTag) {
	AssetTag = assetTag;
}

public Double getPrice() {
	return Price;
}

public void setPrice(Double price) {
	Price = price;
}

public String getDicription() {
	return Dicription;
}

public void setDicription(String dicription) {
	Dicription = dicription;
}


}
