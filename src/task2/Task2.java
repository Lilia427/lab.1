package task2;
import java.util.Arrays;
import java.util.Comparator;

public class Task2 {

    public static void main(String[] args) {
        String[] strings = {"TWo", "One", "FOUR", "THRee"};
        Arrays.sort(strings, Comparator.comparing(Task2::countUppercaseLetters));
        Arrays.stream(strings).forEach(System.out::println);
    }

    private static int countUppercaseLetters(String str) {
        return (int) str.chars().filter(Character::isUpperCase).count();
    }
}
