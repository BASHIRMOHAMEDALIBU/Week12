public class Uygulama2 {
    public static final int N = 5;
    public static void main(String[] args){
        for ( int line = 1; line <= N; line++) {
            for(int j = 1; j <= (-1 * line + N); j++){
                System.out.print("+");
            }
            System.out.println(line);
        }

        for ( int line = N; line >= 1; line--){
            for ( int j = 1; j <= (-1 * line + N); j++){
                System.out.print("+");
            }
            System.err.println(line);
        }

    }











}


