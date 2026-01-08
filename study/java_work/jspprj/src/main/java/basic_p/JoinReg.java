package basic_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.List;


/**
 * Servlet implementation class JoinReg
 */
@WebServlet("/JoinReg")
@MultipartConfig()
public class JoinReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	List<String> imgExts;
    
    public JoinReg() {
        super();
        imgExts = List.of("gif","png","jpeg","jpg","bmp");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String goUrl = "file/alert.jsp";
		
		Part myPic = request.getPart("myPic");
		
		if(!myPic.getSubmittedFileName().equals("")) { //파일 존재할 경우
			
			
			String fName = myPic.getSubmittedFileName();
			
			String ext = fName.substring(fName.lastIndexOf(".")+1);
			
			
			if(imgExts.contains(ext.toLowerCase())) {  //확장자가 이미지라면
				
				// 저장할 폴더 위치
				//배포시
				String dst = request.getServletContext().getRealPath("up")+"\\";
				//이클립스 작업시
				dst = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\jspprj\\src\\main\\webapp\\up\\";
				
				// 파일 쓰기 --> 저장
				myPic.write(dst+fName);
				
				//임시폴더에 업로드된 파일 삭제
				myPic.delete();
				
				
				goUrl = "file/joinReg.jsp";
				JoinMember mem = new JoinMember(
						request.getParameter("pname"),
						request.getParameter("birth"),
						request.getParameter("addr"),
						fName);
				
				
				
				request.setAttribute("mem", mem);
			}
			
			
			
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(goUrl);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
