/**
 * 
 */

/**
 * @author putri balqis
 *
 */
public class Wheels extends BikePart {
	public String material; 
	
	public Wheels(String assetTag, String description, int amount, String material) {
		super(assetTag, description, amount);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

}
