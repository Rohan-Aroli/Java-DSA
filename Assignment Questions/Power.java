import java.util.Scanner;
class Power {
    public static void main(String[] args) {
        System.out.println("Enter power and base");
        Scanner in = new Scanner(System.in);
        int power = in.nextInt();
        int base = in.nextInt();
        double res=0;
        res = Math.pow(base,power);
        System.out.println(res);
    }
    
}
