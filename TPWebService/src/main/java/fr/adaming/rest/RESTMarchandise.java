package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.modele.Marchandise;
import fr.adaming.service.IServiceMarchandise;

@RestController
public class RESTMarchandise {

	@Autowired
	private IServiceMarchandise serviceMarchandise;

	
}
