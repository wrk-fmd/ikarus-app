package at.wrk.fmd.ikarusapp.requests;

import android.content.Context;
import android.content.SharedPreferences;


public class MlsBasicAuthCredentials
{
	private static MlsBasicAuthCredentials mInstance;
	private SharedPreferences mSharedPreferences;
	private Context mContext;


	/**
	 * Create a new instance of MlsBasicAuthCredentials
	 *
	 * @param context The context for the shared preferences.
	 */
	private MlsBasicAuthCredentials (Context context)
	{
		mContext = context;
		mSharedPreferences = mContext.getSharedPreferences ("http-basic-auth", Context.MODE_PRIVATE);
	}

	/**
	 * Get the current instance of MlsBasicAuthCredentials
	 *
	 * @param context The context for the shared preferences
	 *
	 * @return The current MlsBasicAuthCredentials instance
	 */
	public static MlsBasicAuthCredentials getInstance (Context context)
	{
		if (mInstance == null) {
			mInstance = new MlsBasicAuthCredentials (context);
		}

		return mInstance;
	}

	/**
	 * Get the server url
	 *
	 * @return The server url
	 */
	public String getServer ()
	{
		return mSharedPreferences.getString ("server", "");
	}


	/**
	 * Set the server url
	 *
	 * @param server The server url
	 */
	public void setServer (String server)
	{
		SharedPreferences.Editor editor = mSharedPreferences.edit ();
		editor.putString ("server", server);
		editor.apply ();
	}


	/**
	 * Get the username
	 *
	 * @return The username
	 */
	public String getUsername ()
	{
		return mSharedPreferences.getString ("username", "");
	}


	/**
	 * Set the username
	 *
	 * @param username The username
	 */
	public void setUsername (String username)
	{
		SharedPreferences.Editor editor = mSharedPreferences.edit ();
		editor.putString ("username", username);
		editor.apply ();
	}


	/**
	 * Get the password
	 *
	 * @return The password
	 */
	public String getPassword ()
	{
		return mSharedPreferences.getString ("password", "");
	}


	/**
	 * Set the password
	 *
	 * @param password The password
	 */
	public void setPassword (String password)
	{
		SharedPreferences.Editor editor = mSharedPreferences.edit ();
		editor.putString ("password", password);
		editor.apply ();
	}
}
