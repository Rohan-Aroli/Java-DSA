import java.util.Scanner;

class SwitchAndNestedCases{
    public static void main(String[] args) {
        // System.out.println("Enter the fruit!");
        // Scanner input = new Scanner(System.in);
        // String fruit = input.next();

        // switch(fruit){
        //     case "mango":
        //             System.out.println("The given fruit is king of fruits!");
        //             break;
        //     case "orange":
        //             System.out.println("The given fruit is very sweet and orange!");
        //             break;
        //     default:
        //             System.out.println("Wrong choice!");
        //}

        //~~~~~ Enhanched switch ~~~~~~~~~~~~~~~

        // Scanner in = new Scanner(System.in);
        // int day = in.nextInt();
        // switch(day){

        //     case 1 -> {System.out.println("monday");
        //                 System.out.println("This is a multiline case");}
        //     case 2 -> System.out.println("tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4,5,6,7,8,9-> System.out.println("anything other thn those 3"); //multiple cases in single line
        //     default-> System.out.println("case out of index");
        // }

        Scanner in = new Scanner(System.in);
        int empid=in.nextInt();
        String department = in.next();

        switch(empid){
        case 1 :
                System.out.println("empid 1 recorded");
                switch(department){
                    case "IT":
                    System.out.println("It department selected");
                    break;
                }

                break;

        default:
                System.out.println("invalid empid or department");
            }
    }
    
}
