package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class SubTipoAnalise extends Model{
	
	public String subTeste;
	
	@ManyToOne
	@JoinTable(name="teste_id")
	public TipoAnalise teste;
	
	@OneToMany(mappedBy="hedonica")
	public List<EscalaHedonica> escala;
}
