package transport;

/**
 * @author Angelo
 *
 */
public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "Angelo Nam", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println("Customer name is : "+vc.getCustomerName() +" and price is " + vc.calcPrice(10000));
	}
}
