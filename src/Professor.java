public class Professor {
    private int codigo;
    private String nome;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private int cpf;
    private int rg;
    private String email;
    private float salario;

    public int getCodigo() {
        return codigo;
    }

    public Professor() {

    }

    public Professor(Professor p) {
        this.codigo = p.codigo;
        this.nome = p.nome;
        this.logradouro = p.logradouro;
        this.numero = p.numero;
        this.complemento = p.complemento;
        this.bairro = p.bairro;
        this.cep = p.cep;
        this.cidade = p.cidade;
        this.estado = p.estado;
        this.cpf = p.cpf;
        this.rg = p.rg;
        this.email = p.email;
        this.salario = p.salario;
    }

    public Professor(int codigo, String nome, String logradouro, int numero, String complemento, String bairro,
            String cep, String cidade, String estado, int cpf, int rg, String email, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.salario = salario;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", codigo=" + codigo
                + ", complemento=" + complemento + ", cpf=" + cpf + ", email=" + email + ", estado=" + estado
                + ", logradouro=" + logradouro + ", nome=" + nome + ", numero=" + numero + ", rg=" + rg + ", salario="
                + salario + "]";
    }

}
