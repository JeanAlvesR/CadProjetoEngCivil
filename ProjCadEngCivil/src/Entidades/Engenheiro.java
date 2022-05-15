package Entidades;

import java.util.Objects;

public class Engenheiro implements Funcionario{

    private String name;
    private String crea;
    private Double horaTrabalhada;
    private final Double valorHora = 25.0;

    public Engenheiro(){
        name = "";
        crea = "";
        horaTrabalhada = 0.0;
    }

    public Engenheiro(String name, String crea, Double horaTrabalhada) {
        this.name = name;
        setCrea(crea);
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

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        crea = crea.replace(" ", "");
        crea = crea.replace("-","");
        crea = crea.replace(".","");
        this.crea = crea;
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
                ", crea='" + crea + '\'' +
                ", horaTrabalhada=" + horaTrabalhada +
                ", valorHora=" + valorHora +
                '}';
    }
//Compara os objetos Engenheiro pelo crea
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engenheiro that = (Engenheiro) o;
        return crea.equals(that.crea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crea);
    }
}
