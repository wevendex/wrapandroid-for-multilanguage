package com.srplab.wrapandroid;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.content.res.AssetManager;
import android.widget.*;
import android.view.*;
import android.widget.LinearLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.util.*;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import com.srplab.www.starcore.*;

/**
 * 
 * @author srplab
 *
 */

public class SpinnerClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init SpinnerClass");

		class StarCLESpinner extends Spinner implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;       
			private List<Object> RefList;
			public StarCLESpinner(Context ctx,StarObjectClass In_Object){
				super(ctx);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}			
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};  
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "SpinnerClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}
		
        /* SpinnerClass Body */
        Service._GetObject("SpinnerClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");   
        		StarCLESpinner spinner = new StarCLESpinner((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)spinner);
        		if( parent != null ){
        			if( activity == parent ){
        				Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_activity.setContentView(spinner);
        			}else{
        				ViewGroup android_viewgroup = (ViewGroup)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_viewgroup.addView(spinner);
        			}
        			self._LockGC();
        			self._Call("decAndroidRef");  // release with parent
        		}
        	}
        });
        
		return true;
	}	
}