package escola;

import escola.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("3", "222"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("2", "998877"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("47", "98153488"));
    }
}
