package servico;

import Entidades.Cliente;
import java.util.stream.Collectors;

public class ProjServico {

    public Cliente consultaCliente(Cliente cliente){
        List<Cliente> listAux = null;
    
        if(listCliente == null){
            return null;
        }
        
        listAux = listCliente.stream()                
                .filter(listCliente -> listCliente.getCpf() == cliente.getCpf())
                .collect(Collectors.toList());
        if(listAux == null){
            return null;
        }
        return listAux.get(0);
    }

}
