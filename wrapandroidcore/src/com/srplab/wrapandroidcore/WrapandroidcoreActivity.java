package com.srplab.wrapandroidcore;

import android.os.Bundle;
import android.widget.Toast;
import android.graphics.Color;

import java.util.Hashtable;

import com.srplab.wrapandroid.*;
import com.srplab.www.starcore.*;

public class WrapandroidcoreActivity extends WrapAndroidActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	DumpInfoFlag = true;
    	//StarCoreFile = "http://www.srplab.com/android/starcore_armeabi_r5.zip";
        super.onCreate(savedInstanceState);  
//        setContentView(R.layout.main);

        /*-----------------function body------------------*/
        /*--for java, the following variable is defined in parent class
    	public StarCoreFactory starcore;
    	public StarSrvGroupClass SrvGroup;	
    	public StarServiceClass Service;
    	public StarObjectClass StarActivity;		
    	*/
                
        /*-----------------------------------------------------------------------------------------------
         *      telnet and webservice support        
		System.out.println(StarActivity._Call("getLocalIpAddress"));
		System.out.println("_SetTelnetPort = "+SrvGroup._SetTelnetPort(3010));
		System.out.println("_SetWebServerPort = "+SrvGroup._SetWebServerPort("",3040,100,0));
		StarActivity._Call("openWifi");
        -----------------------------------------------------------------------------------------------*/        
        
        StarObjectClass MyLayout = Service._GetObject("AbsoluteLayoutClass")._New(StarActivity);
