package Controller;

import Model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
            Funcionario func1 = new Funcionario("Segio", 2.500);
            Funcionario func2 = new Funcionario("Paulo", 3.500);

            System.out.println(func1);
            System.out.println(func2);
        }
    }

