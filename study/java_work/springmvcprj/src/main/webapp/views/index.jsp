<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>springMvc입니다</title>
</head>
<body>
<h1>springMvc입니다</h1>
<h2>request</h2>
<a href="/req/getGo">get</a>
<a href="/req/exam">exam</a>
<a href="/req/buyOrder">buyOrder</a>
<h2>return</h2>
<a href="/ret/vv">vv</a>
<a href="/ret/vv2">vv2</a>
<a href="/ret/vv3">vv3</a>
<a href="/ret/moAndvv">modelAndView</a>
<a href="/ret/pp1">pp1</a>
<a href="/ret/pp2">pp2</a>
<a href="/ret/per">per</a>
<a href="/ret/arr">arr</a>
<a href="/ret/map">map</a>
<a href="/ret/obj1">obj1</a>
<a href="/ret/obj2">obj2</a>

<h2>rest</h2>
<a href="/rest/vv">vv</a>
<a href="/rest/vv2">vv2</a>
<a href="/rest/vv3">vv3</a>
<a href="/rest/moAndvv">modelAndView</a>
<a href="/rest/pp1">pp1</a>
<a href="/rest/pp2">pp2</a>
<a href="/rest/per">per</a>
<a href="/rest/arr">arr</a>
<a href="/rest/map">map</a>
<a href="/rest/obj1">obj1</a>
<a href="/rest/obj2">obj2</a>

<h2>file</h2>
<a href="/file">form</a>

<h2>cookie</h2>
<a href="/coo/make">쿠키생성</a>
<a href="/coo/view">쿠키보기</a>
<a href="/coo/modify">쿠키수정</a>
<a href="/coo/delete">쿠키삭제</a>
<a href="/coo/logMain">로그인</a>

<h2>session</h2>
<a href="/session/make">세션생성</a>
<a href="/session/view">세션보기</a>
<a href="/session/modify">세션수정</a>
<a href="/session/delete">세션삭제</a>
<a href="/session/logMain">로그인</a>

<h2>model</h2>
<a href="/mmm/hello">hello1</a>
<a href="/mmm/hello?zipcode=111&addr1=서울&addr2=남산">hello2</a>
<a href="/mmm/hello?zipcode=222&addr1=서울&addr2=코엑스">hello3</a>
<a href="/mmm/history">history1</a>
<a href="/mmm/history?zipcode=111&addr1=창원&addr2=sk테크노파크">history2</a>
<a href="/mmm/history?zipcode=222&addr1=창원&addr2=성산아트홀">history3</a>
<a href="/company">회사</a>

<h2>path</h2>
<a href="/path/info/aaa/detail">info/aaa/detail</a>
<a href="/path/info/aaa/insert">info/aaa/insert</a>
<a href="/path/gall/aaa/detail">gall/aaa/detail</a>
<a href="/path/gall/aaa/list">gall/aaa/list</a>
<a href="/path/product/aaa/modify">product/aaa/modify</a>
<br/>
<a href="/path/info/bbb">info/bbb</a>
<a href="/path/gall/bbb">gall/bbb</a>
<a href="/path/info/27">info/27</a>
<a href="/path/gall/15">gall/15</a>
<br/>
<a href="/path/info/ddd/detail">info/ddd/detail</a>
<a href="/path/info/ddd/insert">info/ddd/insert</a>
<a href="/path/gall/ddd/detail">gall/ddd/detail</a>
<a href="/path/gall/ddd/list">gall/ddd/list</a>
<a href="/path/product/ddd/modify">product/ddd/modify</a>
<br/>
<a href="/path/info/ddd/detail?pNo=10">info/ddd/detail?pNo</a>
<a href="/path/info/eee/detail/20">info/eee/detail/20</a>
<a href="/path/info/eee/detail/20?pNo=30">info/eee/detail/20?pNo</a>
<h2>pc</h2>
<a href="/pc/mlist">mlist</a>
<a href="/pc/mdetail">mdetail</a>
<a href="/pc/minsert">minsert</a>
<a href="/pe/peList">학생목록</a>
<a href="/pe/peDetail/aaa">학생상세</a>
<a href="/pe/peInsert?id=ddd&kor=78&eng=65&mat=82">학생추가</a>

<h3><a href="/val">validate</a></h3>
<h3><a href="/val/join">join</a></h3>
<h3><a href="/initGo?birth=1999-03-20">initGo</a></h3>
<h3><a href="/initGo2?reg_date=2011-08-15">initGo2</a></h3>
<h2>intercepter</h2>
<a href="/inter/event/abc">abc</a>
<a href="/inter/event/efg">efg</a>
<a href="/inter/event/hij">hij</a>
</body>
</html>