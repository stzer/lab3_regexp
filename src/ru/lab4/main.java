package ru.lab4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
        int prilag=0;
        Pattern pattern = Pattern.compile("ая ");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            prilag++;
        }
        pattern = Pattern.compile("ые ");
        matcher = pattern.matcher(text);
        while(matcher.find()){
            prilag++;
        }
        pattern = Pattern.compile("ое ");
        matcher = pattern.matcher(text);
        while(matcher.find()){
            prilag++;
        }
        pattern = Pattern.compile("ую ");
        matcher = pattern.matcher(text);
        while(matcher.find()){
            prilag++;
        }
        pattern = Pattern.compile("ый ");
        matcher = pattern.matcher(text);
        while(matcher.find()){
            prilag++;
        }

    }
}