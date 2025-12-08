package oops_p;

/*
AbsSwimMain
수영 선수를 구현 하세요

부모 : 수영선수
     필드 : 이름, 종목(자유형, 접영, 평영, 배영)
    메소드 : 수영해요(거리) - 추상화
    
자식 :   자유형선수 - 1m당 몇초, - :: 자유형 이름 거리 몇초 수영해요 
         접영선수 - 1m당 몇초, 50m당 - 0.초 느려짐,  :::: 접영 이름 거리 몇초 수영해요
         평영선수 - 1m당 몇초 , 잠영몇m,   :::: 평영 이름 거리 잠영 몇m, 몇초 수영해요
         배영선수 - 1m당 몇초  :::: 배영 이름 거리 몇초 수영해요

* */
abstract class AbsSwim{
	String name, kind;

	AbsSwim(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	abstract void swim(int dist);
}

class AbsFree extends AbsSwim{
	double speed;

	AbsFree(String name, double speed) {
		super("자유형", name);
		this.speed = speed;
	}
	
	@Override
	void swim(int dist) {
		System.out.println(kind+" "+name+" "+dist+" "+speed*dist+"초 수영해요" );
		
	}
}

class AbsButterfly extends AbsSwim{
	double speed;
	double delay;

	AbsButterfly(String name, double speed, double delay) {
		super("접영", name);
		this.speed = speed;
		this.delay = delay;
	}
	
	@Override
	void swim(int dist) {
		
		double time = 0;
		for (int i = 0; i < dist; i++) {
			time += speed+(i*delay);
		}
		
		
		System.out.println(kind+" "+name+" "+dist+" "+time+"초 수영해요" );
		
	}
}

class AbsBack extends AbsSwim{
	double speed;
	

	AbsBack(String name, double speed) {
		super("배영", name);
		this.speed = speed;
	}
	
	@Override
	void swim(int dist) {
		System.out.println(kind+" "+name+" "+dist+" "+speed*dist+"초 수영해요" );
		
	}
}

class AbsBreast extends AbsSwim{
	int  under;
	double speed,delay;

	AbsBreast(String name, double speed, int under) {
		super("평영", name);
		this.speed = speed;
		this.under = under;
	}
	
	@Override
	void swim(int dist) {
		
		System.out.println(kind+" "+name+" "+dist+" 잠영:"+under+", "+speed*(dist-under)+"초 수영해요" );
		
	}
}




public class AbsSwimMain {

	public static void main(String[] args) {
		AbsSwim [] players = {
			new AbsFree("박태환",0.6),
			new AbsButterfly("비욘디",0.8,0.02),
			new AbsBack("황선우",0.9),
			new AbsBreast("조오련",1.2, 7)
		};
		
		for (AbsSwim pp : players) {
			pp.swim(100);
		}

	}

}
