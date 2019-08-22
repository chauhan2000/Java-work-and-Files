class funct
{
    public void display(char c)
    {
         System.out.println(c);
    }
    public void display(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class example
{
   public static void main(String args[])
   {
       funct obj = new funct();
       obj.display('r');
       obj.display('r',5);
   }
}