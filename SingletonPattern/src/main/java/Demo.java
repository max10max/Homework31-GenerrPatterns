import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    //    private List<Integer> list;
    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        try (Scanner scanner = new Scanner(System.in)) {
            logger.log("Запускаем программу.....");
            logger.log("Введите входные данные для списка");
            System.out.print("Введите размер списка:  ");
            int n = scanner.nextInt();
            System.out.print("Введите верхнюю границу значений списка:  ");
            int m = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = random.nextInt(m);
                list.add(i, x);
            }
            logger.log("Создаём и наполняем список \nВот случайный список: " + list.toString());
            logger.log("Введите входные данные для фильтрации");
            System.out.print("Введите число для фильтрации    ");
            int filterNum = scanner.nextInt();
            logger.log("Начинаем фильтрацию");
            Filter filter = new Filter(filterNum);
            logger.log("Выводим результат на экран" +
                    "\nОтсортированный список: " + filter.filterOut(list).toString());
            logger.log("Завершаем работу");


        }
    }
}
