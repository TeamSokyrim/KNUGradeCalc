package com.example.knuapp;


import android.util.Log;

import java.net.CookieStore;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

public class SessionControl
{

    static public String MainUrl = "http://yes.knu.ac.kr";
    static public DefaultHttpClient httpclient = null;
    static public List<Cookie> cookies;

    public static HttpClient getHttpclient()
    {
        if( httpclient == null){
            SessionControl.setHttpclient(new DefaultHttpClient());
        }
        return httpclient;
    }

    public static String getUrlContet(String get)
    {
        HttpGet g;
        try {
            getHttpclient();
            g = new HttpGet(MainUrl+get);
            Log.v("TAG","URL: "+ MainUrl+get);
            return EntityUtils.toString(httpclient.execute(g).getEntity(),"UTF-8");
        }
        catch(Exception e)
        {
            Log.v("TAG", "An Exception given because of getUrl :" + e);
            e.printStackTrace();
        }
        return null;
    }

    public static void setHttpclient(DefaultHttpClient httpclient) {
        SessionControl.httpclient = httpclient;
    }
}
