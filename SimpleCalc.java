import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {
        openCalc();
    }

    static void openCalc() {
        String sym = "";
        Double n1 = 0d;
        Double n2 = 0d;
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
    
        while (!quit) {
            System.out.print("Operation: ");
            sym = scanner.next();
            System.out.print("First number: ");
            n1 = scanner.nextDouble();
            System.out.print("Second number: ");
            n2 = scanner.nextDouble();

            switch (sym) {
                case "*":
                    System.out.print("Output: "+ n1*n2);
                    break;
                case "/":
                    System.out.print("Output: "+ n1/n2);
                    break;
                case "-":
                    System.out.print("Output: "+ (n1-n2));
                    break;
                case "+":
                    System.out.print("Output: "+ (n1+n2));
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.print("Quit: ");
            quit = (scanner.next().equals("yes")) ? true : false;
            if (quit) scanner.close();
        }

    }

    
}
