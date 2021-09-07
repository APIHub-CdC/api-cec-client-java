package io.ApiCec.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Score {
  @SerializedName("nombreScore")
  private String nombreScore = null;
  @SerializedName("valor")
  private Integer valor = null;
  @SerializedName("razones")
  private List<CatalogoRazones> razones = null;

  public Score nombreScore(String nombreScore) {
    this.nombreScore = nombreScore;
    return this;
  }

  public String getNombreScore() {
    return nombreScore;
  }

  public void setNombreScore(String nombreScore) {
    this.nombreScore = nombreScore;
  }

  public Score valor(Integer valor) {
    this.valor = valor;
    return this;
  }

  public Integer getValor() {
    return valor;
  }

  public void setValor(Integer valor) {
    this.valor = valor;
  }

  public Score razones(List<CatalogoRazones> razones) {
    this.razones = razones;
    return this;
  }

  public Score addRazonesItem(CatalogoRazones razonesItem) {
    if (this.razones == null) {
      this.razones = new ArrayList<CatalogoRazones>();
    }
    this.razones.add(razonesItem);
    return this;
  }

  public List<CatalogoRazones> getRazones() {
    return razones;
  }

  public void setRazones(List<CatalogoRazones> razones) {
    this.razones = razones;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score score = (Score) o;
    return Objects.equals(this.nombreScore, score.nombreScore) && Objects.equals(this.valor, score.valor)
        && Objects.equals(this.razones, score.razones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreScore, valor, razones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score {\n");

    sb.append("    nombreScore: ").append(toIndentedString(nombreScore)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
