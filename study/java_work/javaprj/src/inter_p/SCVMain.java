package inter_p;

/*
스타크래프트를 구현하세요

scv -4기를 이용하여 작업


scv 1회 획득량  미네랄 : 8, 가스 : 8
커맨드센터 : 미네랄 400
팩토리 : 미네랄 200, 가스 100
스타포트 : 미네랄 150, 가스 100

커맨드 센터 --2 짓기    (건물)
스타포트-1 짓기 1  수리	(건물)
팩토리-2 짓기			(건물)
미네랄-500			(자원)
탱크-2대 수리			(유닛)
탱크 타기 -3			(유닛)
저그 공격 : 5마리		(적)

건물 - 짓기, 수리
자원 - 캐기
유닛 - 수리, 타기
적  - 공격
*/

interface Tower{
	void building(String name);
	void repair(String name);
}

interface Resource{
	boolean get(String name, int limit);
}

interface Unit{
	void riding(String name);
	void repair(String name);
}
interface Enemy{
	void attack(String name);
}

interface SCVWork extends Tower, Resource, Unit, Enemy{}

class SCVDataMM{
	String name;
	int cnt =0, repair=0, riding=0;
	int qauntity=0;
	int [] reRequire;
	SCVDataMM(String name) {
		
		this.name = name;
	
	}
	
	SCVDataMM(String name, int ...reRequire) {
		
		this.name = name;
		this.reRequire = reRequire;
	}
	
	String add() {
		qauntity += 8;
		cnt++;
		return ppp();
	}
	
	String ppp() {
		return "["+name+","+cnt+","+qauntity+"]";
	}
	
	void report() {
		System.out.println(name+"\t"+cnt+"\t"+qauntity+"\t"+repair+"\t"+riding);
	}
	
}

class SCVData{
	String name;
	
	SCVDataMM [] buildArr = {
			new SCVDataMM("미네랄"),
			new SCVDataMM("가스"),
			new SCVDataMM("커맨드센터",400,0),
			new SCVDataMM("팩토리",200, 100),
			new SCVDataMM("스타포트",150, 100),
			new SCVDataMM("탱크"),
			new SCVDataMM("레이스"),
			new SCVDataMM("저그"),
			new SCVDataMM("질럿")
	};
	
	SCVData(String name) {
		this.name = name;
	}
	
	SCVDataMM getMM(String title) {
		SCVDataMM res = null;
		
		for (SCVDataMM sdmm : buildArr) {
			if(sdmm.name.equals(title)) {
				res = sdmm;
				break;
			}
		}
		
		return res;
	}
	
	void report() {
		System.out.println(name+" >>>");
		for (SCVDataMM sdm : buildArr) {
			sdm.report();
		}
	}
	
}

class SCV implements SCVWork{
	SCVData myData, totData;

	SCV(SCVData totData, String name) {
		this.totData = totData;
		myData = new SCVData(name);
	}
	
//	커맨드센터 : 미네랄 400
//	팩토리 : 미네랄 200, 가스 100
//	스타포트 : 미네랄 150, 가스 100
//
//	scv 1회 획득량  미네랄 : 8, 가스 : 8
	
	
	

	@Override
	public void building(String name) {
//		int index = 0;
//
//		
//		if(name.equals("커맨드센터")) {
//		
//			index = 0;
//		}else if(name.equals("팩토리")) {
//			
//			index = 1;
//		}else if(name.equals("스타포트")) {
//			
//			index = 2;
//		}
//		
//		if(totData.mineral.qauntity < totData.buildArr[index].reRequire[0] ||
//				totData.gas.qauntity <totData.buildArr[index].reRequire[1]
//				) {
//			System.out.println(myData.name+" "+name+" "+
//				totData.mineral.qauntity +","+totData.gas.qauntity +" 부족");
//			return;
//		}else {
//			totData.mineral.qauntity -= totData.buildArr[index].reRequire[0];
//			totData.gas.qauntity -= totData.buildArr[index].reRequire[1];
//			totData.buildArr[index].cnt++;
//			myData.buildArr[index].cnt++;
//			System.out.println(myData.name+" "+name+" 생성 완료");
//		}
		
		SCVDataMM tot = totData.getMM(name);
		SCVDataMM my = myData.getMM(name);
		
		if(totData.buildArr[0].qauntity < tot.reRequire[0] ||
				totData.buildArr[1].qauntity <tot.reRequire[1]
				) {
			System.out.println(myData.name+" "+name+" "+
				totData.buildArr[0].qauntity +","+totData.buildArr[1].qauntity +" 부족");
			return;
		}else {
			totData.buildArr[0].qauntity -= tot.reRequire[0];
			totData.buildArr[1].qauntity -= tot.reRequire[1];
			tot.cnt++;
			my.cnt++;
			System.out.println(myData.name+" "+name+" 생성 완료");
		}
		
		
	}

