package odemeİslemleriUygulamasi;

import java.util.Random;

public class TextContainsDigitsException extends Exception {

	int min = 0;
    int max = 100;
    Random random = new Random();
    int randomInRange = random.nextInt(max - min + 1) + min;
    


		  private final String text;

		  public TextContainsDigitsException(String message, String text) {
		    super(message);
		    this.text = text;
		  }

		  public String getText() {
		    return text;
	}

}
