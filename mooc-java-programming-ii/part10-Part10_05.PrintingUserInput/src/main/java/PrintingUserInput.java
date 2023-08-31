
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }
            
            list.add(input);
        }
        list.stream().forEach(s -> System.out.println(s));
    }
}
