package lambda_p;

import java.util.Arrays;
import java.util.OptionalInt;

public class AggredateMain {

	public static void main(String[] args) {
		int [] arr = {33,88,11,66,22,44,77,55};
		
		System.out.println("count:"+Arrays.stream(arr).count());
		System.out.println("findFirst:"+Arrays.stream(arr).findFirst());
		//OptionalInt[33]
		System.out.println("findFirst.getAsInt():"+Arrays.stream(arr).findFirst().getAsInt());
		//33 -- 데이터가 있을 경우 getAsInt() 정상 처리됨
		System.out.println("max:"+Arrays.stream(arr).max());
		System.out.println("min:"+Arrays.stream(arr).min());
		System.out.println("sum:"+Arrays.stream(arr).sum());
		System.out.println("average:"+Arrays.stream(arr).average());
		
		System.out.println("값이 없을 경우 --------------------");
		arr = new int[]{};
		System.out.println("count:"+Arrays.stream(arr).count());
		System.out.println("findFirst:"+Arrays.stream(arr).findFirst());
		// OptionalInt.empty
		// System.out.println("findFirst:"+Arrays.stream(arr).findFirst().getAsInt());
		// 에러발생  데이터가 없어서 변환 불가
		
		// 방법 1
		OptionalInt oint = Arrays.stream(arr).findFirst();
		System.out.println(oint);
		System.out.println(oint.isPresent());  // 값이 존재 : true, 값이 없으면 : false
		
		if(!oint.isPresent()) {
			System.out.println("값이 없음");
		}
		
		//방법 2
		// orElse(0)  : 값이 있을 경우 값을 int 로 리턴
		//            : 값이 없을 경우 매개변수(0) 을 리턴
		System.out.println("orElse:"+Arrays.stream(arr).findFirst().orElse(0));
		
		// 방법3
		// ifPresent();   : 값이 있을 경우 () 안의 내용 실행
		//				  : 값이 없을 경우 실행안함
		Arrays.stream(arr).findFirst().ifPresent(a->System.out.println("방법3 : "+a));

	}

}
