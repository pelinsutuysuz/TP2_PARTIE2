package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Cette méthode analyse les symptomes du patient de la requete mise en parametre.
		// et retourne "requete analysee" une fois que l'analyse est terminee.
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Cette methode compare toutes les requetes afin de determiner si les patients 
		// ont les memes symptomes et donc s'il y a un cluster. Si de nombreux patients 
		// ont les memes symptomes, on retourne "cluster trouve"
		return "Cluster trouvé";
	}

}


