package spring;

public class MainCalculator {

	public static void main(String[] args) {
		ImplCalculator implCal = new ImplCalculator();
		long start1 = System.nanoTime();
		implCal.factorial(10);
		long end1 = System.nanoTime();
		
		RecuCalculator recuCal = new RecuCalculator();
		long start2 = System.nanoTime();
		recuCal.factorial(10);
		long end2 = System.nanoTime();
		
		System.out.printf("ImplCalculator.factorial(%d) 실행시간 = %dns\n", 10, (end1 - start1));
		System.out.printf("RecuCalculator.factorial(%d) 실행시간 = %dns\n", 10, (end2 - start2));
	}

}
