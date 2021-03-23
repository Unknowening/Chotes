package com.example.chotes;

import androidx.annotation.Nullable;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class NewSaveRequest extends StringRequest {

    private static final String SAVE_REQUEST_URL = "https://uncomposable-pans.000webhostapp.com/Save.php";
    private Map<String, String> params;

    public NewSaveRequest(String file, String username, String password, Response.Listener<String> listener){
        super(Method.POST, SAVE_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("file", file);
        params.put("username", username);
        params.put("password", password);
    }

    @Nullable
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
