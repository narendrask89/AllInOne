package com.nandulabs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nandulabs.model.Shipwreck;
import com.nandulabs.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringbootwebappApplication.class)
public class ShipwreckRepositoryTest {
	
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@Test
	public void testFindAll(){
		List<Shipwreck> findAll = this.shipwreckRepository.findAll();
		
		assertThat(findAll.size(), is(greaterThanOrEqualTo(0)));
	}
	
}
