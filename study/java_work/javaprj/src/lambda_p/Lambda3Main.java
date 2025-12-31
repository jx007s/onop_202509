package lambda_p;

public class Lambda3Main {
	
	interface Lam3{
		int asdfwe(int a, int b , int c);
	}
	
	void qwer(int aa, int bb, int cc, Lam3 ll) {
		System.out.println(ll.asdfwe(aa, bb, cc));
	}
	
	public Lambda3Main() {
		qwer(5,7,10, (x, y,z)-> x+y+z);
		
		qwer(20,50,10, (x, y,z)-> {
			int ret = x;
			
			if(ret<y) {
				ret = y; 
			}
			if(ret<z) {
				ret = z; 
			}
			
			return ret;
		});
		
		qwer(5,7,10, (x, y,z)-> x*y-z);
		
		
	}

	public static void main(String[] args) {
		
		new Lambda3Main();

	}

}
