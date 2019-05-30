package at.wrk.fmd.ikarusapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import at.wrk.fmd.ikarusapp.requests.MlsBasicAuthCredentials;


public class LogoutFragment extends Fragment
{
	public LogoutFragment ()
	{
	}


	@Override
	public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate (R.layout.fragment_logout, container, false);
	}


	@Override
	public void onViewCreated (@NonNull final View view, @Nullable Bundle savedInstanceState)
	{
		super.onViewCreated (view, savedInstanceState);

		Button logoutBtn = view.findViewById (R.id.logoutBtn);
		logoutBtn.setOnClickListener (new View.OnClickListener ()
		{
			@Override
			public void onClick (View v)
			{
				// empty out all cached data
				MlsBasicAuthCredentials.getInstance (getContext ()).setPassword ("");
				MlsBasicAuthCredentials.getInstance (getContext ()).setServer ("");
				MlsBasicAuthCredentials.getInstance (getContext ()).setPassword ("");

				// pop the back stack and go to the login page
				//
				// Developer Note:
				// Removing the entire back stack is very important. If we don't clean the back stack
				// we end up the the same fuck up as in the current EDOCTA app where you can crash the
				// entire app by opening activity/fragments over and over again.
				Navigation.findNavController (view).popBackStack (R.id.loginFragment, true);
			}
		});
	}
}
