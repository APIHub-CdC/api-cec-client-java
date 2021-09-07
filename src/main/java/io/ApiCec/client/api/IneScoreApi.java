package io.ApiCec.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.ApiCec.client.ApiCallback;
import io.ApiCec.client.ApiClient;
import io.ApiCec.client.ApiException;
import io.ApiCec.client.ApiResponse;
import io.ApiCec.client.Configuration;
import io.ApiCec.client.Pair;
import io.ApiCec.client.ProgressRequestBody;
import io.ApiCec.client.ProgressResponseBody;
import io.ApiCec.client.model.Peticion;
import io.ApiCec.client.model.Respuesta;

public class IneScoreApi {
    private ApiClient apiClient;
    public IneScoreApi() {
        this(Configuration.getDefaultApiClient());
    }
    public IneScoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call v1InePostCall( String xApiKey, String username, String password, Peticion body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/v1/ine";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    
    private okhttp3.Call v1InePostValidateBeforeCall( String xApiKey, String username, String password, Peticion body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling v1InePost(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling v1InePost(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling v1InePost(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling v1InePost(Async)");
        }
        
        okhttp3.Call call = v1InePostCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta v1InePost( String xApiKey, String username, String password, Peticion body) throws ApiException {
        ApiResponse<Respuesta> resp = v1InePostWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> v1InePostWithHttpInfo( String xApiKey, String username, String password, Peticion body) throws ApiException {
        okhttp3.Call call = v1InePostValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call v1InePostAsync( String xApiKey, String username, String password, Peticion body, final ApiCallback<Respuesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = v1InePostValidateBeforeCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
