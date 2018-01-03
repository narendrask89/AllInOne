package microservices.book.multiplication.service;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import microservices.book.multiplication.domain.Multiplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceImplTest {

	private MultiplicationServiceImpl multiplicationServiceImpl;

	@Mock
	private RandomGeneratorService randomGeneratorService;

	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.multiplicationServiceImpl = new MultiplicationServiceImpl(randomGeneratorService);
	}

	@Test
	public void createRandomMultiplicationTest() {
		given(this.randomGeneratorService.generateRandomFactor()).willReturn(50, 30);

		Multiplication multiplication = this.multiplicationServiceImpl.createRandomMultiplication();

		assertThat(multiplication.getFactorA()).isEqualTo(50);
		assertThat(multiplication.getFactorB()).isEqualTo(30);
		assertThat(multiplication.getResult()).isEqualTo(1500);

	}
}
