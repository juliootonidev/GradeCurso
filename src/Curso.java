public class Curso {
    private int codigo;
    private String nome;
    private String turno;
    private int vagasAnuais;
    private String conceito;

    public Curso() {

    }

    public Curso(Curso c) {
        this.codigo = c.codigo;
        this.nome = c.nome;
        this.turno = c.turno;
        this.vagasAnuais = c.vagasAnuais;
        this.conceito = c.conceito;
    }

    public Curso(int codigo, String nome, String turno, int vagasAnuais, String conceito) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
        this.vagasAnuais = vagasAnuais;
        this.conceito = conceito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getVagasAnuais() {
        return vagasAnuais;
    }

    public void setVagasAnuais(int vagasAnuais) {
        this.vagasAnuais = vagasAnuais;
    }

    public String getConceito() {
        return conceito;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }

    @Override
    public String toString() {
        return "Curso [codigo=" + codigo + ", conceito=" + conceito + ", nome=" + nome + ", turno=" + turno
                + ", vagasAnuais=" + vagasAnuais + "]";
    }

}