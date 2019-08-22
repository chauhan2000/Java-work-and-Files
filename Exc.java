class Exc extends Thread
{
public static void main(String args[]){
try {
int num1,num2,i;
for(i=0; i<5; i++){
System.out.println("this will give us error " +i);
Thread.sleep(20000);}
}
catch (InterruptedException e) {System.out.println(e);}
catch (ArithmeticException e){
System.out.println("Division by zero");}
}
}