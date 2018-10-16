
/** */
public class calauBMI {
	/** */
	private double w;
	
	/** */
	private double h;
	
	/** */
	public double getBMI() {
		double result =  w/(h*h);
	 return result;
	}
	
	/** */
	public void setW(double w) {
		this.w = w;
	}
	
	/** */
	public void setH(double h) {
		this.h = h;
	}
}
