import java.util.Scanner;
class LargestOfAll {
    public static void main(String[] args) {
        System.out.println("Enter the inputs (press 0 to terminate)");
        Scanner in = new Scanner(System.in);
   int count=0;
        int[] array = new int[20];
            for(int i=0;i>=0;i++){
                int input = in.nextInt();
                if(input==0){
                    break;
                }
                array[i]=input;
                count++;


            }
            for(int i=0;i<=count;i++){
                for(int j=0;j<=count;j++){
                    if(array[i]>array[j]){
                        int temp = array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
            }
            System.out.println(array[0] + " is the largest number!");

        }
    }

