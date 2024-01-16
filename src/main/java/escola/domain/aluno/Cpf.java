package escola.domain.aluno;

public class Cpf {

    public Cpf(String numero) {

        if(numero == null) {
            throw new IllegalArgumentException("CPF VAZIO");
        }

        this.numero = numero;
    }
    private String numero;

    public String getNumero() {
        return numero;
    }
}
