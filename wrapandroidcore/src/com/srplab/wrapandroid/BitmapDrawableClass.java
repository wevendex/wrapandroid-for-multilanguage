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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;

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

public class BitmapDrawableClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init BitmapDrawableClass");

        /* BitmapDrawableClass Body */
        Service._GetObject("BitmapDrawableClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEBitmapDrawable bimapdrawable = new StarCLEBitmapDrawable((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)bimapdrawable);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  init(StarObjectClass self,String filepath) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  init(StarObjectClass self,String filepath){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null ){
        			BitmapDrawable android_bitmapdrawable = new BitmapDrawable(filepath);
        			if( android_bitmapdrawable == null )
        				return false;
        			bimapdrawable.SetAndroidObject(android_bitmapdrawable);
        			return true;
        		}        		
        		return false;
        	}        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  draw(StarObjectClass self,StarObjectClass canvas) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  draw(StarObjectClass self,StarObjectClass canvas){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLECanvas star_canvas = (StarCLECanvas)WrapAndroidClass.GetAndroidObject(canvas,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).draw((Canvas)star_canvas.GetAndroidObject());        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getBitmap(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note the returned Bitmap Object should be freed by caller.
        	 */
        	public StarObjectClass  getBitmap(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			StarObjectClass bitmap = Service._GetObject("BitmapClass")._New();
        			StarCLEBitmap star_bitmap = (StarCLEBitmap)WrapAndroidClass.GetAndroidObject(bitmap,"AndroidObject");
        			Bitmap android_bitmap = ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getBitmap();
        			star_bitmap.SetAndroidObject(android_bitmap);
        			return bitmap; 
        		}
        		return null;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getChangingConfigurations(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getChangingConfigurations(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			return ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getChangingConfigurations();
        		return 0;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getGravity(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getGravity(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			return ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getGravity();
        		return 0;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getIntrinsicHeight(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getIntrinsicHeight(StarObjectClass self) {
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			return ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getIntrinsicHeight();
        		return 0;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getIntrinsicWidth(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getIntrinsicWidth(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			return ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getIntrinsicWidth();
        		return 0;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getOpacity(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getOpacity(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			return ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getOpacity();
        		return 0;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getPaint(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note the returned path should be freed by caller
        	 */
        	public StarObjectClass  getPaint(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			StarObjectClass paint = Service._GetObject("PaintClass")._New();
        			StarCLEPaint star_paint = (StarCLEPaint)WrapAndroidClass.GetAndroidObject(paint,"AndroidObject");
        			Paint android_path = ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getPaint();
        			star_paint.SetAndroidObject(android_path);
        			return paint; 
        		}
        		return null;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public String getTileModeX(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @return "CLAMP","MIRROR","REPEAT"
        	 */
        	public String getTileModeX(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			android.graphics.Shader.TileMode tilemode = ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getTileModeX();
        			if( tilemode == android.graphics.Shader.TileMode.CLAMP )
        				return new String("CLAMP");
        			else if( tilemode == android.graphics.Shader.TileMode.MIRROR )
        				return new String("MIRROR");
        			else if( tilemode == android.graphics.Shader.TileMode.REPEAT )
        				return new String("REPEAT");   
        			else
        				return null;
        		}
        		return null;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public String getTileModeY(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public String getTileModeY(StarObjectClass self){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			android.graphics.Shader.TileMode tilemode = ((BitmapDrawable)bimapdrawable.GetAndroidObject()).getTileModeY();
        			if( tilemode == android.graphics.Shader.TileMode.CLAMP )
        				return new String("CLAMP");
        			else if( tilemode == android.graphics.Shader.TileMode.MIRROR )
        				return new String("MIRROR");
        			else if( tilemode == android.graphics.Shader.TileMode.REPEAT )
        				return new String("REPEAT");   
        			else
        				return null;
        		}
        		return null;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setAlpha(StarObjectClass self,int alpha) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setAlpha(StarObjectClass self,int alpha){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setAlpha(alpha);
        		return;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setAntiAlias(StarObjectClass self,boolean aa) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setAntiAlias(StarObjectClass self,boolean aa){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setAntiAlias(aa);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setDither(StarObjectClass self,boolean dither) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setDither(StarObjectClass self,boolean dither){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setDither(dither);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setFilterBitmap(StarObjectClass self,boolean filter) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setFilterBitmap(StarObjectClass self,boolean filter){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setFilterBitmap(filter);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setGravity(StarObjectClass self,int gravity) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setGravity(StarObjectClass self,int gravity){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setGravity(gravity);
        		return;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setTargetDensity(StarObjectClass self,int density) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setTargetDensity(StarObjectClass self,int density){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null )
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTargetDensity(density);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setTargetDensity1(StarObjectClass self,StarObjectClass canvas) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setTargetDensity1(StarObjectClass self,StarObjectClass canvas){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null && canvas != null ){
        			StarCLECanvas star_canvas = (StarCLECanvas)WrapAndroidClass.GetAndroidObject(canvas,"AndroidObject");
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTargetDensity((Canvas)star_canvas.GetAndroidObject());
        		}
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setTileModeX(StarObjectClass self,String mode) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param mode "CLAMP","MIRROR","REPEAT"
        	 */
        	public void  setTileModeX(StarObjectClass self,String mode){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			if( mode.equals("CLAMP"))
        				((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeX(android.graphics.Shader.TileMode.CLAMP);
        			else if( mode.equals("MIRROR"))
        				((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeX(android.graphics.Shader.TileMode.MIRROR);
        			else if( mode.equals("REPEAT"))
        				((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        		}
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setTileModeXY(StarObjectClass self,String xmode, String ymode) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setTileModeXY(StarObjectClass self,String xmode, String ymode){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			android.graphics.Shader.TileMode android_xmode,android_ymode;
        			if( xmode.equals("CLAMP"))
        				android_xmode = android.graphics.Shader.TileMode.CLAMP;
        			else if( xmode.equals("MIRROR"))
        				android_xmode = android.graphics.Shader.TileMode.MIRROR;
        			else if( xmode.equals("REPEAT"))
        				android_xmode = android.graphics.Shader.TileMode.REPEAT;
        			else
        				android_xmode = android.graphics.Shader.TileMode.REPEAT;
        			if( ymode.equals("CLAMP"))
        				android_ymode = android.graphics.Shader.TileMode.CLAMP;
        			else if( ymode.equals("MIRROR"))
        				android_ymode = android.graphics.Shader.TileMode.MIRROR;
        			else if( ymode.equals("REPEAT"))
        				android_ymode = android.graphics.Shader.TileMode.REPEAT;
        			else
        				android_ymode = android.graphics.Shader.TileMode.REPEAT;
        			((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeXY(android_xmode,android_ymode);
        		}
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setTileModeY(StarObjectClass self,String mode) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setTileModeY(StarObjectClass self,String mode){
        		StarCLEBitmapDrawable bimapdrawable = (StarCLEBitmapDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( bimapdrawable != null && bimapdrawable.GetAndroidObject() != null ){
        			if( mode.equals("CLAMP"))
        				((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeY(android.graphics.Shader.TileMode.CLAMP);
        			else if( mode.equals("MIRROR"))
        				((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeY(android.graphics.Shader.TileMode.MIRROR);
        			else if( mode.equals("REPEAT"))
        				((BitmapDrawable)bimapdrawable.GetAndroidObject()).setTileModeY(android.graphics.Shader.TileMode.REPEAT);
        		}
        		return;
        	}          	
        });    
        
		return true;
	}	
}