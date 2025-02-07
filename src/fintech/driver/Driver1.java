package fintech.driver;

import java.util.Scanner;
import fintech.model.Account;

/**
 * @author 12S23001 - Kevin Gultom
 * 
 * @author 12S23010 - Tiffani Butar-Butar
 */
public class Driver1 {

            public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String command = scan.nextLine();
            String owner = scan.nextLine();
            String account_name = scan.nextLine();
            Account account = new Account(owner, account_name);
            scan.close();
            
    
            System.out.println(account.toString());
    
        }
    }