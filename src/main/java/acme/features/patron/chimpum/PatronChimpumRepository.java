package acme.features.patron.chimpum;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.chimpum.Chimpum;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface PatronChimpumRepository extends AbstractRepository {
	
	@Query("SELECT chimpum FROM Chimpum chimpum")
	Collection<Chimpum> findAllChimpums();
	
	@Query("SELECT chimpum FROM Chimpum chimpum WHERE chimpum.id = :id")
	Chimpum findChimpumById(int id);
	
	@Query("select cd.acceptedCurrencies from ConfigData cd")
	String acceptedCurrencies();
	
}
