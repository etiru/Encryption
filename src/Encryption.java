import java.io.*;
import java.lang.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Encryption{
    public static String encrypt(String text, String keyWord)
    {
        byte[] arr = text.getBytes();
        byte[] keyarr = keyWord.getBytes();
        byte[] line = new byte[arr.length];
        for(int i = 0; i< arr.length; i++)
        {
            line[i] = (byte) (arr[i] ^ keyarr[i % keyarr.length]);
        }
        String result = new String(line, StandardCharsets.UTF_8);
        return result;
    }
}
