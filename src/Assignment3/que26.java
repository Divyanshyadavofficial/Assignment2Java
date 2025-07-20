package Assignment3;

public class que26 {
    public static void main(String[] args) {
        Kout();
    }
    static void Kout(){
        int count =0;
        for (int i = 1; i <=31 ; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.printf("the number of days kunal can go out is  %d ",count);
    }
}
