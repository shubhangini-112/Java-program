import java.io.*;

class Buffered
{
	public static void main(String arg[]) throws Exception
	{
		//InputStreamReader iobj = new InputStreamReader(System.in);
		// BufferedReader bobj = new BufferedReader(iobj);
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String str = bobj.readLine();

		System.out.println("Enter your age");
		int age = Integer.parseInt(bobj.readLine());

		System.out.println("Your name : "+str);
		System.out.println("Your age : "+age);
	}
}



class Hello
{
	public Hello(String str)
	{}	
}

class Demo
{
	public Demo(Hello hobj)
	{}
}

Demo dobj = new Demo(new Hello("Marvellous"));












