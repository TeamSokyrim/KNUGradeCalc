package com.example.knuapp;

import android.util.Log;
import android.widget.Toast;

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
        String identCode = deb.substring(2,5);
        Log.v("PasTag", "Testing22" + identCode);

        return false;
    }


}
