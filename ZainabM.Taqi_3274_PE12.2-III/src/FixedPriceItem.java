
/*************************
 * 
 * @author ZainabM.Taqi
 * 
 *         Date: 11/1/2022
 *
 *************************/
/**
 * Enhance the invoice-printing program by providing for two kinds of line
 * items: One kind describes products that are purchased in certain numerical
 * quantities (such as "3 toasters"), another describes a fixed charge (such as
 * "shipping: $5.00"). Hint: Use inheritance.
 * 
 * For Part I, only complete the FixedPriceItem class.
 */
public class FixedPriceItem extends AbstractItem {

	private String description;
	private double charge;

	public FixedPriceItem(String aDescription, double aCharge) {
		description = aDescription;
		charge = aCharge;
	}

	public double getTotalPrice() {
		return charge;
	}

	public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f     ", description, charge);
	}

}
