package Test;
public class TestMaximum
{
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;

	public TestMaximum(int firstNumber, int secondNumber, int thirdNumber)
	{
		


	
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getThirdNumber() {
		return thirdNumber;
	}

	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	public void findMaximum() {
			if(firstNumber>secondNumber && firstNumber > thirdNumber)
				System.out.println("Maximum: "+firstNumber);
			else if(secondNumber>firstNumber && secondNumber > thirdNumber)
				System.out.println("Maximum: "+secondNumber);
			else
				System.out.println("Maximum: "+thirdNumber);
	}



	public static void main(String[] args) {
		System.out.println("welcome to maximum problem");
		TestMaximum testmaximum = new TestMaximum(2,1,3);
		testmaximum.findMaximum();
	}

}