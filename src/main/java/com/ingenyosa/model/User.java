import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strayegy = GenerationType.Auto)
	@Column(name = "id_user")
	private int id;

	@Column(name = "mail")
	private String mail;

	@Column(name = "password")
	private String password;
	
	@Column(name = "commentaire")
	private String commentaire;
	
	public int getId(){
		return id;
	}
	public int setId(){
		this.id = id;
	}
	
	public String getmail(){
		return mail;
	}
	public int setmail(){
		this.mail = mail;
	}
	public int getpassword(){
		return password;
	}
	public int setId(){
		this.password = password;
	}

	@ManyToMany(cascade = CascadeType.All)
	@JoinTable(name ="voiture" , @JoinColumn{name ="id_user"} , inverseJoinColumns = @JoinColumnn{name ="id_voiture"})
	
}