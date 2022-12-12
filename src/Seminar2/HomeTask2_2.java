// Если необходимо, исправьте данный код:
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)


package Seminar2;

public class HomeTask2_2 {
    public static void main(String[] args) {
        int[] newArray = { 3, 2, 5, 4, 6, 7, 3, 1 };

        try {
            int d = 0;
            double catchedRes1 = newArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound " + e);
        } catch (NullPointerException e) {
            System.out.println("Nulls are not alowed" + e);
        }

    }
}
