package sn.set.ut.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.set.ut.modeles.RendezVous;
@Repository
public interface RendezVousRepo extends JpaRepository<RendezVous, Long> {

}
