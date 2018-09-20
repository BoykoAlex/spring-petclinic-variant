package org.springframework.samples.petclinic.deviations;

import java.util.Collection;

import org.springframework.samples.petclinic.owner.Owner;

public interface IOwnerSearchService {

	Collection<Owner> findOwners(String searchTerm);
	
//	Flux<Owner> findOwners(String searchTerm);
	
}
