package reflect_method;

public class Methods {
    public int add(int a, int b) {
        return a + b;
    }

    private void print(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
    }
}
