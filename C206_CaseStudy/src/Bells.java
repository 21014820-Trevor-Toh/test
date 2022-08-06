/**
 * 
 */

/**
 * @author putri balqis
 *
 */
public class Bells extends BikePart{
	public String material;
	
	public Bells(String assetTag, String description, int amount, String material) {
		super(assetTag, description, amount);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}



}
