public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso	Permitido!");
            return true;
        } else {
            System.out.println("Acesso	Negado!");
            return false;
        }

    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    @Override
    public double getBonificacao() {
        return getSalario()*0.15;
    }
}
