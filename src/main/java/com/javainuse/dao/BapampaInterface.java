package com.javainuse.dao;
import java.util.List;

import com.javainuse.entities.Region;
import com.javainuse.entities.Signalement;
import com.javainuse.entities.UtilisateurFO;
import com.javainuse.entities.UtilisateurMobile;


public interface BapampaInterface {
	public UtilisateurFO connexionFO(String login ,String mdp ) ;
	public List<Signalement> ListSignalementRegion (int idRegion); 
	public Region findRegion (int id_region);
	public UtilisateurMobile findUtilisateurMobile (int id_user);
}
