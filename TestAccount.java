class account {
int acc_no;
String name;
float amount;
void insert(int a,String n,float ant){
acc_no=a;
name=n;
account=amt;
}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("insufficient balance");
}else{
amount=amount-amt;
System.out.println(amt+"withdrawn");
}
}
void checkbalance()
{
System.out.println("Balance is: "+amount);
}
void display() {
System.out.println(acc_no+" "+"name"+" "+amount);
}

public class TestAccount{
public static void main(String[] args){
account a1=new Account();
a1.insert(832345,"Ankit",1000);
a1.display();
a1.checkbalance();
a1.deposit();
a1.checkbalance();
a1.withdraw(15000);
a1.checkbalance();

}
    
}