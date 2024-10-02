import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args)
    {
        System.out.println("enter the n elements  you want in fibonacci series");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a= new int[20];
        a[0]=0;
        a[1]=1;

        for(int i=1;i<n;i++)
        {
            a[i+1]=a[i]+a[i-1];
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
