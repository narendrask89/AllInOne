package com.nandulabs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.nandulabs.controller.ShipwreckController;
import com.nandulabs.model.Shipwreck;
import com.nandulabs.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void get(){
		Shipwreck shipwreckMock = new Shipwreck();
		shipwreckMock.setId(1L);
		when(shipwreckRepository.findOne(1L)).thenReturn(shipwreckMock);		
		
		Shipwreck shipwreck = sc.get(1L);
		assertEquals(1L, shipwreck.getId().longValue());
	}
}
