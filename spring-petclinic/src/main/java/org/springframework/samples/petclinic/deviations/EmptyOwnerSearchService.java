package org.springframework.samples.petclinic.deviations;

import java.util.Collection;
import java.util.Collections;

import org.springframework.samples.petclinic.owner.Owner;

public class EmptyOwnerSearchService implements IOwnerSearchService {
	
	@Override
	public Collection<Owner> findOwners(String searchTerm) {
		return Collections.emptyList();
	}


//	@Override
//	public Flux<Owner> findOwners(String searchTerm) {
//		return Flux.empty();
//	}

}
