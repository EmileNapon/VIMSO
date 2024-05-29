@Entity
public class Engein{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nom;
  private String Probleme;
  private Boolean status;

  public Engein(){

  }

  public Engein(String nom, String Probleme, Boolean status){
    this.nom=nom;
    this.Probleme=probleme;
    this.status=status;
    
  }
  

  public Long getId() {
        return id;
    }

  public void setId(Long id) {
        this.id = id;
    }


  public String getNom(){
    return nom;
  }

  public Stirng getProbleme(){
    return probleme;
  }
  public Boolean getStatus(){
    return status;
  }

  public void setNom(String nom){
    this.nom=nom;
  }

  public void setProbleme(String probleme){
    this.probleme=probleme;
  }

  public void setStatus(String status){
    this.status=status;
  }
  

}