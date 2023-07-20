package this_keyword;

public class Current_Class_Method 
{
	void method()
	{
		System.out.println("Method");
	}
	void display()
	{
		this.method();
		System.out.println("METHOD");
	}
	public static void main(String[] args) 
	{
		Current_Class_Method cm=new Current_Class_Method();
		cm.display();
	}
}
