package at.wrk.fmd.ikarusapp.requests;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class MlsJsonObjectRequest extends JsonObjectRequest
{
	private Context mContext;

	public MlsJsonObjectRequest (int method, String url, JSONObject jsonRequest, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener, Context context)
	{
		super (method, url, jsonRequest, listener, errorListener);
		mContext = context;
	}


	@Override
	public Map<String, String> getHeaders () throws AuthFailureError
	{
		HashMap headers = new HashMap ();

		String auth = String.format ("Basic %s",
				String.format ("%s:%s",
						MlsBasicAuthCredentials.getInstance (mContext).getUsername (),
						MlsBasicAuthCredentials.getInstance (mContext).getPassword ()
				)
		);


		headers.put ("Content-Type", "application/json");
		headers.put ("Authorization", auth);

		return headers;
	}
}
