package escola;

public class Email {

    public Email(String endereco) {
        validar(endereco);
        this.endereco = endereco;
    }

    private void validar(String endereco) {
        if(endereco == null || !endereco.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            throw new IllegalArgumentException("Email invalido!");
        }
    }

    private String endereco;

    public String getEndereco() {
        return endereco;
    }
}
