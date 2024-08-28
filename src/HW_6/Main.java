package HW_6;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI();

        ui.service.addLaptop(new Laptop("Dell", "black", "Windows 11 Pro"));
        ui.service.addLaptop(new Laptop("Apple", "silver", "macOS"));
        ui.service.addLaptop(new Laptop("HP", "grey", "Windows 11 Home"));
        ui.service.addLaptop(new Laptop("Asus", "white", "Windows 11 Pro"));

        ui.run();
    }
}