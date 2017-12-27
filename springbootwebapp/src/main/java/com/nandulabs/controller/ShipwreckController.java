package com.nandulabs.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nandulabs.model.Shipwreck;
import com.nandulabs.repository.ShipwreckRepository;

@RestController
@RequestMapping(value = "/api/v1")
public class ShipwreckController {

	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	
	@RequestMapping(value = "/shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return this.shipwreckRepository.findAll();
	}

	@PostMapping(value = "/shipwrecks")
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return this.shipwreckRepository.saveAndFlush(shipwreck);
	}

	@GetMapping(value = "/shipwrecks/{id}")
	public Shipwreck get(@PathVariable Long id) {
		return this.shipwreckRepository.findOne(id);
	}

	@PutMapping(value = "/shipwrecks/{id}")
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		Shipwreck exShipwreck = this.shipwreckRepository.findOne(id);
		BeanUtils.copyProperties(shipwreck, exShipwreck);
		return this.shipwreckRepository.saveAndFlush(shipwreck);
	}

	@DeleteMapping(value = "/shipwrecks/{id}")
	public Shipwreck delete(@PathVariable Long id) {
		Shipwreck exShipwreck = this.shipwreckRepository.findOne(id);
		this.shipwreckRepository.delete(exShipwreck);
		return exShipwreck;
	}
}
