import java.util.Scanner;
class diff_of_sum_and_prod {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        int prod =1;
        while(n!=0){
            int temp = n%10;
            sum+=temp;
            prod*=temp;
            n/=10;
        }
        int diff = prod-sum;
        System.out.println(diff);

    }
    
    
}
