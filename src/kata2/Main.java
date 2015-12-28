package kata2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] vector = {"Pepe", "Juan", "Juan", "Juan", "Ana", "Ana"};
        Histogram<String> histogram = CalculateHistogram.computeHistogram(vector);

        for (Object key : histogram.keySet()) {
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
