
public class ParseScanLine {
    private String flag;
    private String keyEncryption;
    private String inputNameFile;
    private String outputNameFile;

    private ParseScanLine(String flag, String keyEncryption, String inputNameFile, String outputNameFile){

    }

    public ParseScanLine(String commandLine) {
        String[] commandLineSplit = commandLine.split(" ");
        int commandLineSize = commandLineSplit.length;
        flag = commandLineSplit[1];
        keyEncryption = commandLineSplit[2];
        inputNameFile = commandLineSplit[3];
        if (commandLineSize == 5)
            outputNameFile = commandLineSplit[5];
        else outputNameFile = null;
    }

    public String getFlag(){
        return flag;
    }

    public String getKeyEncryption(){
        return keyEncryption;
    }

    public String getInputNameFile() {
        return inputNameFile;
    }

    public String getOutputNameFile() {
        return outputNameFile;
    }

    FileInputOutput init;
}
