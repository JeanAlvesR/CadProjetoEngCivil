package Entidades;

import java.util.Objects;

public class DetalhesProjeto {
    private Double comprimento;
    private Double largura;
    private Double inclinacao;
    private String tipoSolo;
    private Double areaTotal;
    Endereco endereco;

    public DetalhesProjeto(){
        comprimento = 0.0;
        largura = 0.0;
        inclinacao = 0.0;
        tipoSolo = "";
        areaTotal = 0.0;
        endereco = new Endereco();
    }

    public DetalhesProjeto(Double comprimento, Double largura, Double inclinacao, String tipoSolo, Endereco endereco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.inclinacao = inclinacao;
        this.tipoSolo = tipoSolo;
        this.areaTotal = largura*comprimento;
        this.endereco = endereco;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getInclinacao() {
        return inclinacao;
    }

    public void setInclinacao(Double inclinacao) {
        this.inclinacao = inclinacao;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "DetalhesProjeto{" +
                "comprimento=" + comprimento +
                ", largura=" + largura +
                ", inclinacao=" + inclinacao +
                ", tipoSolo='" + tipoSolo + '\'' +
                ", areaTotal=" + areaTotal +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalhesProjeto that = (DetalhesProjeto) o;
        return Objects.equals(comprimento, that.comprimento) && Objects.equals(largura, that.largura) && Objects.equals(inclinacao, that.inclinacao) && Objects.equals(tipoSolo, that.tipoSolo) && Objects.equals(areaTotal, that.areaTotal) && Objects.equals(endereco, that.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comprimento, largura, inclinacao, tipoSolo, areaTotal, endereco);
    }
}
