import java.io.*;
import java.util.Scanner;

public class FileInputOutput {
    private Scanner inputFile;
    private File outputFile;
    private String keyEncryption;

    public FileInputOutput(String InputName, String OutputName, String key){
        keyEncryption = key;
        try {
            inputFile = new Scanner(new File(InputName));
        } catch (Exception e){
            throw new IllegalArgumentException(InputName + "Error File not found" + e);
        }
        try {
            outputFile = new File(OutputName);
        } catch (Exception e){
            throw new IllegalArgumentException("File not created" + e);
        }
        readToWriteInFile();
        System.out.println("Successfully");
    }

    private void readToWriteInFile(){
        try {
            PrintWriter pw = new PrintWriter(outputFile);
            while (inputFile.hasNext()){
                String line = inputFile.nextLine();
                pw.println(Encryption.encrypt(line, keyEncryption));
            }
            pw.close();
        }catch (IOException e){
            throw new IllegalArgumentException("Error" + e);
        }
        inputFile.close();
    }
}
