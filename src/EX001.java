import java.util.ArrayList;
import java.util.Iterator;

public class EX001 {



        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            // Добавляем строки и целые числа в список
            list.add("строка1");
            list.add("строка2");
            list.add("строка3");
            list.add("3");
            list.add("целое число1");
            list.add("целое число2");

            // Проходим по списку и удаляем целые числа
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                try {
                    Integer.parseInt(element); // Пытаемся привести элемент к типу int
                    iterator.remove(); // Если удалось привести к int, удаляем элемент
                } catch (NumberFormatException e) {
                    // Обрабатываем исключение, если не удалось привести к типу int
                }
            }

            // Выводим элементы списка (строки без целых чисел)
            for (String element : list) {
                System.out.println(element);
            }
        }
    }

