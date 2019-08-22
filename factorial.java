public class factorial
{
public int fact()
{
int value =5;
int f =1,i=2;
while(i<=value)
f= f*value;
i++;
}
return f;
}
public static void main(String[] args)
{
factorial ob = new factorial();
system.out.println("the factorial is "+ob.fact() );
}
}