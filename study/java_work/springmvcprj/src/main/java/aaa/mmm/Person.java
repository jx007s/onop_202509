package aaa.mmm;

import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

	String pid,pw,pname;
	int age;
	boolean marriage;
	public Person(String pid, String pname, String pw) {

		this.pid = pid;
		this.pw = pw;
		this.pname = pname;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(pid, other.pid) && Objects.equals(pw, other.pw);
	}
	@Override
	public int hashCode() {
		return Objects.hash(pid, pw);
	}
	
	
	
	
}
