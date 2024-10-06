import java.util.Scanner;
class Permutations_and_combinations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of objects present");
        int n=in.nextInt();
        int b =n;
        System.out.println("Enter the no of objects you want to arrange");
        int r=in.nextInt();
        long fact=1;
        long fact2=1;
        while(b!=0){
            fact*=b;
            b--;
        }
        long diff=(n-r);
        while(diff!=0){
            fact2*=diff;
            diff--;

        }
        long permu=fact/fact2;
        System.out.println("The permutation of given combination is " +permu);
        long fact3=1;
        while(r!=0){
            fact3*=r;
            r--;
        }
        long comb = permu/fact3;
        System.out.println("The Combinations possible are "+comb);


    }
    
}
