class first { 
  
    
    int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
     
    int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    }
}

class hello{ 
    public static void main(String args[]) 
    { 
        first obj = new first(); 
        System.out.println(obj.sum(123,145)); 
        System.out.println(obj.sum(1120, 1140, 1130));
    } 
}
