package fr.adaming.dao;

import java.util.List;
import fr.adaming.modele.Marchandise;

public interface IDaoMarchandise {
	public Marchandise getMarchandiseByReference(long id);
	public List<Marchandise> getAllMarchandises();
	public Marchandise addMarchandise(Marchandise marchandise);
	public Marchandise updateMarchandise(Marchandise marchandise);
	public void deleteMarchandise(long id);
}
