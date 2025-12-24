package coll_p;

import java.util.Map;
import java.util.TreeMap;

public class WordCntMain {

	public static void main(String[] args) {
		 String news = "'과유불급'이라 했다. '지나침은 미치지 못함과 같다'라는 뜻이다.\r\n"
		 		+ "FA '거품'은 알면서도 커진다. 필요한 선수는 시장 가격을 훨씬 웃도는 돈으로 잡을 수밖에 없다. '패닉 바이'도 나온다.\r\n"
		 		+ "하지만 무턱대고 해당 선수를 사지는 않는다. 일단 성적이 좋아야 한다. 가능성도 봐야 한다. 셀러리캡을 준수하는 선이어야 한다.\r\n"
		 		+ "FA이지만 아직도 계약을 하지 않고 있는 선수는 손아섭, 조상우, 김범수, 홍건희다.\r\n"
		 		+ "계약이 늦어지고 있는 것은 역시 몸값 때문이다. 선수는 FA 프리미엄 등을 내세우며 한 푼이라도 많이 받으려고 한다. 한 선수는 성적에 비해 지나친 금액을 요구하고 있는 것으로 전해졌다.\r\n"
		 		+ "그런데 이들에 대한 구단들의 반응은 뜨뜻미지건하다. 아예 쳐다보지 않을 수도 없고, 그렇다고 '애원'하지도 않는다. 잡으면 좋고, 잡지 않아도 그리 큰 데미지를 입는 것도 아니다. 이들의 성적이 그리 매력적이지 않기 때문이다.\r\n"
		 		+ "그런데도 이들은 FA 프리미엄을 등에 업고 큰 돈을 요구하고 있는 것으로 전해진다. 구단들은 시간은 자기 편이라며 계약을 서두르지 않고 있다. 샐러리캡 때문에 이들이 요구하는 금액을 맞춰줄 수 없다는 구단도 있다. 결국 이들의 몸값이 내려그가길 기다리겠다는 것이다. 그렇게 되면 이들은 어쩔 수 없이 헐값에라도 계약을 해야 한다. 1년 계약을 할 선수가 나올 수 있는 이유다. 최악의 경우 FA 미아가 될 수도 있다.\r\n"
		 		+ "강백호의 100억원, 박찬호의 80억원, 김현수의 3년 50억원 등 올해 FA들의 '거품' 금액이 이들에게 영향을 미쳤을 수 있다. 하지만 이들 대부분은 내년에도 소속 팀에서 몸값을 할 수 있는 선수들이다. 반면 아직 계약을 하지 못하고 있는 FA들은 내년 어떤 성적을 올릴지 알 수 없다.\r\n"
		 		+ "그럼에도 불구하고 구단들은 이들을 보유하는 것이 전력 유지 또는 향상에 도움이 될 것이라는 점을 잘 알고 있기에 결국에는 적당한 선에서 계약을 체결할 것으로 보인다.";
		 
		 news = news.replaceAll("\r\n", " ").replaceAll(",", " ")
				 	.replaceAll("[.]", " ").replaceAll("'", " ")
				 	.replaceAll("  ", " ").replaceAll("  ", " ").trim();
		 //System.out.println(news);
		 
		 TreeMap word = new TreeMap();
		 for (String ttt : news.split(" ")) {
			//System.out.println(ttt);
			int cnt = 1;
			if(word.containsKey(ttt)) {
				cnt+=(int)word.get(ttt);
			}
			word.put(ttt,cnt);
		 }
		 for (Object obj : word.entrySet()) {
			Map.Entry me = (Map.Entry)obj;
			System.out.println(me.getKey()+" : "+"⭐".repeat((int)me.getValue()));
		}
	}

}
