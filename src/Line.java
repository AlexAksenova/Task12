import java.util.Scanner;

public class Line {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу: ");
        String phrase = scanner.nextLine();
        String phrase2 = phrase.replaceAll(" ", "");
        System.out.println(phrase2);
    }

}
