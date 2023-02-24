
/*
*    Java programs to perform the functions of bank ....
* */

package com.company;

import java.util.Scanner;

public class bank1 {
    String name;
    long account_no;
    int account_type;
    double balance;
    int deposit, amount;
    Scanner sc = new Scanner(System.in);

    void open_account() {
        System.out.println("enter the account n0: ");
        account_no = sc.nextInt();
        System.out.println("enter the account type:\n1.saving\n2.current");
        account_type = sc.nextInt();
        System.out.println("enter the name: ");
        name = sc.next();
        System.out.println("enter the balance: ");
        balance = sc.nextDouble();
        if (balance >= 10000 && account_type == 1)
            System.out.println("saving account openned successfully:");

        else if (balance >= 25000 && account_type == 2) {
            System.out.println("current account opened successfully: ");
        } else {
            System.out.println("balance is not sufficient: ");
        }
    }
    void deposit(){
        System.out.println("enter the balance:");
        deposit = sc.nextInt();
        balance = balance+ deposit;
        System.out.println("balance updated successfully: ");
    }
    void withdraw(){
        System.out.println("balance present in your account:"+ balance);
        System.out.println("enter the amount to withdraw");
        amount = sc.nextInt();
        balance = balance - amount;
        if(balance>10000 && account_type == 1)
        {
            System.out.println("withdraw successful");
        }
        else if (balance>25000 && account_type == 2){
            System.out.println("withdraw successful:");
        }
        else {
            System.out.println("cannot withdraw this amount");
            balance = balance +amount;
        }
    }
    void display()
    {
        System.out.println("name:"+name);
        System.out.println("account_no: "+account_no);
        System.out.println("balance: "+balance);
        if(account_type == 1)
            System.out.println("account type: saving");
        else
        {
            System.out.println("account type: current");
        }
    }

}
class banking{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        bank1 bb = new bank1();
        int option;
        do{
            System.out.println("select the option\n1.open acount\n2.deposit\n3.withdraw\n4.display\n5.exit");
            System.out.println("enter the option");
            option = op.nextInt();
            switch(option)
            {
                case 1:
                    bb.open_account();
                    break;
                case 2:
                    bb.deposit();
                    break;
                case 3:
                    bb.withdraw();
                    break;
                case 4:
                    bb.display();
                    break;
                default:
                    break;
            }
        }
        while (option!=5);
    }
}

