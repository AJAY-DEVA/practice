import java.util.Scanner;
import java.util.ArrayList;
class Account{
private String name;
private int age;
private String gender;
private String type;
private int initial;
private int accountnumber;

Account(){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the Account Holder Name:");
this.name=scanner.next();
System.out.println("Enter the Account Holder Age:");
this.age=scanner.nextInt();
System.out.println("Enter the Account Holder Gender:");
this.gender=scanner.next();
System.out.println("Enter the Account Type:");
this.type=scanner.next();
System.out.println("Enter the Account number:");
this.accountnumber=scanner.nextInt();

}

public void  creatingaccount(){
Scanner scanner1=new Scanner(System.in);
System.out.println("Enter the intial amount you paid and deposit the amount into machine:");
this.initial=scanner1.nextInt();
System.out.println("Account created Successfully");
System.out.println("Your current balance:"+initial);
}
 public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Account Type: " + type);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Balance: " + initial);
        System.out.println("------------------------------");
    }
}

class Bank extends Account{
public static void main(String[]args){
int option=0;
ArrayList<Account> holder=new ArrayList<Account>();
Scanner myscan=new Scanner(System.in);
while(option!=5){
System.out.println("enter one of the option from below list:");
System.out.println("Press '1' for New Account creating");
System.out.println("Press '2' for Amount Deposit");
System.out.println("Press '3' for Amount Withdrawl");
System.out.println("Press '4' for Account Removal ");
System.out.println("Press '5' for Exit");
option=myscan.nextInt();
switch(option){
case 1:
Account account1=new Account();
account1.creatingaccount();
holder.add(account1);
break;
case 2:
  for(Account acc:holder){
      acc.display();
}
break;
case 3:
  
}
}
}
}
