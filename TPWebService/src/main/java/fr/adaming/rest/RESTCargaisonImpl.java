package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.modele.Cargaison;
import fr.adaming.service.IServiceCargaison;

@RestController
public class RESTCargaisonImpl {
	@Autowired
	private IServiceCargaison serviceCargaison;

	public void setServiceCargaison(IServiceCargaison serviceCargaison) {
		this.serviceCargaison = serviceCargaison;
	}
	

	@RequestMapping(value="/cargaison", method=RequestMethod.GET, produces="application/json")
	public Cargaison getCargaisonByReference(@RequestParam("pType") String type, @RequestParam("pReference") String reference) {
		return serviceCargaison.getCargaisonByReference(type, reference);
	}

	@RequestMapping(value="/cargaisons", method=RequestMethod.GET, produces="application/json")
	public List<Cargaison> getAllCargaisons(@RequestParam("pType") String type) {
		return serviceCargaison.getAllCargaisons(type);
	}
//
//	@RequestMapping(value="/cargaison", method=RequestMethod.POST, produces="application/json", consumes="application/json")
//	public Cargaison addCargaison(@RequestBody Cargaison cargaison) {
//		return serviceCargaison.addCargaison(cargaison);
//	}
//
//	@RequestMapping(value="/cargaison", method=RequestMethod.PUT, produces="application/json", consumes="application/json")
//	public Cargaison updateCargaison(@RequestBody Cargaison cargaison) {
//		return serviceCargaison.updateCargaison(cargaison);
//	}
//
//	@RequestMapping(value="/cargaison", method=RequestMethod.DELETE)
//	public void deleteCargaison(@RequestParam("pType") String type, @RequestParam("pReference") String reference) {
//		serviceCargaison.deleteCargaison(type, reference);
//	}
}
