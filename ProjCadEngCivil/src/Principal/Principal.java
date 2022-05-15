package Principal;

import Entidades.DetalhesProjeto;
import Entidades.Endereco;
import Entidades.Engenheiro;
import Entidades.Projeto;
import Entidades.enu.ProjetoStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Projeto projeto = new Projeto(1, "Nova Casa", 0.0, (sdf1.parse("15/05/2022")),sdf1.parse("29/06/2022"),
                ProjetoStatus.ANALISANDO,
                new DetalhesProjeto(10.2, 20.0, 2.0, "Arenoso",
                        new Endereco("Sao Paulo", "1000 ap 5", "Centro", "86300000", "Cornélio Procópio")));

        projeto.addFuncionario(new Engenheiro(
                "Jean", "46325974123", 100.5
        ));

        System.out.println(projeto);
    }
}
