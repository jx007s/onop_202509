package excep_p;

public class ThreeSixNine {

	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			int one = i%10;
			try {
				int a = 1234/(one%3);
				System.out.println(i);
			} catch (Exception e) {
				try {
					int a = 1234/one;
					System.out.println("짝");
				} catch (Exception e2) {
					System.out.println(i);
				}
			}
		}

	}

}
