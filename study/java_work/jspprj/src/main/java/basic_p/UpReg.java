package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

/**
 * Servlet implementation class UpReg
 */
@WebServlet("/UpReg")
@MultipartConfig(maxFileSize = 1024*1024*20)
public class UpReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpReg() {
        super();
        // TODO Auto-generated constructor stub
    }

        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet 실행");
		
		//일반 input 가져옴 - 파라미터를 문자열로 받음
		System.out.println("pname : "+request.getParameter("pname"));
		// file type은 null
		System.out.println("ff1 : "+request.getParameter("ff1"));
		
		System.out.println("getPart ----------------------");
		Part ff1 = request.getPart("ff1");   //multiple 처리 못함
		System.out.println("getName : "+ff1.getName());  //파리미터 이름
		System.out.println("getContentType : "+ff1.getContentType());//파일종류
		System.out.println("getSize : "+ff1.getSize());//파일크기
		System.out.println("getSubmittedFileName : "+ff1.getSubmittedFileName());//업로드파일명
					//파일이 없을 경우getSubmittedFileName() == ""
		
		// 저장할 폴더 위치
		//배포시
		String dst = request.getServletContext().getRealPath("up")+"\\";
		//이클립스 작업시
		dst = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\jspprj\\src\\main\\webapp\\up\\";
		System.out.println("dst:"+dst);
		
		//파일이 업로드 되었다면
		if(!ff1.getSubmittedFileName().equals("")) {
		
			// 파일 쓰기 --> 저장
			ff1.write(dst+ff1.getSubmittedFileName());
			
			//임시폴더에 업로드된 파일 삭제
			ff1.delete();
		}
			
		
		
		
		
		//파라미터들을 객체로 받음
		Collection<Part> pps = request.getParts();  //multiple 처리가능
		System.out.println("pps ----------------------");
		for (Part part : pps) {
			String ttt = part.getName()+"\t"+
						part.getContentType()+"\t"+
						part.getSize()+"\t"+
						part.getSubmittedFileName();
			System.out.println(ttt);
			
			
			if(part.getName().equals("ff2") &&  			// ff2 만 저장 
				!part.getSubmittedFileName().equals("")	// 업로드파일 존재시 저장
				) {
				System.out.println("ff2 저장");
				// 파일 쓰기 --> 저장
				part.write(dst+part.getSubmittedFileName());
				
				//임시폴더에 업로드된 파일 삭제
				part.delete();
			}
			
		}
		
		
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter()
		.append("<html>")
		.append("<body>")
		.append("UpReg  진입")
		.append("<script>")
		.append("alert('파일저장')")
		.append("</script>")
		.append("</body>")
		.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
                               forward
file/joinForm.jsp  --> JoinReg ---------> file/joinReg.jsp 
이력서 폼을 구현하세요

입력내용

이름,생년월일,주소,사진

사진은 이미지(gif,png,jpeg,jpg,bmp) 만 가능

모든 입력내용은 필수



전송 후 

확인 페이지에서 이름, 생년월일,주소,사진 보여주세요

 * */



