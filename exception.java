class Exc
{
public Static void main(String args[]){
try {
int a,d;
d =0;
a = 42/0;
System.out.println("this will give us error");
}
catch (AirthmeticException e)
{
System.out.println("Division by zero");
}
}
}