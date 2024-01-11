package escola;

import escola.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    /*deixar os termos mais proximos do mundo real*/
    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime data;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.data = LocalDateTime.now();
    }
}
