public class Main {
    public static double example(int x, int y){
        double error;
        error = x / y;
        return error;
    }
    public static void main(String[] args) {
        int x = 6;
        int y = 2;
        try {
            System.out.println(example(x, y));
            x = 0;
            System.out.println(example(x, y));
            x = 6;
            y = 0;
            System.out.println(example(x, y));
        } catch (ArithmeticException e) {
            //checked
            System.out.println("Ошибка при делении " + x + " на " + y);
        }
    }
}