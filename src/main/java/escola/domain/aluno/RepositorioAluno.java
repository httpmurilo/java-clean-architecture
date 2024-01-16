package escola.domain.aluno;

import java.sql.SQLException;
import java.util.List;

public interface RepositorioAluno {

    void matricular(Aluno aluno) throws SQLException;
    Aluno buscarPorCpf(Cpf cpf) throws SQLException;
    List<Aluno> listarTodosAlunosMatriculados();

}
