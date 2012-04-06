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
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Rect;

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

public class ShapeDrawableClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init ShapeDrawableClass");

        /* ShapeDrawableClass Body */
        Service._GetObject("ShapeDrawableClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEShapeDrawable shapedrawable = new StarCLEShapeDrawable((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)shapedrawable);
        		return;
        	}     
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  init(StarObjectClass self,StarObjectClass shape) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param shape will be freed with ShapeDrawable
        	 */
        	public void  init(StarObjectClass self,StarObjectClass shape){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(shape,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null ){
        			shapedrawable.SetAndroidObject(new ShapeDrawable((Shape)androidinterface.GetAndroidObject()));
        			shapedrawable.AddRef(androidinterface);
        			shape._LockGC();
        			shape._Call("decAndroidRef");  // release with parent
        		}        		
        	}        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  draw(StarObjectClass self,StarObjectClass canvas) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  draw(StarObjectClass self,StarObjectClass canvas){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLECanvas star_canvas = (StarCLECanvas)WrapAndroidClass.GetAndroidObject(canvas,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			((ShapeDrawable)shapedrawable.GetAndroidObject()).draw((Canvas)star_canvas.GetAndroidObject());        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getChangingConfigurations(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public int  getChangingConfigurations(StarObjectClass self){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			return ((ShapeDrawable)shapedrawable.GetAndroidObject()).getChangingConfigurations();
        		return 0;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getIntrinsicHeight(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getIntrinsicHeight(StarObjectClass self){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			return ((ShapeDrawable)shapedrawable.GetAndroidObject()).getIntrinsicHeight();
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
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			return ((ShapeDrawable)shapedrawable.GetAndroidObject()).getIntrinsicWidth();
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
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			return ((ShapeDrawable)shapedrawable.GetAndroidObject()).getOpacity();
        		return 0;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  getPadding(StarObjectClass self,StarObjectClass padding) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param padding is instance of RectClass
        	 */
        	public boolean  getPadding(StarObjectClass self,StarObjectClass padding){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null ){
        			Rect rect=new Rect(0,0,0,0);
        			boolean Result = ((ShapeDrawable)shapedrawable.GetAndroidObject()).getPadding(rect);
        			if( Result == false )
        				return false;
        			padding._Set("left",rect.left);
        			padding._Set("top",rect.top);
        			padding._Set("right",rect.right);
        			padding._Set("bottom",rect.bottom);
        			return true;
        		}
        		return false;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getPaint(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public StarObjectClass  getPaint(StarObjectClass self){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null ){
        			Paint android_paint = ((ShapeDrawable)shapedrawable.GetAndroidObject()).getPaint();
        			StarObjectClass paint = Service._GetObject("PaintClass")._New();
        			StarCLEPaint star_paint = (StarCLEPaint)WrapAndroidClass.GetAndroidObject(paint,"AndroidObject");
        			star_paint.SetAndroidObject(android_paint);
        			return paint;
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
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			((ShapeDrawable)shapedrawable.GetAndroidObject()).setAlpha(alpha);
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
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			((ShapeDrawable)shapedrawable.GetAndroidObject()).setDither(dither);
        		return;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setIntrinsicHeight(StarObjectClass self,int height) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public void  setIntrinsicHeight(StarObjectClass self,int height){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			((ShapeDrawable)shapedrawable.GetAndroidObject()).setIntrinsicHeight(height);
        		return;
        	}   
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setIntrinsicWidth(StarObjectClass self,int width) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setIntrinsicWidth(StarObjectClass self,int width){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			((ShapeDrawable)shapedrawable.GetAndroidObject()).setIntrinsicWidth(width);
        		return;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setPadding(StarObjectClass self,int left, int top, int right, int bottom) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setPadding(StarObjectClass self,int left, int top, int right, int bottom){
        		StarCLEShapeDrawable shapedrawable = (StarCLEShapeDrawable)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( shapedrawable != null && shapedrawable.GetAndroidObject() != null )
        			((ShapeDrawable)shapedrawable.GetAndroidObject()).setPadding(left,top,right,bottom);
        		return;
        	}     	
        });    
        
		return true;
	}	
}