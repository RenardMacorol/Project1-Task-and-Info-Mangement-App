import java.util.*;
public class Proto0{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
       
        String array[] = {"School", "Personal Project", "Work"};
        System.out.println("Good day Welcome to my Project");
        System.out.println();
        System.out.println("Type 'Y' to Proceed" );
        String input=s.nextLine();
        if(input.equalsIgnoreCase("y")){
            int randomize =r.nextInt(array.length);
            System.out.println("The things that you will do are:");
            System.out.println(array[randomize]);

        }


    }
}