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
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.Matrix;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Stack;

import com.srplab.www.starcore.*;

/**
 * 
 * @author srplab
 *
 */

public class TypefaceClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init TypefaceClass");

        /* TypefaceClass Body */
        Service._GetObject("TypefaceClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLETypeface typeface = new StarCLETypeface((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)typeface);
        		return;
        	}  
        	/* onDestroyAndroid function */
        	public void onDestroyAndroid( StarObjectClass self ){
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface == null )
        			return;
        		typeface.typeface = null;
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean create(StarObjectClass self,String familyName, int style) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean create(StarObjectClass self,String familyName, int style){ 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface == null )
        			return false;
        		typeface.typeface = Typeface.create(familyName,style);
        		if( typeface.typeface == null )
        			return false;
        		return true;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean createFromFile(StarObjectClass self,String path) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean createFromFile(StarObjectClass self,String path){ 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface == null )
        			return false;
        		typeface.typeface = Typeface.createFromFile(path);
        		if( typeface.typeface == null )
        			return false;
        		return true;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean defaultFromStyle(StarObjectClass self,int style) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean defaultFromStyle(StarObjectClass self,int style){ 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface == null )
        			return false;
        		typeface.typeface = Typeface.defaultFromStyle(style);
        		if( typeface.typeface == null )
        			return false;
        		return true;
        	}        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean createFromAsset(StarObjectClass self,String path) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean createFromAsset(StarObjectClass self,String path){ 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		        		
        		if( typeface == null )
        			return false;
        		if( typeface.typeface != null )
        			typeface.typeface = null;
        		Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject");
        		AssetManager mgr = android_activity.getAssets();        		
        		typeface.typeface = Typeface.createFromAsset(mgr,path);
        		if( typeface.typeface == null )
        			return false;
        		return true;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getStyle(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public int  getStyle(StarObjectClass self){ 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface != null && typeface.GetAndroidObject() != null )
        			return ((Typeface)typeface.GetAndroidObject()).getStyle();
        		return 0; 
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  isBold(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  isBold(StarObjectClass self) { 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface != null && typeface.GetAndroidObject() != null )
        			return ((Typeface)typeface.GetAndroidObject()).isBold();
        		return false; 
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  isItalic(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  isItalic(StarObjectClass self){ 
        		StarCLETypeface typeface = (StarCLETypeface)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( typeface != null && typeface.GetAndroidObject() != null )
        			return ((Typeface)typeface.GetAndroidObject()).isItalic();
        		return false; 
        	}         	
        });            
		return true;
	}	
}