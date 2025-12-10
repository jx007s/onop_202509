package excep_p;


public class ThreeSixNineNumber {
	
	static int cnt;
	static String ttt;
	
	static void zzag(int one) {
		try {
			int a = 1234/(one%3);
		} catch (Exception e) {
			try {
				int a = 1234/one;
				ttt += "짝";
				cnt++;
				//System.out.println("짝");
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("시작");
		
		for (int i = 1; i <=2784; i++) {
			
			ttt = "";
			cnt = 0;
			
			for (int buf = i; buf>0; buf /= 10) {
				zzag(buf%10);
			}
			
			/*
			int buf = i;
			
			try {
				
				while(true) {

					zzag(buf%10);
					
					buf /= 10;
					
					int b = 4567/buf;
				}

			} catch (Exception e) {
				// TODO: handle exception
			}*/

			try {
				int a = 1234/cnt;
				
			} catch (Exception e2) {
				ttt += i;
			}
			
			System.out.println(ttt);
		}

	}

}
