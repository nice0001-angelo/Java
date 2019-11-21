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
		System.out.println(customerLee.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() +" ���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");
	}
}
