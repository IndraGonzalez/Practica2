package kata2;

import java.util.HashMap;

public class Histogram <T> {

    private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }
    
    public Object[] getVector() {
        return vector;
    }
    
    public HashMap<T,Integer> getHistogram(){
        HashMap<T,Integer> histogram = new HashMap<T, Integer>();
        for (int i = 0; i < vector.length; i++) {
            if(!histogram.containsKey(vector[i])){
                histogram.put(vector[i],1);
            } else {
                histogram.put(vector[i], histogram.get(vector[i])+1);
            }
        }
        return histogram;
    }
}