public class Empty {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <= 36; sum += i++);
        System.out.println("Сумма: " + sum);
    }
}
