package dynamic_p;

import java.util.Arrays;

/*
OverCarMain
자동차 성능 테스트 하세요

부모 : 자동차

자식 
스포츠카  : 속도 50 , 연비 20, 디자인 30
트럭 :    연비 60 , 적재종류 : 개당 10점
승합차 :   속도 15 , 연비 35, 탑승인원 50

으로 성능점수를 계산토록 할 것
*/
class OverCar{
	String pname, kind;
	int res;
	
	
	
	OverCar(String kind,String pname) {
		this.pname = pname;
		this.kind = kind;
	}

	void calc() {}
	
	void ppp() {
		calc();
		System.out.println(kind+"\t"+pname+"\t"+res);
	}
}

class OverSports extends  OverCar{

	int speed, fuel, design;
	
	OverSports( String pname,int speed, int fuel,int design) {
		super("스포츠카",  pname);
		this.speed = speed;
		this.fuel = fuel;
		this.design = design;
	}

	void calc() {
		res = (int)(speed *0.50 + fuel *0.20+ design *0.30);
	}
}
class OverTruck extends  OverCar{

	String [] res;
	int tot;
	
	OverTruck( String pname,int fuel, String ...res) {
		super("트럭",  pname);
		this.res = res;
		tot = (int)(fuel*0.6 + res.length*10);
	}

	void ppp() {
		System.out.println(kind+"\t"+pname+"\t"+Arrays.toString(res)+"\t"+tot);
	}
}

class OverVan extends  OverCar{

	int speed, fuel, person;
	
	OverVan( String pname,int speed, int fuel,int person) {
		super("승합차",  pname);
		this.speed = speed;
		this.fuel = fuel;
		this.person = person;
	}

	void calc() {
		res = (int)(speed *0.15 + fuel *0.35+ person);
	}
}


public class OverCarMain {

	public static void main(String[] args) {
		OverCar [] cars = {
			new OverSports("아스라다", 98, 72, 35),
			new OverSports("세이버", 38, 72, 95),
			new OverVan("스타리아",89,45,17),
			new OverTruck("포터", 71,"이삿짐","50미리대공포","돌?"),
			new OverTruck("봉고르기니무얼실을라고", 78,"흙","돌"),
			new OverVan("레이",65,91,5)
		};
		
		for (OverCar overCar : cars) {
			overCar.ppp();
		}

	}

}
