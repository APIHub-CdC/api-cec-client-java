package io.ApiCec.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Respuesta {
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("score")
  private Score score = null;

  public Respuesta folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }

  public String getFolioConsulta() {
    return folioConsulta;
  }

  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }

  public Respuesta folio(String folio) {
    this.folio = folio;
    return this;
  }

  public String getFolio() {
    return folio;
  }

  public void setFolio(String folio) {
    this.folio = folio;
  }

  public Respuesta score(Score score) {
    this.score = score;
    return this;
  }

  public Score getScore() {
    return score;
  }

  public void setScore(Score score) {
    this.score = score;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folioConsulta, respuesta.folioConsulta) && Objects.equals(this.folio, respuesta.folio)
        && Objects.equals(this.score, respuesta.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folioConsulta, folio, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");

    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
