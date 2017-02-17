package pkgMain;

import java.util.Scanner;

public class Quarter_Rating 
{
	public static void main (String[] args)
	{
		
	Scanner input =new Scanner (System.in );
	
	System.out.println( "QB Calculator");
	
	System.out.println( "Please enter the number of passing attempts: " );
	double att = input.nextDouble();
	
	System.out.println( "Please enter the number of completions: " );
	double comp = input.nextDouble();
	
	System.out.println( "Please enter the number of passing yards: " );
	double yds = input.nextDouble();
	
	System.out.println( "Please enter the number of touchdown passes: " );
	double td = input.nextDouble();
	
	System.out.println( "Please enter the number of interceptions: " );
	double in = input.nextDouble();
	
	double a = (comp/att - 0.3) * 5;
	
	if(a > 2.375)
		a = 2.375;
	if(a < 0)
		a = 0;
	
	double b = (yds/att - 3) * .25;

	if(b > 2.375)
		b = 2.375;
	if(b < 0)
		b = 0;
	
	double c = td/att * 20;

	if(c > 2.375)
		c = 2.375;
	if(c < 0)
		c = 0;
	
	double d = 2.375 - (in/att*25);
	
	if(d > 2.375)
		d = 2.375;
	if(d < 0)
		d = 0;
	
	double rating = (a+b+c+d)*100/6;
	
	System.out.println( "QB rating: " + rating );
	}
}