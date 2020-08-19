package PGM;
//导入scanner
import java.util.Scanner;
public class input {
	public static void main(String[] args)
	{
		//2.创建Scanner对象，名为input
		Scanner input=new Scanner(System.in);
		//使用Scanner获取数据
		System.out.print("请输入您的姓名：");
		String name=input.next();
		System.out.print("请输入您的年龄：");
		int age=input.nextInt();
		System.out.print("请输入您的身高：");
		double height=input.nextDouble();
		
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("身高："+height);
		
		input.close();
	}

}
