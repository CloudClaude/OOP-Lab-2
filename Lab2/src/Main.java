///Проверить является ли заданная строка шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядах.
/// – пример правильных выражений: 123456, 234567.
/// – пример неправильных выражений: 1234567, 12345.
import java.util.Scanner;
import java.util.regex.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше число: ");
        String number = scanner.nextLine();
        // correctnumber = Pattern.compile("[1-9]\\d{5}");
        if(number.matches("[1-9]\\d{5}")) {
            System.out.println("Введенное число является подходящим.");
        }
        else{System.out.println("Введенное число не является подходящим.");}
    }
}

