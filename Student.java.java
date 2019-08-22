class teacher 
{
Public void Test()
{
System.out.println("this is a test class");
}
public void show(int a)
{
System.out.println("value is :" + a);
}
}

class Student extends teacher
{
Public static void main(String args[])
{
Student obj = new student();
obj.Test();
obj.show(5);
}
}