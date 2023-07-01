import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class ex00 {
    public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            Random random = new Random();

            // Заполняем список 10 случайными числами
            for (int i = 0; i < 10; i++) {
                numbers.add(random.nextInt(100));
            }

            // Сортируем список
            Collections.sort(numbers);

            // Выводим отсортированный список
            for (int num : numbers) {
                System.out.println(num);
            }
        }
    }

