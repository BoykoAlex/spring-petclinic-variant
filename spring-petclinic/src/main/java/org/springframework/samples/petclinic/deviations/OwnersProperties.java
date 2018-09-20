package org.springframework.samples.petclinic.deviations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="petclinic.owners")
public class OwnersProperties {
	
	/**
	 * Owner search enabled
	 */
	private boolean search = false;

	public boolean isSearch() {
		return search;
	}

	public void setSearch(boolean search) {
		this.search = search;
	}

}
