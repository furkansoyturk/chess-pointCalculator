package Util;

import javax.swing.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class InputReader {
    
    public static String readFileAsString(File fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(String.valueOf(fileName))));
        System.out.println("Seçilen input dosyası: " +Paths.get(String.valueOf(fileName)));
        return data;
    }

    public static List<String> reader() throws Exception {

        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        f.showSaveDialog(null);

        
        String inputTxt = readFileAsString(f.getSelectedFile());
        inputTxt = inputTxt.replaceAll("\\s+","");

        List<String> currentBoard = Arrays.asList(inputTxt.split("(?<=\\G.{2})"));
        
        return  currentBoard;
    }

}
