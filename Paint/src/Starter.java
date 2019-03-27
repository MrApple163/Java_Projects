import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Starter
{
	public static void main(String[] args)
	{
		Frame frame = new Frame();
	}
}

class Frame extends JFrame
{
	public Frame()
	{
		setSize(717, 500);
		setLocationRelativeTo(null);
		setTitle("Demo");
		Panel panel = new Panel();
		Container cont = getContentPane();
		cont.add(panel);
		setVisible(true);
	}
}

class Panel extends JPanel
{
	Color[] masColor;
	int tColor = 0;
	int mX, mY;
	Boolean flag = false;
	
	public Panel()
	{
	addMouseListener(new Mouse1());
	addMouseMotionListener(new Mouse2());
	
	setBackground(Color.blue);
	}
	
	public void paintComponent(Graphics gr)
	{		
		masColor = new Color[7];
		masColor[0] = Color.BLACK;
		masColor[1] = Color.GRAY;
		masColor[2] = Color.ORANGE;
		masColor[3] = Color.RED;
		masColor[4] = Color.BLUE;
		masColor[5] = Color.GREEN;
		masColor[6] = Color.WHITE;
		
		gr.setColor(Color.BLACK);
		gr.fillRect(671, 431, 30, 30);
		
		for(int i = 0; i < 7; i ++)
		{
			gr.setColor(masColor[i]);
			gr.fillRect(i*100, 0, 100, 50);
		}
//-----------------------------------------------------// создане рамки		
		gr.setColor(Color.DARK_GRAY);
		gr.fillRect(0, 48, 717, 4);
		gr.fillRect(98, 0, 4, 50);
		gr.fillRect(198, 0, 4, 50);
		gr.fillRect(298, 0, 4, 50);
		gr.fillRect(398, 0, 4, 50);
		gr.fillRect(498, 0, 4, 50);
		gr.fillRect(598, 0, 4, 50);
//-----------------------------------------------------// создание рамки	
		if (flag == true)
		{
			gr.setColor(masColor[tColor]);
			gr.fillRect(mX, mY, 5, 5);
		}	
	}
	
	public class Mouse1 implements MouseListener
	{
		public void mouseClicked(MouseEvent e)
		{
			
		}
		
		public void mousePressed(MouseEvent e)
		{
			int tX = e.getX();
			int tY = e.getY();
			int num = e.getClickCount();
			int butt = e.getButton();
			
			if ((tX > 0) && (tX <700) && (tY > 0) && (tY < 50))
			{
				if (num == 1)
				{
					if (butt == 1)
					{
						tColor = tX / 100;
					}
				}
			}
			
			if((tX > 671) && (tX < 701) && (tY > 431) && (tY < 460))
			{
				System.exit(0);
			}
		}
		
		public void mouseReleased(MouseEvent e)
		{
			
		}
		
		public void mouseEntered(MouseEvent e)
		{
			
		}
		
		public void mouseExited(MouseEvent e)
		{
			
		}
	}
		public class Mouse2 implements MouseMotionListener
		{
		public void mouseDragged(MouseEvent e)
		{
			int tX = e.getX();
			int tY = e.getY();
			
			if(tY > 50)
			{
				mX = tX;
				mY = tY;
				flag = true;
				repaint();
			}
		}
		
		public void mouseMoved(MouseEvent e)
		{
			int tX = e.getX();
			int tY = e.getY();
			
			if(((tX > 0) && (tX < 700) && (tY > 0) && (tY < 50)) ||
					((tX > 671) && (tX < 701) && (tY > 431) && (tY < 461)))
			{
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			else
			{
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		}
	}
}

