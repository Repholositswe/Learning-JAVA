import java.io.*;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\pruma\\OneDrive\\Desktop\\tesr.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }

        catch (FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }


    }
}
