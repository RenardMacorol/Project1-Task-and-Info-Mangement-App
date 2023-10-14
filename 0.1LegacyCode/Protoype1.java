import java.io.*;
import java.util.Scanner;
public class Protoype1 {
    public static void main(String[] args)  {
        fileCheck();
        writeFile();

    }

    public static void writeFile(){
        try {
            Scanner s = new Scanner(System.in);
            FileWriter w = new FileWriter("0.1LegacyCode\\Todo.txt");
            System.out.println("Type what you want to write: ");
            String input = s.nextLine();
            w.write(input);
            w.close();// this is essential
            s.close();
            System.out.println(" Write Succesfully");

        }catch (IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }

    public static void fileCheck() {
        //create a file where that place in 0.1 Legacy Code
        File file = new File("0.1LegacyCode\\Todo.txt");
        if(!file.exists()){
        fileCreate(file);
        }else{
            System.out.println("File Exist");
        }
        
    }
    public static void fileCreate(File file){
        try{
            if(file.createNewFile()){
                System.out.println("No File exist");
                System.out.println("File created: "+ file.getName());
            }
        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    
}
