package escola.domain.aluno;

public class FactoryAluno {

    /*builder*/

    private Aluno aluno;

    public FactoryAluno comNomeCpfEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new Cpf(cpf), nome, new Email(email));
        return this;
    }

    public FactoryAluno comTelefome(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
