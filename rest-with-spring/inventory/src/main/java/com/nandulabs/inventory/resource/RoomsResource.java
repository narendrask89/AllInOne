package com.nandulabs.inventory.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nandulabs.inventory.dto.RoomDTO;
import com.nandulabs.inventory.service.InventoryService;

@RestController
@RequestMapping("/rooms")
public class RoomsResource {

	private final InventoryService inventoryService;

	public RoomsResource(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	public RoomDTO getRoom(@PathVariable("roomId") String roomId) {

		RoomDTO roomDTO = new RoomDTO();
		// TODO need to implement business logic
		return roomDTO;
	}
}
