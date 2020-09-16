import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int searchValue;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Nhập số muốn xóa trong mảng: ");
        input = scanner.nextLine();
        if (isStringInteger(input)) {
            searchValue = Integer.parseInt(input);
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] == searchValue) {
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = searchValue;
                }
            }
            inputArray[inputArray.length - 1] = 0;

            for (int i = 0; i < inputArray.length ; i++) {
                System.out.print(inputArray[i] + " ");
            }
        }
        else{
            System.out.println("Không có hàng, đi đi!!");
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
