import java.util.Scanner;

public class Add_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,1,9,9,8,0,0};
        int add;
        int pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value you want to add: ");
        add = sc.nextInt();
        System.out.println("Enter the position you want to put the value you entered: ");
        pos = sc.nextInt();

        if (pos >= arr.length)
            System.out.println("The position you entered exceed the array's length");
        else{
            for (int i = arr.length -1; i>pos; i--){
                arr[i] = arr[i-1];
            }
            arr[pos] = add;
        }

        String result = " ";
        for(int i=0; i<arr.length;i++){
            result += arr[i] + ", ";
        }
        System.out.println("Result: " + result);
    }
}
