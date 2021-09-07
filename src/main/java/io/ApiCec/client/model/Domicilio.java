package io.ApiCec.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Domicilio {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;
  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private CatalogoEstados estado = null;
  @SerializedName("CP")
  private String CP = null;
  @SerializedName("fechaResidencia")
  private String fechaResidencia = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("tipoDomicilio")
  private CatalogoTipoDomicilio tipoDomicilio = null;
  @SerializedName("tipoAsentamiento")
  private CatalogoTipoAsentamiento tipoAsentamiento = null;
  @SerializedName("fechaRegistroDomicilio")
  private String fechaRegistroDomicilio = null;
  @SerializedName("tipoAltaDomicilio")
  private Integer tipoAltaDomicilio = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;

  public Domicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Domicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }

  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }

  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }

  public Domicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }

  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }

  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }

  public Domicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public Domicilio estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }

  public CatalogoEstados getEstado() {
    return estado;
  }

  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }

  public Domicilio CP(String CP) {
    this.CP = CP;
    return this;
  }

  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }

  public Domicilio fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }

  public String getFechaResidencia() {
    return fechaResidencia;
  }

  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }

  public Domicilio numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }

  public String getNumeroTelefono() {
    return numeroTelefono;
  }

  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }

  public Domicilio tipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }

  public CatalogoTipoDomicilio getTipoDomicilio() {
    return tipoDomicilio;
  }

  public void setTipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }

  public Domicilio tipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
    return this;
  }

  public CatalogoTipoAsentamiento getTipoAsentamiento() {
    return tipoAsentamiento;
  }

  public void setTipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
  }

  public Domicilio fechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
    return this;
  }

  public String getFechaRegistroDomicilio() {
    return fechaRegistroDomicilio;
  }

  public void setFechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
  }

  public Domicilio tipoAltaDomicilio(Integer tipoAltaDomicilio) {
    this.tipoAltaDomicilio = tipoAltaDomicilio;
    return this;
  }

  public Integer getTipoAltaDomicilio() {
    return tipoAltaDomicilio;
  }

  public void setTipoAltaDomicilio(Integer tipoAltaDomicilio) {
    this.tipoAltaDomicilio = tipoAltaDomicilio;
  }

  public Domicilio idDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
    return this;
  }

  public String getIdDomicilio() {
    return idDomicilio;
  }

  public void setIdDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.direccion, domicilio.direccion)
        && Objects.equals(this.coloniaPoblacion, domicilio.coloniaPoblacion)
        && Objects.equals(this.delegacionMunicipio, domicilio.delegacionMunicipio)
        && Objects.equals(this.ciudad, domicilio.ciudad) && Objects.equals(this.estado, domicilio.estado)
        && Objects.equals(this.CP, domicilio.CP) && Objects.equals(this.fechaResidencia, domicilio.fechaResidencia)
        && Objects.equals(this.numeroTelefono, domicilio.numeroTelefono)
        && Objects.equals(this.tipoDomicilio, domicilio.tipoDomicilio)
        && Objects.equals(this.tipoAsentamiento, domicilio.tipoAsentamiento)
        && Objects.equals(this.fechaRegistroDomicilio, domicilio.fechaRegistroDomicilio)
        && Objects.equals(this.tipoAltaDomicilio, domicilio.tipoAltaDomicilio)
        && Objects.equals(this.idDomicilio, domicilio.idDomicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, fechaResidencia,
        numeroTelefono, tipoDomicilio, tipoAsentamiento, fechaRegistroDomicilio, tipoAltaDomicilio, idDomicilio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");

    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    tipoAsentamiento: ").append(toIndentedString(tipoAsentamiento)).append("\n");
    sb.append("    fechaRegistroDomicilio: ").append(toIndentedString(fechaRegistroDomicilio)).append("\n");
    sb.append("    tipoAltaDomicilio: ").append(toIndentedString(tipoAltaDomicilio)).append("\n");
    sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
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
