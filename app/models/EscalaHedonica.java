package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class EscalaHedonica extends Model {
	
	public String hedonicaDados;
	
	@ManyToOne
	@JoinTable(name="escala_id")
	public SubTipoAnalise hedonica;
}