	@Override
	public void repair(String name) {
		SCVDataMM tot = totData.getMM(name);
		SCVDataMM my = myData.getMM(name);
		
		tot.repair++;
		my.repair++;
		System.out.println(myData.name+" "+name+" 수리 완료");
	}

	@Override
	public boolean get(String name, int limit) {
		
		SCVDataMM tot = totData.getMM(name);
		SCVDataMM my = myData.getMM(name);
		
		System.out.println(myData.name+" "+name+" 획득");
		System.out.println(my.add()+" , "+tot.add());
		
		return tot.qauntity >= limit;
	}

	@Override
	public void attack(String name) {
		SCVDataMM tot = totData.getMM(name);
		SCVDataMM my = myData.getMM(name);
		
		tot.cnt++;
		my.cnt++;
		System.out.println(myData.name+" "+name+" 공격");
		
	}

	@Override
	public void riding(String name) {
		SCVDataMM tot = totData.getMM(name);
		SCVDataMM my = myData.getMM(name);
		
		tot.riding++;
		my.riding++;
		System.out.println(myData.name+" "+name+" 타기");
		
	}

	
}
public class SCVMain {
	
	static void getget(String name, int limit, Resource ...rr ) {
		
		AAA:while(true) {
			for (Resource r : rr) {
				if(r.get(name, limit)) {
					break AAA;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		SCVData tot = new SCVData("1시테란");
		
		SCV [] scv = {
			new SCV(tot,"0호기"),
			new SCV(tot,"1호기"),
			new SCV(tot,"2호기"),
			new SCV(tot,"3호기")
		};
		Tower tt;
		Unit uu;
		Enemy ee;
		
//		커맨드센터 --2 짓기    (건물)
//		스타포트-1 짓기 1  수리	(건물)
//		팩토리-2 짓기			(건물)
//		미네랄-500			(자원)
//		탱크-2대 수리			(유닛)
//		탱크 타기 -3			(유닛)
//		저그 공격 : 5마리		(적)
		
		
		
		
		getget("미네랄", 400, scv[3],scv[0],scv[1]);
		
		tt = scv[1];
		tt.building("커맨드센터");
		getget("미네랄", 200, scv[3],scv[0],scv[1]);
		tt = scv[2];
		tt.building("커맨드센터");
		
		getget("미네랄", 400, scv[3],scv[0],scv[1]);
		tt.building("커맨드센터");
		
		uu = scv[2];
		uu.repair("탱크");
		getget("가스", 200, scv[2],scv[0]);
		uu = scv[3];
		uu.riding("탱크");
		ee = scv[2];
		ee.attack("저그");
		tt = scv[0];
		tt.building("스타포트");
		getget("미네랄", 300, scv[3],scv[0],scv[1]);
		tt.building("스타포트");
		tt = scv[0];
		tt.building("팩토리");
		getget("미네랄", 300, scv[2],scv[1]);
		tt.building("팩토리");
		uu = scv[3];
		uu.riding("탱크");
		ee = scv[1];
		ee.attack("저그");
		ee = scv[0];
		ee.attack("저그");
		uu = scv[1];
		uu.repair("탱크");
		tt = scv[3];
		tt.repair("스타포트");
		ee = scv[0];
		ee.attack("저그");
		tt = scv[1];
		tt.building("팩토리");
		uu = scv[0];
		uu.riding("탱크");
		ee = scv[2];
		ee.attack("저그");
		
		for (SCV s : scv) {
			s.myData.report();
		}
		System.out.println("======================");
		tot.report();
		
		
	}

}

