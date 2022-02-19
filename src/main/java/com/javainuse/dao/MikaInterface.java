package com.javainuse.dao;

import java.util.List;

import com.javainuse.entities.Region;
import com.javainuse.entities.Signalement;
import com.javainuse.entities.UtilisateurBO;

public interface MikaInterface {
	public UtilisateurBO connexion(String login , String mdp );
	public List<Region> listeRegion();
	public List<Signalement> listeSignalement();
	public void affecterSignalement(Signalement s);
	public List<Signalement> listeSignalementAffecter();
	public String typeSignalement(int idTypesignalement);

}
