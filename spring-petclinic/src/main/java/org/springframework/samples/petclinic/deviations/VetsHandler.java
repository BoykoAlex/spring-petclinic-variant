package org.springframework.samples.petclinic.deviations;

import org.springframework.stereotype.Component;

@Component
public class VetsHandler {
	
//    private final VetRepository vetsRespository;
//
//    public VetsHandler(VetRepository vetsRepository) {
//        this.vetsRespository = vetsRepository;
//    }
//	
//	public Mono<ServerResponse> vets(ServerRequest request) {
//		Vets vets = new Vets();
//		vets.getVetList().addAll(vetsRespository.findAll());
//		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
//			.body(BodyInserters.fromObject(vets));
//	}
//	
//	public Mono<ServerResponse> vetsHtml(ServerRequest request) {
//        Vets vets = new Vets();
//        vets.getVetList().addAll(vetsRespository.findAll());
//        return ServerResponse.ok().render("vets/vetList", vets);
//	}
//	
//	public Mono<ServerResponse> vetById(ServerRequest request) {
//		String vetId = request.pathVariable("vetId");
//		System.out.println("Vetid: " + vetId);
//		return ServerResponse.ok().build();
//	}

}
