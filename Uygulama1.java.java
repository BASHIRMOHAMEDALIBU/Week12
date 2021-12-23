public class Uygulama1 {
    public static final int HIGHT = 8;
    public static final int SEGMENT = 2;
    public static void main(String args[]){
        for (int i = 1; i <= SEGMENT; i++){
            for (int line = 1; line <= HIGHT; line++){

                for(int space = 1; space <= HIGHT -line; space++){
                    System.err.print(" ");
                }
                for (int star = 1; star <= 2 * line - 1; star++){
                    System.err.print("*");
                }
                System.err.println();
            }
        }
    }
}
