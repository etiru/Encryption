import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class FileInputOutput {
    private ParseScanLine ParseScanLine;
    private String inputName = ParseScanLine.getInputNameFile();
    private String outputName;
    private Scanner inputFile;
    private Formatter outputFile;
    private String key = ParseScanLine.getKeyEncryption();

    public FileInputOutput(){

        if(ParseScanLine.getOutputNameFile() != null)
            outputName = ParseScanLine.getOutputNameFile();
        else
            outputName = inputName + "encry";

        try {
             inputFile = new Scanner(new File(inputName));
        } catch (Exception e) {
            throw new IllegalArgumentException("File Not Found... " + e);
        }

        try {
            outputFile = new Formatter(outputName);
        } catch (Exception e){
            throw new IllegalArgumentException("File not create... " + e);
        }
        readToWriteInFile();
    }

    private void readToWriteInFile(){
        while (inputFile.hasNext()){
            String line = inputFile.nextLine();
            outputFile.format(Encryption.encrypt(line, key));
        }
      outputFile.close();
    }

}
