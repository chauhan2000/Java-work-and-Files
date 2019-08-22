public class Encap {
   private String name;
   private String id;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getId() {
      return id;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setId( String newId) {
      id = newId;
   }
}
class run {

   public static void main(String args[]) {
      Encap obj = new Encap();
      obj.setName("Rachit");
      obj.setAge(19);
      obj.setId("384728732");

      System.out.print("Name : " + obj.getName() + " Age : " + obj.getAge() );
}
}
