import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'k';
        do {
            System.out.println("Задумана буква в диапазоне a - z.");
            System.out.println("Попытайтесь ее угадать: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer)
                System.out.println("** Правильно **");
            else {
                System.out.println("Неправильно, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }
        } while (answer != ch);
    }
}
