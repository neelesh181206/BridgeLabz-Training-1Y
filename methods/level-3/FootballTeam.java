public class FootballTeam {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int n : arr)
            min = Math.min(min, n);
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            max = Math.max(max, n);
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }

        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}