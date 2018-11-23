package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class TipoAnalise extends Model {
	
	public String teste;
	
	@OneToMany(mappedBy="teste")
	public List<SubTipoAnalise> subteste;

}
