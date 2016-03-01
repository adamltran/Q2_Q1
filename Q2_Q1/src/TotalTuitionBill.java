import java.util.Scanner;
import Math.lang.util

public class TotalTuitionBill {
/*
 *  p: 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			// The Initial Tuition Cost
			
			System.out.println("Enter the initial tuition cost.");
			double initialTuitionCost = input.nextDouble();
			
			// The Tuition Percent Increase
			
			System.out.println("Enter the tuition percent increase.");
			double tuitionPercentIncrease = input.nextDouble();
			
			// The Repayment APR
			
			System.out.println("Enter the repayment APR.");
			double repaymentAPR = input.nextDouble();
			
			// The term
			System.out.println("Enter the term.");
			double term = input.nextDouble();
			
			return pv(5, 5, 5, 5, 5);
}
}
