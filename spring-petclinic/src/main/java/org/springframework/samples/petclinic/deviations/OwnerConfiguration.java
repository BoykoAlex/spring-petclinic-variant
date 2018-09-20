package org.springframework.samples.petclinic.deviations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.owner.OwnerRepository;

@Configuration
public class OwnerConfiguration {
	
	@Autowired
	private OwnersProperties properties;
	
	@Bean
	public IOwnerSearchService ownerSearchService(OwnerRepository repository) {
		return properties.isSearch() ? new OwnerSearchService(repository) : new EmptyOwnerSearchService();
	}
	
}
