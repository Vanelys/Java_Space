package entry;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //tax filing options
	    System.out.println("0: Single filer \n1: Married jointly or qualified widower \n2: Married separately \n"+
                         "3: Head of household");
	    System.out.println("\nEnter filing status");

        //store filing status
	    int status = input.nextInt();

	    //prompt for income
	    System.out.print("Enter taxable income(your annual income): ");
	    double income = input.nextDouble();

	    //compute tax
        double tax = 0;

        if(status == 0)
        {
            if(income <= 8350)
            {
                tax = income * 0.10;
            }
            else if(income <= 33950)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            }
            else if(income <= 82250)
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            }
            else if(income <= 171550)
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            }
            else if(income <= 372950)
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.35;
            }
        }

        System.out.println(tax);
    }
}
