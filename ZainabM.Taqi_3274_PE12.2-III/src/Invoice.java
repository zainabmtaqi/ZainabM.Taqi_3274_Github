import java.util.ArrayList;

/*************************
 * 
 * @author ZainabM.Taqi
 * 
 *         Date: 11/1/2022
 *
 *************************/
/**
 * For Part III, we'll put it all together an modify the Invoice class from
 * Section 12.3 (below), replacing the LineItem class with AbstractItem. Use the
 * classes from Part I and Part II in your solution, along with the other
 * classes from Section 12.3.
 */
public class Invoice {
	private Address billingAddress;
	private ArrayList<AbstractItem> items;

	public Invoice(Address anAddress) {
		items = new ArrayList<AbstractItem>();
		billingAddress = anAddress;
	}

	public void add(AbstractItem item) {
		items.add(item);
	}

	public void add(Product aProduct, int quantity) {
		add(new QuantityItem(aProduct, quantity));
	}

	public String format() {
		String r = "                     I N V O I C E\n\n" + billingAddress.format()
				+ String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");

		for (AbstractItem i : items) {
			r = r + i.format() + "\n";
		}

		r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());

		return r;
	}

	private double getAmountDue() {
		double amountDue = 0;
		for (AbstractItem item : items) {
			amountDue = amountDue + item.getTotalPrice();
		}
		return amountDue;
	}
}
