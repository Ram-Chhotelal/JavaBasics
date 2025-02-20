package BasicsJavaCode;

public class Swapping {
    public static void main(String[] args) {
        int first_num = 10, second_num = 20;

        System.out.println("Before swaping : " + first_num + " " + second_num);

//        Swapping Logic
        int temp = first_num;
        first_num = second_num;
        second_num = temp;

        System.out.println("After Swapping : " + first_num + " " + second_num);
    }
}
