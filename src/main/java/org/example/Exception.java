package org.example;

public class Exception {
    public static void getDataR( String data){
        char []s=data. toCharArray();
        if(s.length==10 || s[2]=='.' || s[5]=='.'){

        }
        else {
            throw new IncorrectValueException("Дата рождения введена неправильно\nНадо так: \n<dd.mm.yyyy>");
        }

    }
    public static void getNumber(String number ) throws IncorrectValueException{
        try{
            long n=Long.parseLong(number);
        }
        catch (IncorrectValueException e){
            throw new IncorrectValueException("не правильный ввод, надо так <1111111111>");
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Это не номер, это строка");
        }
    }
    public static void getGender(String gender){
        if(gender.equals("f") || gender.equals("m"));
        else{
            throw new IncorrectValueException("Не верный пол\n надо так <m/f>");
        }

    }
}
