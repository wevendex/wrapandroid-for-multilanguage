SrvGroup = libstarpy._GetSrvGroup()
Service = SrvGroup._GetService("","")

#--get activity
StarActivity = Service.ActivityClass.getCurrent();

#--create AbsoluteLayout        
MyLayout = Service.AbsoluteLayoutClass._New(StarActivity);

#--create Button
MyButton = Service.ButtonClass._New(MyLayout);
MyButton.setText("Hello");
MyButton.setAbsoluteLayoutParams(100,50,10,100);
def MyButton_onClick(self,Event) :
    toast = Service.ToastClass._New();
    toast.makeText("Button is click", 0).show();
    toast._LockGC(); 
    return;
MyButton.onClick = MyButton_onClick;    

