// get keyword is used to get the value
// set keywordd is used to set the value
class Socs 
{
int n;
string nme;
private int ssn;
private int pn; 
public int getssn(int n)
{
value =n;
}
public string getname(string nme)
{
name =nme;
}
}
class cybernetics extends Socs
{
public a;
int getssn(int a)
{
system.out.print("id is" +a)
}
}
class Informatics extends cybernatics
{
public a;
int getssn(int a)
{
system.out.print("id is" +a)
}
}
class Analytics extends Informatics
{
public b;
int getssn(int a)
{
system.out.print("id is" +a)
}
}
class virtualization extends Analytics
{
public a;
int getssn(int a)
{
system.out.print("id is" +a)
}
} 
class Admin
{
public static void main(String args[])
{
cybernatics obj = new cybernatics()
obj.getssn(123);
obj.getnme(hello1);
System.out.println("output" +obj.getssn);  
System.out.println("output2:"+obj.getname);  
}
Informatics obj = new Informatics()
obj.getssn(1234);
obj.getnme(hello2);
System.out.println("output" +obj.getssn);  
System.out.println("output2:"+obj.getname);  

Analytics obj = new Analytics()
obj.getssn(12345);
obj.getnme(hello3);
System.out.println("output" +obj.getssn);  
System.out.println("output2:"+obj.getname);  

}