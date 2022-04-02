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
	
	public TestMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
		this.fourthNumber = fourthNumber;
	}
    
	public TestMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber,T fifthNumber) {
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

	
	public void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
			System.out.println("Maximum: " + firstNumber);
		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0)
			System.out.println("Maximum: " + secondNumber);
		else
			System.out.println("Maximum: " + thirdNumber);
	}
		
	public void findMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber) {
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0
				&& firstNumber.compareTo(fourthNumber) > 0)
			System.out.println("Maximum: " + firstNumber);
		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0 &&
				secondNumber.compareTo(fourthNumber) > 0)
			System.out.println("Maximum: " + secondNumber);
		else if(thirdNumber.compareTo(firstNumber) > 0 && thirdNumber.compareTo(secondNumber) > 0 && 
				thirdNumber.compareTo(fourthNumber) > 0)
			System.out.println("Maximum: "+thirdNumber);
		else
			System.out.println("Maximum: " + fourthNumber);
	}
	
	
	public void findMaximum(T firstNumber, T secondNumber, T thirdNumber,T fourthNumber, T fifthNumber) {
		if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0
				&& firstNumber.compareTo(fourthNumber) > 0 && firstNumber.compareTo(fifthNumber)> 0)
			System.out.println("Maximum: " + firstNumber);
		else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0 &&
				secondNumber.compareTo(fourthNumber) > 0 && secondNumber.compareTo(fifthNumber) > 0)
			System.out.println("Maximum: " + secondNumber);
		else if(thirdNumber.compareTo(firstNumber) >0 && thirdNumber.compareTo(secondNumber)>0 && 
				thirdNumber.compareTo(fourthNumber)>0 && thirdNumber.compareTo(fifthNumber) >0)
			System.out.println("Maximum: "+thirdNumber);
		else if(fourthNumber.compareTo(firstNumber) > 0 && fourthNumber.compareTo(secondNumber) >0 &&
				fourthNumber.compareTo(thirdNumber) >0 && fourthNumber.compareTo(fifthNumber) >0)
			System.out.println("Maximum: "+fourthNumber);
		else
			System.out.println("Maximum: " + fifthNumber);
	}
}