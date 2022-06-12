package Principal;

import Controler.Controlador;
import Entidades.*;
import Entidades.enums.ProjetoStatus;
import Servico.Exceptions.CadException;
import Servico.Exceptions.RemoveException;
import Servico.ProjServico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

     Controlador controlador = Controlador.getControlador();

     try{
         Cliente cliente = new Cliente();
         cliente.setNome("Jean");
         controlador.getServico().addCliente(cliente);
     }catch(CadException ce){
     
     }
     
     controlador = Controlador.getControlador();
     
        System.out.println(controlador.getServico().clienteList());
     
    }
}
