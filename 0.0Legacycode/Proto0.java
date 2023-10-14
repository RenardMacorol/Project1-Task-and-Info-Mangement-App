import java.util.*;
public class Proto0{
    //A whatTODO Picker With simple Functionality
    public static void main(String[] args) {
      startText();
    }

    //starting conditional
    static void startText(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Good day Welcome to my Project");
        System.out.println();
        System.out.println("Type 'Y' to Proceed" );
        String input=s.nextLine();
        execute(input);
    }

    //Creates Ouput 
    static void execute(String input){
        final String array[] = {"School", "Personal Project", "Work"};
        Random r = new Random();

        if(input.equalsIgnoreCase("y")){
            int randomize =r.nextInt(array.length);
            System.out.println();
            System.out.println("The things that you will do are:");
            System.out.println(array[randomize]);
            System.out.println();
        }else{
            System.out.println();
            System.out.println("your input are invalid ");
            System.out.println();
        }
        credit();
    }

    //credit 
    static void credit(){
        System.out.println("Created By: Wonkabars");
        System.out.println("Github: https://github.com/RenardFake");
        System.out.println("Facebook: https://www.facebook.com/profile.php?id=100009456221522 ");
    }
}