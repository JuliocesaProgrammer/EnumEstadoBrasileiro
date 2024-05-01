package SistemaEstados;
public class SistemaIBGE {
    public static void main(String[] args) {
    for (estados e: estados.values()){
        System.out.println(e.getSigla() + "- " + e.getNome());
    }
    estados eb = estados.Parana;
    System.out.println(eb.getNome());
  }
}
