import java.util.ArrayList;
import java.util.List;

public class EX002 {



        public static void main(String[] args) {
            List<ArrayList<String>> catalog = new ArrayList<>();

            // Пример заполнения каталога
            addGenreAndBooks(catalog, "Жанр 1", "Книга 1", "Книга 2");
            addGenreAndBooks(catalog, "Жанр 2", "Книга 3", "Книга 4");
            addGenreAndBooks(catalog, "Жанр 3", "Книга 5", "Книга 6");

            // Вывод содержимого каталога
            for (ArrayList<String> genreAndBooks : catalog) {
                for (String item : genreAndBooks) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
        }

        public static void addGenreAndBooks(List<ArrayList<String>> catalog, String genre, String... books) {
            ArrayList<String> genreAndBooks = new ArrayList<>();
            genreAndBooks.add(genre);

            for (String book : books) {
                genreAndBooks.add(book);
            }

            catalog.add(genreAndBooks);
        }
    }

