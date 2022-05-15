package Principal;

import Entidades.Engenheiro;
import Entidades.FuncGerais;

public class Principal {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("Jean", "451. 464. 508- 70 ", 3.0);
        System.out.println(engenheiro);

        FuncGerais funcGerais = new FuncGerais("Zé", "451. 464. 508- 70 ", 3.4);
        System.out.println(funcGerais);
    }
}
