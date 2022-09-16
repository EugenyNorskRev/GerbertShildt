public class InchToMetr {
    public static void main(String[] args) {
        double inch, metr;
         int counter;

         counter = 0;
         for (inch = 0; inch < 100; inch++){
             metr = inch / 39.37;
             System.out.println(inch + " дюймам соответствует " + metr + " метра");

             counter++;
             if (counter == 12) {
                 System.out.println();
                 counter = 0;
             }
         }
    }
}
