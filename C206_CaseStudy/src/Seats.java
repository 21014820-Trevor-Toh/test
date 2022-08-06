/**
 * 
 */

/**
 * @author putri balqis
 *
 */
public class Seats extends BikePart{
	public String material;
	
	public Seats(String assetTag, String description, int amount, String material) {
		super(assetTag, description, amount);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	

}
