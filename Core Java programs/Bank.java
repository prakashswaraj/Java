
/*
*     Java programs to perform the functions of bank ....
 * */

package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {
    String customer_name;
    String account_type;
    int account_no;
    int account_balance;
    void open_account(int account_balance)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the customer: ");
        customer_name = sc.next();
        System.out.println("enter the account no. of the customer: ");
        account_no = sc.nextInt();
        System.out.println("the name of the customer is: "+customer_name);
        System.out.println("the account no of the customer is: "+account_no);
        System.out.println(account_balance);
        System.out.println("press 1 for saving. \n press 2 for current.");
    }
    int deposit_amount(int account_balance)
    {
        System.out.println("enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        account_balance = account_balance + amount;
        return account_balance;
    }
    int  withdraw(int account_balance)
    {
        int amount;
        Scanner sc = new Scanner(System.in);
        if(account_balance == 0)
            System.out.println("Insufficient Balance!");
        else {
            System.out.println("enter the amount to withdraw: ");
            amount = sc.nextInt();
            account_balance = account_balance - amount;
        }
        return account_balance;
    }
    void display(int account_balance,String customer_name)
    {
        System.out.println("name: "+customer_name+"amount: "+account_balance);
    }
}
   class Day2_3
{
    public static void main(String[] args) {
        int ch,balance,x;
        String cname;
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        System.out.println("enter the name of the customer: ");
        cname = sc.next();
        balance = sc.nextInt();
        while(true)
        {
            System.out.println("\n1.to open account\n2.to deposit\n3.to withdraw\n4.to display\n5.EXIT");
            System.out.println("enter the choice: ");
            ch = sc.nextInt();
                    switch(ch)
                    {
                        case 1:
                            obj.open_account(balance);
                            break;
                        case 2:
                            System.out.println("enter the account balance of the customer: ");
                            balance = sc.nextInt();
                            x=obj.deposit_amount(balance);
                            break;
                        case 3:
                            x=obj.withdraw(balance);
                            break;
                        case 4:
                            x = obj.deposit_amount(balance);
                            obj.display(x,cname);
                            break;
                        case 5:
                            System.out.println("invalid choice:");
                            break;
                    }
                }

    }
}
