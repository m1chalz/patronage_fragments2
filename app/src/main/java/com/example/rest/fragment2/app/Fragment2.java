package com.example.rest.fragment2.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

	public Fragment2() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		return rootView;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		//RelativeLayout layout = (RelativeLayout) view.findViewById(R.id.relative);
		//layout.setBackgroundColor(android.R.color.holo_orange_light);
		TextView text = (TextView) view.findViewById(R.id.text);
		text.setText("To jest drugi fragment");
	}
}