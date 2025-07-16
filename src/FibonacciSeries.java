public class FibonacciSeries {
    public static void main(String[] args) {
       int result = fibo(5);
        System.out.println(result);

    }
    static int fibo(int n){
        if(n==0){
            return 1;

        }
        if(n==1){
            return 1;
        }
        else {
            return n*fibo(n-1);
        }
    }
}
