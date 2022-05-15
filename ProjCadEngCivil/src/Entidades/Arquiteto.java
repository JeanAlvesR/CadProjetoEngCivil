package Entidades;

import java.util.Objects;

public class Arquiteto implements Funcionario{

    private String name;
    private String codRegistro;
    private Double horaTrabalhada;
    private final Double valorHora = 20.0;

    public Arquiteto(){
        name = "";
        codRegistro = "";
        horaTrabalhada = 0.0;
    }

    public Arquiteto(String name, String codRegistro, Double horaTrabalhada) {
        this.name = name;
        setCodRegistro(codRegistro);
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

    public String getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(String codRegistro) {
        codRegistro = codRegistro.replace(" ", "");
        codRegistro = codRegistro.replace("-","");
        codRegistro = codRegistro.replace(".","");
        this.codRegistro = codRegistro;
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
        return "Engenheiro{" +
                "name='" + name + '\'' +
                ", codRegistro='" + codRegistro + '\'' +
                ", horaTrabalhada=" + horaTrabalhada +
                ", valorHora=" + valorHora +
                '}';
    }
//Compara os objetos Arquiteto pelo codRegistro
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arquiteto that = (Arquiteto) o;
        return codRegistro.equals(that.codRegistro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codRegistro);
    }
}
