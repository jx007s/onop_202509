package swing_p;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class mainFrame extends JFrame{
	public mainFrame() {
		// TODO Auto-generated constructor stub
		setContentPane(new MainPanel());
		setSize(500, 500);
		setVisible(true);
	}
}

class MainPanel extends JPanel{
	Color color = new Color(0xc0c0c0);
	Graphics gg;
	JButton b1, b2, b3, b4;
	JButton b_red, b_black, b_blue, b_pink, b_yellow;
	//boolean chk = false;
	int shapeSelection = 0;
	int colorSelection = 0;
	
	Point startP = null, endP = null;
	
	/* 직선 리스트 */
	List<Point> startV = new ArrayList();
	List<Point> endV = new ArrayList();
	
	/* 곡선 리스트 */
	List<Point> curveV = new ArrayList();
	
	/*사각형 리스트*/
	List<Point> startR = new ArrayList();
	List<Point> endR = new ArrayList();
	
	/*원 리스트 */
	List<Point> startC = new ArrayList();
	List<Point> endC = new ArrayList();
	
	public MainPanel() {
		// TODO Auto-generated constructor stub
		MouseListner mp = new MouseListner();
		b1 = new JButton("직선"); //0
		b2 = new JButton("곡선"); //1
		b3 = new JButton("사각형");//2
		b4 = new JButton("원");	 //3
		b1.addActionListener(new Line());
		b2.addActionListener(new Curve());
		b3.addActionListener(new Rect());
		b4.addActionListener(new Circle());
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b_red = new JButton("red");
		b_red.addActionListener(new Red());
		add(b_red);
		
		b_black = new JButton("black");
		b_black.addActionListener(new Black());
		add(b_black);
		
		
		this.addMouseListener(mp);
		this.addMouseMotionListener(mp);
	}
	
	class Line implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("직선");
			shapeSelection = 0;
		}
	}
	
	class Curve implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			System.out.println("곡선");
			shapeSelection = 1;
		}
	}
	
	class Rect implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("사각형");
			shapeSelection = 2;
		}
	}
	
	class Circle implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("원");
			shapeSelection = 3;
		}
	}
	class Red implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("빨강");
			colorSelection = 0;
			color = Color.RED;

		}
	}
	class Black implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("검정");
			colorSelection = 1;
			color = Color.BLACK;
			
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		
		if(0==colorSelection) {
			g.setColor(Color.red);
		}else if(1==colorSelection) {
			g.setColor(Color.black);
		}

		if(0 != startV.size()) { // 직선 


			for(int i=0; i<endV.size(); i++){
				Point start = startV.get(i);
				Point end = endV.get(i);
				
				g.drawLine(start.x, start.y, end.x, end.y);
			}
			
			if(null != startP){
				g.drawLine(startP.x, startP.y, endP.x, endP.y);
			}
		}
		
		if(0 != curveV.size()) { //곡선 

			for(int i=1; i<curveV.size(); i++){
				Point start = curveV.get(i-1);
				Point end = curveV.get(i);
				
				if(null == start){
					continue;
				}else if(null == end){
					continue;
				}else{
		
					g.drawLine(start.x, start.y, end.x, end.y);
				}	
			}
		}
		
		if(0 != startR.size()) { //사각형 
			for(int i=0; i<endR.size(); i++){
				Point start = startR.get(i);
				Point end = endR.get(i);
				
				g.drawRect(start.x, start.y, end.x-210, end.y-210);
			}
			
			if(null != startP){
				g.drawRect(startP.x, startP.y, endP.x-210, endP.y-210);
			}

		}
		
		if(0 != startC.size()) { //원 
			for(int i=0; i<endC.size(); i++){
				Point start = startC.get(i);
				Point end = endC.get(i);
				
				g.drawOval(start.x, start.y, end.x-210, end.y-210);
			}
			
			if(null != startP){
				g.drawOval(startP.x, startP.y, endP.x-210, endP.y-210);
			}
		}
	}

	class MouseListner extends MouseAdapter implements  MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			
			if(0==colorSelection) {
				gg.setColor(Color.red);
			}else if(1==colorSelection) {
				gg.setColor(Color.black);
			}
			//gg.setColor(color);

			if(0 ==  shapeSelection) {
				endP = e.getPoint();
			}else if(1 ==  shapeSelection) {
				curveV.add(e.getPoint());
			}else if(2 ==  shapeSelection) {
				//endR.add(e.getPoint());
			}else if(3 ==  shapeSelection) {
				//endC.add(e.getPoint());
			}
		
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			//super.mousePressed(e);
			
			if(0 ==  shapeSelection) {
				startP = e.getPoint();
				startV.add(e.getPoint());
			}else if(1 ==  shapeSelection) {
				curveV.add(null);
				curveV.add(e.getPoint());
			}else if(2 ==  shapeSelection) {
				startR.add(e.getPoint());
			}else if(3 ==  shapeSelection) {
				startC.add(e.getPoint());
			}
	
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//super.mouseReleased(e);
			if(0 ==  shapeSelection) {
				endP = e.getPoint();	
				endV.add(e.getPoint());
			}else if(1 ==  shapeSelection) {
				
			}else if(2 ==  shapeSelection) {
				endR.add(e.getPoint());
			}else if(3 ==  shapeSelection) {
				endC.add(e.getPoint());
			}
			
			repaint();
		}
		
	}
	
}

public class JPaintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(args.length);
		new mainFrame();
		
	}

}
