import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //решение задачи 1
        User tester = new User(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());

        //решение задачи 2
        var price = new int[] {5, 100, 20, 66, 16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;

        var discounter = new Discounter();
        int[] result;

        try {
            result = discounter.decryptData(price, discount, offset, readLength);
            System.out.println(Arrays.toString(result));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
