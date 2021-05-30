package sn.set.ut.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.set.ut.modeles.RendezVous;
import sn.set.ut.services.RendezVousService;

@RestController
@RequestMapping("/api")
public class RendezVousController {

	@Autowired
	RendezVousService rendezVousService;

	@GetMapping(value = { "/", "/rvs" })
	public ResponseEntity<List<RendezVous>> getAllRvs() {
		List<RendezVous> rvs = rendezVousService.findAllRv();
		return new ResponseEntity<List<RendezVous>>(rvs, HttpStatus.OK);
	}

	@PostMapping("/ajouter")
	public ResponseEntity<RendezVous> ajouterRv(@RequestBody RendezVous rv) {
		RendezVous Rv = rendezVousService.ajouterRv(rv);
		return new ResponseEntity<RendezVous>(Rv, HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteRv(@PathVariable("id") Long id) {
		rendezVousService.deleteRvById(id);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<RendezVous> getRvById(@PathVariable("id") Long id) {
		RendezVous rv = rendezVousService.getRendezById(id);
		return new ResponseEntity<RendezVous>(rv, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<RendezVous> updateRvById(@RequestBody RendezVous rv) {
		RendezVous updateRv = rendezVousService.updateRvById(rv);
		return new ResponseEntity<RendezVous>(updateRv,HttpStatus.OK);
	}
}
