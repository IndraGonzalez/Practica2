package kata2;

public class CalculateHistogram {
    public static <T> Histogram <T> computeHistogram (T[] vector){
        
        Histogram <T> histogram = new Histogram<>();
        
        for(T key : vector){
            histogram.increment(key);
        }
        return histogram;
    }
}