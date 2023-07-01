import java.util.ArrayList;
import java.util.List;

public class homework {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            // добавим пример чисел в список
            numbers.add(7);
            numbers.add(3);
            numbers.add(12);
            numbers.add(5);
            numbers.add(1);
            numbers.add(9);

            // 1) Удаление четных чисел
            List<Integer> oddNumbers = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 != 0) {
                    oddNumbers.add(number);
                }
            }

            // 2) Нахождение минимального значения
            int min = oddNumbers.get(0);
            for (int i = 1; i < oddNumbers.size(); i++) {
                if (oddNumbers.get(i) < min) {
                    min = oddNumbers.get(i);
                }
            }

            // 3) Нахождение максимального значения
            int max = oddNumbers.get(0);
            for (int i = 1; i < oddNumbers.size(); i++) {
                if (oddNumbers.get(i) > max) {
                    max = oddNumbers.get(i);
                }
            }

            // 4) Нахождение среднего значения
            int sum = 0;
            for (int number : oddNumbers) {
                sum += number;
            }
            double average = (double) sum / oddNumbers.size();

            // Вывод результатов
            System.out.println("Исходный список чисел: " + numbers);
            System.out.println("Список чисел без четных чисел: " + oddNumbers);
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее значение: " + average);
        }
    }
