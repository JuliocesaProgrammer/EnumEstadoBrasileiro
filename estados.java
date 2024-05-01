package SistemaEstados;
public enum estados {

    Rio_de_Janeiro ("RJ", "Rio de Janeiro"),
    Sao_Paulo ("SP", "São Paulo"),
    Minas_Gerais ("MG", "Minas Gerais"),
    Parana ("PR", "Paraná"),
    Goias ("GO", "Goiás"),
    ;
    private String nome;
    private String sigla;
    private estados(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }   
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
