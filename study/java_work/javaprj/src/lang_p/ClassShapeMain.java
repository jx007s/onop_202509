package lang_p;

interface ClassShape{
	void execute(int ...line);
}

class ClaRec implements ClassShape{
	@Override
	public void execute(int... line) {
		System.out.println("직사각형 넓이:"+line[0]*line[1]);
	}
}
class ClaCir implements ClassShape{
	@Override
	public void execute(int... line) {
		System.out.println("원 넓이:"+Math.pow(line[0],2)*Math.PI);
	}
}

class ClaTri implements ClassShape{
	@Override
	public void execute(int... line) {
		System.out.println("직각삼각형 넓이:"+line[0]*line[1]/2);
	}
}


public class ClassShapeMain {
	
	static void calc(String sh, int... line) {
		
		try {
			 ((ClassShape)Class.forName("lang_p.Cla"+sh).newInstance()).execute(line);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		calc("Rec",5,6);
		calc("Cir",5);
		calc("Tri",5,6);

	}

}
