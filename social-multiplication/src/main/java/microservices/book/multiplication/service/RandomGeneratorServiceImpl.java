package microservices.book.multiplication.service;

import java.util.Random;

public class RandomGeneratorServiceImpl implements RandomGeneratorService {

	private final static int MINIMUN_FACTOR = 11;
	private final static int MAXIMUM_FACTOR = 99;

	@Override
	public int generateRandomFactor() {

		return new Random().nextInt((MAXIMUM_FACTOR - MINIMUN_FACTOR) + 1) + MINIMUN_FACTOR;
	}

}
