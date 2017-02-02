
/**
 * 
 * @author Lauren Li
 *
 */

public class Portfolio {
	private String type;
	private double initInvestment;
	private double meanReturn;
	private double sd; //standard deviation
	
	public Portfolio(String type, double investment, double meanReturn, double sd) {
		this.type = type;
		this.initInvestment = investment;
		this.setMeanReturn(meanReturn);
		this.sd = sd;
	}
	

	//----- Below are getters and setters ------------------------------

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getInitInvestment() {
		return initInvestment;
	}
	public void setInitInvestment(double initInvestment) {
		this.initInvestment = initInvestment;
	}

	public double getSd() {
		return sd;
	}
	public void setSd(double sd) {
		this.sd = sd;
	}

	public double getMeanReturn() {
		return meanReturn;
	}

	public void setMeanReturn(double meanReturn) {
		this.meanReturn = meanReturn;
	}
}
