import java.sql.Array;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần xóa!!");
        input = scanner.nextLine();

        if (isStringInteger(input)){
            int searchValue = Integer.parseInt(input);

        }
    }

    public static boolean isStringInteger (String str){
        try{
            Integer.parseInt(str);
        }catch(Exception e ){
            return false;
        }
        return true;
    }
}
