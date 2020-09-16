import java.util.Scanner;

public class AddNewElement {
    public static void main(String[] args) {
        int newElement, index;
        String input;
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println("Nhập số cần chèn đi anh zai!!");
        input = scanner.nextLine();

        if (isStringInteger(input)){
            newElement = Integer.parseInt(input);

            System.out.println("Giờ thì nhập vị trí xem nào!!");
            input = scanner.nextLine();

            if (isStringInteger(input)){
                index = Integer.parseInt(input);

                if (index < 0 || index > inputArray.length - 1){
                    System.out.println("Chịu, mảng có thế thôi mà đòi chèn.");
                }
                else {
                    int temp;
                    for (int i = index - 1; i < inputArray.length; i++) {
                        temp = inputArray[i];
                        inputArray[i] = newElement;
                        newElement = temp;
                    }
                }

                for (int i = 0; i < inputArray.length; i++) {
                    System.out.print(inputArray[i] + " ");
                }
            }
            else{
                System.out.println("Vị trí phải là số, có bị thiểu năng không??");
            }
        }
        else {
            System.out.println("Bảo là số cơ mà!!");
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
