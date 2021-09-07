package io.ApiCec.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Persona {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("ingresoMensual")
  private Integer ingresoMensual = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexo sexo = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;

  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public Persona apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }

  public String getApellidoAdicional() {
    return apellidoAdicional;
  }

  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }

  public Persona nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Persona RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }

  public String getRFC() {
    return RFC;
  }

  public void setRFC(String RFC) {
    this.RFC = RFC;
  }

  public Persona ingresoMensual(Integer ingresoMensual) {
    this.ingresoMensual = ingresoMensual;
    return this;
  }

  public Integer getIngresoMensual() {
    return ingresoMensual;
  }

  public void setIngresoMensual(Integer ingresoMensual) {
    this.ingresoMensual = ingresoMensual;
  }

  public Persona CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }

  public String getCURP() {
    return CURP;
  }

  public void setCURP(String CURP) {
    this.CURP = CURP;
  }

  public Persona nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public Persona residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }

  public CatalogoResidencia getResidencia() {
    return residencia;
  }

  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }

  public Persona estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }

  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public Persona sexo(CatalogoSexo sexo) {
    this.sexo = sexo;
    return this;
  }

  public CatalogoSexo getSexo() {
    return sexo;
  }

  public void setSexo(CatalogoSexo sexo) {
    this.sexo = sexo;
  }

  public Persona claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }

  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }

  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }

  public Persona numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }

  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }

  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }

  public Persona fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }

  public String getFechaDefuncion() {
    return fechaDefuncion;
  }

  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }

  public Persona domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  public Domicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.apellidoPaterno, persona.apellidoPaterno)
        && Objects.equals(this.apellidoMaterno, persona.apellidoMaterno)
        && Objects.equals(this.apellidoAdicional, persona.apellidoAdicional)
        && Objects.equals(this.nombres, persona.nombres)
        && Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) && Objects.equals(this.RFC, persona.RFC)
        && Objects.equals(this.ingresoMensual, persona.ingresoMensual) && Objects.equals(this.CURP, persona.CURP)
        && Objects.equals(this.nacionalidad, persona.nacionalidad)
        && Objects.equals(this.residencia, persona.residencia) && Objects.equals(this.estadoCivil, persona.estadoCivil)
        && Objects.equals(this.sexo, persona.sexo) && Objects.equals(this.claveElectorIFE, persona.claveElectorIFE)
        && Objects.equals(this.numeroDependientes, persona.numeroDependientes)
        && Objects.equals(this.fechaDefuncion, persona.fechaDefuncion)
        && Objects.equals(this.domicilio, persona.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, nombres, fechaNacimiento, RFC,
        ingresoMensual, CURP, nacionalidad, residencia, estadoCivil, sexo, claveElectorIFE, numeroDependientes,
        fechaDefuncion, domicilio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");

    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    ingresoMensual: ").append(toIndentedString(ingresoMensual)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
