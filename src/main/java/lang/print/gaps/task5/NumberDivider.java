package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        int result = toBeDivided / 5;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        NumberDivider numberDivider = new NumberDivider();
        int toBeDivided = 15;
        numberDivider.divide(toBeDivided);
    }
}
