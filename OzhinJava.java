import java.util.Scanner;

public class OzhinJava
{
	public static void main(String [] ar)
	{
		int i ;
		Scanner in = new Scanner(System.in);
		System.out.print("write number of letter in your name = ");
		i=in.nextInt();

		char o[]= new char[i];

		Scanner in2 = new Scanner(System.in);

		for(int x=0; x<o.length; x++)
		{
			System.out.print("write letter "+(1+x)+" = ");
			o[x] = in2.next().charAt(0);

		}


		System.out.println("name is ");
		for(int j= 0; j<o.length; j++){

			System.out.print(o[j]);
		}
		System.out.println("");
	}
}