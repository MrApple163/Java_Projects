import java.util.*;

public class Queue<T>
{
	ArrayList<Cat> arr = new ArrayList<Cat>();
	
	public void add(Cat T)
	{
		arr.add(T);
	}
	public void set(Cat T, int i)
	{
		arr.set(i, T);
	}
	public void get(int i)
	{
		Cat s = arr.get(i);
		System.out.print(s.name);
	}
	public void remove(int i)
	{
		arr.remove(i);
	}
}
