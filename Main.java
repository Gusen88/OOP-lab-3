import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность символов: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        System.out.println("Последовательность в обратном порядке: ");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
