package spring;

// 재귀 호출(recursive call) 방식으로 factorial 메서드를 구현
public class RecuCalculator implements Calculator {
	@Override
	public long factorial(long num) {
		
		if (num <= 1) {
			return 1;
		} else { 
			return num * factorial(num - 1);
		}
	}
}
