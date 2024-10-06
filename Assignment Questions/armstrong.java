// import java.util.Scanner;

// class armstrong{

//     public static int armstrong(int n){
//         int count=0;
//         int counum=n;
//         while(counum!=0){
//             counum/=10;
//             count++;
//         }
//         int sumno=0;
//         int dumno=0;
//         while(n!=0){
//             dumno=n%10;
//             n/=10;
//             sumno+=(int)Math.pow(dumno,count);
//         }

//         return sumno;
        

//     }
//     public static void main(String[] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Please enter the 2 numbers");
//         int x = input.nextInt();
//         int y= input.nextInt();
//         int a=armstrong(x);

//         if(a==x){
//             System.out.println("The given " +x+ " is armstrong number");
//         }else{
//             System.out.println("not an armstrong number");
//         }
//         int b = armstrong(y);
//         if(b==y){
//             System.out.println("Given number "+y+" is an armstrong number");

//         }else{
//             System.out.println("Not an armstrong number");
//         }
//     }
// }


//~~~~~ second attempt ~~~~~~~~

import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to be checked:");
        int n = in.nextInt();
        if(n<0){
            System.out.println("Invalid choice! Neagtive numbers cannot be armstrong.");
            System.exit(0);

        }
        int b = n;
        int c = b;
        int firstno,count=0,sum=0;
        while(b!=0){
            b/=10;
            count++;
        }
        while(n!=0){
            if(n>0 && n<10)
            {
                System.out.println("Not practically an armstrong number!");
            }
            firstno=n%10;
            sum+=Math.pow(firstno,count); 
            n/=10;    

        }
        if(sum>9 && sum==c){
            System.out.println("The number given is an armstong number");
        }
        else if (sum>9 && sum!=c){
            System.out.println("Not an armstrong number");
        }
    }
}