package Principal;

import Entidades.*;
import Entidades.enums.ProjetoStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws ParseException {


        servico.ProjServico ps = new servico.ProjServico();



/*
>>>>>>> parent of cc2f4b0... Troca de laço por expressão Lambda no método getGastoFuncionarios

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Projeto projeto = new Projeto(1, "Nova Casa", 0.0, (new Date()),sdf1.parse("29/06/2022"),
                ProjetoStatus.ANALISANDO,
                new DetalhesProjeto(10.2f, 20.0f, 2.0f, "Arenoso",
                        new Endereco("Sao Paulo", "1000 ap 5", "Centro", "86300000", "Cornélio Procópio")));

        projeto.addFuncionario(new Engenheiro(
                "Jean", "46325974123", 100.5
        ));

<<<<<<< HEAD
        Cliente cliente = new Cliente();

        cliente.addProjeto(projeto);
        cliente.setCpf("451.6954.741-70");
        ps.addCliente(cliente);

        Cliente c2 = new Cliente();

        c2.setCpf("4569823");

        System.out.println(ps.consultaCliente(cliente));

=======
        System.out.println(projeto);
    */

    }

}
