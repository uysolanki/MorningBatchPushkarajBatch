package day22.bankingapp;

import java.util.Random;

public class RandomNumberGenerator {

	public int getSixDigitOTP() {
		Random random = new Random();
		int otp = random.nextInt(1000000);
		if (otp < 900000)
			otp += 100000;
		return otp;
	}

}
