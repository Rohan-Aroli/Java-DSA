import java.util.Scanner;
// q)Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Statementprob2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] array = new int[20];
        int count=0;
        System.out.println("Enter the elements into the list (press 0 to terminate)");
        for(int i=0;i>-1;i++){
            array[i]=in.nextInt();
            if(array[i]==0)break;
            count++;
            

        }
        int negsum=0,poseve=0,posodd=0;
        for(int i=0;i<=count;i++){
            if(array[i]<0)negsum+=array[i];
            else if(array[i]>0 && array[i]%2==0)poseve+=array[i];
            else posodd+=array[i];
        }

        System.out.println("Sum of negative integers: "+negsum+" sum of positive odd numbers "+ posodd+" sum of positive even numbers "+poseve);
    }
    
    
}
