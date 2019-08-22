class mainserver
{
		private double Acc_Balance;
    		private int accnum;
    		private String lastName;
		
}
class employee extends mainserver
{
		void display_details()
		{
        	System.out.println("Depositor Name :" +name);
		System.out.println("Depositors last Name :" +lastname);
        	System.out.println("Account Number : "+Acc_num);
        	System.out.println("Account Balance : "+Acc_Balance);
        	System.out.println("Account Type : "+acc_type);
  		}
void fundtransfer()
{ 
 public int credit()
{
system.out.println("enter the details and amount for credit")

    		public int AccNum(int a)
		{
        			return(accNum);
    		}
 
    		public double getBalance()
		{
        			return(balance);
    		}
}
 public void debit()
{
system.out.println("enter the amount for debit");
public int AccNum(int a)
		{
        			return(accNum);
    		}
 
    		public double getBalance()
		{
        			return(balance);
    		}
}
}
}
}

class accholder extends mainserver 
{
                void getdetails()
                {
		public String getname()
    		{   
				return firstName;
 
 		}
		public String getLastName()
    		{   
				return lastName;
 
 		}
 
    		public int getAccountNumber()
		{
        			return(accountNumber);
    		}
 
    		public double getBalance(
		{
        			return(balance);
    		}
 		
}
}
public class Bank 
{
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
Bank obj = new Bank();
obj.fundtransfer();
obj.getdetails();
  int num;
    double balance = 0;
    double checkBal= 0;
    do {
        double amount;
        System.out.println("your choice");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
        num = scan.nextInt();
 if (num == 1) {      
                    System.out.println("Enter amount to deposit in checking account: ");
                    amount = scan.nextDouble();
                    checkingBalance += amount;
        } 
elseif (num == 2) { 
            System.out.println("Would you like to withdrawal");
                {
                    System.out.println("Enter amount to withdrawal: ");
                    amount = scan.nextDouble();
		} 
elseif (num == 3) 
{
           	System.out.println("Your Checking balance is " + checkBal);
                num = scan.nextInt();
if(bal<0)
{
System.out.println("Transaction failed");
} 
}
while (num != 4);
    System.out.println("Transaction time is over");

}