//Java program that read from a file and write to file by handling all file related exceptions
import java.io.*;
import java.util.Scanner;

public class fileHandler{
    public static void main(String[] args) throws IOException {
        String filename = "Sample.txt";
        File file = new File(filename);
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("Creating a new file");
            }catch (IOException e){
                System.out.println("Can't create File");
            }
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
            String line;
            if (reader.readLine() == null){
                System.out.println("File Empty.");
            }
            reader = new BufferedReader(new FileReader(filename)); // Because otherwise it won't read the data in the file due to reader being using to check if file is empty
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to enter data in the file?\n1:Yes\n2:No");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter data to be inserted into the file");
                sc.nextLine();
                line = sc.nextLine();
                writer.write(line);
            }else if(choice == 2){
                System.out.println("Closing the file");
            }else {
                System.out.println("Invalid Option");
            }
            writer.close();
            reader.close();
        }catch (IOException err){
            throw err;
        }
    }
}