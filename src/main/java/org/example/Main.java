package org.example;

import java.io.IOException;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            GetСontact.getContact();
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
        catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}