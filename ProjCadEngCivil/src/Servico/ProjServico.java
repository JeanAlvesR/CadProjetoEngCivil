package Servico;

import BD.BdAplicacao;
import Entidades.Cliente;
import Entidades.Funcionario;
import Servico.Exceptions.AtualizaException;
import Servico.Exceptions.CadException;
import Servico.Exceptions.RemoveException;

import java.util.List;
import java.util.stream.Collectors;

public class ProjServico {

    private BdAplicacao bd = new BdAplicacao();

    public Cliente consultaCliente(Cliente cliente) {
        List<Cliente> listAux = null;
        if (bd.getClientes() == null) {
            return null;
        }
        listAux = bd.getClientes().stream()
                .filter(clienteList -> clienteList.getCpf() == cliente.getCpf())
                .collect(Collectors.toList());

        return listAux == null ? null : listAux.get(0);

    }

    //Dispara exceção, caso a pessoa tente cadastrar um cliente que já existe...
    public void addCliente(Cliente cliente) throws CadException {

        if (consultaCliente(cliente) == null) {
            bd.AddCliente(cliente);
        } else {
            throw new CadException();
        }

    }

    //Dispara exceção, caso o cliente nao existe...
    public void removeCliente(Cliente cliente) throws RemoveException {
        if (consultaCliente(cliente) != null) {
            bd.getFuncionarios().remove(cliente);
        } else {
            throw new RemoveException();
        }
    }

    //Recupa o bd de cliente, procura se há igual com base no cpf. Caso haja, ele substitui, caso contrario, dispara exceção.
    //Pensar melhor sobre essa atualização, ṕois as vezes só precisarei editar algumas informações...............................................
    public void atualizaCliente(Cliente cliente) throws AtualizaException {
        boolean aux= true;
        for (int i = 0; i < bd.getClientes().size(); i++) {
            if (cliente.getCpf().equals(bd.getClientes().get(i).getCpf())) {
                bd.getClientes().set(i, cliente);
                aux = false;
            }
        }
        if(aux){
            throw new AtualizaException();
        }
    }

    public List<Cliente> clienteList() {
        return bd.getClientes();
    }

    //-------------------------------------------------> Funcionarios

    public Funcionario consultaFuncionario(Funcionario funcionario) {
        List<Funcionario> listAux = null;

        if (bd.getFuncionarios().size() == 0) {
            return null;
        }

        for (Funcionario func: bd.getFuncionarios()) {
            if(func.equals(funcionario)) { //Sobreescrevi o equals na classe engenheiro, funcGerais e Arquiteto para comparar com o crea, codigo e codRegistro respectivamente.
                return func;
            }
        }

        return null;

    }

    public void cadFuncionario(Funcionario funcionario) throws CadException{
        if(consultaFuncionario(funcionario) == null) {
            bd.addFuncionario(funcionario);
        }
        else{
            throw new CadException();
        }
    }

    public void removeFuncionario(Funcionario funcionario) throws RemoveException{
        if (consultaFuncionario(funcionario) != null) {
            bd.getFuncionarios().remove(funcionario);
        } else {
            throw new RemoveException();
        }
    }

    public void atualizaFuncionario(Funcionario funcionario) throws AtualizaException {
        boolean aux= true;
        for(int i = 0; i< bd.getFuncionarios().size(); i++){
            if(funcionario.equals(bd.getFuncionarios().get(i))){
                bd.getFuncionarios().set(i, funcionario);
                aux = false;
            }
        }

        if(aux){
            throw new AtualizaException();
        }
    }
        
    public List<Funcionario> funcionarioList(){
        return bd.getFuncionarios();
    }

}
