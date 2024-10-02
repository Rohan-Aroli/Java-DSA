import java.util.Scanner;
class Oddornot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0)System.out.println("The given number is even");
        else System.out.println("The given number is odd");

        
    }    
}
