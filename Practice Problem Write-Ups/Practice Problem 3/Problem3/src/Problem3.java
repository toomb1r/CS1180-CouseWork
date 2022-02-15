// Tiffany Behr
// CS - 1180L-06
// Due 09/17/21
import java.util.Scanner;

public class Problem3
{public static void main(String[] args) {
    Scanner LoanEligibilityScanner = new Scanner(System.in);
    System.out.print("What is the loan Amount?: ");
    int loanAmount =  LoanEligibilityScanner.nextInt();
    System.out.print("What is the down payment?: ");
    int downPayment = LoanEligibilityScanner.nextInt();
    System.out.print("Have you held your current job for at least a year?: ");
    String jobRequirement = LoanEligibilityScanner.next();
    System.out.print("What is your annual salary?: ");
    int annualSalary = LoanEligibilityScanner.nextInt(); 
    if (0.2 * loanAmount <= downPayment || jobRequirement.equals("yes") && annualSalary >= loanAmount * 0.5) //replace w/ {} eventually (for when true)
    {System.out.print("You are eligible for this loan");}
    else {System.out.print("You are not eligible for this loan ");}
    LoanEligibilityScanner.close();

}}

