import java.util.Scanner;
public class guessthenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int n=7;
        int i,guess;
        System.out.println("choose a number between 1 to 100");
        System.out.println("guess a number with in 7 trials");
        for(i=0;i<n;i++){
            System.out.println("guess the number: ");
            guess=sc.nextInt();
            if(number==guess){
                System.out.println(("congratulations you guessed the correct number:")+(guess));
                break;
            }
            else if(number>guess){
                System.out.println("the number is greaterthen "+(guess));            
            }
            else if(number<guess){
                System.out.println("the number is lessthan "+(guess));
            }
        }
           if(i==n) {
            System.out.println("you are used all the choices");
            System.out.println("the number is: "+(number));
           }
        
    }
}