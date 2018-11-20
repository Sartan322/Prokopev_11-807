import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ConsoleScan {
    Scanner sc = new Scanner(System.in);
    JacardTextAnalayzer jacard = new JacardTextAnalayzer();
    Operations tta = new Operations();
    CosAnalyzer ca = new CosAnalyzer();

    public void toListString(int y) {
        System.out.println("Введите текст №1");
        String t1 = sc.nextLine();
        System.out.println("Введите текст №2");
        String t2 = sc.nextLine();
        if (y == 1) {
            System.out.println(jacard.jacard(t1, t2));
        } else {
            System.out.println(ca.cosAnalyzer(t1, t2));
        }
    }

    public void toListFile(int y) throws FileNotFoundException {
        FileReader fr1 = new FileReader("Text1.txt");
        Scanner sc1 = new Scanner(fr1);
        FileReader fr2 = new FileReader("Text2.txt");
        Scanner sc2 = new Scanner(fr2);
        String t1 = sc1.nextLine();
        String t2 = sc2.nextLine();
        if (y == 1) {
            System.out.println(jacard.jacard(t1, t2));
        } else {
            System.out.println(ca.cosAnalyzer(t1, t2));
        }
    }
}










