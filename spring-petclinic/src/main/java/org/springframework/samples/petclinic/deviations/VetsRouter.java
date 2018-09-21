package org.springframework.samples.petclinic.deviations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class VetsRouter {

//	@Bean
//	public RouterFunction<ServerResponse> route(VetsHandler vetsHandler) {
//
//		return RouterFunctions
//			.route(RequestPredicates.GET("/vets").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), vetsHandler::vets)
//			.andRoute(RequestPredicates.GET("/vets.html"), vetsHandler::vetsHtml);
//	}
}
