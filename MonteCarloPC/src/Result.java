
public class Result {
	private double median;
	private double TenPercentBest;
	private double TenPercentWorst;
	
	public String toString(){
		return "median: " + median + " | 10 % Best Case: " + TenPercentBest 
				+ " | 10 % Worst Case: " + TenPercentWorst;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public double getTenPercentBest() {
		return TenPercentBest;
	}

	public void setTenPercentBest(double tenPercentBest) {
		TenPercentBest = tenPercentBest;
	}

	public double getTenPercentWorst() {
		return TenPercentWorst;
	}

	public void setTenPercentWorst(double tenPercentWorst) {
		TenPercentWorst = tenPercentWorst;
	}
}
