

public class Fib {
    public static void main(String[] args) {
       for(int i = 0; i < 10; i++){
           System.out.println(fib(i));
       }
    }
    public static int fib(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            int x = a;
            a = b;
            b = b + x;
        }
        return a;

    }
}
