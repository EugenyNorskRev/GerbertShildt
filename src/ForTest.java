import java.io.IOException;

public class ForTest {
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Для остановки нажмите клавишу S");
        for (i = 0; (char) System.in.read() !='s'; i++)
            System.out.println("Проход № " + i);
    }
}
