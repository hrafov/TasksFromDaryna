public class Main {
    public static void main(String[] args) {
        //input [1,2,3,4]
        //output [1,3,6,10]
        int[] input = new int[]{1,2,3,4};
        int[] output = summingArray(input);
        for (int i = 0; i < input.length; i++) System.out.print(output[i] + " ");
    }

    private static int[] summingArray(int[] input) {
        int[] output = new int[input.length];
        output[0] = input[0];
        for (int i = 1; i < input.length; i++) output[i] = input[i] + output[i - 1];
        return output;
    }
}
