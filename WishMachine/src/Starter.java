import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Starter
{	
	public static void main(String[] args)
	{
		Frame frame = new Frame();
	}
}

class Panel extends JPanel
{
	int val = 0;
	
	public Panel()
	{
		setLayout(null);
		
		String str[] = new String [10];
		
		str[0] = "Да";
		str[1] = "Нет";
		str[2] = "Может быть";
		str[3] = "Скорее да чем нет";
		str[4] = "Скорее нет чем да";
		str[5] = "Однозначно нет";
		str[6] = "Конечно да";
		str[7] = "Трудно ответить";
		str[8] = "Я не вижу этого в твоем будущем";
		str[9] = "У тебя все получится";
		
		double rand = Math.random() * 10;
		int rand1 = (int) rand;
		
		Font btnFont = new Font("arial", 1, 20);
		
		JButton btn = new JButton();
		add(btn);
		btn.setSize(150, 50);
		btn.setLocation(170, 380);
		btn.setText("Predict");
		btn.setFont(btnFont);
		
		btn.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{	
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception ex)
				{
					
				}
				
				JOptionPane.showMessageDialog(null, str[rand1]);
				System.exit(0);
			}
				});	
		
		Timer tm = new Timer(200, new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				val ++;
				if(val == 256) val = 0;
				repaint();
			}
				});
		tm.start();
	}
	
	public void paintComponent(Graphics gr)
	{		
		super.paintComponent(gr);

		for(int i = 0; i <= 255; i ++)
		{	
			gr.setColor(new Color (180, (i * val) % 255, 255));
			gr.drawRect(245 - i / 2, 220 - i / 2, i, i);
		}
	}
}

class Frame extends JFrame
{
	JTextArea text;
	Font textFont = new Font("arial", 0, 20);
	
	public Frame()
	{		
		setTitle("Future visor");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Panel panel = new Panel();
		Container cont = getContentPane();
		cont.add(panel);
		
		text = new JTextArea();
		text.setFont(textFont);
		text.setBounds(15, 15, 450, 50);
		panel.add(text);
	}
}