package demo.payment;
import java.util.*;

import demo.creditcard.CreditCard;
import demo.account.Account;
import demo.payment.Transaction;
public class CreditLimit extends Transaction
{
  public static void main(String[] args)
        {
      
        int account = 1, balance,charges,credits,credit_limit, newbal;
        
        while( account != 0 )
          {
       
          System.out.print("Input Account Number: ");
          account = scan.nextInt();           
          
          System.out.print("Input Beginning Balance: ");
          balance = scan.nextInt();
          
          System.out.print("Input Total Charges: ");
          charges = scan.nextInt();
          
          System.out.print("Input Total Credits: ");
          credits = scan.nextInt();
          
          System.out.print("Input Credit Limit: ");
          credit_limit = scan.nextInt();

          //And time for the calculations and displaying what the paragraph wants
          newbal = balance + charges - credits;
          System.out.println("Equivalent New Balnce: " + newbal);

               if ( newbal > credit_limit)
               {
                  System.out.println("Credit Limit Exceeded");
                break;
               }
          }
       }
}
