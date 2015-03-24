package ru.lab4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class main {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //String str = new String();
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
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");
        }
    }
}