package Model;

import java.util.List;

public class Vendedor extends Funcionario{
    private String local;

    public Vendedor(Integer matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "\n__ Vendedor __ " +
                "\n   Local: " + local;
    }
}
