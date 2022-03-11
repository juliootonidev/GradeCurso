public class Disciplina {
    private int codigo;
    private String nome;
    private int cargaHoraria;

    public Disciplina() {

    }

    public Disciplina(Disciplina d) {
        this.codigo = d.codigo;
        this.nome = d.nome;
        this.cargaHoraria = d.cargaHoraria;
    }

    public Disciplina(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina [cargaHoraria=" + cargaHoraria + ", codigo=" + codigo + ", nome=" + nome + "]";
    }

}

