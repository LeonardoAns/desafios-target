import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();

        DesafioUm main = new DesafioUm();
        if(main.fibonacci(num,0,1)){
            System.out.println("O número está na sequencia de fibonacci");
        }
        else {
            System.out.println("O número não está na sequencia de fibonacci");
        }


    }

    public boolean fibonacci(Integer num, Integer firstNumber, Integer secondNumber){
        if(num.equals(firstNumber)){
            return true;
        }
        if(num < firstNumber){
            return false;
        }
        return fibonacci(num,secondNumber,firstNumber+ secondNumber);
    }
}