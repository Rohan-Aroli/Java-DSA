// import java.util.Scanner;

// //for and while
// class Conditionalstatements_and_loops  {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n = input.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(i+" ");
//         }
//         int i=0;
//         while(i<=n)
//         {
//             System.out.print(i+" ");
//             i+=1;
//         }
//     }


// }

// Largest of 3 numbers

// import java.util.Scanner;

// class Conditionalstatements_and_loops{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//         int c = input.nextInt();

//         if(a>b){
//             if(a>c){
//                 System.out.println(a + " is the largest");
//             }
//             else{
//                 System.out.println(c + "is the largest");
//             }

//         }
//         else if(b>c){
//             System.out.println(b + " is the largest");
//         }
//         else{
//             System.out.println(c + " is the largest");
//         }


//     }
// }


// import java.util.Scanner;

// class Conditionalstatements_and_loops{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         int c = in.nextInt();

//         // int max = a;

//         // if(b>a){
//         //     max=b;
//         // }
//         // if(c>a){
//         //     max = c;
//         // }
//         // ~~~~~~~~~~~~~~~~~~~~~ Using math.max() ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//         int max = Math.max(c,Math.max(a,b));
//         System.out.println(max + " is the largest number");
//     }
// }

// import java.util.Scanner;

// class Conditionalstatements_and_loops{
//     public static void main(String[] args) {
//     System.out.println("Please enter a characeter");
//     Scanner input = new Scanner(System.in);
//     int ch = input.next().charAt(0);
//     if(ch>='a'&&ch<='z'){
//         System.out.println("The given character is of lower case");
//     }
//     else if(ch>='A'&&ch<='Z'){
//         System.out.println("The given character is of upper case");
//     }
//     else{
//         System.out.println("Invalid character please try again");
//     }
//     }

// }


// import java.util.Scanner;

// class Conditionalstatements_and_loops{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Please enter till where you want to find the fibonacci series:");
//         int n = in.nextInt();
//         int[] array = new int[n+1];
//         array[0]=0;
//         array[1]=1;
//         for(int i=2;i<=n;i++)
//         {
//             array[i]=array[i-1]+array[i-2];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(array[i]+ " ");
//         }

//     System.out.println("\n The nth number is ");
//        System.out.println(array[n]);

//     }
// }

//~~~~~~~~~~~~ another approach ~~~~~~~~~~~~~~~
// import java.util.Scanner;
// class Conditionalstatements_and_loops{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int a = 0;
//         int b = 1;
//         for(int i=0;i<n-2;i++){
//             int fib=a+b;
//             a=b;
//             b=fib;
//         }
//         System.out.println(b);
//     }

// }

//~~~~~~~~~~~ no of occurances ~~~~~~~~~~

//

// ~~~~~~~~~~ reverse of a number ~~~~~~~~~~~~~~~

// import java.util.Scanner;

// class Conditionalstatements_and_loops{
//     public static void main(String[] args) {
//         Scanner input= new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = input.nextInt();
//         int rev =0;
//         while(n!=0){
//             rev = rev*10+n%10;
//             n/=10;


//         }
//         System.out.println(rev);
//     }
// }

import java.util.Scanner;

class Conditionalstatements_and_loops{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation and press X to terminate");
        int res=0;
        while(true){
            char op = in.next().charAt(0);
            int a = in.nextInt();
            int b = in.nextInt();
            if(op=='+'){
                res =a+b;
            }
            if(op=='-'){
                res=a-b;
            }
            if(op=='*'){
                res = a*b;
            }
            if(op=='/'){
                res = a/b;
            }
            if(op=='X'){
                break;
            }
            // else{
            //     System.out.println("invalid operation! please try again.");
            // }
            System.out.println(res);

        }
    }
}