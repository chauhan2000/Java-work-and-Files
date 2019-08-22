public static void main(String[] args) {
    String[] mcq;
    Scanner input = new Scanner(System.in);

    mcq = new String[5];
    mcq[0] = "Fav sports";
    String userSelect1 = multiChoice1[0];

    if(userSelect1==mcq[0]){
        System.out.println(mcq[0]);
        System.out.println("A. football");
        System.out.println("B. cricket");
        System.out.println("C. basketball");
        System.out.println("D. vollyball");
        System.out.println();
        System.out.print("Your answer: ");
        String sel = input.next();

        switch (sel.toUpperCase()){
            case "A":
                sel = "United States";
                System.out.println("Incorrect!\n\n");
                break;
            case "B":
                sel = "China";
                System.out.println("Correct!\n\n");
                scorePro++;
                score++;
                break;
            case "C":
                sel = "India";
                System.out.println("Incorrect!\n\n");
                break;
            case "D":
                sel = "England";
                System.out.println("Incorrect!\n\n");
                break;
            default: 
                sel = "Incorrect, choice.\n\n";
                break;
        }
    }