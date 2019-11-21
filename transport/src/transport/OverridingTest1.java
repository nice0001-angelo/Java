package transport;

/**
 * @author Angelo
 *
 */
public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "Lee");
		customerLee.bonusPoint = 1000;
		//System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "Kim", 12345);
		customerKim.bonusPoint = 10000;
		//System.out.println(customerKim.showCustomerInfo());
		
		int price = 10000;
		System.out.println("Name is : "+customerLee.getCustomerName() +" and price is : " + customerLee.calcPrice(price));
		System.out.println("Name is : "+customerKim.getCustomerName() +" and price is : " + customerKim.calcPrice(price));
	}
}
