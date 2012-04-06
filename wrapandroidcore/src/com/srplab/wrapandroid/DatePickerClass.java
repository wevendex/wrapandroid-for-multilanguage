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
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import java.util.Calendar;


import com.srplab.www.starcore.*;

/**
 * 
 * @author srplab
 *
 */

public class DatePickerClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init DatePickerClass");

		class StarCLEDatePicker extends DatePicker implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;        
			private List<Object> RefList;
			public StarCLEDatePicker(Context ctx,StarObjectClass In_Object){
				super(ctx);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "DatePickerClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}	
        /* DatePickerClass Body */
        Service._GetObject("DatePickerClass")._Assign(new StarObjectClass(){
        	/* _OnCreate Event */
        	public Object[] _OnCreate(Hashtable Ev){
        		StarObjectClass self = (StarObjectClass)Ev.get("_DesObject");        		        		
			    /*set event for View*/
        		DatePicker view = (DatePicker)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		final Calendar c = Calendar.getInstance();
        		int year = c.get(Calendar.YEAR);
        		int month = c.get(Calendar.MONTH);
        		int day = c.get(Calendar.DAY_OF_MONTH);
            	/**
            	 * <div class="memproto">
            	 *   <table class="memname">
            	 *     <tr><td class="memname">Event : onDateChanged(Hashtable Ev,int year, int monthOfYear, int dayOfMonth) </td></tr>
            	 *   </table>
            	 * </div>
            	 */          		
        		view.init(year,month,day,        		
        		    new DatePicker.OnDateChangedListener(){ 
            		    public void  onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth)   {
                			StarObjectClass self = ((BasicAndroidInterface)view).getBasicAndroid().getStarObject();
                			self._ProcessEvent("onDateChanged",year,monthOfYear,dayOfMonth);
                		}
        		    });
			    WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "starobject : "+self+" is created");
			    return null;
        	}             	
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEDatePicker button = new StarCLEDatePicker((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)button);
        		if( parent != null ){
        			if( activity == parent ){
        				Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_activity.setContentView(button);
        			}else{
        				ViewGroup android_viewgroup = (ViewGroup)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_viewgroup.addView(button);
        			}
        			self._LockGC();
        			self._Call("decAndroidRef");  // release with parent
        		}
        		return;
        	}
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void updateDate(StarObjectClass self,int year,int monthOfYear,int dayOfMonth) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void updateDate(StarObjectClass self,int year,int monthOfYear,int dayOfMonth){
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		if( parent != null && parent == activity )
        			return;  //may be content view        		
        		DatePicker view = (DatePicker)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( view != null )
        			view.updateDate(year,monthOfYear,dayOfMonth);
        	}      
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int getDayOfMonth(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int getDayOfMonth(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		if( parent != null && parent == activity )
        			return 0;  //may be content view        		
        		DatePicker view = (DatePicker)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( view != null )
        			return view.getDayOfMonth();
        		return 0;
        	}  
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int getMonth(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int getMonth(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		if( parent != null && parent == activity )
        			return 0;  //may be content view        		
        		DatePicker view = (DatePicker)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( view != null )
        			return view.getMonth();
        		return 0;
        	}  
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int getYear(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int getYear(StarObjectClass self){
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		if( parent != null && parent == activity )
        			return 0;  //may be content view        		
        		DatePicker view = (DatePicker)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( view != null )
        			return view.getYear();
        		return 0;
        	}          	
        	
        });         	
		return true;
	}	
}