package io.ApiCec.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoRazones.Adapter.class)
public enum CatalogoRazones {

  B6("B6"),

  B7("B7"),

  B8("B8"),

  D5("D5"),

  E7("E7"),

  M1("M1"),

  M5("M5"),

  N2("N2"),

  R1("R1"),

  C1("C1"),

  C2("C2"),

  C3("C3"),

  FR("FR");

  private String value;

  CatalogoRazones(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogoRazones fromValue(String text) {
    for (CatalogoRazones b : CatalogoRazones.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogoRazones> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoRazones enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogoRazones read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoRazones.fromValue(String.valueOf(value));
    }
  }
}
