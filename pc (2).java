class pc{
   pc(){
      System.out.println("Default constructor");
   }
   pc(int i, int j){
      System.out.println("constructor with Two parameters");
   }
      public static void main(String args[]){
      pc obj = new pc();
      pc obj2 = new pc(12, 12);
   }
}