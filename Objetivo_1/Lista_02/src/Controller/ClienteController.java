package Controller;

import Model.Cliente;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("84812079004", "Cleber", "Junior", "Rua Porto", "96230-000", "93863-46348", "cleber@gmail.com");
        System.out.println(c1);
        Cliente c2 = new Cliente();
        System.out.println(c2);
    }
}
