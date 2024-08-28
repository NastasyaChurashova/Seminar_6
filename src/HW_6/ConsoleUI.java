package HW_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {
    public LaptopService service = new LaptopService();
    public Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - Операционная система");
            System.out.println("2 - Цвет");
            System.out.println("3 - Бренд");
            String param = scanner.nextLine();
            Map<String, String> filters = new HashMap<>();

            if (param.equals("1")) {
                System.out.print("Введите операционную систему: ");
                filters.put("operatingSystem", scanner.nextLine());
            } else if (param.equals("2")) {
                System.out.print("Введите цвет: ");
                filters.put("colour", scanner.nextLine());
            } else if (param.equals("3")) {
                System.out.print("Введите бренд: ");
                filters.put("brand", scanner.nextLine());
            }

            Set<Laptop> filteredLaptops = service.filterLaptops(filters);
            if (filteredLaptops.isEmpty()) {
                System.out.println("Нет ноутбуков, соответствующих критериям.");
            } else {
                filteredLaptops.forEach(System.out::println);
            }

            System.out.print("Искать еще? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
