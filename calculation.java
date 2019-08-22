public class calculation
{
    public char disp(char c)
    {
         System.out.println(c);
    }
    public int disp(int num)  
    {
         System.out.println(+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       calculation obj = new calculation();
       obj.disp('a');
   }
}