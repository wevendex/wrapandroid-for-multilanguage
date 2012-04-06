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
import android.graphics.Matrix;
import android.graphics.drawable.*;
import android.graphics.Bitmap;
import android.widget.ImageView.ScaleType;

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

public class ImageViewClass{
	/**
	 * @note do not call Init method directly
	 */	
	static public boolean Init(StarServiceClass In_Service,StarSrvGroupClass In_SrvGroup,boolean In_DumpInformationFlag){
		final StarSrvGroupClass SrvGroup = In_SrvGroup;
		final StarServiceClass Service = In_Service;	
		final boolean DumpInformationFlag = In_DumpInformationFlag;
		WrapAndroidClass.DumpInformation(SrvGroup, DumpInformationFlag, "init ImageViewClass");

		class StarCLEImageView extends ImageView implements BasicAndroidInterface{
			private BasicAndroidClass BasicAndroidObject;  
			private List<Object> RefList;
			public StarCLEImageView(Context ctx,StarObjectClass In_Object){
				super(ctx);
				BasicAndroidObject = new BasicAndroidClass();
				BasicAndroidObject.setStarObject(In_Object);
				RefList = new ArrayList<Object>();
			}
			public BasicAndroidClass getBasicAndroid(){return BasicAndroidObject;};
			public Object GetAndroidObject(){return this;}
			public void SetAndroidObject(Object object){SrvGroup._PrintError(1, "ImageViewClass not support SetAndroidObject" );}
			public void AddRef(Object object){RefList.add(object);}
			public void DelRef(Object object){RefList.remove(object);}
			protected void finalize(){
				StarObjectClass starobject = BasicAndroidObject.getStarObject();
				if( starobject != null )
					starobject._Free();
			}
		}	

        /* ImageViewClass Body */
        Service._GetObject("ImageViewClass")._Assign(new StarObjectClass(){
        	/* onCreateAndroid function */
        	public void onCreateAndroid( StarObjectClass self ){
        		StarObjectClass parent = (StarObjectClass)self._Get("_Parent");
        		StarObjectClass activity = (StarObjectClass)self._Call("getActivity");        		
        		StarCLEImageView imageview = new StarCLEImageView((Activity)WrapAndroidClass.GetAndroidObject(activity,"AndroidObject"),self);
        		WrapAndroidClass.SetAndroidObject(self,"AndroidObject",(Object)imageview);
        		if( parent != null ){
        			if( activity == parent ){
        				Activity android_activity = (Activity)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_activity.setContentView(imageview);
        			}else{
        				ViewGroup android_viewgroup = (ViewGroup)WrapAndroidClass.GetAndroidObject(parent,"AndroidObject");
        				android_viewgroup.addView(imageview);
        			}
        			self._LockGC();
        			self._Call("decAndroidRef");  // release with parent
        		}
        		return;
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  clearColorFilter(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public void  clearColorFilter(StarObjectClass self){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.clearColorFilter();
        		return;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public int  getBaseline(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public int  getBaseline(StarObjectClass self){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			return imagview.getBaseline();
        		return 0;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getDrawable(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @note not implemented
        	 */
        	public StarObjectClass  getDrawable(StarObjectClass self){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null ){
        			Drawable android_drawable = imagview.getDrawable();
        			if( android_drawable == null )
        				return null;
/*        			should new object based on drawable type
        			StarObjectClass matrix = Service._GetObject("DrawableClass")._New();
        			StarCLEMatrix star_matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(matrix,"AndroidObject");
        			star_matrix.SetAndroidObject(android_matrix);
        			return matrix;
*/        			
        		}
        		return null;
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public StarObjectClass  getImageMatrix(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @return the return value should be freed
        	 */
        	public StarObjectClass  getImageMatrix(StarObjectClass self){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null ){
        			Matrix android_matrix = imagview.getImageMatrix();
        			if( android_matrix == null )
        				return null;
        			StarObjectClass matrix = Service._GetObject("MatrixClass")._New();
        			StarCLEMatrix star_matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(matrix,"AndroidObject");
        			star_matrix.SetAndroidObject(android_matrix);
        			return matrix;
        		}
        		return null;
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public String getScaleType(StarObjectClass self) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @return "CENTER","CENTER_CROP","CENTER_INSIDE","FIT_CENTER","FIT_START","FIT_XY","MATRIX"
        	 */
        	public String getScaleType(StarObjectClass self){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null ){
        			android.widget.ImageView.ScaleType scaletype = imagview.getScaleType();
        			if( scaletype == ImageView.ScaleType.CENTER )
        				return "CENTER";
        			else if( scaletype == ImageView.ScaleType.CENTER_CROP )
        				return "CENTER_CROP";
        			else if( scaletype == ImageView.ScaleType.CENTER_INSIDE )
        				return "CENTER_INSIDE";
        			else if( scaletype == ImageView.ScaleType.FIT_CENTER )
        				return "FIT_CENTER";
        			else if( scaletype == ImageView.ScaleType.FIT_END )
        				return "FIT_END";
        			else if( scaletype == ImageView.ScaleType.FIT_START )
        				return "FIT_START";
        			else if( scaletype == ImageView.ScaleType.FIT_XY )
        				return "FIT_XY";
        			else if( scaletype == ImageView.ScaleType.MATRIX )
        				return "MATRIX";
        			else
        				return "CENTER";
        		}
        		return null;
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  invalidateDrawable(StarObjectClass self,StarObjectClass dr) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  invalidateDrawable(StarObjectClass self,StarObjectClass dr){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null || dr == null ){
        			BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(dr,"AndroidObject");
        			imagview.invalidateDrawable((Drawable)androidinterface.GetAndroidObject());
        		}
        	}    
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setAdjustViewBounds(StarObjectClass self,boolean adjustViewBounds) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setAdjustViewBounds(StarObjectClass self,boolean adjustViewBounds){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setAdjustViewBounds(adjustViewBounds);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setAlpha(StarObjectClass self,int alpha) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setAlpha(StarObjectClass self,int alpha){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setAlpha(alpha);
        	}           	 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setImageResource(StarObjectClass self,int resid) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setImageBitmap(StarObjectClass self,StarObjectClass bm){
        		StarCLEImageView imagview = (StarCLEImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null || bm == null ){
        			BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(bm,"AndroidObject");
        			imagview.setImageBitmap((Bitmap)androidinterface.GetAndroidObject());
        			imagview.AddRef(androidinterface);
        			bm._LockGC();
        			bm._Call("decAndroidRef");  // release with parent        			
        		}
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setImageDrawable(StarObjectClass self,StarObjectClass drawable) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param drawable will be freed with imageview
        	 */
        	public void  setImageDrawable(StarObjectClass self,StarObjectClass drawable){
        		StarCLEImageView imagview = (StarCLEImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null || drawable == null ){
        			BasicAndroidInterface androidinterface = (BasicAndroidInterface)WrapAndroidClass.GetAndroidObject(drawable,"AndroidObject");
        			imagview.setImageDrawable((Drawable)androidinterface.GetAndroidObject());
        			imagview.AddRef(androidinterface);
        			drawable._LockGC();
        			drawable._Call("decAndroidRef");  // release with parent        			
        		}
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setImageLevel(StarObjectClass self,int level) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setImageLevel(StarObjectClass self,int level){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setImageLevel(level);
        	}  
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setImageMatrix(StarObjectClass self,StarObjectClass matrix) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param matrix will be freed with imageview
        	 */
        	public void  setImageMatrix(StarObjectClass self,StarObjectClass matrix){
        		StarCLEImageView imagview = (StarCLEImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null || matrix == null ){
        			StarCLEMatrix star_matrix = (StarCLEMatrix)WrapAndroidClass.GetAndroidObject(matrix,"AndroidObject");
        			imagview.setImageMatrix((Matrix)star_matrix.GetAndroidObject());
        			imagview.AddRef(star_matrix);
        			matrix._LockGC();
        			matrix._Call("decAndroidRef");  // release with parent        			
        		}
        	}         	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setImageResource(StarObjectClass self,int resid) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void setImageResource(StarObjectClass self,int resid){
        		if( resid == 0 )
        			return;
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setImageResource(resid);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setImageState(StarObjectClass self,StarParaPkgClass state, boolean merge) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param state is set of integer
        	 */        	
        	public void  setImageState(StarObjectClass self,StarParaPkgClass state, boolean merge) {
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null || state == null ){
        			int number = state._Getint("_Number");
        			if( number == 0 )
        				return;
        			int[] value = new int[number];
        			for( int i=0; i < number; i++ )
        				value[i] = state._Toint(state._Get(i));
        			imagview.setImageState(value,merge);
        		}
        	}  
        	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setImageURI(StarObjectClass self,String uri) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void setImageURI(StarObjectClass self,String uri){
        		if( uri == null )
        			return;
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview == null )
        			return;
        		Uri imgUri=Uri.parse(uri);
        		imagview.setImageURI(imgUri);
        	}
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setMaxHeight(StarObjectClass self,int maxHeight) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public void  setMaxHeight(StarObjectClass self,int maxHeight){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setMaxHeight(maxHeight);
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setMaxWidth(StarObjectClass self,int maxWidth) </td></tr>
        	 *   </table>
        	 * </div>
        	 */
        	public void  setMaxWidth(StarObjectClass self,int maxWidth){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setMaxWidth(maxWidth);
        	}         	
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void setScaleType(StarObjectClass self,String scaleType) </td></tr>
        	 *   </table>
        	 * </div>
        	 * @param scaleType  "CENTER","CENTER_CROP","CENTER_INSIDE","FIT_CENTER","FIT_START","FIT_XY","MATRIX"
        	 */
        	public void setScaleType(StarObjectClass self,String scaleType){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null ){
        			if( scaleType.equals("CENTER"))
        				imagview.setScaleType(ImageView.ScaleType.CENTER);
        			else if( scaleType.equals("CENTER_CROP"))
        				imagview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        			else if( scaleType.equals("CENTER_INSIDE"))
        				imagview.setScaleType(ImageView.ScaleType.CENTER_INSIDE);        				
        			else if( scaleType.equals("FIT_CENTER"))
        				imagview.setScaleType(ImageView.ScaleType.FIT_CENTER);        				
        			else if( scaleType.equals("FIT_END"))
        				imagview.setScaleType(ImageView.ScaleType.FIT_END);        				
        			else if( scaleType.equals("FIT_START"))
        				imagview.setScaleType(ImageView.ScaleType.FIT_START);        				
        			else if( scaleType.equals("FIT_XY"))
        				imagview.setScaleType(ImageView.ScaleType.FIT_XY);        				
        			else if( scaleType.equals("MATRIX"))
        				imagview.setScaleType(ImageView.ScaleType.MATRIX);        				        		
        		}
        	} 
        	/**
        	 * <div class="memproto">
        	 *   <table class="memname">
        	 *     <tr><td class="memname">public void  setSelected(StarObjectClass self,boolean selected) </td></tr>
        	 *   </table>
        	 * </div>
        	 */        	
        	public void  setSelected(StarObjectClass self,boolean selected){
        		ImageView imagview = (ImageView)WrapAndroidClass.GetAndroidObject(self,"AndroidObject");
        		if( imagview != null )
        			imagview.setSelected(selected);
        	}          	
        });        
        
		return true;
	}	
}