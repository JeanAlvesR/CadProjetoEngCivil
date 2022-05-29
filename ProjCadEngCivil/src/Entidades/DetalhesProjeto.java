package Entidades;

import java.util.Objects;

public class DetalhesProjeto {
    private float comprimento;
    private float largura;
    private float inclinacao;
    private String tipoSolo;
    private float areaTotal;
    Endereco endereco;

    public DetalhesProjeto(){
        comprimento = 0.0f;
        largura = 0.0f;
        inclinacao = 0.0f;
        tipoSolo = "";
        areaTotal = 0.0f;
        endereco = new Endereco();
    }

    public DetalhesProjeto(float comprimento, float largura, float inclinacao, String tipoSolo, Endereco endereco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.inclinacao = inclinacao;
        this.tipoSolo = tipoSolo;
        this.areaTotal = largura*comprimento;
        this.endereco = endereco;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getInclinacao() {
        return inclinacao;
    }

    public void setInclinacao(float inclinacao) {
        this.inclinacao = inclinacao;
    }

    public String getTipoSolo() {
        return tipoSolo;
    }

    public void setTipoSolo(String tipoSolo) {
        this.tipoSolo = tipoSolo;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
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
