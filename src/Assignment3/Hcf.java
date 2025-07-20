package Assignment3;

public class Hcf {
    public static void main(String[] args) {
        //hcf*lcm = a*b
//        hcf = a*b/lcm
        System.out.println(gcd(4,8));
        System.out.println(lcm(4,8));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
