package escola.infra.aluno;

import escola.domain.aluno.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RepositorioAlunoImpl implements RepositorioAluno {

    private final Connection connection;

    public RepositorioAlunoImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void matricular(Aluno aluno) throws SQLException {

        String sql = "INSERT INTO ALUNO VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, aluno.getCpf());
        ps.setString(2, aluno.getNome());
        ps.setString(3, aluno.getEmail());
        ps.execute();

        sql = "INSERT INTO TELEFONE VALUES (?, ?)";
        ps = connection.prepareStatement(sql);

        for (Telefone telefone : aluno.getTelefones()) {
            ps.setString(1, telefone.getDdd());
            ps.setString(2, telefone.getNumero());
            ps.execute();
        }

    }

    @Override
    public Aluno buscarPorCpf(Cpf cpf) throws SQLException {
        String sql = "SELECT id, nome, email FROM ALUNO WHERE cpf = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, cpf.getNumero());

        ResultSet rs = ps.executeQuery();
        boolean encontrou = rs.next();

        if(!encontrou) {
            throw new IllegalArgumentException("Aluno nao encontrado");
        }

        String nome = rs.getString("nome");
        Email email = new Email(rs.getString("email"));
        Aluno encontrado = new Aluno(cpf, nome, email);
        return  encontrado;


    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
