package Entidades;

import Entidades.enu.ProjetoStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Projeto {

    private Integer codigoId;
    private String nome;
    private Double gastoFuncionarios;
    private Date dataInicial;
    private Date dataFinal;

    private ProjetoStatus projetoStatus;
    private DetalhesProjeto detalhesProjeto;

    private List<Funcionario> funcionarios = new ArrayList<>();

    public Projeto(){
        codigoId = 0;
        nome = "";
        gastoFuncionarios = 0.0;
        dataInicial = new Date();
        dataFinal = new Date();
    }

    public Projeto(Integer codigoId, String nome, Double gastoFuncionarios, Date dataInicial, Date dataFinal, ProjetoStatus projetoStatus, DetalhesProjeto detalhesProjeto) {
        this.codigoId = codigoId;
        this.nome = nome;
        this.gastoFuncionarios = gastoFuncionarios;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.projetoStatus = projetoStatus;
        this.detalhesProjeto = detalhesProjeto;
    }

    public Integer getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(Integer codigoId) {
        this.codigoId = codigoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastoFuncionarios() {

        if(Objects.nonNull(funcionarios.get(0))){
            for (Funcionario funcionario: funcionarios
                 ) {
                gastoFuncionarios+=funcionario.getSalario();
            }
        }

        return gastoFuncionarios;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public ProjetoStatus getProjetoStatus() {
        return projetoStatus;
    }

    public void setProjetoStatus(ProjetoStatus projetoStatus) {
        this.projetoStatus = projetoStatus;
    }

    public DetalhesProjeto getDetalhesProjeto() {
        return detalhesProjeto;
    }

    public void setDetalhesProjeto(DetalhesProjeto detalhesProjeto) {
        this.detalhesProjeto = detalhesProjeto;
    }

    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "codigoId=" + codigoId +
                ", nome='" + nome + '\'' +
                ", gastoFuncionarios=" + gastoFuncionarios +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", projetoStatus=" + projetoStatus +
                ", detalhesProjeto=" + detalhesProjeto +
                ", funcionarios=" + funcionarios +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return codigoId.equals(projeto.codigoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoId);
    }
}
