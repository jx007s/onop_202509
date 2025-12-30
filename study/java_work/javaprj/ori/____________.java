package swing_p;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EscapeMain extends JFrame{
	
	Timer timer;
	JLabel timerDp;
	int width;
	int height;
	Unit air;
	ArrayList<Ball> balls;
	ArrayList<Thread> ballThrs;
	long time;
	
	public EscapeMain()
	{
		setBounds(300,300,600,500);
		setLayout(null);

		timer = new Timer();
		timer.start();
		
		timerDp=new JLabel("0");
		timerDp.setBounds(10,10,70,30);
		add(timerDp);
		
		width = getWidth();
		height = getHeight();
		
		int ballNum=5;
		balls = new ArrayList<>();
		ballThrs = new ArrayList<>();
		for(int i=0; i<ballNum; ++i)
		{
			balls.add(new Ball());
			ballThrs.add(new Thread(balls.get(i)));
			add(balls.get(i));
			ballThrs.get(i).start();
		}
		
		air = new Unit();
		add(air);
		
		AddBall ab = new AddBall(timer); 
		ab.start();
		
		
//		addKeyListener(new KeyListener()
//		{
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//			}
//
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//				int keyCode = e.getKeyCode();
//				if(keyCode==37)
//				{
//					System.out.println("Moving");
//					air.setLocation(air.getX()-20,air.getY());					
//				}
//				if(keyCode==38)
//				{
//					System.out.println("Moving");
//					air.setLocation(air.getX(),air.getY()-20);
//				}
//				if(keyCode==39)
//				{
//					System.out.println("Moving");
//					air.setLocation(air.getX()+20,air.getY());
//				}
//				if(keyCode==40)
//				{
//					System.out.println("Moving");
//					air.setLocation(air.getX(),air.getY()+20);
//				}
//			}
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				air.setLocation(e.getX()-25,e.getY()-35);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	private void addBall()
	{
		Ball ball = new Ball();
		Thread bThr = new Thread(ball);
		add(ball);
		bThr.start();
		balls.add(ball);
		ballThrs.add(bThr);
	}
	
	
	private void ballStop()
	{
		for(Ball ball : balls)
		{
			ball.move = false;
		}
		timer.playing=false;
	}

	
	
	class AddBall extends Thread
	{
		Timer timer;
		
		AddBall(Timer timer)
		{
			super();
			this.timer = timer;
		}
		
		@Override
		public void run()
		{
			out : while(timer.playing)
			try {
				Thread.sleep(3000);
				while(!timer.playing) break out;
				addBall();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	class Timer extends Thread
	{
		long start = System.currentTimeMillis();
		long time;
		boolean playing = true;
		
		@Override
		public void run()
		{
			while(playing)
			{
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				time = System.currentTimeMillis()-start;
				timerDp.setText(String.valueOf(time));
			}
		}
	}
	
	class Unit extends JPanel
	{
		Unit()
		{
			setBounds(width/2,height/2,35,35);
			setBackground(Color.PINK);
		}
	}
	
	
	class Ball extends JButton implements Runnable
	{
		double slope;
		double yIntercept;
		double x;
		double y;
		double dir;
		boolean move = true;
		
		Ball()
		{
			super();
			slope = Math.random()*2;
			while(x <= width/4 && y <=height/4)
			{
				x = Math.random()*width;
				y = Math.random()*height;
			}
			yIntercept = y-slope*x;
			dir = 1/slope*2;
			
			setBounds((int)x,(int)y,10,10);
		}
		
		@Override
		public void run()
		{
			while(move)
			{
				try
				{
					Thread.sleep(10);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				if(y<=0 || y>=height)
				{
					slope = -slope;
					yIntercept = y-slope*x;
				}
				if(x<=0 || x>=width)
				{
					slope = -slope;
					yIntercept = y-slope*x;
					dir= -dir;
				}
				
				setLocation((int)(Math.abs(x%width)),(int)(Math.abs((x*slope+yIntercept)%height)));
				
				double airX = air.getX();
				double airY = air.getY();
				
				if(airX<=x && x <= airX+air.getWidth() && airY<=y && y <= airY+air.getHeight())
				{
					EscapeMain.this.ballStop();
					
					JDialog end = new JDialog(new JFrame(),"게임오버",true);
					end.setLayout(new FlowLayout());
					end.setBounds(300,400,200,100);
					end.addWindowListener(new WindowListener()
							{
								@Override
								public void windowOpened(WindowEvent e) {
									// TODO Auto-generated method stub
								}

								@Override
								public void windowClosing(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void windowClosed(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void windowIconified(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void windowDeiconified(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void windowActivated(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}

								@Override
								public void windowDeactivated(WindowEvent e) {
									// TODO Auto-generated method stub
									
								}
						
							});
					
					
					JLabel jl = new JLabel("게임이 종료되었습니다.");
					JButton jb = new JButton("종료");
					jb.addActionListener(action ->{
						System.exit(0);
					}); 
					
					end.add(jl);
					end.add(jb);
					end.setVisible(true);
					
					break;
				}
				x+=dir;
				y = x*slope+yIntercept;
			}
		}

	}
	
	public static void main(String[] args) {
		new EscapeMain();
	}
}