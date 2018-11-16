import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ConsoleScan {
    Scanner sc = new Scanner(System.in);
    JacardTextAnalayzer jacard = new JacardTextAnalayzer();
    TextToArray tta = new TextToArray();
    public void toListString(){
        System.out.println("Введите текст №1");
        String t1 = sc.nextLine();
        System.out.println("Введите текст №2");
        String t2 = sc.nextLine();
        System.out.println(jacard.jacard(tta.toArray(t1), tta.toArray(t2)));
    }
    public void  toListFile() throws FileNotFoundException {
        FileReader fr1 = new FileReader("Text1.txt");
        Scanner sc1 = new Scanner(fr1);
        FileReader fr2 = new FileReader("Text2.txt");
        Scanner sc2 = new Scanner(fr2);
        String t1 = sc1.nextLine();
        String t2 = sc2.nextLine();
        System.out.println(jacard.jacard(tta.toArray(t1), tta.toArray(t2)));
    }
}










