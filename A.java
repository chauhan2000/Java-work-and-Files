class A{
void show(int a){
System.out.println("hello");
}
}

class B extends A{
void show(int b){
 System.out.println("world");
}
}

class hello{
 public static void main(String args[]){
 A obj= new B();
 obj.show(10); 
}
}