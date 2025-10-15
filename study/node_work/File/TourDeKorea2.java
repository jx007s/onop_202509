package oops;

//전체 자동차 여행거리를 계산하세요

class Zone2{	//데이터
	
	static int[] move= {	//부산에서 부산,춘천,수원,대전 이동시거리
    		0,300,500,700
	};
    
	static Place2[] Busan = {
    		new Place2("해운대",20,0),
    		new Place2("광안리",10,0),
    		new Place2("자갈치시장",10,0),
    		//new Place("부산",300)
    };
    
   	static Place2[] chuncheon = {
    		new Place2("소양강",10,1),
    		new Place2("닭갈비",20,1),
    		new Place2("춘천호",30,1),
    		//new Place("춘천",200)
    };
   	static Place2[] Suwon = {
    		new Place2("수원성",10,2),
    		new Place2("수원역",10,2),
    		new Place2("수원집",5,2),
    		new Place2("수원강",15,2),
    		new Place2("수원운동장",20,2),
    		new Place2("수원산",10,2),
    		//new Place("수원",200)
    };
    
   	static Place2[] Daejeon = {
    		new Place2("엑스포",5,3),
    		new Place2("대전역",7,3),
    		new Place2("대전강",5,3),
    		new Place2("대전집",10,3),
    		new Place2("대전산",20,3),
    		new Place2("대전공항",15,3)
    		};
    
   static Place2[][] zone= {
    		Busan,chuncheon,Suwon,Daejeon
    };
	
	
}
class Place2{		//계싼
	String place;
    int distance;
    int localNum;
    static int endPlace;
    //static Zone2 aa= new Zone2();
      
    Place2(String aa,    int bb,	int cc)//지역이름 , 거리, 지역번호(거리계산용)
    {
        place = aa;
        distance = bb;
        localNum = cc;
    }
    
    Place2 (String[] ad){
    	System.out.print("경유지 : ");
    	for(String ap : ad) {
			cal(ap);
		}
    	System.out.println("\n총이동거리 :"+ (distance+Zone2.move[endPlace]));
    }
    int cal(String name) {
    	for(Place2[] aaa: Zone2.zone) {
    		for(Place2 p : aaa) {
        		if(name.equals(p.place)) {
        			System.out.print(name+"\t");
        			distance += p.distance;
        			endPlace = p.localNum;
        		}
    		}
    	}
    	return distance;
    }

}

public class TourDeKorea2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] schedule = {"해운대","춘천호","수원집","수원강","대전역"};
		Place2 tt = new Place2(schedule);
	}

}
