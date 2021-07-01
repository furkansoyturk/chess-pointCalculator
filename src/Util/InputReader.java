package Util;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class InputReader {

    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println("Verilen input adı: " +Paths.get(fileName));
        return data;
    }

    public List<String> reader() throws Exception {
        String inputTxt = readFileAsString("src/input/board2.txt");
        inputTxt = inputTxt.replaceAll("\\s+","");

        List<String> currentBoard = Arrays.asList(inputTxt.split("(?<=\\G.{2})"));
        return  currentBoard;
    }

}
