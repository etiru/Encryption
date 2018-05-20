import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] Args){
        Scanner commandLineScanner = new Scanner(System.in);
        String commandLine = commandLineScanner.nextLine();
        System.out.println(commandLine);
        ParseScanLine in = new ParseScanLine(commandLine);
    }

}
