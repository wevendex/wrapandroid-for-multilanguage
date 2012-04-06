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
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;

import java.io.IOException;
import java.io.InputStream;
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

public class BitmapFactoryClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init BitmapFactoryClass");

		class StarCLEBitmapFactory extends BitmapFactory implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;         	
			private List<Object> RefList;
			public StarCLEBitmapFactory(Context ctx,StarObjectClass In_Object){
				super();
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "BitmapFactoryClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}
        /* BitmapFactoryClass Body */
        Service._GetObject("BitmapFactoryClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEBitmapFactory bitmapfactory = new StarCLEBitmapFactory((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)bitmapfactory);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass decodeResource(StarObjectClass self,int id) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public StarObjectClass decodeResource(StarObjectClass self,int id) {
        		StarCLEBitmapFactory bitmapfactory = (StarCLEBitmapFactory)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");
        		if( bitmapfactory == null )
        			return null;
        		Bitmap bitmap = bitmapfactory.decodeResource(((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject")).getResources(),id);
        		if( bitmap == null )
        			return null;
        		StarObjectClass clebitmap;
        		clebitmap = Service._GetObject("BitmapClass")._New();
        		StarCLEBitmap androidbitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(clebitmap,"AndroidObject");
        		androidbitmap.bitmap = bitmap;
        		return clebitmap;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass decodeResource(StarObjectClass self,int id) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public StarObjectClass decodeFile(StarObjectClass self,String pathName){
        		StarCLEBitmapFactory bitmapfactory = (StarCLEBitmapFactory)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmapfactory == null )
        			return null;
        		Bitmap bitmap = bitmapfactory.decodeFile(pathName);
        		if( bitmap == null )
        			return null;
        		StarObjectClass clebitmap;
        		clebitmap = Service._GetObject("BitmapClass")._New();
        		StarCLEBitmap androidbitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(clebitmap,"AndroidObject");
        		androidbitmap.bitmap = bitmap;
        		return clebitmap;
        	}     
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass decodeAssetsFile(StarObjectClass self,String pathName) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public StarObjectClass decodeAssetsFile(StarObjectClass self,String pathName){
        		StarCLEBitmapFactory bitmapfactory = (StarCLEBitmapFactory)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmapfactory == null )
        			return null;
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");
        		if( bitmapfactory == null )
        			return null;
        		try{
        			Bitmap bitmap = bitmapfactory.decodeStream(((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject")).getAssets().open(pathName));
        			if( bitmap == null )
        				return null;
        			StarObjectClass clebitmap;
        			clebitmap = Service._GetObject("BitmapClass")._New();
        			StarCLEBitmap androidbitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(clebitmap,"AndroidObject");
        			androidbitmap.bitmap = bitmap;
        			return clebitmap;
        		}catch(IOException e){
        			SrvGroup._Print(e.toString());
        			return null;
        		}
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass decodeByteArray(StarObjectClass self,StarBinBufClass binBuf,int offset,int length) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public StarObjectClass decodeByteArray(StarObjectClass self,StarBinBufClass binBuf,int offset,int length){
        		StarCLEBitmapFactory bitmapfactory = (StarCLEBitmapFactory)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmapfactory == null )
        			return null;
        		int len = binBuf._Toint(binBuf._Get("_Offset"));
        		if( len == 0 || len < offset+length)
        			return null;
        		byte[] data = new byte[len];
        		binBuf._Read(data, offset, length);
        		Bitmap bitmap = bitmapfactory.decodeByteArray(data,0,length);
        		if( bitmap == null )
        			return null;
        		StarObjectClass clebitmap;
        		clebitmap = Service._GetObject("BitmapClass")._New();
        		StarCLEBitmap androidbitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(clebitmap,"AndroidObject");
        		androidbitmap.bitmap = bitmap;
        		return clebitmap;
        	}        	
        });    
        
		return true;
	}	
}