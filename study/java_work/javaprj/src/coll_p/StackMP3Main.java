package coll_p;

import java.util.Stack;

//mp3 노래듣기를 구현하세요
//1. 노래 정보 :  트랙번호, 노래제목, 가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 다음곡, 이전곡, 트랙번호
class StackMusic{
	int no;
	String title, singer;
	StackMusic(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "[" + no + ", " + title + ", " + singer + "]";
	}
	
	
	
}

class StackMP3{
	StackMusic now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	StackMP3(StackMusic ...arr) {
		
		for (int i = arr.length-1; i >=0 ; i--) {
			arr[i].no = i+1;
			next.push(arr[i]);
		}
	}
	
	void goNext() {
		System.out.println("goNext()------------------------");
		if(next.empty()) {
			System.out.println("마지막 곡입니다.");
			return;
		}
		
		nextMD();
		
		ppp();
	}
	
	void nextMD() {
		if(now!=null) {
			back.push(now);
		}
		now = (StackMusic)next.pop();
	}
	
	void goBack() {
		System.out.println("goBack()------------------------");
		if(back.empty()) {
			System.out.println("첫번째 곡입니다.");
			return;
		}
		backMD();
		ppp();
	}
	void backMD() {
		if(now!=null) {
			next.push(now);
		}
		now = (StackMusic)back.pop();
	}
	
	void goTrack(int no) {
		System.out.println("goTrack("+no+")------------------------");
		if(now.no<no) {
			while(now.no!=no) {
				 nextMD();
			}
		}
		else if(now.no>no) {
			while(now.no!=no) {
				 backMD();
			}
		}
		
		
		ppp();
	}
	
	void ppp() {
		System.out.println("현재 : "+now);
		System.out.println("이전 : "+back);
		System.out.println("다음 : "+next);
	}
	
	
	
	
}

public class StackMP3Main {

	public static void main(String[] args) {
		StackMP3 mp3 = new StackMP3(
				new StackMusic("첫 눈","EXO"),
				new StackMusic("하얀그리움","프로미스나인"),
				new StackMusic("눈사람","정승환"),
				new StackMusic("눈이오잖아","이무진"),
				new StackMusic("미리 메리 크리스마스","아이유"),
				new StackMusic("크리스마스니까","성시경"),
				new StackMusic("Must Have Love","SG워너비"),
				new StackMusic("로맨틱 겨울","김진표"),
				new StackMusic("화이트","다비치"),
				new StackMusic("겨울고백","박효신")
				);
		
		mp3.goNext();
		mp3.goNext();
		mp3.goNext();
		mp3.goNext();
		mp3.goBack();
		mp3.goBack();
		mp3.goTrack(5);
		mp3.goTrack(2);
		mp3.goTrack(2);

	}

}
