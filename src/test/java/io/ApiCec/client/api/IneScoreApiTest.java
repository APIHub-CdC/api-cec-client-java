package io.ApiCec.client.api;

import java.util.concurrent.TimeUnit;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.ApiCec.client.ApiClient;
import io.ApiCec.client.ApiException;
import io.ApiCec.client.ApiResponse;
import io.ApiCec.client.model.CatalogoEstadoCivil;
import io.ApiCec.client.model.CatalogoEstados;
import io.ApiCec.client.model.CatalogoResidencia;
import io.ApiCec.client.model.CatalogoSexo;
import io.ApiCec.client.model.CatalogoTipoAsentamiento;
import io.ApiCec.client.model.CatalogoTipoDomicilio;
import io.ApiCec.client.model.Domicilio;
import io.ApiCec.client.model.Persona;
import io.ApiCec.client.model.Peticion;
import io.ApiCec.client.model.Respuesta;
import okhttp3.OkHttpClient;

public class IneScoreApiTest {
    private final IneScoreApi api = new IneScoreApi();
    
    private Logger logger = LoggerFactory.getLogger(IneScoreApiTest.class.getName());

	private ApiClient apiClient;
	
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String usernameCDC = "your_username_otrorgante";
    private String passwordCDC = "your_password_otorgante"; 
    
    private String url = "the_url";
    private String xApiKey = "X_Api_Key";

    private SignerInterceptor interceptor;
    
    @Before()
	public void setUp() {
		interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(interceptor)
			    .build();
		apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void v1InePostTest() throws ApiException {
        
        Peticion body = new Peticion();
        Persona persona = new Persona();
        Domicilio domicilio = new Domicilio();
        Integer estatusOK = 200;
        Integer estatusNoContent = 204;
        
        try {
            body.setFolio("FOLIO");
            persona.setNombres("NOMBRE");
            persona.setApellidoPaterno("APELLIDO PATERNO");
            persona.setApellidoMaterno("APELLIDO MATERNO");
            persona.setApellidoAdicional("APELLIDO ADICIONAL");
            persona.setFechaNacimiento("YYYY-MM-dd");
            persona.setRFC("XAXX010101000");
            persona.setIngresoMensual(10000);
            persona.setCURP("XEXX010101HNEXXXA4");
            persona.setNacionalidad("NACIONALIDAD");
            persona.setResidencia(CatalogoResidencia.NUMBER_1);
            persona.setEstadoCivil(CatalogoEstadoCivil.S);
            persona.setSexo(CatalogoSexo.M);
            persona.setClaveElectorIFE("000000000000");
            persona.setNumeroDependientes(0);
            persona.setFechaDefuncion("YYYY-MM-dd");
            
            domicilio.setDireccion("DIRECCION");
            domicilio.setColoniaPoblacion("COLONIA");
            domicilio.setDelegacionMunicipio("DELEGACION");
            domicilio.setCiudad("CIUDAD");
            domicilio.setEstado(CatalogoEstados.DF);
            domicilio.setFechaRegistroDomicilio("YYYY-MM-dd");
            domicilio.setFechaResidencia("YYYY-MM-dd");
            domicilio.setNumeroTelefono("5512345678");
            domicilio.setTipoDomicilio(CatalogoTipoDomicilio.C);
            domicilio.setTipoAsentamiento(CatalogoTipoAsentamiento._0);
            domicilio.setTipoAltaDomicilio(0);
            domicilio.setIdDomicilio("316110890");
            persona.setDomicilio(domicilio);

            body.setPersona(persona);

            
            ApiResponse<?>  response = api.v1InePostWithHttpInfo(xApiKey, usernameCDC, passwordCDC, body);
            
        	Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
            
            if(estatusOK.equals(response.getStatusCode())) {
                Respuesta responseOK = (Respuesta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if(!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));           
        }
    }
    
    
}
