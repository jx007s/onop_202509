package basic_p;

public class CoffeeMain {

	public static void main(String[] args) {
		String name ="아프리카노";
		boolean packing =  true;
		char size = 'L'; 
		short price = 2100;
		byte cnt =3;
		int total = price * cnt;
		System.out.println("커피이름 : "+name);
		System.out.println("포장유무 : "+packing);
		System.out.println("크기 : "+size);
		System.out.println("단가  : "+price);
		System.out.println("수량  : "+cnt);
		System.out.println("금액 : "+total);
	}

}
