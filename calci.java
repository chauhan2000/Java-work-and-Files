class Calculation {
   int z;
	
   public void add(int x, int y) {
      z = x + y;
      System.out.println("sum"+z);
   }
	
   public void Sub(int x, int y) {
      z = x - y;
      System.out.println("difference"+z);
   }
}

public class calci extends Calculation {
   public void multiply(int x, int y) {
      z = x * y;
      System.out.println("product"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      calci obj = new calci();
      obj.add(a, b);
      obj.Sub(a, b);
      obj.multiply(a, b);
   }
}