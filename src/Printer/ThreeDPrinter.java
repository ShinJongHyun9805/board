package Printer;

public class ThreeDPrinter<T extends Limit> {

	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
