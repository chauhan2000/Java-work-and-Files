import java.io.File;  
import java.io.IOException;  

public class file { 
  public static void main(String[] args) { 
    try { 
      File obj = new File("hel.txt"); 
      if (obj.createNewFile()) { 
        System.out.println("the new file ihes created and the name of t" + obj.getName()); 
      } else { 
        System.out.println("file is present in the system"); 
      } 
    } catch (IOException e) {
      System.out.println("error");
    } 
  } 
}