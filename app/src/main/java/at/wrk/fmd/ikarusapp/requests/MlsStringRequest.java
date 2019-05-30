package at.wrk.fmd.ikarusapp.requests;

import android.content.Context;
import android.util.Base64;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class MlsStringRequest extends StringRequest
{
	private Context mContext;

	public MlsStringRequest (int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener, Context context)
	{
		super (method, url, listener, errorListener);
		mContext = context;
	}


	@Override
	public Map<String, String> getHeaders () throws AuthFailureError
	{
		HashMap headers = new HashMap ();

		String auth = String.format ("Basic %s",
				Base64.encodeToString (
						String.format ("%s:%s",
								MlsBasicAuthCredentials.getInstance (mContext).getUsername (),
								MlsBasicAuthCredentials.getInstance (mContext).getPassword ()
						).getBytes (), Base64.NO_WRAP
				)
		);


		headers.put ("Content-Type", "application/json");
		headers.put ("Authorization", auth);

		return headers;
	}
}
