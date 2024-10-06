import java.util.Scanner;
class ReversingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] str = new char[10];
        int count=0;
        for(int i=0;i>-1;i++){
            str[i]=input.next().trim().charAt(i);
            if(str[i]=='$')break;
            count++;
        }
        for(int i=count;i>=0;i--){
            System.out.print(str[i]);
        }

    }
    
}
