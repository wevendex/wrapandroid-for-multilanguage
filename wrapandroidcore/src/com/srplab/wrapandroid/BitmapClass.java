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

public class BitmapClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init BitmapClass");
/*
		class StarCLEBitmap implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;    
			private Bitmap bitmap;
			public StarCLEBitmap(Context ctx,StarObjectClass In_Object){
				bitmap = null;
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};  
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}			
		}
*/		
        /* BitmapClass Body */
        Service._GetObject("BitmapClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEBitmap bitmap = new StarCLEBitmap((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)bitmap);
        		return;
        	}  
        	/* onDestroyAndroid function */
        	public void onDestroyAndroid( StarObjectClass self ){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null )
        			return;
        		if( bitmap.bitmap != null )
        			bitmap.bitmap.recycle();
        		return;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  createBitmap0(StarObjectClass self,StarObjectClass source, int x, int y, int width, int height, StarObjectClass m, boolean filter) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  createBitmap0(StarObjectClass self,StarObjectClass source, int x, int y, int width, int height, StarObjectClass m, boolean filter){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLEBitmap srcbitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(source,"AndroidObject");
        		StarCLEMatrix matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(m,"AndroidObject");
        		if( bitmap == null || srcbitmap == null || srcbitmap.bitmap == null )
        			return false;
        		if( bitmap.bitmap != null ){
        			bitmap.bitmap.recycle();
        			bitmap.bitmap = null;
        		}
        		bitmap.bitmap = Bitmap.createBitmap(srcbitmap.bitmap,x,y,width,height,(Matrix)matrix.GetAndroidObject(),filter);
        		if( bitmap.bitmap == null )
        			return false;
        		return true;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  createBitmap1(StarObjectClass self,int width, int height, String config) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param config : "ALPHA_8","ARGB_4444","ARGB_8888","RGB_565"
        	 */        	
        	public boolean  createBitmap1(StarObjectClass self,int width, int height, String config){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null )
        			return false;
        		if( bitmap.bitmap != null ){
        			bitmap.bitmap.recycle();
        			bitmap.bitmap = null;
        		}
        		if( config.equals("ALPHA_8"))
        			bitmap.bitmap = Bitmap.createBitmap(width,height,Bitmap.Config.ALPHA_8);
        		else if( config.equals("ARGB_4444"))
        			bitmap.bitmap = Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_4444);
        		else if( config.equals("ARGB_8888"))
        			bitmap.bitmap = Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888);
        		else if( config.equals("RGB_565"))
        			bitmap.bitmap = Bitmap.createBitmap(width,height,Bitmap.Config.RGB_565);        		
        		if( bitmap.bitmap == null )
        			return false;
        		return true;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  createBitmap2(StarObjectClass self,StarBinBufClass colors, int offset, int stride, int width, int height, String config) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param config : "ALPHA_8","ARGB_4444","ARGB_8888","RGB_565"
        	 */
        	public boolean  createBitmap2(StarObjectClass self,StarBinBufClass colors, int offset, int stride, int width, int height, String config){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || colors == null )
        			return false;
        		if( bitmap.bitmap != null ){
        			bitmap.bitmap.recycle();
        			bitmap.bitmap = null;
        		}
        		int Length = colors._Getint("_Offset") / 4;
        		if( Length == 0 )
        			return false;
        				
           		int pix[] = new int[Length];  //bgra
           		colors._Read4(pix,0,Length,3,2,1,0);            		
        		if( config.equals("ALPHA_8"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,offset,stride,width,height,Bitmap.Config.ALPHA_8);
        		else if( config.equals("ARGB_4444"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,offset,stride,width,height,Bitmap.Config.ARGB_4444);
        		else if( config.equals("ARGB_8888"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,offset,stride,width,height,Bitmap.Config.ARGB_8888);
        		else if( config.equals("RGB_565"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,offset,stride,width,height,Bitmap.Config.RGB_565);        		
        		if( bitmap.bitmap == null )
        			return false;
        		return true;
        	}        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  createBitmap3(StarObjectClass self,StarBinBufClass colors, int width, int height, String config) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param config : "ALPHA_8","ARGB_4444","ARGB_8888","RGB_565"
        	 */
        	public boolean  createBitmap3(StarObjectClass self,StarBinBufClass colors, int width, int height, String config){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || colors == null )
        			return false;
        		if( bitmap.bitmap != null ){
        			bitmap.bitmap.recycle();
        			bitmap.bitmap = null;
        		}
        		int Length = colors._Getint("_Offset") / 4;
        		if( Length == 0 )
        			return false;
        				
           		int pix[] = new int[Length];  //bgra
           		colors._Read4(pix,0,Length,3,2,1,0);            		
        		if( config.equals("ALPHA_8"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,width,height,Bitmap.Config.ALPHA_8);
        		else if( config.equals("ARGB_4444"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,width,height,Bitmap.Config.ARGB_4444);
        		else if( config.equals("ARGB_8888"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,width,height,Bitmap.Config.ARGB_8888);
        		else if( config.equals("RGB_565"))
        			bitmap.bitmap = Bitmap.createBitmap(pix,width,height,Bitmap.Config.RGB_565);        		
        		if( bitmap.bitmap == null )
        			return false;
        		return true;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  createScaledBitmap(StarObjectClass self,StarObjectClass source, int x, int y, int width, int height, StarObjectClass m, boolean filter) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  createScaledBitmap(StarObjectClass self,StarObjectClass source,int dstWidth, int dstHeight, boolean filter){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLEBitmap srcbitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(source,"AndroidObject");
        		if( bitmap == null || srcbitmap == null || srcbitmap.bitmap == null )
        			return false;
        		if( bitmap.bitmap != null ){
        			bitmap.bitmap.recycle();
        			bitmap.bitmap = null;
        		}
        		bitmap.bitmap = Bitmap.createScaledBitmap(srcbitmap.bitmap,dstWidth,dstHeight,filter);
        		if( bitmap.bitmap == null )
        			return false;
        		return true;
        	}        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  eraseColor(StarObjectClass self,int c) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  eraseColor(StarObjectClass self,int c){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null )
        			return;
        		bitmap.bitmap.eraseColor(c);
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getHeight(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getHeight(StarObjectClass self){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null )
        			return 0;
        		return bitmap.bitmap.getHeight();
        	}        		
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getPixel(StarObjectClass self,int x, int y) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getPixel(StarObjectClass self,int x, int y){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null )
        			return 0;
        		return bitmap.bitmap.getPixel(x,y);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  getPixels(StarObjectClass self,StarBinBufClass pixels, int offset, int stride, int x, int y, int width, int height) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  getPixels(StarObjectClass self,StarBinBufClass pixels, int offset, int stride, int x, int y, int width, int height){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null || pixels == null )
        			return;
        		pixels._Clear();        				
           		int pix[] = new int[width*height];  //bgra
           		bitmap.bitmap.getPixels(pix,offset, stride, x, y, width, height);
           		pixels._Write4(0,pix,width*height,3,2,1,0);
        		return;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getWidth(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getWidth(StarObjectClass self){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null )
        			return 0;
        		return bitmap.bitmap.getWidth();
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setPixel(StarObjectClass self,int x, int y, int color) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setPixel(StarObjectClass self,int x, int y, int color){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null )
        			return;
        		bitmap.bitmap.setPixel(x,y,color);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setPixels(StarObjectClass self,StarBinBufClass pixels, int offset, int stride, int x, int y, int width, int height) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setPixels(StarObjectClass self,StarBinBufClass pixels, int offset, int stride, int x, int y, int width, int height){
        		StarCLEBitmap bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bitmap == null || bitmap.bitmap == null || pixels == null )
        			return;
        		int Length = pixels._Getint("_Offset") / 4;
        		if( Length == 0 || Length != width * height)
        			return;        				
           		int pix[] = new int[Length];  //bgra
           		pixels._Read4(pix,0,Length,3,2,1,0);   
           		bitmap.bitmap.setPixels(pix, offset, stride, x, y, width, height);
        		return;
        	}
        });            
		return true;
	}	
}