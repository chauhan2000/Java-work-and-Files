class cons{
    private int x;
    private cons(){
        System.out.println("Constructor");
        x = 5;
    }
    public static void main(String[] args){
        cons obj = new cons();
        System.out.println("Value of x = " + obj.x);
    }
}