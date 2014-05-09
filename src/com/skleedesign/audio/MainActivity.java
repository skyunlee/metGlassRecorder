package com.skleedesign.audio;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.InputFilter.LengthFilter;
import android.util.Log;
import android.util.EventLog.Event;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity {
	
//	private MediaRecorder myRecorder;
//	private String outputFile = null;
	
//	private MediaRecorder myRecorder;
//	private static String myFileName = null;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
//	private static final int TAKE_PICTURE_REQUEST = 1;
//	
//	private void takePicture(){
//		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//		startActivityForResult(intent, TAKE_PICTURE_REQUEST);
//		
//	}
//	
//	@Override
//	protected void onActivityResult(int reqeustCode, int resultCode)
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_DPAD_CENTER){
			Toast.makeText(getApplicationContext(), "Recording Started", Toast.LENGTH_LONG).show();
			
			Toast.makeText(getApplicationContext(), "End of Recording", Toast.LENGTH_SHORT).show();
//			myFileName = Environment.getExternalStorageDirectory().getAbsolutePath() + "/myrecording.3gp";
//			
//			myRecorder = new MediaRecorder();
//			myRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
//			myRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
//			myRecorder.setOutputFile(myFileName);
//			myRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
//			
//			try {
//				myRecorder.prepare();
//			} catch (IOException e) {
//				Log.e("RecordTest", "prepare() failed");
//			}
//			
//			myRecorder.start();
		}		
		return super.onKeyDown(keyCode, event);
	}

//	@Override
//	public boolean onGenericMotionEvent(MotionEvent event) {
//		switch (event.getAction()) {
//		case MotionEvent.ACTION_DOWN:
//			Log.d("TOUCH", "action_down");
//			break;
//		case MotionEvent.ACTION_UP:
//			Log.d("TOUCH", "action_up");
//			break;
//		case MotionEvent.ACTION_MOVE:
//			Log.d("TOUCH", "action_move");
//			break;
//		}
//		return super.onGenericMotionEvent(event);
//	}
	
	

}
