package loan001;

public class Genie001 {

	public static void main(String[] args) {
		double dnum = 1;

		for(int i=0; i <10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);

		/*
		final int MAX_COUNT = 30;
		System.out.println(MAX_COUNT);
		
		for(int i = 0; i < MAX_COUNT ; i++) {
			System.out.println(i);
		}*/
		/*
		int num = 10;
		System.out.println(num);
		int result = ~num;
		System.out.println(result);
		*/
		
		int floor = 4;
		
		switch(floor) {
		case 1 : System.out.println("1�� �౹");
				break;
		case 2 : System.out.println("2�� �����ܰ�");
				break;
		case 3 : System.out.println("3�� �Ǻΰ�");
				break;
		case 4 : System.out.println("4�� ġ��");
				break;
        case 5 : System.out.println("5�� �ｺŬ��");
				break;				
		}
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1���� 10������ ���� ==>"+sum);
		
		
		int res = 0;
		
		for(int x = 2 ; x <= 9 ; x++) {
			for(int y = 1 ; y <=9 ; y++) {
				res = x*y;
				System.out.println(x+"���ϱ�"+y+"��"+res);
			}
		}
		
		
	}

}

/*
public class IntegerVariable {
	
	public static void main(String[] args) {
		short sVal = 10;
		byte bVal= 20;
		System.out.println(sVal+bVal);
	}
	
}

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		int ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
	}
*/

