package escola.aluno;

public class Telefone {

    public Telefone(String ddd, String numero) {

        validar(ddd, numero);

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    private void validar(String ddd, String numero) {
        if(ddd == null | numero == null) {
            throw new IllegalArgumentException("DDD e Numero são obrigatorios");
        }

        if(!ddd.matches("\\{d2}")) {
            throw new IllegalArgumentException("DDD invalido");
        }

        if(!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero invalido");
        }
    }

    private String ddd;
    private String numero;
}
