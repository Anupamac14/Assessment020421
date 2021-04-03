

public class FuntionalInterfaceExmp {
	public static int display(int x,int y,int z)
	{
		return x*y*z;
	}
public static void main(String args[])
{
	FuntionalInterfaceExmp obj=new FuntionalInterfaceExmp();
	int s1=obj.display(10, 2, 5);
	int s2=obj.display(3, 5, 0);
	System.out.println("Multiplication : "+s1);
	System.out.println(" Multiplication with default value: "+s2);
	Multiplication1 a=new Multiplication1();
	System.out.println("Multiplication of Three numbers: "+a.multiply(3, 4, 5));	
}
}

class Multiplication1
{
	int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
}

class Multiplication2 extends Multiplication1
{
	int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
}