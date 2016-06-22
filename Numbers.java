package Luna_1;

public class Numbers {

	int number;

	/**
	 * Constructor of the class with the number parameter
	 * @param number
	 */
	public Numbers(int number) {
		this.number = number;
	}

	/*
	 * @return True Or false
	 */
	public boolean even() {

		return (number % 2 ) == 0;//if the remainder is 0 then true else false
	}
	
	/*
	 * @return True Or false
	 */
	public boolean Odd() {

		return (number % 2 ) == 1; //if the remainder is 1 then true else false
	}

}
