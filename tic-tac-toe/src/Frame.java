import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame
{	
	String[] str = new String[9];
	boolean b[] = new boolean[9];
	JLabel[] lab = new JLabel[5];
	int[] list = new int[4];
	int k = 0, k1 = 0, kAI = 0, kx = 0, ko = 0;
	Timer win, AI;
	Font btnF = new Font("arial", 1, 50), LabelF = new Font("arial", 1, 20), aiF = new Font("times new roman", 1, 15);
	
	public Frame(String title)
	{
		//----------------------------------------------------------------------------------------// основа
		setTitle(title);
		setSize(436, 359); // изначальный X = 186
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		Panel panel = new Panel();
		panel.setLayout(null);
		Container cont = getContentPane();
		cont.add(panel);
		
		list[0] = 0; list[1] = 2; list[2] = 6; list[3] = 8;
			//----------------------------------------------------------------------------------------// Надписи
			for (int i = 0; i < 5; i ++)
			{
				lab[i] = new JLabel();
				lab[i].setFont(LabelF);
				panel.add(lab[i]);
			}
			
			lab[0].setText("xXx"); lab[0].setBounds(325, 5, 50, 20);
			lab[1].setText(kx + ""); lab[1].setBounds(325, 25, 50, 20);
			lab[2].setText("o0o"); lab[2].setBounds(375, 5, 50, 20);
			lab[3].setText(ko + ""); lab[3].setBounds(375, 25, 50, 20);
			lab[4].setText("AI:"); lab[4].setBounds(324, 72, 22, 20); lab[4].setFont(aiF);
			//----------------------------------------------------------------------------------------//
		
		JButton[] btn = new JButton[9];
		JButton res = new JButton(), ai = new JButton();
		
		for (int i = 0; i < 9; i ++)
		{
			btn[i] = new JButton();
			btn[i].setSize(100, 100);
			btn[i].setFont(btnF);
			panel.add(btn[i]);
		}
		panel.add(res); panel.add(ai);
		
		for (int i = 0; i < 3; i ++)
		{
			btn[i].setLocation(5+(i*105), 5);
			btn[i+3].setLocation(5+(i*105), 110);
			btn[i+6].setLocation(5+(i*105), 215);
		} 
		res.setSize(85, 20); res.setLocation(324, 47);
		ai.setSize(59, 20); ai.setLocation(350, 72);
		
		for (int i = 0; i < 9; i ++) btn[i].setText("");
		res.setText("reset"); ai.setText("OFF");
		//----------------------------------------------------------------------------------------//
		
		//----------------------------------------------------------------------------------------// обработчики
		res.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				kx = 0; ko = 0; k = 0;
				lab[1].setText(kx + ""); lab[3].setText(ko + "");
				for (int i = 0; i < 9; i ++)
				{
					btn[i].setText(""); b[i] = false; str[i] = "";
				}
			}
				});
		ai.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (kAI % 2 == 0) {AI.start(); kAI ++; ai.setText("ON");}
				else {AI.stop(); kAI ++; ai.setText("OFF");}
			}
				});
		btn[0].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[0] == false)
				{
					k ++; b[0] = true;
					if (k % 2 == 0){btn[0].setText("O"); str[0] = "O";}
					else {btn[0].setText("X"); str[0] = "X";}
				}
			}
				});
		btn[1].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[1] == false)
				{
					k ++; b[1] = true;
					if (k % 2 == 0) {btn[1].setText("O"); str[1] = "O";}
					else {btn[1].setText("X"); str[1] = "X";}
				} 
			}
				});
		btn[2].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[2] == false)
				{
					k ++; b[2] = true;
					if (k % 2 == 0) {btn[2].setText("O"); str[2] = "O";}
					else {btn[2].setText("X"); str[2] = "X";}
				}
			}
				});
		btn[3].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[3] == false)
				{
					k ++; b[3] = true;
					if (k % 2 == 0) {btn[3].setText("O"); str[3] = "O";}
					else {btn[3].setText("X"); str[3] = "X";}
				}
			}
				});
		btn[4].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[4] == false)
				{
					k ++; b[4] = true;
					if (k % 2 == 0) {btn[4].setText("O"); str[4] = "O";}
					else {btn[4].setText("X"); str[4] = "X";}
				}
			}
				});
		btn[5].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[5] == false)
				{
					k ++; b[5] = true;
					if (k % 2 == 0) {btn[5].setText("O"); str[5] = "O";}
					else {btn[5].setText("X"); str[5] = "X";}
				}
			}
				});
		btn[6].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[6] == false)
				{
					k ++; b[6] = true;
					if (k % 2 == 0) {btn[6].setText("O"); str[6] = "O";}
					else {btn[6].setText("X"); str[6] = "X";}
				}
			}
				});
		btn[7].addActionListener(new ActionListener()
				{ 
			public void actionPerformed(ActionEvent e)
			{
				if (b[7] == false)
				{
					k ++; b[7] = true;
					if (k % 2 == 0) {btn[7].setText("O"); str[7] = "O";}
					else {btn[7].setText("X"); str[7] = "X";}
				}
			}
				});
		btn[8].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (b[8] == false)
				{
					k ++; b[8] = true;
					if (k % 2 == 0) {btn[8].setText("O"); str[8] = "O";}
					else {btn[8].setText("X"); str[8] = "X";}
				}
			}
				});
		//----------------------------------------------------------------------------------------//
		
		//----------------------------------------------------------------------------------------// проверка победы
		win = new Timer(250, new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if (str[0] == str[1] & str[0] == str[2] & b[0] == true)
				{
					JOptionPane.showMessageDialog(null, str[0] + " win");
					if (str[0] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[3] == str[4] & str[3] == str[5] & b[3] == true)
				{
					JOptionPane.showMessageDialog(null, str[3] + " win");
					if (str[3] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[6] == str[7] & str[6] == str[8] & b[6] == true)
				{
					JOptionPane.showMessageDialog(null, str[6] + " win");
					if (str[6] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[0] == str[3] & str[0] == str[6] & b[0] == true)
				{
					JOptionPane.showMessageDialog(null, str[0] + " win");
					if (str[0] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[1] == str[4] & str[1] == str[7] & b[1] == true)
				{
					JOptionPane.showMessageDialog(null, str[1] + " win");
					if (str[1] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[2] == str[5] & str[2] == str[8] & b[2] == true)
				{
					JOptionPane.showMessageDialog(null, str[2] + " win");
					if (str[2] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[6] == str[4] & str[6] == str[2] & b[6] == true)
				{
					JOptionPane.showMessageDialog(null, str[6] + " win");
					if (str[6] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
				else if (str[0] == str[4] & str[0] == str[8] & b[0] == true)
				{
					JOptionPane.showMessageDialog(null, str[0] + " win");
					if (str[0] == "X") kx ++;
					else ko ++;
					lab[1].setText(kx + ""); lab[3].setText(ko + "");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					} 
					k = 0;
				}
				else if (k == 9)
				{
					JOptionPane.showMessageDialog(null, "It's a draw!");
					for (int i = 0; i < 9; i ++)
					{
						btn[i].setText("");
						b[i] = false;
						str[i] = "";
					}
					k = 0;
				}
			}
				}); win.start();
		//----------------------------------------------------------------------------------------//
				
		//----------------------------------------------------------------------------------------// ИИ таймер
		AI = new Timer(250, new ActionListener()
				{
			public void actionPerformed(ActionEvent ev)
			{
				if (k - k1 == 1)
				{
					//-----------------------------------------------------// 1o
					if (str[0] == str[1] & b[0] == true & b[2] == false & str[0] == "O")
					{
						k ++; k1 = k; b[2] = true;
						btn[2].setText("O"); str[2] = "O";
					}
					else if (str[1] == str[2] & b[1] == true & b[0] == false & str[1] == "O")
					{
						k ++; k1 = k; b[0] = true;
						btn[0].setText("O"); str[0] = "O";
					}
					else if (str[0] == str[2] & b[0] == true & b[1] == false & str[0] == "O")
					{
						k ++; k1 = k; b[1] = true;
						btn[1].setText("O"); str[1] = "O";
					}
					//-----------------------------------------------------// 2o
					else if (str[3] == str[4] & b[3] == true & b[5] == false & str[3] == "O")
					{
						k ++; k1 = k; b[5] = true;
						btn[5].setText("O"); str[5] = "O";
					}
					else if (str[4] == str[5] & b[4] == true & b[3] == false & str[4] == "O")
					{
						k ++; k1 = k; b[3] = true;
						btn[3].setText("O"); str[3] = "O";
					}
					else if (str[3] == str[5] & b[3] == true & b[4] == false & str[3] == "O")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 3o
					else if (str[6] == str[7] & b[6] == true & b[8] == false & str[6] == "O")
					{
						k ++; k1 = k; b[8] = true;
						btn[8].setText("O"); str[8] = "O";
					}
					else if (str[7] == str[8] & b[7] == true & b[6] == false & str[7] == "O")
					{
						k ++; k1 = k; b[6] = true;
						btn[6].setText("O"); str[6] = "O";
					}
					else if (str[6] == str[8] & b[6] == true & b[7] == false & str[6] == "O")
					{
						k ++; k1 = k; b[7] = true;
						btn[7].setText("O"); str[7] = "O";
					}
					//-----------------------------------------------------// 4o
					else if (str[0] == str[3] & b[0] == true & b[6] == false & str[0] == "O")
					{
						k ++; k1 = k; b[6] = true;
						btn[6].setText("O"); str[6] = "O";
					}
					else if (str[3] == str[6] & b[3] == true & b[0] == false & str[3] == "O")
					{
						k ++; k1 = k; b[0] = true;
						btn[0].setText("O"); str[0] = "O";
					}
					else if (str[0] == str[6] & b[0] == true & b[3] == false & str[0] == "O")
					{
						k ++; k1 = k; b[3] = true;
						btn[3].setText("O"); str[3] = "O";
					}
					//-----------------------------------------------------// 5o
					else if (str[1] == str[4] & b[1] == true & b[7] == false & str[1] == "O")
					{
						k ++; k1 = k; b[7] = true;
						btn[7].setText("O"); str[7] = "O";
					}
					else if (str[4] == str[7] & b[4] == true & b[1] == false & str[4] == "O")
					{
						k ++; k1 = k; b[1] = true;
						btn[1].setText("O"); str[1] = "O";
					}
					else if (str[1] == str[7] & b[1] == true & b[4] == false & str[1] == "O")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 6o
					else if (str[2] == str[5] & b[2] == true & b[8] == false & str[2] == "O")
					{
						k ++; k1 = k; b[8] = true;
						btn[8].setText("O"); str[8] = "O";
					}
					else if (str[5] == str[8] & b[5] == true & b[2] == false & str[5] == "O")
					{
						k ++; k1 = k; b[2] = true;
						btn[2].setText("O"); str[2] = "O";
					}
					else if (str[2] == str[8] & b[2] == true & b[5] == false & str[2] == "O")
					{
						k ++; k1 = k; b[5] = true;
						btn[5].setText("O"); str[5] = "O";
					}
					//-----------------------------------------------------// 7o
					else if (str[0] == str[4] & b[0] == true & b[8] == false & str[0] == "O")
					{
						k ++; k1 = k; b[8] = true;
						btn[8].setText("O"); str[8] = "O";
					}
					else if (str[4] == str[8] & b[4] == true & b[0] == false & str[4] == "O")
					{
						k ++; k1 = k; b[0] = true;
						btn[0].setText("O"); str[0] = "O";
					}
					else if (str[0] == str[8] & b[0] == true & b[4] == false & str[0] == "O")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 8o
					else if (str[2] == str[4] & b[2] == true & b[6] == false & str[2] == "O")
					{
						k ++; k1 = k; b[6] = true;
						btn[6].setText("O"); str[6] = "O";
					}
					else if (str[4] == str[6] & b[4] == true & b[2] == false & str[4] == "O")
					{
						k ++; k1 = k; b[2] = true;
						btn[2].setText("O"); str[2] = "O";
					}
					else if (str[2] == str[6] & b[2] == true & b[4] == false & str[2] == "O")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 1X
					else if (str[0] == str[1] & b[0] == true & b[2] == false & str[0] == "X")
					{
						k ++; k1 = k; b[2] = true;
						btn[2].setText("O"); str[2] = "O";
					}
					else if (str[1] == str[2] & b[1] == true & b[0] == false & str[1] == "X")
					{
						k ++; k1 = k; b[0] = true;
						btn[0].setText("O"); str[0] = "O";
					}
					else if (str[0] == str[2] & b[0] == true & b[1] == false & str[0] == "X")
					{
						k ++; k1 = k; b[1] = true;
						btn[1].setText("O"); str[1] = "O";
					}
					//-----------------------------------------------------// 2X
					else if (str[3] == str[4] & b[3] == true & b[5] == false & str[3] == "X")
					{
						k ++; k1 = k; b[5] = true;
						btn[5].setText("O"); str[5] = "O";
					}
					else if (str[4] == str[5] & b[4] == true & b[3] == false & str[4] == "X")
					{
						k ++; k1 = k; b[3] = true;
						btn[3].setText("O"); str[3] = "O";
					}
					else if (str[3] == str[5] & b[3] == true & b[4] == false & str[3] == "X")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 3X
					else if (str[6] == str[7] & b[6] == true & b[8] == false & str[6] == "X")
					{
						k ++; k1 = k; b[8] = true;
						btn[8].setText("O"); str[8] = "O";
					}
					else if (str[7] == str[8] & b[7] == true & b[6] == false & str[7] == "X")
					{
						k ++; k1 = k; b[6] = true;
						btn[6].setText("O"); str[6] = "O";
					}
					else if (str[6] == str[8] & b[6] == true & b[7] == false & str[6] == "X")
					{
						k ++; k1 = k; b[7] = true;
						btn[7].setText("O"); str[7] = "O";
					}
					//-----------------------------------------------------// 4X
					else if (str[0] == str[3] & b[0] == true & b[6] == false & str[0] == "X")
					{
						k ++; k1 = k; b[6] = true;
						btn[6].setText("O"); str[6] = "O";
					}
					else if (str[3] == str[6] & b[3] == true & b[0] == false & str[3] == "X")
					{
						k ++; k1 = k; b[0] = true;
						btn[0].setText("O"); str[0] = "O";
					}
					else if (str[0] == str[6] & b[0] == true & b[3] == false & str[0] == "X")
					{
						k ++; k1 = k; b[3] = true;
						btn[3].setText("O"); str[3] = "O";
					}
					//-----------------------------------------------------// 5X
					else if (str[1] == str[4] & b[1] == true & b[7] == false & str[1] == "X")
					{
						k ++; k1 = k; b[7] = true;
						btn[7].setText("O"); str[7] = "O";
					}
					else if (str[4] == str[7] & b[4] == true & b[1] == false & str[4] == "X")
					{
						k ++; k1 = k; b[1] = true;
						btn[1].setText("O"); str[1] = "O";
					}
					else if (str[1] == str[7] & b[1] == true & b[4] == false & str[1] == "X")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 6X
					else if (str[2] == str[5] & b[2] == true & b[8] == false & str[2] == "X")
					{
						k ++; k1 = k; b[8] = true;
						btn[8].setText("O"); str[8] = "O";
					}
					else if (str[5] == str[8] & b[5] == true & b[2] == false & str[5] == "X")
					{
						k ++; k1 = k; b[2] = true;
						btn[2].setText("O"); str[2] = "O";
					}
					else if (str[2] == str[8] & b[2] == true & b[5] == false & str[2] == "X")
					{
						k ++; k1 = k; b[5] = true;
						btn[5].setText("O"); str[5] = "O";
					}
					//-----------------------------------------------------// 7X
					else if (str[0] == str[4] & b[0] == true & b[8] == false & str[0] == "X")
					{
						k ++; k1 = k; b[8] = true;
						btn[8].setText("O"); str[8] = "O";
					}
					else if (str[4] == str[8] & b[4] == true & b[0] == false & str[4] == "X")
					{
						k ++; k1 = k; b[0] = true;
						btn[0].setText("O"); str[0] = "O";
					}
					else if (str[0] == str[8] & b[0] == true & b[4] == false & str[0] == "X")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// 8X
					else if (str[2] == str[4] & b[2] == true & b[6] == false & str[2] == "X")
					{
						k ++; k1 = k; b[6] = true;
						btn[6].setText("O"); str[6] = "O";
					}
					else if (str[4] == str[6] & b[4] == true & b[2] == false & str[4] == "X")
					{
						k ++; k1 = k; b[2] = true;
						btn[2].setText("O"); str[2] = "O";
					}
					else if (str[2] == str[6] & b[2] == true & b[4] == false & str[2] == "X")
					{
						k ++; k1 = k; b[4] = true;
						btn[4].setText("O"); str[4] = "O";
					}
					//-----------------------------------------------------// other
					else if (str[4] == "X" & (k == 1 | k == 3))
					{						
						int randB = (int)(Math.random()*4);
						if (b[list[randB]] == false)
						{
							k ++; k1 = k; b[list[randB]] = true;
							btn[list[randB]].setText("O"); str[list[randB]] = "O";
						}
					}
					//-----------------------------------------------------// random
					else
					{
						if (k != 9)
						{
							int rand = (int)(Math.random() * 9);
							while(b[rand] == true) {rand += 1; if (rand == 9) rand = 0;}
							
							k ++; k1 = k; b[rand] = true;
							btn[rand].setText("O"); str[rand] = "O";
						}
					}
				}
				else k1 = k;
			}
				});
		//----------------------------------------------------------------------------------------//
	}
}
