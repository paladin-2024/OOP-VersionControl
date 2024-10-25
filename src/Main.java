import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new HPComputer("HP", "Silver", 512, 16, "Windows 07", 8, "Intel", "HP Pavilion", 7, 5, 10));
        computers.add(new HPComputer("HP", "Red", 512, 8, "Windows 10", 11, "Intel", "EliteBook", 7, 5, 10));
        computers.add(new HPComputer("HP", "Black", 1024, 32, "Windows 11", 14, "Ubuntu", "HP ZBook", 7, 5, 10));
        computers.add(new Dell_PC("Dell", "Black", 256, 8, "Ubuntu", 9, "AMD", "Dell Latitude", 5, 7));
        computers.add(new Dell_PC("Dell", "White", 256, 8, "Windows 11", 11, "Intel", "Dell AlienWare", 5, 3));
        computers.add(new LenovoPC("Lenovo", "White", 521, 16, "Windows", 11, "Intel", "Lenovo ThinkPad", 9, 0));
        computers.add(new LenovoPC("Lenovo", "Grey", 512, 8, "Linux", 6, "Intel", "ThinkPad", 7, 10));
        computers.add(new LenovoPC("Lenovo", "Black", 1024, 32, "Windows", 11, "Intel", "Lenovo ThinkPad", 9, 0));
        Polymorphism poly = new Polymorphism();
        poly.InstanceMethod(computers);
    }
}