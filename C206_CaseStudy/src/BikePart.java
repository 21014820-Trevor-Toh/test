/**
 * 
 */

/**
 * @author putri balqis
 *
 */
public class BikePart {
	private String assetTag;
	private String description;
	private int amount;
	private boolean isAvailable;
	
	
	public BikePart(String assetTag, String description, int amount) {
		this.assetTag = assetTag;
		this.description = description;
		this.amount = amount;
		this.isAvailable = true;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}
	

}
