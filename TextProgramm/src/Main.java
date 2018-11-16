import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ConsoleScan cs = new ConsoleScan();
        boolean on = true;
        while(on){
            System.out.println("Здравствуйте. Тексты вводятся с клавиатуры или берутся из файла?");
            System.out.println("Введите \n1 - с клавиатуры; \n2 - из файлов");
            int x = sc.nextInt();
            System.out.println("Как вы хотите провести анализ?");
            System.out.println("Введите \n1 - Жакарр; \n2 - Косинусовая мера");
            int y = sc.nextInt();
            switch (x) {
                case 1:
                    switch (y){
                        case 1:
                            cs.toListString();
                            break;
                        case 2:
                            break;

                        default:
                            System.out.println("Вы ввели некорректное значение");
                            break;
                    }
                break;
                case 2:
                    switch (y){
                        case 1:
                            cs.toListFile();
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Вы ввели некорректное значение");
                            break;
                    }
                    break;

                default:
                    System.out.println("Вы ввели некорректное значение");
                    break;
            }
            on = false;
        }
    }
}
