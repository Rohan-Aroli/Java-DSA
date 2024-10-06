import java.util.Scanner;
public class LeapOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year you want to Check:");
        int year = in.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year!");
                }
                else{
                    System.out.println("Not a leap year!");
                }
            }
        }
        else{
            System.out.println("Not a leap year :(");
        }
    }
    
}
