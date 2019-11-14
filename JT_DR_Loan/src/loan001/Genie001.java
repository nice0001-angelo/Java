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
		case 1 : System.out.println("1Ãþ ¾à±¹");
				break;
		case 2 : System.out.println("2Ãþ Á¤Çü¿Ü°ú");
				break;
		case 3 : System.out.println("3Ãþ ÇÇºÎ°ú");
				break;
		case 4 : System.out.println("4Ãþ Ä¡°ú");
				break;
        case 5 : System.out.println("5Ãþ Çï½ºÅ¬·³");
				break;				
		}
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1¿¡¼­ 10°¡ÁöÀÇ ÇÕÀº ==>"+sum);
		
		
		int res = 0;
		
		for(int x = 2 ; x <= 9 ; x++) {
			for(int y = 1 ; y <=9 ; y++) {
				res = x*y;
				System.out.println(x+"°öÇÏ±â"+y+"´Â"+res);
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

