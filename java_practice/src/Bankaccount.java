
public class Bankaccount {
 private double balance=0;
 public void deposite(double amt)
 {
	 if(amt>0)
	 {
		 balance+=amt;
		 System.out.println("deposited amount ="+amt);
	 }
 }
 private  void withdraw(double balance) {
	 if( amt > 0 && amt<=balance)
	 {
		 balance-=amt;
		 System.out.println("withdraw amount ="+balance);
	 }
	 else {
		 System.out.println("null amount");
	 }
 }
 
 public  static void main(String[] args) {
	Bankaccount bk= new Bankaccount();
	bk.deposite(100000);
	bk.withdraw(1090);
	
 }
}
