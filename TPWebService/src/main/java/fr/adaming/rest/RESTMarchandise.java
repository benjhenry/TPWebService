package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.modele.Cargaison;
import fr.adaming.modele.Marchandise;
import fr.adaming.service.IServiceCargaison;
import fr.adaming.service.IServiceMarchandise;

@RestController
public class RESTMarchandise {
	@Autowired
	private IServiceMarchandise serviceMarchandise;
	@Autowired
	private IServiceCargaison serviceCargaison;

	public void setServiceMarchandise(IServiceMarchandise serviceMarchandise) {
		this.serviceMarchandise = serviceMarchandise;
	}
	public void setServiceCargaison(IServiceCargaison serviceCargaison) {
		this.serviceCargaison = serviceCargaison;
	}


	@RequestMapping(value="/marchandise", method=RequestMethod.GET, produces="application/json")
	public Marchandise getMarchandiseByReference(@RequestParam("pId") long id) {
		return serviceMarchandise.getMarchandiseByReference(id);
	}

	@RequestMapping(value="/marchandises", method=RequestMethod.GET, produces="application/json")
	public List<Marchandise> getAllMarchandises() {
		return serviceMarchandise.getAllMarchandises();
	}

//	@RequestMapping(value="/marchandise", method=RequestMethod.POST, produces="application/json", consumes="application/json")
//	public Marchandise addMarchandise(@RequestBody Marchandise marchandise, @RequestParam("pReferenceCargaison") String reference) {
//		Cargaison cargaison = serviceCargaison.getCargaisonByReference(reference);
//		return serviceMarchandise.addMarchandise(marchandise, cargaison);
//	}
//
//	@RequestMapping(value="/marchandise", method=RequestMethod.PUT, produces="application/json", consumes="application/json")
//	public Marchandise updateMarchandise(@RequestBody Marchandise marchandise, @RequestParam("pReferenceCargaison") String reference) {
//		Cargaison cargaison = serviceCargaison.getCargaisonByReference(reference);
//		return serviceMarchandise.updateMarchandise(marchandise, cargaison);
//	}
//
//	@RequestMapping(value="/marchandise/{pId}", method=RequestMethod.DELETE)
//	public void deleteMarchandise(@PathVariable("pId") long id) {
//		serviceMarchandise.deleteMarchandise(id);
//	}
}
