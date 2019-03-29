import javax.swing.*;
import java.awt.event.*;

public class Starter
{	
	static int k = 0;
	
	public static void main(String[] args)
	{
		Queue<Cat> q = new Queue<Cat>(); // �������� �������
		JFrame frame = new JFrame();
		
		Timer tm = new Timer(500, new ActionListener() // ������ �� ���������� ������� � �� �������
				{
			public void actionPerformed(ActionEvent e)
			{
				k ++; // ������� ������� �������
				String name = Integer.toString(k); // ������� ������ ��� �������
				System.out.print(k + " ");
				
				Cat cat = new Cat(name);
				q.add(cat);
				
				if (k % 3 == 0) // ���� ������� �������������, �� �������� ������� ��������
				{
					System.out.println();
					q.get(0); System.out.println(" was removed");
					q.remove(0);
				}
			}
				}); tm.start();
	}
}