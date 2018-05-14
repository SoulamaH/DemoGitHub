package GitInt;

public interface MonInterface {
	
	public default String direBonjour() {
		return "je vous dit bonjour";
	}
	
	public void faireLaSomme(int x, int y);
}
