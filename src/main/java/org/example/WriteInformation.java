package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInformation {
    public static void createWile(String[] s) throws IOException {
        String fileName = s[0] + ".txt";
        try {
            File path = new File(fileName);

            if (!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            String writeString = String.join(" ", s);

            bw.write(writeString);
            bw.newLine();
            bw.close();


        } catch (IOException e){
            throw new IOException("Произошла ошибка во время создания или записи файла");
        }

    }

    }

