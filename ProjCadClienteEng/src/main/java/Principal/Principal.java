package Principal;

import Entidades.*;
import Entidades.enums.ProjetoStatus;
import Servico.Exceptions.CadException;
import Servico.Exceptions.RemoveException;
import Servico.ProjServico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws ParseException {

        ProjServico ps = new ProjServico();
        try {
            Engenheiro eng = new Engenheiro();
            eng.setCrea("111");
            ps.cadFuncionario(eng);
            System.out.println(ps.consultaFuncionario(eng));
            eng = new Engenheiro();
            eng.setCrea("222");
            ps.cadFuncionario(eng);
            System.out.println(ps.consultaFuncionario(eng));
            eng = new Engenheiro();
            eng.setCrea("333");
            ps.cadFuncionario(eng);
            System.out.println(ps.consultaFuncionario(eng));
            Arquiteto arq = new Arquiteto();
            arq.setCodRegistro("1");
            ps.cadFuncionario(arq);
            arq = new Arquiteto();
            arq.setCodRegistro("2");
            ps.cadFuncionario(arq);
        }
        catch (CadException ce){
            ce.printStackTrace();
        }

        System.out.println("DEPOIS DO TRY");
            Engenheiro engee = new Engenheiro();
            engee.setCrea("1");
            Funcionario func = ps.consultaFuncionario(engee);
            System.out.println(func);
            Arquiteto arq = new Arquiteto();
            arq.setCodRegistro("2");
            func = ps.consultaFuncionario(arq);
            System.out.println(func);

            System.out.println(ps.funcionarioList());

           try{
                Engenheiro funcionario = new Engenheiro();
                funcionario.setCrea("222");
                ps.removeFuncionario(funcionario);
            }
           catch (RemoveException re){
               re.printStackTrace();
           }

        System.out.println(ps.funcionarioList());
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
