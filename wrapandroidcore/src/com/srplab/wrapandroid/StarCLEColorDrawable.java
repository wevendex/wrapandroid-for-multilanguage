package com.srplab.wrapandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;

import com.srplab.www.starcore.StarObjectClass;

		class StarCLEColorDrawable implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;    
			public ColorDrawable colordrawable;
			private List<Object> RefList;
			public StarCLEColorDrawable(Context ctx,StarObjectClass In_Object){
				colordrawable = new ColorDrawable();
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return colordrawable;}
			public void SetAndroidObject(Object object){colordrawable=(ColorDrawable)object;}	
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}