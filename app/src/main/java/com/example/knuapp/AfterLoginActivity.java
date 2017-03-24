package com.example.knuapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by GW on 2017-03-25.
 */

public class AfterLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
    }


//
//    public void onBackButtonClicked(View v) {
//        Toast.makeText(getApplicationContext(), "돌아가기 버튼 클릭", Toast.LENGTH_LONG).show();
//        finish();
//    }
}
