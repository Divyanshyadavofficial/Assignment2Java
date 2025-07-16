public class Palindrome {
    public static void main(String[] args) {
        String arr = "nitin";
        boolean result = isPalindrome(arr);
        System.out.println(result);

    }
    static boolean isPalindrome(String arr){
        int start = 0;
        int end = arr.length()-1;
       while(start<end){
           if(arr.charAt(start)!=arr.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;

    }


}
