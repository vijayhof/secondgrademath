package com.hcsn.kidbook.secondgrademath;

import com.hcsn.kidbook.framework.BasicWebView2;
import com.hcsn.kidbook.framework.BasicWebView;
import android.os.Bundle;
import com.google.ads.*;

public class StartActivity extends BasicWebView2
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    	// TODO - http://192.168.0.107/~vpalaiya/adjuggler.html
        setLaunchURL("http://hcsnsgm34.appspot.com/secondgrademath/home.html");
//        setLaunchURL("http://192.168.0.107/~vpalaiya/adjuggler.html"); 
        super.onCreate(savedInstanceState);
    }

}
