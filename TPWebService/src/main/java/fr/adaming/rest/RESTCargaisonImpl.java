package fr.adaming.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.adaming.modele.Cargaison;
import fr.adaming.modele.CargaisonAerienne;
import fr.adaming.modele.CargaisonRoutiere;
import fr.adaming.service.IServiceCargaison;

@RestController
public class RESTCargaisonImpl {
	@Autowired
	private IServiceCargaison serviceCargaison;

	public void setServiceCargaison(IServiceCargaison serviceCargaison) {
		this.serviceCargaison = serviceCargaison;
	}
	

	@RequestMapping(value="/cargaison/{pType}", method=RequestMethod.GET, produces="application/json")
	public Cargaison getCargaisonByReference(@PathVariable("pType") String type, @RequestParam("pReference") String reference) {
		return serviceCargaison.getCargaisonByReference(type, reference);
	}

	@RequestMapping(value="/cargaisons/{pType}", method=RequestMethod.GET, produces="application/json")
	public List<Cargaison> getAllCargaisons(@PathVariable("pType") String type) {
		return serviceCargaison.getAllCargaisons(type);
	}

	@RequestMapping(value="/cargaison/{pType}", method=RequestMethod.POST, produces="application/json", consumes="application/json")
	public Cargaison addCargaison(@PathVariable("pType") String type, @RequestBody String cargaison) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			if (type.equals("a")) {
				CargaisonAerienne ca = mapper.readValue(cargaison, CargaisonAerienne.class);
				return serviceCargaison.addCargaison(ca);
			} else if (type.equals("r")) {
				CargaisonRoutiere cr = mapper.readValue(cargaison, CargaisonRoutiere.class);
				return serviceCargaison.addCargaison(cr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value="/cargaison/{pType}", method=RequestMethod.PUT, produces="application/json", consumes="application/json")
	public Cargaison updateCargaison(@PathVariable("pType") String type, @RequestBody String cargaison) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			if (type.equals("a")) {
				CargaisonAerienne ca = mapper.readValue(cargaison, CargaisonAerienne.class);
				return serviceCargaison.updateCargaison(ca);
			} else if (type.equals("r")) {
				CargaisonRoutiere cr = mapper.readValue(cargaison, CargaisonRoutiere.class);
				return serviceCargaison.updateCargaison(cr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value="/cargaison/{pType}", method=RequestMethod.DELETE)
	public void deleteCargaison(@PathVariable("pType") String type, @RequestParam("pReference") String reference) {
		serviceCargaison.deleteCargaison(type, reference);
	}
}
