public class FibonacciSeries {
    public static void main(String[] args) {
       int n = 5;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+ " ");
        }

    }
    static int fibo(int n){
        if(n==0){
            return 1;

        }
        if(n==1){
            return 1;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
