import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи, что нужно посчитать, например: 2 + 7");
        String input = scanner.nextLine();

        String[] m = (input.trim()).split("\\s+");

        try {
            if (m.length < 3){
                throw new Exception("Строка не является математической операцией");
            }
            if (m.length >3){
                throw new Exception("Не выполнено условие: два операнда и один оператор");
            }

            a = Integer.parseInt(m[0]);
            b = Integer.parseInt(m[2]);

            if (a>10 || b>10 || a<1 || b<1){
                throw new Exception("Данный калькулятор принимает числа от 1 до 10");
            }


            sdf
                    sdsdfsd
                    fsddfgdfg
                            fs
                            df
                           vbvbnvbncvn
            sdf

            switch (m[1]) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    throw new Exception("Данный калькулятор не умеет вычислять эту операцию");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
