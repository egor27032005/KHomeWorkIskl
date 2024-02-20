package org.example;

import java.io.IOException;
import java.util.Scanner;

public class GetСontact {
    static Scanner sc=new Scanner(System.in);
    public static void getContact() throws IOException {
        System.out.println("Введите одной строкой:\n" +
                "<Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>\n" +
                "Пример: \nSergeyev Egor Vladimirovich 27.03.2005 9167894856 m");
        String data= sc.nextLine();
        String[] infa=data.split(" ");
        int len=infa.length;
       if(len==6)
           parse(infa);
       else{
           throw new IndexOutOfBoundsException("много-мало ввел");
       }

    }
    public static void parse(String [] infa) throws IOException {
        String data=infa[3];
        String number=infa[4];
        String gender=infa[5];
        Exception.getDataR(data);
        Exception.getNumber(number);
        Exception.getGender(gender);
        WriteInformation.createWile(infa);
    }


}
