import java.util.Scanner;
import java.text.NumberFormat;
public class MortageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int principal;
		float rate;
		byte period;
		final byte MONTHS_IN_YEAR = 12;
	    final byte PERCENT = 100;
	    int numberOfPayments;
	    float monthlyInterest;
	    

		do{
			System.out.println("Enter the principal");
			 principal=sc.nextInt();
			if (principal<1000||principal>100000)
			{
				System.out.println("Enter the value between 1000 and 100000");
			}
			}while(principal<1000||principal>100000);
			
			do {
				System.out.println("Enter the rate");
				rate=sc.nextFloat();
				  monthlyInterest = rate / PERCENT / MONTHS_IN_YEAR;
				if(rate<1||rate>30)
				{
					System.out.println("Enter the value between 1 and 30");
					
				}
			}while(rate<1||rate>30);
			do {
				System.out.println("Enter the period");
				period=sc.nextByte();
				 numberOfPayments = period * MONTHS_IN_YEAR;
				if(rate<1||rate>30)
				{
					System.out.println("Enter the value between 1 and 30");
					
				}
			}while(period<1||period>30);
double mortgage = principal
			                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
			                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

			        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
			        System.out.println("Mortgage: " + mortgageFormatted);
			    }

}
