import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strayegy = GenerationType.Auto)
	@Column(name = "id_voiture")
	private int id;

	@Column(name = "NumMatri")
	private String NumMatri;

	@Column(name = "Modele")
	private String Modele;
	
	@Column(name = "Puissance")
	private String Puissance;
	
	public int getId(){
		return id;
	}
	public int setId(){
		this.id = id;
	}
	
	public String getNumMatri(){
		return NumMatri;
	}
	public int setNumMatri(){
		this.NumMatri = NumMatri;
	}
	public int getModele(){
		return Modele;
	}
	public int setModele(){
		this.Puissance = Puissance;
	}

	public int Puissance(){
		return Modele;
	}
	public int setPuissance(){
		this.Puissance = Puissance;
	}
	
	
}