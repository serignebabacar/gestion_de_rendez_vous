package sn.set.ut.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.set.ut.exceptions.RvNotFoundException;
import sn.set.ut.modeles.RendezVous;
import sn.set.ut.repos.RendezVousRepo;

@Service
public class RendezVousService {
	@Autowired
	private RendezVousRepo rendezVousRepo;

	public RendezVous ajouterRv(RendezVous rv) {
		rv.setCodeRv(UUID.randomUUID().toString());
		return rendezVousRepo.save(rv);
	}

	public List<RendezVous> findAllRv() {
		return rendezVousRepo.findAll();
	}

	public void deleteRvById(Long id) {
		rendezVousRepo.deleteById(id);
	}

	public RendezVous updateRvById(RendezVous rv) {
		deleteRvById(rv.getId());
		return rendezVousRepo.save(rv);
	}

	public RendezVous getRendezById(Long id) {
		return rendezVousRepo.findById(id)
				.orElseThrow(() -> new RvNotFoundException("un rv avec l'" + id + "n'existe pas "));
	}

}
