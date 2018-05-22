import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] Args){
        System.out.println("Command Line: ciphxor [-c key][-d key] inputname.txt [-o outputname.txt]");
        Scanner commandLineScanner = new Scanner(System.in);
        String commandLine = commandLineScanner.nextLine();
        ParseScanLine in = new ParseScanLine(commandLine);
    }

}
