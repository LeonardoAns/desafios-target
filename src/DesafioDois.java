import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        palavra.toLowerCase();

        Integer ocorrencia = 0;
        for(char letra : palavra.toCharArray()){
            if(letra == 'a'){
                ocorrencia ++;
            }
        }
        if(ocorrencia > 0){
            System.out.println("A letra A aparece "+ocorrencia+" vezes na palavra "+palavra);
        }
        else{
            System.out.println("A letra A não aparece nenhuma vez na palavra "+ palavra);
        }
        scanner.close();
    }
}
