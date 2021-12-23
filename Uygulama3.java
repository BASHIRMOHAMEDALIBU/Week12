public class Uygulama3 {
    public static final int HIGHT = 8;

    public static void main(String args[]){
        for (int i = 1; i <= 1; i++){
            for (int line = 1; line <= HIGHT; line++){

                for(int space = 0; space <= HIGHT -line; space++){
                    System.out.print("");
                }
                for (int star = 1; star <= 2 * line - 1; star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
