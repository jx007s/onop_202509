package oops_p;
class SelfCall{
	
	String pre = "";
	int meth(int no) {   //초기값
		
		String myPre = pre;
		pre+="\t";
		
		int res = no;
		
		System.out.println(myPre+"시작 "+no+" , "+res);
		
		if(no>0) {		// 조건
			res += meth(no-1);	// 증감 //재귀호출
		}
		
		System.out.println(myPre+"끝 "+no+" , "+res);
		return res;
	}
	
	
	String pre3 = "";
	int meth3(int no) {   //초기값
		
		String myPre = pre3;
		pre3+="\t";
		
		int res = 0;
		if(no%3==0) {
			res = no;
		}
		
		System.out.println(myPre+"시작 "+no+" , "+res);
		
		if(no>0) {		// 조건
			res += meth3(no-1);	// 증감 //재귀호출
		}
		
		System.out.println(myPre+"끝 "+no+" , "+res);
		return res;
	}
}


public class SelfCallMain {

	public static void main(String[] args) {
		int rr = new SelfCall().meth(3);
		System.out.println("rr : "+rr);
		
		rr = new SelfCall().meth3(16);
		System.out.println("rr : "+rr);

	}

}
