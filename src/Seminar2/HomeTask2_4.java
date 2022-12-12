// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Seminar2;

import java.util.Scanner;
        public class HomeTask2_4 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                try {
                    System.out.println(inputString(scanner));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            public static String inputString(Scanner scanner) throws Exception {

                System.out.print("Введите строку: ");
                String string = scanner.nextLine();
                string = string.trim();
                if (string.isEmpty()) {
                    throw new Exception("Нельзя вводить пустые строки");
                }
                return string;
            }
        }