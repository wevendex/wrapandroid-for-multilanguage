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
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.DrawableContainer;
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

public class DrawableContainerClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init DrawableContainerClass");

        /* DrawableContainerClass Body */
        Service._GetObject("DrawableContainerClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEDrawableContainer drawablecontainer = new StarCLEDrawableContainer((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);        		
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)drawablecontainer);
        		return;
        	}       	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  draw(StarObjectClass self,StarObjectClass canvas) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  draw(StarObjectClass self,StarObjectClass canvas){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		StarCLECanvas star_canvas = (StarCLECanvas)WrapAndroidClass.GetAndroidObject(canvas,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			((DrawableContainer)drawablecontainer.GetAndroidObject()).draw((Canvas)star_canvas.GetAndroidObject());        		
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getChangingConfigurations(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public int  getChangingConfigurations(StarObjectClass self){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).getChangingConfigurations();
        		return 0;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getCurrent(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @return return value should not be freed
        	 */        	
        	public StarObjectClass  getCurrent(StarObjectClass self){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null ){
        			BasicAndroidInterface androidinterface = (BasicAndroidInterface)((DrawableContainer)drawablecontainer.GetAndroidObject()).getCurrent();
        			if(androidinterface == null)
        				return null;
        			return androidinterface.getBasicAndroid().getStarObject();
        		}
        		return null;
        	}         	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getIntrinsicHeight(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getIntrinsicHeight(StarObjectClass self){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).getIntrinsicHeight();
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
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).getIntrinsicWidth();
        		return 0;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getMinimumHeight(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getMinimumHeight(StarObjectClass self){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).getMinimumHeight();
        		return 0;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getMinimumWidth(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getMinimumWidth(StarObjectClass self){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).getMinimumWidth();
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
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).getOpacity();
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
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null ){
        			Rect rect=new Rect(0,0,0,0);
        			boolean Result = ((DrawableContainer)drawablecontainer.GetAndroidObject()).getPadding(rect);
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
        	 *     <tr><td class="memname">public void  invalidateDrawable(StarObjectClass self,StarObjectClass who) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public void  invalidateDrawable(StarObjectClass self,StarObjectClass who){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null ){
        			BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(who,"AndroidObject");
        			Drawable drawable = (Drawable)androidinterface.GetAndroidObject();
        			((DrawableContainer)drawablecontainer.GetAndroidObject()).invalidateDrawable(drawable);
        		}
        		return;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  isStateful(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  isStateful(StarObjectClass self){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).isStateful();
        		return false;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  selectDrawable(StarObjectClass self,int idx) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  selectDrawable(StarObjectClass self,int idx){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).selectDrawable(idx);
        		return false;
        	}            	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setAlpha(StarObjectClass self,int alpha) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setAlpha(StarObjectClass self,int alpha){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			((DrawableContainer)drawablecontainer.GetAndroidObject()).setAlpha(alpha);
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
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			((DrawableContainer)drawablecontainer.GetAndroidObject()).setDither(dither);
        		return;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public boolean  setVisible(StarObjectClass self,boolean visible, boolean restart) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public boolean  setVisible(StarObjectClass self,boolean visible, boolean restart){
        		StarCLEDrawableContainer drawablecontainer = (StarCLEDrawableContainer)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( drawablecontainer != null && drawablecontainer.GetAndroidObject() != null )
        			return ((DrawableContainer)drawablecontainer.GetAndroidObject()).setVisible(visible,restart);
        		return false;
        	}          	
        });    
        
		return true;
	}	
}