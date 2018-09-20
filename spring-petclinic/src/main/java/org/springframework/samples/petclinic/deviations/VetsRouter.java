package org.springframework.samples.petclinic.deviations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("webflux")
public class VetsRouter {

//	@Bean
//	public RouterFunction<ServerResponse> route(VetsHandler vetsHandler) {
//
//		return RouterFunctions
//			.route(RequestPredicates.GET("/vets").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), vetsHandler::vets);
//	}
}
