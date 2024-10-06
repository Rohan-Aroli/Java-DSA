import java.util.Scanner;
class String_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String revstr="";
        for (int i=str.length()-1;i>=0;i--){
            revstr+=str.charAt(i);
        }
        if(revstr.equals(str)){
            System.out.println("The given string is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
      
    }
    
}
