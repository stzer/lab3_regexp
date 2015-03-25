package ru.lab4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class main {
    public static void main(String[] args) throws IOException {
        ArrayList <String> list = new ArrayList<String>();

        File fd = new File("myfile.txt");
        if (!fd.exists()) {
            System.out.println("File not found! Exit the programm");
            System.exit(1);
        }
        Scanner fw = new Scanner(fd);
        while (fw.hasNextLine()) {
            list.add(fw.nextLine());
        }
        fw.close();
        String text=list.get(0);
        for(int i=1;i<list.size();i++){
            text+=list.get(i);
        }
        System.out.println(text);
        //----------------------------------------------------------------------------------------------//
        int prilag=0;
        Pattern pattern = Pattern.compile("ая[ .,!?] |[ыо]е[ .,!?]|[у|ю]ю[ .,!?]");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            prilag++;
        }

        //---------------------------------------------------------------------------------------------//
        int glagol=0;
        pattern = Pattern.compile("[аыуиею]ть[ .,!?]|тся[ .,!?]|ться[ .,!?]");
        matcher = pattern.matcher(text);
        while(matcher.find()){
            glagol++;
        }

        //------------------------------------------------------------------------------------------//
        int narechie=0;
        pattern = Pattern.compile("либо[ .,!?]|нибудь[ .,!?]|нно[ .,!?]");
                matcher = pattern.matcher(text);
        while(matcher.find()){
            narechie++;
        }
        System.out.println("Наречий в тексте: "+narechie + "\nГлаголов в тексте: "+glagol+"\nПрилагательных в тексте: "+prilag);
    }
}