import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите выражение (например, 2 + 2):");

        try {
            // пользователь чето пишет
            String input = scanner.nextLine();

            // метод для вычисления
            String result = calc(input);

            // результат
            System.out.println("результат: " + result);
        } catch (Exception e) {
            // ошибка
            System.out.println("ошибка: " + e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        // строку на части
        String[] parts = input.split(" ");

        // частей три
        if (parts.length != 3) {
            throw new Exception("введите выражение в формате: число операция число");
        }

        // Пробуем преобразовать числа
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);

        // числа в диапазоне от 1 до 10
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("числа должны быть от 1 до 10 включительно.");
        }

        // сохраняем оператор
        String operator = parts[1];

        // переменная для результата
        int result = 0;
        // switch для определения операции
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                // неизвестный оператор
                throw new Exception("операция должна быть +, -, *, /.");
        }

        // результат
        return Integer.toString(result);
    }
}