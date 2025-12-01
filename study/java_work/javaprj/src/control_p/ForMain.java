package control_p;

public class ForMain {

	public static void main(String[] args) {
		System.out.println("아기상어");
		System.out.println();
		System.out.println("엄마상어");
		System.out.print("상어");
		//System.out.print();
		System.out.print("문어");
		System.out.println();
		
		int limit = 5;
		System.out.println("1. >>>");
		
		for (int big = 0; big <limit; big++) {
			
			for (int star = 0; star <=big; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2. >>>");
		
		for (int big = 0; big <limit; big++) {
			
			for (int star = big; star <limit; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3. >>>");
		
		for (int big = 0; big <limit; big++) {
			
			for (int star = big; star <limit-1; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star <=big; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4. >>>");
		
		for (int big = 0; big <limit; big++) {
			
			for (int star = 0; star <big; star++) {
				System.out.print(" ");
			}
			for (int star = big; star <limit; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("5. >>>");
		
		for (int big = 0; big <limit; big++) {
			
			for (int star = big; star <limit-1; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star <=big*2; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("6. >>>");
		
		for (int big = 0; big <limit; big++) {
			
			for (int star = 0; star <big; star++) {
				System.out.print(" ");
			}
			for (int star = 0; star <(limit-big)*2-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*

2번

 *****
 ****
 ***
 **
 *


 3번

     *
    **
   ***
  ****
 *****




 4번

 *****
  ****
   ***
    **
     *



 5번

     *
    ***
   *****
  *******
 *********


 6번

 *********
  *******
   *****
    ***
     * 



 * */
