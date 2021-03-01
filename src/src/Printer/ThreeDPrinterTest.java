package Printer;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		//상위로부터 제한을 걸었을때 해당되지 않은 클래스는 에러가 나옴
		ThreeDPrinter<Powder> T = new ThreeDPrinter<>();
		T.setT(new Powder());
		Powder pow = T.getT();
		System.out.println(pow.toString());
		
		ThreeDPrinter<Plastic> P = new ThreeDPrinter<>();
		P.setT(new Plastic());
		Plastic Pla = P.getT();
		System.out.println(Pla.toString());
		
		
		
	}

}
