// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя
// ввод данных.

package Seminar2;

public class HomeTask2_1 {
    public static void main(String[] args) {
        System.out.println(inputFloat());
    }
    public static float inputFloat() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите дробное число (например: 5,76): ");
            while (!in.hasNextFloat()) {
                System.out.print("Не верный ввод повторите попытку: ");
                in.next();
            }
            return in.nextFloat();
        }
    }
}
