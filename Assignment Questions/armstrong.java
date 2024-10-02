import java.util.Scanner;

class armstrong{

    public static int armstrong(int n){
        int count=0;
        int counum=n;
        while(counum!=0){
            counum/=10;
            count++;
        }
        int sumno=0;
        int dumno=0;
        while(n!=0){
            dumno=n%10;
            n/=10;
            sumno+=(int)Math.pow(dumno,count);
        }

        return sumno;
        

    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the 2 numbers");
        int x = input.nextInt();
        int y= input.nextInt();
        int a=armstrong(x);

        if(a==x){
            System.out.println("The given " +x+ " is armstrong number");
        }else{
            System.out.println("not an armstrong number");
        }
        int b = armstrong(y);
        if(b==y){
            System.out.println("Given number "+y+" is an armstrong number");

        }else{
            System.out.println("Not an armstrong number");
        }
    }
}