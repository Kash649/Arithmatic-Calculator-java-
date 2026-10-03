import java.util.Scanner;
class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        String a = "+";
        String b = "-";

        System.out.print("enter the operator in words;- ");
        String op = sc.nextLine();
        
        if (op.equals(a))
        {
            System.out.print("enter the numbers:- ");
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int area = a1 + a2;
            
            System.out.println("your addition is:- " + area);
        }
        else
        {
            System.out.print("enter your number:- ");
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int grea = s1 - s2;
            
            System.out.print("your substraction is:- " + grea);
        }        
    }
}