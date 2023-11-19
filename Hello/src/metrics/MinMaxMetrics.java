package metrics;

/**
 * In this exercise, we are going to implement a class called MinMaxMetrics. A
 * single instance of this class will be passed to multiple threads in our
 * application. MinMaxMetrics is an analytics class used to keep track of the
 * minimum and the maximum of a particular business or performance metric in our
 * application. Example: A stock trading application that keeps track of the
 * minimum and maximum price of the stock daily. The class will have 3 methods:
 * addSample(..) - Takes a new sample. getMin() - Returns the sample with the
 * minimum value we have seen so far. getMax() - Returns the sample with the
 * maximum value we have seen so far. Notes: Each method can be called
 * concurrently by any given number of threads, so the class needs to be
 * thread-safe. In addition, this class is used for analytics, so it needs to be
 * as performant as possible, as we don't want it to slow down our business
 * logic threads too much. Threads that call getMin() or getMax() are interested
 * in only one of the values and are never interested in both the min and the
 * max at the same time
 */
public class MinMaxMetrics {

    private long minValue;
    private long maxValue;

    public MinMaxMetrics(long minValue, long maxValue) {
	this.minValue = Long.MAX_VALUE;
	this.maxValue = Long.MIN_VALUE;
    }

    public void addSample(long newSample) {
	synchronized (this) {
	    this.minValue = Math.min(newSample, this.minValue);
	    this.maxValue = Math.max(newSample, this.maxValue);
	}
    }

    public long getMin() {
	return this.minValue;
    }

    public long getMax() {
	return this.maxValue;
    }
}
