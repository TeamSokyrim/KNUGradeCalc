package com.example.knuapp;

import android.util.Log;

/**
 * Created by GW on 2017-03-24.
 */

public class LoginFunction {
    boolean success = false;
    String deb;

    LoginFunction (String deb){
        this.deb = deb;
    }

    boolean testing() {
        Log.v("PasTag", "Testing" + deb);
        String identCode = deb.substring(104,108);
        Log.v("PasTag", "Testing22" + identCode);

        if(identCode.equals("Lang")) {
            Log.v("PasTag_Testing Result","Success");
            return true;
        }
        else {
            Log.v("PasTag_Testing Result","Fail");
            return false;
        }
    }


}
