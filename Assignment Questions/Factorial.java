import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        System.out.println("enter till where you want to find factorial");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    
}
