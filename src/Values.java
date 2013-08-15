
public class Values {

	String IDs = "";
	int counter = 0;
	public Values() {
		
	}
	public Values(String IDs, int counter) {
		this.IDs = IDs;
		this.counter = counter;
	}
	public String toString() {
		return counter + ":" + IDs;
	}

}
