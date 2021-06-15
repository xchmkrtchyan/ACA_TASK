package com.company.IO;

import java.io.*;

public class Task5 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Хчо\\Desktop\\ACA_TASK\\src\\com\\company\\IO\\input.txt");
        File file2 = new File("C:\\Users\\Хчо\\Desktop\\ACA_TASK\\src\\com\\company\\IO\\output.txt");
        System.out.println(specificExtension(file1, file2, ".txt"));
    }

    static boolean specificExtension(File file1, File file2, String suffix) {
        int num = 0;
        try {
            BufferedReader file1Reader = new BufferedReader(new FileReader(file1));
            BufferedReader file2Reader = new BufferedReader(new FileReader(file2));
            String line1 = file1Reader.readLine();
            String line2 = file2Reader.readLine();
            while (line1 != null || line2 != null) {
                if (line1.length() == line2.length() && !line1.equals(line2)) {
                    for (int i = 0; i < line1.length(); i++) {
                        if (line1.charAt(i) != line2.charAt(i))
                            num++;
                    }
                } else if (line1.length() != line2.length()){
                    for (int i = 0; i < line1.length(); i++) {
                        if (line1.charAt(i) != line2.charAt(i))
                            num++;
                    }
                }
                String nextLine1 = file1Reader.readLine();

                return true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

