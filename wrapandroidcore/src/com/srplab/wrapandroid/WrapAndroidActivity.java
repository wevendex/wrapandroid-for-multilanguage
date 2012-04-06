package com.srplab.wrapandroid;

import android.app.Activity;
import android.os.Bundle;

import java.util.Timer;  
import java.util.TimerTask; 
import android.os.Handler;  
import android.os.Message;
import android.view.MotionEvent;

import com.srplab.wrapandroid.WrapAndroidClass;
import com.srplab.www.starcore.*;

public class WrapAndroidActivity extends Activity{
    /** Called when the activity is first created. */
	public StarCoreFactory starcore;
	public StarSrvGroupClass SrvGroup;	
	public StarServiceClass Service;
	public StarObjectClass StarActivity;
	static public int TimerInterval = 100;
	static public boolean DumpInfoFlag = false;
	static public String StarCoreFile = "http://www.srplab.com/android/starcore_armeabi_r5.zip";
	static public int MainVersion = 0;
	static public int SubVersion = 8;
	static public int BuildVersion = 0;
	static public int minSdkVersion = 7;
	Timer timer;
	
	private StarObjectClass motionevent;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        starcore = null;
        SrvGroup = null;
        Service = null;
        StarActivity = null;
        motionevent = null;
        /*-----------------init starcore----------------------------*/
        StarNetInst.InstallZipFileDefault(this,"starcore_version.txt",StarCoreFile,"1.4.1.0");
        
		starcore= StarCoreFactory.GetFactory();	
		SrvGroup = starcore._GetSrvGroup(0);

    	/*-----------------init wrapandroid service------------------*/
		Service = WrapAndroidClass.Init(this, SrvGroup,DumpInfoFlag);		
		StarActivity = (StarObjectClass)Service._GetObject("ActivityClass")._Call("getCurrent");
		
		/*--StarActivity.DefaultAndroidView--*/
		if( savedInstanceState != null )
			WrapAndroidClass.SetAndroidObject(StarActivity,"savedInstanceState",(Object)savedInstanceState);		
    }
    
    @Override protected void onStart() {
    	super.onStart();
		/*-----------------create dispatch timer------------------*/    	
        timer = new Timer();
        final Handler handler = new Handler(){  
            @Override  
            public void handleMessage(Message msg)  
            {  
                while( starcore._SRPDispatch(false) == true );
            }
        };
        timer.scheduleAtFixedRate(new TimerTask()  
        {  
            @Override  
            public void run()  
            {  
                Message mesasge = new Message();  
                mesasge.what = 0;  
                handler.sendMessage(mesasge);  
            }  
        }, 0, TimerInterval);	  /*change from 10 to 100 */ 
    	StarActivity._Call("onStart");
    	WrapAndroidClass.SetAndroidObject(StarActivity,"savedInstanceState",(Object)null);        
    }    
    
    @Override 
    public void onSaveInstanceState(Bundle savedInstanceState) { 
    	super.onSaveInstanceState(savedInstanceState);
    	
		StarObjectClass star_bundle = Service._GetObject("BundleClass")._New();
		StarCLEBundle bundle = (StarCLEBundle)WrapAndroidClass.GetAndroidObject(star_bundle,"AndroidObject");
		bundle.bundle = savedInstanceState;
		StarActivity._Call("onSaveInstanceState",star_bundle);
		star_bundle._Free();
    }    
    
    @Override 
    public void onRestoreInstanceState(Bundle savedInstanceState) { 
    	super.onRestoreInstanceState(savedInstanceState);
		StarObjectClass star_bundle = Service._GetObject("BundleClass")._New();
		StarCLEBundle bundle = (StarCLEBundle)WrapAndroidClass.GetAndroidObject(star_bundle,"AndroidObject");
		bundle.bundle = savedInstanceState;
		StarActivity._Call("onRestoreInstanceState",star_bundle);
		star_bundle._Free();    	
    }    
    
    @Override protected void onPause() {
    	if( timer != null )
    		timer.cancel();
    	super.onPause();
    	StarActivity._Call("onPause");
    } 
    @Override protected void onResume() {
    	super.onResume();
    	StarActivity._Call("onResume");
    }     
    @Override protected void onDestroy() {
    	super.onDestroy();
    	StarActivity._Call("onDestroy");
    	SrvGroup._ClearService();    	    	
    }      
    @Override public boolean onTouchEvent(MotionEvent event){
    	if( StarActivity == null )
    		return super.onTouchEvent(event);
    	StarObjectClass definedclass = StarActivity._DefinedClass("onTouchEvent");
    	StarObjectClass basicclass = Service._GetObject("ActivityClass");
		if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
			return super.onTouchEvent(event);
		if( motionevent == null )
			motionevent = Service._GetObject("MotionEventClass")._New();
		StarCLEMotionEvent star_motionevent = (StarCLEMotionEvent)WrapAndroidClass.GetAndroidObject(motionevent,"AndroidObject");
		star_motionevent.motionevent = event;
		boolean Result = StarActivity._Tobool(StarActivity._Call("onTouchEvent", motionevent));
		star_motionevent.motionevent = null;
		if( Result == false )
			return super.onTouchEvent(event);
		return Result;
    }
}    