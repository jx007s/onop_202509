package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
RegexJoinMain
/ 회원 가입 유효성 검사를 실시하세요
1. 아이디 : 영문 숫자 조합(4자이상)
2. 비번 , 비번확인(5자이상, 대소문자,특수문자조합 ) 
3. 이메일  -  아이디:영문,숫자(3글자이상)   @  도메인 : 영문 점
4. 이름 (한글만 가능) 2~5자
5. 주민번호 
6. 사진 첨부-->영문,숫자(3글자 이상).이미지 확장자
이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음

7. 우편번호 검색 - 구단위 (초성검색)
예외처리로 처리할 것
 * */
public class RegexJoinMain {

	public static void main(String[] args) {
		
		class RegexMember{
			Scanner sc = new Scanner(System.in);
			String [] title = "아이디,비번,비번확인,이메일,이름,주민번호,사진,우편번호".split(",");
			String [] data = new String[title.length];
			
			String [][] ppArr = {
					{"[a-zA-Z0-9]{4,}"},
					{"[a-zA-Z!@#$%&]{5,}",".*[A-Z].*",".*[a-z].*",".*[!@#$%&].*"},
					{},
					{"[a-zA-Z0-9]{3,}@[a-zA-Z.]{3,}"},
					{"[가-힣]{2,5}"},
					{"\\d{6}-\\d{7}"},
					{"[a-zA-Z0-9]{3,}[.](jpg|jpeg|bmp|png|gif)"},
					{"[가-힣ㄱ-ㅎ0-9]+"}
			};
			
			String [] guArr =  {
		            "해솔구","은빛구","푸른강구","하늘숲구","별빛구","동백구","가온구","다온구","새론구","미르구",
		            "한결구","바람구","노을구","솔마루구","달샘구","참누리구","여울구","아라구","늘봄구","한울구"
		      };
			@Override
			public String toString() {
				
				String ttt ="";
				
				for (int i = 0; i < title.length; i++) {
					ttt += title[i]+" : " + data[i] + "\n";
				}
				
				return ttt;
			}
			
			void inputGo(int i) throws Exception {
				System.out.print(title[i]+" : ");
				data[i] = sc.nextLine();
				String schTTT =  data[i];
				if(i==6) {
					schTTT = schTTT.toLowerCase();
				}
				for (String pp : ppArr[i]) {
					if(!Pattern.matches(pp,schTTT)) {
						throw new Exception(title[i]+"에러");
					}
				}
				if (i==7) {
				
					guSchGo(data[i]);
				}
				
			}
			
			void guSchGo(String ppData) {
				String index= "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅃㅉㄸㄲㅆ";
				String start = "가나다라마바사아자차카타파하빠짜따까싸";
				String end =   "깋닣딯맇밓빟싷잏짛칳킿팋핗힣삫찧띻낗앃";
				
				String schPP = ".*";
				for (char ch : ppData.toCharArray()) {
					
					if(Pattern.matches("[ㄱ-ㅎ]", ch+"")) {
						int pos =  index.indexOf(ch);
						schPP += "["+start.charAt(pos)+"-"+end.charAt(pos)+"]";
					}else {
						schPP += ch;
					}
				}
				schPP += ".*";
				String res = "";
				for (String gu : guArr) {
					if(Pattern.matches(schPP, gu)) {
						res+=gu+",";
					}
				}
				System.out.println("구검색하지롱 : "+ppData+" , "+schPP+","+res);
			}
			
			void pwEqChk() throws Exception {
				
				System.out.print(title[2]+" : ");
				data[2] = sc.nextLine();
				
				if(!data[1].equals(data[2])) {
					throw new Exception("비밀번호 확인 에러");
				}
			}

			void inputAll() throws Exception {
				for (int i = 0; i < ppArr.length; i++) {
					 
					if(i==2) {
						pwEqChk();
					
					}else {
						inputGo(i);
					}
				}
			}
			
		}
		
		
		
		while(true) {
			
			RegexMember mem = new RegexMember();
			
			try {
				mem.inputAll();
				
				System.out.println(mem);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("회원가입 완료");

	}

}
