package com.srplab.wrapandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.LayerDrawable;

import com.srplab.www.starcore.StarObjectClass;

		class StarCLELayerDrawable implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;    
			public LayerDrawable layerdrawable;
			private List<Object> RefList;
			public StarCLELayerDrawable(Context ctx,StarObjectClass In_Object){
				layerdrawable = null;
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return layerdrawable;}
			public void SetAndroidObject(Object object){layerdrawable=(LayerDrawable)object;}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}