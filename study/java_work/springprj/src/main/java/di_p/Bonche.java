package di_p;

public class Bonche {

	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bonche [name=" + name + "]";
	}
	
	
}
//데스크탑   - 본체 1, 모니터 1, 키보드 1, 마우스 1
//노트북    - 본체 1, 마우스 1
class Monitor{
	String name;
	int size;
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Monitor [name=" + name + ", size=" + size + "]";
	}
	
	
}

class KeyBoard{
	String name, type;

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "KeyBoard [name=" + name + ", type=" + type + "]";
	}
	
	
}

class Mouse{
	String name;
	boolean remove;
	public void setName(String name) {
		this.name = name;
	}
	public void setRemove(boolean remove) {
		this.remove = remove;
	}
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", remove=" + remove + "]";
	}
	
	
}

class DeskTop{
	String name;
	
	Bonche bb;
	Monitor mon;
	KeyBoard kk;
	Mouse mm;
	public void setName(String name) {
		this.name = name;
	}
	public void setBb(Bonche bb) {
		this.bb = bb;
	}
	public void setMon(Monitor mon) {
		this.mon = mon;
	}
	public void setKk(KeyBoard kk) {
		this.kk = kk;
	}
	public void setMm(Mouse mm) {
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "DeskTop [name=" + name + ", bb=" + bb + ", mon=" + mon + ", kk=" + kk + ", mm=" + mm + "]";
	}
	
	
}

class NoteBook{
	String name;
	Bonche bb;
	Mouse mm;
	public void setName(String name) {
		this.name = name;
	}
	public void setBb(Bonche bb) {
		this.bb = bb;
	}
	public void setMm(Mouse mm) {
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "NoteBook [name=" + name + ", bb=" + bb + ", mm=" + mm + "]";
	}
	
	
}

