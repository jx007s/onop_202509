package array_p;

import java.util.Arrays;

public class ExamMain {

	public static void main(String[] args) {
		String [] pname = {
				"손오공","베지터","크리링","피콜로","천진반","무천도사","부르마","야무치"
		};
		
		int [][]jum = {
				{97,69,31},
				{37,69,91},
				{97,79,51,33},
				{37,59,71,93},
				{67,69,61},
				{67,69,61,63},
				{89,87,83},
				{92,95,96,94}
		};
		
		// 전공, 총점, 평점,등급
		// 일반 - 평균
		// 예능 - 5% , 10%, 15%, 70%
		
		
		// 1. 입력부
		String [][] res1 = new String[pname.length][2];
		/*
		 {   전공   등급
		  	{null, null},  	- "손오공",
		  	{null, null},	-"베지터"
		  	{null, null},	-,"크리링"
		  	{null, null},	-,"피콜로"
		  	{null, null},	-,"천진반"
		  	{null, null}		- ,"무천도사"
		 }
		 * */
		int [][] res2 = new int[pname.length][2]; 
		/*
		 {   총점,  평균
		  	{ 0,    0},  	- "손오공",
		  	{ 0,    0},		-"베지터"
		  	{ 0,    0},		-,"크리링"
		  	{ 0,    0},		-,"피콜로"
		  	{ 0,    0},		-,"천진반"
		  	{ 0,    0}		- ,"무천도사"
		 }
		 * */
		
		String [] kind = {"일반","예능"};
		double [] rate = {0.05 , 0.1, 0.15, 0.7};
		String [] grade = {"가","가","가","가","가","가","양","미","우","수","수"};
		//2. 연산부
		for (int me = 0; me < pname.length; me++) {
			res1[me][0] = kind[jum[me].length-3];
			
			res2[me][0] = 0;
			res2[me][1] = 0;
			
			for (int j = 0; j < jum[me].length; j++) {
				res2[me][0] += jum[me][j];
				res2[me][1] += jum[me][j]*rate[j];
				//System.out.println(j);
			}
			
			if(res1[me][0]=="일반") {
				res2[me][1] = res2[me][0]/jum[me].length;
			}
			
			res1[me][1] = grade[res2[me][1]/10];
			
//			System.out.println(me+","+pname[me]+","+Arrays.toString(jum[me])
//			+","+Arrays.toString(res1[me])+","+Arrays.toString(res2[me]));
			
			
		}
		
		
		// 3. 출력부
		for (int me = 0; me < pname.length; me++) {
			String ttt = res1[me][0]+"\t"+pname[me]+"\t";
			for (int j : jum[me]) {
				ttt+=j+"\t";
			}
			if(res1[me][0]=="일반") {
				ttt+="\t";
			}
			
			for (int j : res2[me]) {
				ttt+=j+"\t";
			}
			ttt += res1[me][1];
			System.out.println(ttt);
			
		}
		
	}

}

/*
  {5},
   {5,6},
   {5,6,8},
   {10,4},
   {8},
   {10,6,13}
  }
  
  도형의 넓이와 둘레를 출력하세요
  
 도형명			선분 	 				넓이	 						둘레
 원	 			반지름	 			반지름*반지름*pi 	 		반지름*2*pi
 직사각형	 		가로, 세로 	 		가로*세로	 				(가로+세로)*2
 직각삼각형	 	밑변, 높이, 빗변	 	밑변*높이/2	 			밑변+높이+빗변
 * */



