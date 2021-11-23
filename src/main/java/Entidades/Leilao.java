package Entidades;
import javax.persistence.*;

@Entity
@Table(name = "leilaotarefa")
public class Leilao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Integer situacao;

    public Leilao() {
    }

    public Leilao(Long id, String nome, String descricao, Integer situacao) {
        super();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public Leilao(String nome, String descricao, Integer situacao) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.situacao = situacao;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getSituacao() {
        return situacao;
    }
    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }
}
