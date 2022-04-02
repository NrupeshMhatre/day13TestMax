package Test;
public class TestMaximum<T extends Comparable<T>> {
	private T firstNumber;
	private T secondNumber;
	private T thirdNumber;
	private T fourthNumber;
	private T fifthNumber;

	public TestMaximum(T firstNumber, T secondNumber, T thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public TestMaximum(T firstNumber, T secondNumber, T thirdNumber, T fourthNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
		this.fourthNumber = fourthNumber;
	}

	public TestMaximum(T firstNumber, T secondNumber, T thirdNumber, T fourthNumber, T fifthNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
		this.fourthNumber = fourthNumber;
		this.fifthNumber = fifthNumber;
	}

	public T getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(T firstNumber) {
		this.firstNumber = firstNumber;
	}

	public T getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(T secondNumber) {
		this.secondNumber = secondNumber;
	}

	public T getThirdNumber() {
		return thirdNumber;
	}

	public void setThirdNumber(T thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	public T getFourthNumber() {
		return fourthNumber;
	}

	public void setFourthNumber(T fourthNumber) {
		this.fourthNumber = fourthNumber;
	}

	public T getFifthNumber() {
		return fifthNumber;
	}

	public void setFifthNumber(T fifthNumber) {
		this.fifthNumber = fifthNumber;
	}

	
	
	public <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
		T max;
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
			max = firstNumber;

		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0)
			max = secondNumber;
		else
			max = thirdNumber;
		printMax(firstNumber, secondNumber, thirdNumber, max);
	}

	
	 
	public <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber, T fourthNumber) {
		T max;
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0
				&& firstNumber.compareTo(fourthNumber) > 0)
			max = firstNumber;
		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0
				&& secondNumber.compareTo(fourthNumber) > 0)
			max = secondNumber;
		else if (thirdNumber.compareTo(firstNumber) > 0 && thirdNumber.compareTo(secondNumber) > 0
				&& thirdNumber.compareTo(fourthNumber) > 0)
			max = thirdNumber;
		else
			max = fourthNumber;
		printMax(firstNumber, secondNumber, thirdNumber, fourthNumber, max);

	}
	
	public <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber, T fourthNumber,
			T fifthNumber) {
		T max;
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0
				&& firstNumber.compareTo(fourthNumber) > 0 && firstNumber.compareTo(fifthNumber) > 0)
			max = firstNumber;
		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0
				&& secondNumber.compareTo(fourthNumber) > 0 && secondNumber.compareTo(fifthNumber) > 0)
			max = secondNumber;
		else if (thirdNumber.compareTo(firstNumber) > 0 && thirdNumber.compareTo(secondNumber) > 0
				&& thirdNumber.compareTo(fourthNumber) > 0 && thirdNumber.compareTo(fifthNumber) > 0)
			max = thirdNumber;
		else if (fourthNumber.compareTo(firstNumber) > 0 && fourthNumber.compareTo(secondNumber) > 0
				&& fourthNumber.compareTo(thirdNumber) > 0 && fourthNumber.compareTo(fifthNumber) > 0)
			max = fourthNumber;
		else
			max = fifthNumber;
		printMax(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, max);
	}

	
	public static <T> void printMax(T first, T second, T third, T max) {
		System.out.printf("Maximum of %s, %s and %s is %s\n", first, second, third, max);
	}

	
	public static <T> void printMax(T first, T second, T third, T fourth, T max) {
		System.out.printf("Maximum of %s, %s ,%s, %s is %s\n", first, second, third, fourth, max);
	}


	public static <T> void printMax(T first, T second, T third, T fourth, T fifth, T max) {
		System.out.printf("Maximum of %s, %s, %s, %s and %s is %s\n", first, second, third, fourth, fifth, max);
	}

}