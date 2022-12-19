package Seminar3;

import java.util.Scanner;

import static Seminar3.Login.checkCorrect;
public class Main {
    public static void main(String[] args) {
        String regex = "[\\w]{1,20}";
        Scanner loginScanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = loginScanner.nextLine();
        System.out.println("Введите пароль");
        String password = passwordScanner.nextLine();
        System.out.println("Повторите пароль");
        String confirmPassword = passwordScanner.nextLine();
        System.out.println(checkCorrect(login, password, confirmPassword, regex));
    }
}