package HW_6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LaptopService {
    public Set<Laptop> laptops = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public Set<Laptop> filterLaptops(Map<String, String> filters) {
        return laptops.stream()
                .filter(laptop -> {
                    boolean matches = true;
                    for (Map.Entry<String, String> filter : filters.entrySet()) {
                        String key = filter.getKey();
                        String value = filter.getValue();
                        if (key.equals("brand") && !laptop.getBrandName().equalsIgnoreCase(value)) {
                            matches = false;
                        } else if (key.equals("colour") && !laptop.getColour().equalsIgnoreCase(value)) {
                            matches = false;
                        } else if (key.equals("operatingSystem") && !laptop.getOperatingSystem().equalsIgnoreCase(value)) {
                            matches = false;
                        }
                    }
                    return matches;
                })
                .collect(Collectors.toSet());
    }
}
