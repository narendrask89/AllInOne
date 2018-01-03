package microservices.book.multiplication.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorServiceImplTest {

	private RandomGeneratorServiceImpl randomGeneratorServiceImpl;
	
	@Before
	public void setup(){
		this.randomGeneratorServiceImpl = new RandomGeneratorServiceImpl();
	}
	
	@Test
	public void generateRandomFactorIsBetweenExpectedLimits() throws Exception {
		
		List<Integer> list = IntStream.range(0, 1000)
			.map(i -> randomGeneratorServiceImpl.generateRandomFactor())
			.boxed().collect(Collectors.toList());
		
		assertThat(list).containsOnlyElementsOf(IntStream.range(11, 100).boxed().collect(Collectors.toList()));
	}
}
