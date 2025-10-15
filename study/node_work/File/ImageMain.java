package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.PixelGrabber;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageMain extends JFrame implements MouseMotionListener,MouseListener{
	
	Image img;
	Graphics gg;
	int imgX = 0,imgY = 200;
	int btSetX = 0,btSetXMax = 300, btSetY = 0;
	ImageIcon st = new ImageIcon("./fff/color.png");
	Image st2 = st.getImage();
	Color c = Color.BLACK;
	JFrame f1;
	JLabel jj;
	String mod = "l";
	boolean drag = false;
	String modd = "l,r,o";
	
	
	public static Map<String,Color> colorMap = new LinkedHashMap<String,Color>() {{
		put("BLACK",Color.BLACK);
		put("WHITE",Color.WHITE);
		put("RED",Color.RED);
		put("GREEN",Color.GREEN);
		put("BLUE",Color.BLUE);
		put("YELLOW",Color.YELLOW);
		put("PINK",Color.PINK);
		put("ORANGE",Color.ORANGE);
		put("MAGENTA",Color.MAGENTA);
		put("CYAN",Color.CYAN);
		put("DARK_GRAY",Color.DARK_GRAY);
		put("GRAY",Color.GRAY);
		put("LIGHT_GRAY",Color.LIGHT_GRAY);
	}};
	
	public ImageMain() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 800, 800);
		setLayout(null);
		
		
		for(Map.Entry<String, Color> cc: colorMap.entrySet()) {
			JButton j = new JButton(cc.getKey());
			j.setBackground(cc.getValue());
			if(btSetX==btSetXMax) {
				btSetY+=50;
				btSetX=0;
			}
			j.setBounds(btSetX, btSetY, 50, 50);
			btSetX+=50;
			j.setForeground(cc.getValue());;
			add(j);
			j.addActionListener(new BtnListener() );
		}
		
		String[] sp = modd.split(",");
		for(String str : modd.split(",")) {
			JButton j = new JButton(str);
			j.setBounds(btSetXMax, 0, 50, 150);
			btSetXMax += 50;
			add(j);
			j.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					mod=str;
				}
			});
		}
		
		
		
		ImageIcon pr = new ImageIcon("./fff/paret.jpg");
		JButton j = new JButton(pr);
		j.setBounds(btSetXMax, 0, 50, 150);
		btSetXMax += 50;
		add(j);
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cc();
			}
		});
			
		repaint();
		setVisible(true);
		
		img = createImage(800, 600);
		gg = img.getGraphics();
		gg.setColor(Color.white);
		gg.fillRect(0, 0, img.getWidth(rootPane), img.getHeight(rootPane));
		repaint();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void rr(MouseEvent e) {
		gg.setColor(c);
		gg.drawLine(x1, y1, e.getX()-imgX, e.getY()-imgY);
		x1=e.getX()-imgX;
		y1=e.getY()-imgY;
	}
	
	public void cc() {
		f1 = new JFrame("파레트");
		f1.setBounds(getX()+getWidth(), 100, 600,  500);
		f1.setLayout(null);
		
		JLabel qq = new JLabel(st);
		qq.setBounds(10, 10,st.getIconWidth(), st.getIconHeight());
		//f1.addMouseListener(new ML());
		f1.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int [] xxx = new int[1] ;
				PixelGrabber grab = 
					    new PixelGrabber(st.getImage(), e.getX()-15, e.getY(), 1, 1, xxx, 0, 1 );
				//색추출할 이미지, 추출할픽셀 x,y좌표 ,추출할픽셀 범위x,y , rgb값 저장할 배열, 배열에 저장위치,길이
				try {
					grab.grabPixels();
				} catch (InterruptedException ee) {
					// TODO Auto-generated catch block
					ee.printStackTrace();
				}
				
				System.out.println(new Color(xxx[0]));
				c = new Color(xxx[0]);
				jj.setBackground(c);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		f1.add(qq);
		
		jj = new JLabel("현재색");
		jj.setBackground(c);
		jj.setBounds(300,0,50,50);
		jj.setOpaque(true);
		f1.add(jj);
		f1.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		g.drawImage(img, imgX , imgY , this);
		
		//repaint();
	}

	public static void main(String[] args) {
		new ImageMain();
	}
	
	int x = 30;
	int x1, y1;
	@Override
	public void mouseDragged(MouseEvent e) {
		boolean onPan =  e.getY()>imgY; //위쪽에선 동작안하게..
		if(onPan) {
			System.out.println(e.getModifiersEx());
			if(mod.equals("l")) {
				if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
				{
					gg.setColor(c);
					gg.drawLine(x1, y1, e.getX()-imgX, e.getY()-imgY);
					x1=e.getX()-imgX;
					y1=e.getY()-imgY;
					
				}
				if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
				{
					
					gg.setColor(Color.white);
					gg.fillRect(e.getX()-x/2, e.getY()-x/2-200, x, x);
		
				}
				repaint();
			}
		}
			//도형 크기 드래그도중에도 그려지게 하고싶었지만 크기를 늘렷다가 다시줄일때 자국이 남았ㅅ습니다.
		/*	if(mod.equals("r")) {		
				System.out.println(Math.min(x1,((e.getX()-imgX))));
				gg.setColor(c);
				gg.drawRect(Math.min(x1,((e.getX()-imgX))), Math.min(y1,((e.getY()-imgY))),
						Math.abs(x1-(e.getX()-imgX)), Math.abs(y1-(e.getY()-imgY)));
				repaint();
				gg.setColor(Color.white);
				gg.drawRect(Math.min(x1,((e.getX()-imgX))), Math.min(y1,((e.getY()-imgY))),
						Math.abs(x1-(e.getX()-imgX)), Math.abs(y1-(e.getY()-imgY)));
				gg.fillRect(Math.min(x1,((e.getX()-imgX))), Math.min(y1,((e.getY()-imgY))),
						Math.abs(x1-(e.getX()-imgX)), Math.abs(y1-(e.getY()-imgY)));
			}*/
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x1=e.getX()-imgX;
		y1=e.getY()-imgY;
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(mod.equals("r")) {
			gg.setColor(c);
			gg.drawRect(Math.min(x1,((e.getX()-imgX))), Math.min(y1,((e.getY()-imgY))),
					Math.abs(x1-(e.getX()-imgX)), Math.abs(y1-(e.getY()-imgY)));
		}
		if(mod.equals("o")) {
			gg.setColor(c);
			gg.drawOval(Math.min(x1,((e.getX()-imgX))), Math.min(y1,((e.getY()-imgY))),
					Math.abs(x1-(e.getX()-imgX)), Math.abs(y1-(e.getY()-imgY)));
		}
		repaint();
	}
	
	class BtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println( colorMap.get(e.getActionCommand()));
			c = colorMap.get(e.getActionCommand());
		}
		
	}
	
}
