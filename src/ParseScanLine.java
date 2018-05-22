
public class ParseScanLine {
    public String flag;
    public String keyEncryption;
    public String inputNameFile;
    public String outputNameFile;

    public ParseScanLine(){
        System.out.println("error");
    }

    public ParseScanLine(String commandLine) {
        if(!commandLine.matches
                ("^ciphxor *(-c|-d) *[\\dAaBbCcDdEeFf]+ *[A-Za-z]+(.[A-Za-z]+)? *((-o) *[A-Za-z]+(.[A-Za-z]+))?$"))
            throw new IllegalArgumentException("error");
        String[] commandLineSplit = commandLine.split(" ");
        int commandLineSize = commandLineSplit.length;

        flag = commandLineSplit[1];
        keyEncryption = commandLineSplit[2];
        inputNameFile = commandLineSplit[3];
        if (commandLineSize == 6)
            outputNameFile = commandLineSplit[5];
        else outputNameFile = inputNameFile + "encry";
        begin();
    }

    private void begin(){
        FileInputOutput begin = new FileInputOutput(inputNameFile, outputNameFile, keyEncryption);
    }
}
