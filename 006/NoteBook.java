import java.util.Map;

class NoteBook {
    private String brand;
    private int ramSize; // объем оперативной памяти в ГБ
    private int hddSize; // объем жесткого диска в ГБ
    private String os; // операционная система
    private String color;

    public NoteBook(String brand, int ramSize, int hddSize, String os, String color) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void filterNotebooks(NoteBook[] notebooks, Map<String, Object> filters) {
        for (NoteBook notebook : notebooks) {
            boolean matches = true;
            for (Map.Entry<String, Object> filter : filters.entrySet()) {
                switch (filter.getKey()) {
                    case "ramSize":
                        int ramSize = (int) filter.getValue();
                        if (notebook.getRamSize() < ramSize) {
                            matches = false;
                        }
                        break;
                    case "hddSize":
                        int hddSize = (int) filter.getValue();
                        if (notebook.getHddSize() < hddSize) {
                            matches = false;
                        }
                        break;
                    case "os":
                        String os = (String) filter.getValue();
                        if (!notebook.getOs().equals(os)) {
                            matches = false;
                        }
                        break;
                    case "color":
                        String color = (String) filter.getValue();
                        if (!notebook.getColor().equals(color)) {
                            matches = false;
                        }
                        break;
                    default:
                        break;
                }
            }
            if (matches) {
                System.out.println(notebook);
            }
        }
    }
}
