import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class NoteMain {

    static NoteBookClass book1 = new NoteBookClass("Intel", 16, 14, 256, "Lenovo");
    static NoteBookClass book2 = new NoteBookClass("Intel", 8, 12, 512, "HP");
    static NoteBookClass book3 = new NoteBookClass("AMD", 16, 15, 256, "Acer");

    static HashSet<NoteBookClass> notes = new HashSet<>(Arrays.asList(book1, book2, book3));

    public static void main(String[] args) {

        for (NoteBookClass item : notes) {
            System.out.println(item);
            System.out.println();
        }

        findMyNote();

    }

    public static void findMyNote() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите запрос:\n" +
                "Фильтр по производителю процессора  - введите 1. \n" +
                "Фильтр по обьему оперативной памяти - введите 2. \n" +
                "Фильтр по размеру диагонали экрана  - ведите 3. \n" +
                "Фильтр по обьему жесткого диска - введите 4. \n" +
                "Фильтр по производителю - введите 5. \n");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Введите наименование (AMD или Intel)");
                String proc = scanner.next();
                scanner.close();
                filterCPU(proc);

                break;
            case 2:
                System.out.println("Введите обьем оперативной памяти (8 или 16)");
                int ram = scanner.nextInt();
                scanner.close();
                filterRAM(ram);
                break;

            case 3:
                System.out.println("Введите диагональ экрана (12, 14 или 15)");
                int diag = scanner.nextInt();
                scanner.close();
                filterDiagonal(diag);
                break;

            case 4:
                System.out.println("Введите обьем жесткого диска (256 либо 512)");
                int ssd = scanner.nextInt();
                scanner.close();
                filterSsd(ssd);
                break;

            case 5:
                System.out.println("Введите производителя ноутбука (Lenovo, HP, Acer)");
                String brand = scanner.nextLine();
                scanner.close();
                filterBrand(brand);
                break;

            default:
                System.out.println("Некорректный ввод");
        }

        // дальше по методам расписать каждый выбор

    }

    public static void filterCPU(String proc) {
        if (proc.equals("AMD")) {
            for (NoteBookClass element : notes) {
                if (element.getBrandOfCpu().equals(proc)) {
                    System.out.println(element);

                }
            }
        }
        else if (proc.equals("Intel")) {
            for (NoteBookClass element : notes) {
                if (element.getBrandOfCpu().equals(proc)) {
                    System.out.println(element);
                }
            }
        } 
        else {
            System.out.println("Нет такого производителя процессоров в наших ноутбуках");
        }
    }

    public static void filterRAM(int ram) {
        if (ram == 8) {
            for (NoteBookClass element : notes) {
                if (element.getValueOfOperativ() == ram) {
                    System.out.println(element);
                }
            }
        }
        else if (ram == 16) {
            for (NoteBookClass element : notes) {
                if (element.getValueOfOperativ() == ram) {
                    System.out.println(element);
                }
            }
        } else {
            System.out.println("Нет такого ноутбука");
        }
    }

    public static void filterDiagonal(int diag) {
        if (diag == 12) {
            for (NoteBookClass element : notes) {
                if (element.getDiagonal() == diag) {
                    System.out.println(element);
                }
            }
        }
        else if (diag == 14) {
            for (NoteBookClass element : notes) {
                if (element.getDiagonal() == diag) {
                    System.out.println(element);
                }
            }
        }
        else if (diag == 15) {
            for (NoteBookClass element : notes) {
                if (element.getDiagonal() == diag) {
                    System.out.println(element);
                }
            }
        }

        else {
            System.out.println("Нет ноутбука с такой диагональю");
        }

    }

    public static void filterSsd(int ssd) {
        if (ssd == 256) {
            for (NoteBookClass element : notes) {
                if (element.getValueOfSsd() == ssd) {
                    System.out.println(element);
                }
            }
        }
        else if (ssd == 512) {
            for (NoteBookClass element : notes) {
                if (element.getValueOfSsd() == 512) {
                    System.out.println(element);
                }
            }
        } else {
            System.out.println("Нет ноутбука с такими параметрами");
        }

    }

    public static void filterBrand(String brand) {
        if (brand.equals("Lenovo")) {
            for (NoteBookClass element : notes) {
                if (element.getBrand().equals(brand)) {
                    System.out.println(element);
                }
            }
        }
        else if (brand.equals("HP")) {
            for (NoteBookClass element : notes) {
                if (element.getBrand().equals(brand)) {
                    System.out.println(element);
                }
            }
        }
        else if (brand.equals("Acer")) {
            for (NoteBookClass element : notes) {
                if (element.getBrand().equals(brand)) {
                    System.err.println(element);
                }
            }
        } else {
            System.out.println("Нет ноутбуков этого производителя");
        }
    }

}
