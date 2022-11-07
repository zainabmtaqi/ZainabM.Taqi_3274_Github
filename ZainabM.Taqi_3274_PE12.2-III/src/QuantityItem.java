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
 * For Part II, complete the QuantityItem class. Use the FixedPriceItem class
 * and the AbstractItem class you used for part I.
 */

public class QuantityItem extends AbstractItem {

	private int quantity;
	private Product product;

	public QuantityItem(Product aProduct, int aQuantity) {
		product = aProduct;
		quantity = aQuantity;
	}

	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}

	public String getDescription(int length) {
		return String.format("%-" + (length - 13) + "s%8.2f     ", product.getDescription(), product.getPrice(),
				quantity);
	}

}
