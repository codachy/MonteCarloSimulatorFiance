
public class Test {
	public static void main(String[] args) {
		MonteCarloSimulator simulator = new MonteCarloSimulator(10000, 0.035, 20);
		
		Portfolio aggressive = new Portfolio("Aggressive", 100000, 0.094324, 0.15675);
		System.out.println("Aggressive: " + simulator.cal(aggressive));
		Portfolio conservative = new Portfolio("Very Conservative", 100000, 0.06189, 0.063438);
		System.out.println("Very Conservative: " + simulator.cal(conservative));
	}
}
