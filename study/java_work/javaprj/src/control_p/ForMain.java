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
		
		for (int big = 0; big <5; big++) {
			
			for (int star = 0; star <=big; star++) {
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
