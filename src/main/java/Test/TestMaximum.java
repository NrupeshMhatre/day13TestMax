package Test;
public class TestMaximum
{
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;
	
	private Float floatNumber1;
	private Float floatNumber2;
	private Float floatNumber3;


	public TestMaximum(int firstNumber, int secondNumber, int thirdNumber)
	{
	
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}
	
	public TestMaximum(Float floatNumber1, Float floatNumber2, Float floatNumber3) {
		super();
		this.floatNumber1 = floatNumber1;
		this.floatNumber2 = floatNumber2;
		this.floatNumber3 = floatNumber3;
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
	
	
	
	public Float getFloatNumber1() {
		return floatNumber1;
	}
	public void setFloatNumber1(Float floatNumber1) {
		this.floatNumber1 = floatNumber1;
	}
	public Float getFloatNumber2() {
		return floatNumber2;
	}
	public void setFloatNumber2(Float floatNumber2) {
		this.floatNumber2 = floatNumber2;
	}
	public Float getFloatNumber3() {
		return floatNumber3;
	}
	public void setFloatNumber3(Float floatNumber3) {
		this.floatNumber3 = floatNumber3;
	}
	
	public void findMaximum() {
			if(firstNumber>secondNumber && firstNumber > thirdNumber)
				System.out.println("Maximum: "+firstNumber);
			else if(secondNumber>firstNumber && secondNumber > thirdNumber)
				System.out.println("Maximum: "+secondNumber);
			else
				System.out.println("Maximum: "+thirdNumber);
	}
	
	public void findMaxOfFloat() {
		if (floatNumber1.compareTo(floatNumber2) > 0 && floatNumber1.compareTo(floatNumber3) > 0)
			System.out.println("Maximum: " + floatNumber1);
		else if (floatNumber2.compareTo(floatNumber1) > 0 && floatNumber2.compareTo(floatNumber3) > 0)
			System.out.println("Maximum: " + floatNumber2);
		else
			System.out.println("Maximum: " + floatNumber3);
	}


	public static void main(String[] args) {
		System.out.println("welcome to maximum problem");
		TestMaximum testmaximum = new TestMaximum(2,1,3);
		testmaximum.findMaximum();
		
		TestMaximum testmaximum2 = new TestMaximum(3.8f,1.7f,2.8f);
		testmaximum2.findMaxOfFloat();
	}

}