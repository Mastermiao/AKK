package com.example.apptwo.fragment;

import com.dianping.loader.MyResources;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


@SuppressLint("NewApi") 
@TargetApi(Build.VERSION_CODES.HONEYCOMB) 
public class FrighterFragment extends Fragment {
	
	private ImageView mImageView;
	private MyResources mYResources;
	private static final String TAG = FrighterFragment.class.getSimpleName();
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.e(TAG, "--------------------onAttach");
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e(TAG, "--------------------onCreate");
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.e(TAG, "--------------------onCreateView");
		mYResources= MyResources.getResource(FrighterFragment.class);
		mImageView= (ImageView) getView().findViewById(R.id.imageView1);
		
		return mYResources.inflate(getActivity(), R.layout.fragment_main, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	}
}
