package fintech.driver;

import java.util.Scanner;
import fintech.model.Account;
import fintech.model.Transaction;

/**
 * @author 12S23001 - Kevin Gultom
 * 
 * @author 12S23010 - Tiffani Butar-Butar
 */
public class Driver2 {

            public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String command = scan.nextLine();
            String owner = scan.nextLine();
            String account_name = scan.nextLine();

             String command2 = scan.nextLine();
             String account_name2 = scan.nextLine();
              String amount = scan.nextLine();
                String posted_at = scan.nextLine();
                String note = scan.nextLine();

            Transaction Transaction = new Transaction(owner, account_name, 0.0, Double.parseDouble(amount), posted_at, note, account_name2, 1);
            Account account = new Account(owner, account_name);
            scan.close();

            
    
            System.out.println(account.toString());
            System.out.println(Transaction.toString());
    
        }


    }