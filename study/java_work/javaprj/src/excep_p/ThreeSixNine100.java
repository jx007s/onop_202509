package excep_p;

public class ThreeSixNine100 {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			int one = i%10;
			int ten = i/10;
			//System.out.println(i+","+ten+","+one);
			String ttt = "";
			int cnt = 0;
			
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
			
			try {
				int a = 1234/(ten%3);
			} catch (Exception e) {
				try {
					int a = 1234/ten;
					ttt += "짝";
					cnt++;
					//System.out.println("짝");
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			try {
				int a = 1234/cnt;
				
			} catch (Exception e2) {
				ttt += i;
			}
			
			System.out.println(ttt);
		}

	}

}
