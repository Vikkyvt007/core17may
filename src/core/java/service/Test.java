package core.java.service;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Lenovo\\Desktop\\NUC_TRAINING\\demo.txt");
        FileOutputStream fout = new FileOutputStream(f);
        String s = " writing to this file\n another line";
        byte[]  b = s.getBytes(StandardCharsets.UTF_8);
        fout.write(b);



        /*
        FileInputStream fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\NUC_TRAINING\\demo.txt");

        int i=0;
        while((i =fin.read())!= -1)
        {

            System.out.print((char)i);
        }

        System.out.println("printed");
        fin.close();

         */
    }
}
