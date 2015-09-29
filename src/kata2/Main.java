package kata2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] vector = {1, 1, 4, 4, 5, 6, 8, 9, 100};
        Histogram histogram = new Histogram(vector);
        HashMap<Integer,Integer> histogramResult = histogram.getHistogram();
    }
}
