import java.lang.foreign.StructLayout;
import java.util.Arrays;

public class SimpleStatistics {
    private double[] data;

    public SimpleStatistics(double[] data) {
        this.data = data;
        Arrays.sort(this.data); // sort to facilitate median and mode
    }

    // average
    public double mean() {
        double sum = 0.0;
        for (var num : data) sum += num;
        return sum / data.length;
    }

    // median 중간값
    public double median() {
        int len = data.length;

        // in case odd
        if(len % 2 == 1) {
            return data[len/2];
        } else {
            return (data[len/2-1] + data[len/2]) / 2.0;
        }
    }

    // range
    public double range() {
        return data[data.length-1] - data[0];
    }

    public void descriptiveStatistics() {
        System.out.println(Arrays.toString(this.data));
        System.out.println(mean());
        System.out.println(median());
        System.out.println(range());
    }
}