/*        
        {   //---first example
            StarObjectClass MyText = Service._GetObject("TextViewClass")._New(MyLayout);
            MyText._Call("setText", "Hello");
            MyText._Call("setText", "we are all happy");
            MyText._Call("setAbsoluteLayoutParams",100,50,10,10);

            StarObjectClass MyButton = Service._GetObject("ButtonClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onClick(StarObjectClass self, Hashtable Ev){
            	    System.out.println(self+" event on click is trigger");
            	    return null;
            	}        	
            });
            MyButton._Call("setText", "Hello");
            MyButton._Call("setAbsoluteLayoutParams",100,50,10,100);
            
            StarObjectClass MyButton1 = Service._GetObject("ButtonClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onClick(StarObjectClass self, Hashtable Ev){
            	    System.out.println(self+" event on click is trigger");
            	    return null;
            	}        	
            });
            MyButton1._Call("setText", "............Hello");  
            MyButton1._Call("setAbsoluteLayoutParams",100,80,80,200);
            
            StarObjectClass MyRadioGroup = Service._GetObject("RadioGroupClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onCheckedChanged(StarObjectClass self, Hashtable Ev,String objid){
            	    System.out.println(self+" event on click is trigger"+objid);
            	    return null;
            	}  
            });
            MyRadioGroup._Call("setAbsoluteLayoutParams",300,100,400,100);
             
            StarObjectClass MyRadioButton1 = Service._GetObject("RadioButtonClass")._New(MyRadioGroup);
            MyRadioButton1._Call("setText", "Hello");
            StarObjectClass MyRadioButton2 = Service._GetObject("RadioButtonClass")._New(MyRadioGroup);
            MyRadioButton2._Call("setText", "Hello");

            StarObjectClass MyEdit = Service._GetObject("EditTextClass")._New(MyLayout);
            MyEdit._Call("setAbsoluteLayoutParams",300,50,200,50);
            
            StarObjectClass MyImageButton = Service._GetObject("ImageButtonClass")._New(MyLayout);
            MyImageButton._Call("setAbsoluteLayoutParams",100,100,240,200);
            MyImageButton._Call("setImageResource",R.drawable.ic_launcher);
            
            //Gallery
            StarObjectClass MyAdapter = Service._GetObject("AdapterClass")._New()._Assign(new StarObjectClass(){
            	public int getCount(StarObjectClass self){return 4;}  //aqua02-5
            	public Object getItem(StarObjectClass self,int position) { return position;  }
            	public int getItemId(StarObjectClass self,int position) {return position;}
            	public StarObjectClass getView(StarObjectClass self,int position, StarObjectClass convertView, StarObjectClass parent) {
            		StarObjectClass i = Service._GetObject("ImageViewClass")._New();
            		switch(position){
            		case 0 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "R.drawable.aqua02"))); break;
            		case 1 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "R.drawable.aqua03"))); break;
            		case 2 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "R.drawable.aqua04"))); break;
            		case 3 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "R.drawable.aqua05"))); break;
            		}
            		i._Call("setGalleryLayoutParams",100, 100);
            		i._Call("setScaleType","FIT_XY");
            		return i;
            	}
            });
            
            StarObjectClass MyGallery = Service._GetObject("GalleryClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onItemClick(StarObjectClass self, Hashtable Ev,String objid,int position,int id){
            	    System.out.println(self+" event on click is trigger"+objid+"position=  "+position+" id=  "+id);
            	    return null;
            	}          	
            });
            MyGallery._Call("setAdapter", MyAdapter);
            //MyGallery._Call("setAbsoluteLayoutParams",500,100,300,200);
            MyGallery._Call("setAbsoluteLayoutParams",200,200,500,200);        	
        }
*/      
/*        
        {   //second example
            StarObjectClass MyProgressBarClass = Service._GetObject("ProgressBarClass");
            MyProgressBarClass._SetNameInt("defStyle", android.R.attr.progressBarStyleHorizontal,true);
            StarObjectClass MyProgressBar = Service._GetObject("ProgressBarClass")._New(MyLayout);
            MyProgressBar._Call("setAbsoluteLayoutParams",200,20,10,10);
            MyProgressBar._Call("setMax",100);
            MyProgressBar._Call("setProgress",50);
            
            StarObjectClass MyStringArrayAdapter = Service._GetObject("StringArrayAdapterClass")._New();
            MyStringArrayAdapter._Call("setDropDownViewResource",android.R.layout.simple_spinner_dropdown_item);
            MyStringArrayAdapter._Call("add","red");
            MyStringArrayAdapter._Call("add","green");
            MyStringArrayAdapter._Call("add","blue");
            
            StarObjectClass MySpinner = Service._GetObject("SpinnerClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onItemSelected(StarObjectClass self, Hashtable Ev,String objid,int position,int id){
            	    System.out.println(self+" event on click is trigger"+objid+"position=  "+position+" id=  "+id);
            	    return null;
            	}          	
            });
            MySpinner._Call("setAbsoluteLayoutParams",200,50,10,50);
            MySpinner._Call("setAdapter", MyStringArrayAdapter);
            
            StarObjectClass MyAdapter = Service._GetObject("BaseAdapterClass")._New()._Assign(new StarObjectClass(){
            	public int getCount(StarObjectClass self){return 4;}  //aqua02-5
            	public Object getItem(StarObjectClass self,int position) { return position;  }
            	public int getItemId(StarObjectClass self,int position) {return position;}
            	public StarObjectClass getView(StarObjectClass self,int position, StarObjectClass convertView, StarObjectClass parent) {
            		StarObjectClass i;
            		if( convertView == null )
            			i = Service._GetObject("ImageViewClass")._New();
            		else
            			i = convertView;
            		switch(position){
            		case 0 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "drawable/aqua02"))); break;
            		case 1 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "drawable/aqua03"))); break;
            		case 2 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "drawable/aqua04"))); break;
            		case 3 : i._Call("setImageResource",StarActivity._Toint(StarActivity._Call("getResource", "drawable/aqua05"))); break;
            		}
            		i._Call("setGridViewLayoutParams",100, 100);
            		i._Call("setScaleType","FIT_CENTER");
            		i._Call("setPadding",5,5,5,5);
            		return i;
            	}
            });
            StarObjectClass MyGridView = Service._GetObject("GridViewClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onItemClick(StarObjectClass self, Hashtable Ev,String objid,int position,int id){
            	    System.out.println(self+" event on click is trigger"+objid+"position=  "+position+" id=  "+id);
            	    return null;
            	}          	
            });
            MyGridView._Call("setAbsoluteLayoutParams",300,200,10,120);
            MyGridView._Call("setAdapter", MyAdapter);
            MyGridView._Call("setNumColumns", 3);
            
            StarObjectClass MyAutoCompleteTextView = Service._GetObject("AutoCompleteTextViewClass")._New(MyLayout);
            MyAutoCompleteTextView._Call("setAbsoluteLayoutParams",200,50,400,10);
            MyAutoCompleteTextView._Call("setThreshold",1);
            MyAutoCompleteTextView._Call("setAdapter", MyStringArrayAdapter);

            StarObjectClass MyAnalogClock = Service._GetObject("AnalogClockClass")._New(MyLayout);
            MyAnalogClock._Call("setAbsoluteLayoutParams",100,100,400,70);
            
            StarObjectClass MyDigitalClock = Service._GetObject("DigitalClockClass")._New(MyLayout);
            MyDigitalClock._Call("setAbsoluteLayoutParams",100,50,550,70);        
            
            StarObjectClass MyTimePicker = Service._GetObject("TimePickerClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onTimeChanged(StarObjectClass self, Hashtable Ev,int hourOfDay, int minute){
            	    System.out.println(self+" event on click is trigger"+"hourOfDay=  "+hourOfDay+" minute=  "+minute);
            	    return null;
            	}          	
            });  
            MyTimePicker._Call("setAbsoluteLayoutParams",180,140,400,180);  
            
            StarObjectClass MyDatePicker = Service._GetObject("DatePickerClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onDateChanged(StarObjectClass self, Hashtable Ev,int year, int monthOfYear, int dayOfMonth){
            	    System.out.println(self+" event on click is trigger"+"year=  "+year+" monthOfYear=  "+monthOfYear);
            	    return null;
            	}          	
            });  
            MyDatePicker._Call("setAbsoluteLayoutParams",180,140,600,180);
        }
*/
/*        
        {   //  third example
            StarObjectClass MyStringArrayAdapter = Service._GetObject("StringArrayAdapterClass")._New()._Assign(new StarObjectClass(){
            	public StarObjectClass getView(StarObjectClass self,int position, StarObjectClass convertView, StarObjectClass parent) {
            		StarObjectClass i,itextview,imageView;
            		
            		i = Service._GetObject("LinearLayoutClass")._New();
            		int px = i._Toint(i._Call("dp2px",5));
            		i._Call("setPadding",px,px,px,px);
            		i._Call("setAbsListViewLayoutParams",Service._Getint("WRAP_CONTENT"),Service._Getint("WRAP_CONTENT"));
            		imageView = Service._GetObject("ImageViewClass")._New(i);
            		imageView._Call("setPadding",5,5,5,5);
            		imageView._Call("setLinearLayoutParams",20,20);
            		itextview = Service._GetObject("TextViewClass")._New(i); 
            		itextview._Call("setLinearLayoutParams",Service._Getint("WRAP_CONTENT"),Service._Getint("WRAP_CONTENT"));
            		switch( position ){
            		case 0 : itextview._Call("setText","Android");
                             imageView._Call("setImageResource",R.drawable.android_logo);
                             break;        		                 		
            		case 1 : itextview._Call("setText","WindowsMobile");
            		         imageView._Call("setImageResource",R.drawable.windowsmobile_logo);
            		         break;
            		case 2 : itextview._Call("setText","iOS");
    		                 imageView._Call("setImageResource",R.drawable.ios_logo);
    		                 break;
            		case 3 : itextview._Call("setText","Blackberry");
    		                 imageView._Call("setImageResource",R.drawable.blackberry_logo);
    		                 break;
            		}
            		return i;
            	}
            });
            MyStringArrayAdapter._Call("add","Android");
            MyStringArrayAdapter._Call("add","WindowsMobile");
            MyStringArrayAdapter._Call("add","iOS");
            MyStringArrayAdapter._Call("add","Blackberry");
            
            StarObjectClass MyListView = Service._GetObject("ListViewClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onItemClick(StarObjectClass self, Hashtable Ev,String objid,int position,int id){
            	    System.out.println(self+" event on click is trigger"+objid+"position=  "+position+" id=  "+id);
            	    return null;
            	}          	
            });
            MyListView._Call("setAbsoluteLayoutParams",300,200,10,10);
            MyListView._Call("setAdapter", MyStringArrayAdapter);        	
        }
*/        
/*        
        {   //forth example
            final StarObjectClass MyPaint = Service._GetObject("PaintClass")._New();  
            final StarObjectClass MyBitmapFactory = Service._GetObject("BitmapFactoryClass")._New();        
            StarObjectClass myView = Service._GetObject("ViewClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public void onDraw(StarObjectClass self,StarObjectClass canvas){
            		System.out.println("self draw");
            		self._Call("onSuperDraw", canvas);        		
            		MyPaint._Call("setColor",Color.BLUE);   
                    canvas._Call("drawRect",10, 20, 100, 100, MyPaint); 
                    
                    //android.R.drawable.progress_horizontal
                    StarObjectClass MyBitmap = (StarObjectClass)MyBitmapFactory._Call("decodeResource",StarActivity._Toint(StarActivity._Call("getResource","drawable/girl")));
                    canvas._Call("drawBitmap",MyBitmap, 100, 100, null);                
                    
                    StarObjectClass matrix=Service._GetObject("MatrixClass")._New();
                    matrix._Call("postScale",0.8f, 0.8f);
                    matrix._Call("postRotate",45);
                    StarObjectClass dstbmp=Service._GetObject("BitmapClass")._New();
                    dstbmp._Call("createBitmap0",MyBitmap,0,0,MyBitmap._Toint(MyBitmap._Call("getWidth")),MyBitmap._Toint(MyBitmap._Call("getHeight")),matrix,true);
                    canvas._Call("drawBitmap",dstbmp, 300, 200, null);
                    
                    matrix._Free();
                    dstbmp._Free();
                    MyBitmap._Free();
            	}
            });
            myView._Call("setAbsoluteLayoutParams",500,300,10,10);        	
        }
*/
/*        
        {   //fifth example
            StarObjectClass MyWebView = Service._GetObject("WebViewClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onProgressChanged(StarObjectClass self, Hashtable Ev,int progress){
            	    System.out.println(self+" event onProgressChanged is trigger "+progress);
            	    return null;
            	}
            	public Object[] onReceivedError(StarObjectClass self, Hashtable Ev,int errorCode, String description, String failingUrl){
            	    System.out.println(self+" event onReceivedError is trigger"+errorCode+"description=  "+description+" failingUrl=  "+failingUrl);
            	    return null;
            	}        	
            });
            MyWebView._Call("setAbsoluteLayoutParams",500,300,10,10);
            StarObjectClass MyWebSettings = (StarObjectClass)MyWebView._Call("getSettings");
            MyWebSettings._Call("setJavaScriptEnabled",true);
            MyWebSettings._Free();
            MyWebView._Call("loadUrl","http://www.srplab.com/");
        }
*/
/*        
        {   // sixth example
            StarObjectClass MyTableLayout = Service._GetObject("TableLayoutClass")._New(MyLayout);
            MyTableLayout._Call("setAbsoluteLayoutParams",500,300,10,10);
            StarObjectClass MyTableRow1 = Service._GetObject("TableRowClass")._New(MyTableLayout);
            StarObjectClass MyButton = Service._GetObject("ButtonClass")._New(MyTableRow1);
            MyButton._Call("setText", "hello world");
            MyButton._Call("setTableRowLayoutParams",Service._Getint("FILL_PARENT"),Service._Getint("WRAP_CONTENT"));        
            StarObjectClass MyButton1 = Service._GetObject("ButtonClass")._New(MyTableRow1);
            MyButton1._Call("setText", "hello world1");
            MyButton1._Call("setTextColor", 0xFFFF0000);
            MyButton1._Call("setTextSize", 30);
            MyButton1._Call("setTableRowLayoutParams",Service._Getint("FILL_PARENT"),Service._Getint("WRAP_CONTENT"));        
            
            StarObjectClass MyMediaPlayer = Service._GetObject("MediaPlayerClass")._New()._Assign(new StarObjectClass(){
            	public Object[] onPrepared(StarObjectClass self, Hashtable Ev){
            	    System.out.println(self+" event onPrepared is trigger ");
            	    return null;
            	}
            	public Object[] onCompletion(StarObjectClass self, Hashtable Ev){
            	    System.out.println(self+" event onCompletion is trigger");
            	    return null;
            	}        	
            });
            //MyMediaPlayer._Call("setDataSource","/sdcard/srplab/aaa.mp3");
            //MyMediaPlayer._Call("prepare");
            //MyMediaPlayer._Call("start");
            
            StarObjectClass MyAssetFileDescriptor = (StarObjectClass)StarActivity._Call("getAssetFileDescriptor","aaa.mp3");
            if( MyAssetFileDescriptor != null ){
                MyMediaPlayer._Call("setDataSource2",MyAssetFileDescriptor,MyAssetFileDescriptor._Toint(MyAssetFileDescriptor._Call("getStartOffset")),MyAssetFileDescriptor._Toint(MyAssetFileDescriptor._Call("getLength")));
                MyAssetFileDescriptor._Call("close");
                MyMediaPlayer._Call("prepare");
                MyMediaPlayer._Call("start");        	
            }
        }
*/
/*        
        {   // seventh example
            StarObjectClass MyIntent = Service._GetObject("IntentClass")._New();
            MyIntent._Call("setAction","android.intent.action.VIEW");
            MyIntent._Call("setData","http://www.google.com");
            StarActivity._Call("startActivity",MyIntent);         	
        }
*/        
/*
        {   // eighth example
            StarObjectClass MyAlertDialogPlayer = Service._GetObject("AlertDialogClass")._New()._Assign(new StarObjectClass(){
            	public Object[] onClick(StarObjectClass self, Hashtable Ev,int which){
            	    System.out.println(self+" event onClick is trigger ="+which);
            	    return null;
            	}
            });  
            //MyAlertDialogPlayer._Call("setMessage","Confirm?");
            MyAlertDialogPlayer._Call("setView",Service._GetObject("EditTextClass")._New());
            MyAlertDialogPlayer._Call("setTitle","Information");
            MyAlertDialogPlayer._Call("setButton",-1,"Ok");
            MyAlertDialogPlayer._Call("setButton",-2,"Cancel");
            
            MyAlertDialogPlayer._Call("show");        	
        }
*/       
/*        
        {     	
    		StarActivity = StarActivity._Assign(new StarObjectClass(){
            	public boolean onTouchEvent(StarObjectClass self, StarObjectClass event){
            	    System.out.println(self+" event onTouchEvent is trigger = "+event);
            	    return false;
            	}
    		});
    	}   
*/
/*        
        {   // ninth example
        	final StarObjectClass mDrawable = Service._GetObject("ShapeDrawableClass")._New();
        	mDrawable._Call("init",Service._GetObject("OvalShapeClass")._New());
        	StarObjectClass mPaint = (StarObjectClass)mDrawable._Call("getPaint");
        	mPaint._Call("setColor",0xff74AC23);
        	mDrawable._Call("setBounds",10,10,10+300,10+50);
        	
            StarObjectClass myView = Service._GetObject("ViewClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public void onDraw(StarObjectClass self,StarObjectClass canvas){
            		System.out.println("self draw");
            		self._Call("onSuperDraw", canvas);
            		canvas._Call("drawColor",0xFFFFFFFF);
            		mDrawable._Call("draw",canvas);
            	}
            });
            myView._Call("setAbsoluteLayoutParams",300,50,10,10);
        }
*/        
/*        
        {   // tenth example
            StarObjectClass myView = Service._GetObject("ViewClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public void onDraw(StarObjectClass self,StarObjectClass canvas){
            		self._Call("onSuperDraw", canvas);
            		StarObjectClass paint = Service._GetObject("PaintClass")._New();
            		StarObjectClass font = Service._GetObject("TypefaceClass")._New();
            		font._Call("create","����",1);
            		paint._Call("setColor",0xFFFF0000);
            		paint._Call("setTypeface",font);
            		paint._Call("setTextSize",22);
            		canvas._Call("drawText","hello world",0,30,paint);
            		paint._Free();
            		font._Free();
            	}
            });
            myView._Call("setAbsoluteLayoutParams",300,200,10,10);        	        
        }
*/     
        {   // eleventh example
            StarObjectClass MyButton = Service._GetObject("ButtonClass")._New(MyLayout)._Assign(new StarObjectClass(){
            	public Object[] onClick(StarObjectClass self, Hashtable Ev){
            		StarObjectClass MyToast = Service._GetObject("ToastClass")._New();
                	MyToast._Call("makeText","Button is click", 0);
                	MyToast._Call("show");
                	return null;
            	}        	
            });
            MyButton._Call("setText", "Hello");
            MyButton._Call("setAbsoluteLayoutParams",100,50,10,100);        	        	
        }        
    }
}