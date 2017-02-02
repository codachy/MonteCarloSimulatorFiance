import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * 
 * @author Lauren Li
 *Simulator to process the random walk
 */
public class MonteCarloSimulator {
	private int numOfSimulation;
	private double inflation;
	private int years;
	
	public MonteCarloSimulator(int numOfSimulation, double inflation, int years) {
		this.numOfSimulation = numOfSimulation;
		this.inflation = inflation;
		this.years = years;
	}
	
	/**
	 * Given portfolio, calculate the random simulation by numOfSimulation times. 
	 * @param porfolio
	 * @return Result
	 */
	public Result cal(Portfolio porfolio){
		Result result = new Result();
		if(porfolio==null) return result;

		//init variables
		NormalDistribution normalDis = new NormalDistribution(porfolio.getMeanReturn(), porfolio.getSd());
		DescriptiveStatistics desStats = new DescriptiveStatistics();
		
		//process the simulation
		for (int i = 0; i < numOfSimulation; i++) {
			double amount = porfolio.getInitInvestment();
			for(int j = 0; j < years; j++){
				double rand = normalDis.sample();
				amount *= (1+rand); //next year value
				amount *= (1-inflation); //adjusted for inflation
			}
			desStats.addValue(amount);
		}
		
		//see distribution curve
		result.setMedian(desStats.getPercentile(50));//50 percentile is median
		result.setTenPercentBest(desStats.getPercentile(90));
		result.setTenPercentWorst(desStats.getPercentile(10));
		return result;
	}
	
	//----- Below are getters and setters ------------------------------

	public int getNumOfSimulation() {
		return numOfSimulation;
	}

	public void setNumOfSimulation(int numOfSimulation) {
		this.numOfSimulation = numOfSimulation;
	}

	public double getInflation() {
		return inflation;
	}

	public void setInflation(double inflation) {
		this.inflation = inflation;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
}
