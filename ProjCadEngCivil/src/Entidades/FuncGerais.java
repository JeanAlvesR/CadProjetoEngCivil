package Entidades;

import java.util.Objects;
public class FuncGerais implements Funcionario{

    private String name;
    private String cpf;
    private Double horaTrabalhada;
    private final Double valorHora = 15.0;

    public FuncGerais(){
        name = "";
        cpf = "";
        horaTrabalhada = 0.0;
    }

    public FuncGerais(String name, String cpf, Double horaTrabalhada) {
        this.name = name;
        setCpf(cpf);
        this.horaTrabalhada = horaTrabalhada;
    }

    public Double getSalario(){
        return horaTrabalhada*valorHora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf.replace(" ", "");
        cpf = cpf.replace("-","");
        cpf = cpf.replace(".","");
        this.cpf = cpf;
    }

    public Double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public Double getValorHora() {
        return valorHora;
    }

    @Override
    public String toString() {
        return "FuncGerais{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", horaTrabalhada=" + horaTrabalhada +
                ", valorHora=" + valorHora +
                '}';
    }
//Compara os objetos funcGerais pelo cpf
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuncGerais that = (FuncGerais) o;
        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
