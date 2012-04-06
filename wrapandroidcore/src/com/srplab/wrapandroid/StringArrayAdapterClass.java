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

public class StringArrayAdapterClass{
	/**
	 * @note do not call Init method directly
	 * 
	 *  you can use NameValue "textViewResourceId" of class object to set the ProgressBar style before created
	 *  
	 *  for example :
	 *  
	 *  StarObjectClass MyStringArrayAdapterClass = Service._GetObject("StringArrayAdapterClass");\n
	 *  MyStringArrayAdapterClass._SetNameInt("textViewResourceId", android.R.layout.simple_spinner_item,true);\n
	 *  StarObjectClass MyStringArrayAdapter = Service._GetObject("StringArrayAdapterClass")._New(MyLayout);\n 
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init StringArrayAdapterClass");
		class StarCLEStringArrayAdapter extends ArrayAdapter<String> implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;   
			private List<Object> RefList;
			public StarCLEStringArrayAdapter(Context ctx,StarObjectClass In_Object,int textViewResourceId){
				super(ctx,textViewResourceId);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}				
			public StarCLEStringArrayAdapter(Context ctx,StarObjectClass In_Object){
				super(ctx,android.R.layout.simple_spinner_item);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}			
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "StringArrayAdapterClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			public View  getView(int position, View convertView, ViewGroup parent){
				StarObjectClass adapter = BasicAndroidObject.getStarObject();
				StarObjectClass definedclass = adapter._DefinedClass("getView");
				StarObjectClass basicclass = Service._GetObject("StringArrayAdapterClass");
				if( definedclass._GetStr("_ID").equals(basicclass._GetStr("_ID")) )
					return super.getView(position, convertView, parent);
				WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "getView is override by "+ definedclass);
				StarObjectClass starconvertView,starParent;
				if( convertView != null )
					starconvertView = (((BasicAndroidInterface)convertView).getBasicAndroid()).getStarObject();
				else
					starconvertView = null;
				if( parent != null )
					starParent = (((BasicAndroidInterface)parent).getBasicAndroid()).getStarObject();
				else
					starParent = null;				
				StarObjectClass view = (StarObjectClass)adapter._Call("getView",position,starconvertView,starParent);
				if( view == null )
					return super.getView(position, convertView, parent);
				if( starconvertView != null ){
					if( !(starconvertView._GetStr("_ID").equals(view._GetStr("_ID"))) )
						view._LockGC();
				}								
				View androidview = (View)WrapAndroidClass.GetAndroidObject(view,"AndroidObject");
				view._Call("decAndroidRef");  /*--change to weak ref--*/
				return androidview;
			}			
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}
        /* ProgressBarClass Body */
        Service._GetObject("StringArrayAdapterClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarObjectClass classobject = Service._GetObject("StringArrayAdapterClass");
        		int style = classobject._GetNameInt("textViewResourceId",0);
        		StarCLEStringArrayAdapter starcleobject;        		
        		if( style == 0 )
        			starcleobject = new StarCLEStringArrayAdapter((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);
        		else
        			starcleobject = new StarCLEStringArrayAdapter((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self,style);
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)starcleobject);
        		return;
        	}
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setDropDownViewResource(StarObjectClass self,int resource) </td></tr>
        	 *   </table>
        	 * </div>
             */
        	public void setDropDownViewResource(StarObjectClass self,int resource){
        		ArrayAdapter<String> androidobject = (ArrayAdapter<String>)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( androidobject == null )
        			return;    
        		androidobject.setDropDownViewResource(resource);
        		return;
        	}    
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void remove(StarObjectClass self,String v) </td></tr>
        	 *   </table>
        	 * </div>
             */
        	public void remove(StarObjectClass self,String v){
        		ArrayAdapter<String> androidobject = (ArrayAdapter<String>)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( androidobject == null )
        			return;    
        		androidobject.remove(v);
        		return;
        	}  
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void add(StarObjectClass self,String v) </td></tr>
        	 *   </table>
        	 * </div>
             */
        	public void add(StarObjectClass self,String v){
        		ArrayAdapter<String> androidobject = (ArrayAdapter<String>)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( androidobject == null )
        			return;    
        		androidobject.add(v);
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getView(StarObjectClass self,int position, StarObjectClass convertView, StarObjectClass parent) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public StarObjectClass  getView(StarObjectClass self,int position, StarObjectClass convertView, StarObjectClass parent){return null;};        	
        });         
        
		return true;
	}	
}