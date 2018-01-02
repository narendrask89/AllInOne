package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;

public class MultiplicationServiceImpl implements MultiplicationService {

	private RandomGeneratorService randomGeneratorService;

	public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
		this.randomGeneratorService = randomGeneratorService;
	}

	@Override
	public Multiplication createRandomMultiplication() {
		int factorA = this.randomGeneratorService.generateRandomFactor();
		int factorB = this.randomGeneratorService.generateRandomFactor();

		return new Multiplication(factorA, factorB);
	}

}
