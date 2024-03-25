package jlc;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class fileio {
    public static void main(String[] args) throws IOException {
        String filenamePrefix = "Lab";
        int number = 545;
        String filenameSuffix = ".java";
        
        for(int i=number;i<=572;i++) {
        	File file = new File(filenamePrefix +number+ filenameSuffix);
        	if(!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("public class Lab"+number+" {\n" +
                    		"\tpublic static void main(String[] args) {\n" +
                    		"}" +
                		"}"
            );
            pw.close();
            number++;
        }
        
        System.out.println("Done");
    }
}
