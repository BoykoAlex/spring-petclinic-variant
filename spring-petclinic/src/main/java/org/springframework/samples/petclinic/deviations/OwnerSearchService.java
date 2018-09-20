package org.springframework.samples.petclinic.deviations;

import java.time.Duration;
import java.util.Collection;

import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

public class OwnerSearchService implements IOwnerSearchService {
	
	private static final Duration PERIOD = Duration.ofMillis(500);
	private static final Duration INIT_DELAY = Duration.ofSeconds(1);
	
	private OwnerRepository repository;

	public OwnerSearchService(OwnerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Collection<Owner> findOwners(String searchTerm) {
		Flux<Owner> flux = Flux.zip(Flux.interval(INIT_DELAY, PERIOD), Flux.just(repository.findByLastName(searchTerm).toArray(new Owner[1]))).map(Tuple2::getT2);
		
		return flux.collectList().block();
		
//		return flux;
		
	}	

}
