package com.example.knuapp;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by 함상혁입니다 on 2017-03-24.
 */

public class ShowGradeTask extends AsyncTask<Void,String,String>{

    TextView txtResult;
    String  Deb="default";
    String gradeUrl="/cour/scor/certRec/certRecEnq/listCertRecEnqs.action?certRecEnq.recDiv=1&id" +
            "=certRecEnqGrid&columnsProperty=certRecEnqColumns&" +
            "rowsProperty=certRecEnqs&emptyMessageProperty=certRecEnqNotFoundMessage&viewColumn" +
            "=yr_trm%2Csubj_div_cde%2Csubj_cde%2Csubj_nm%2Cunit%2Crec_rank_cde&checkable=false" +
            "&showRowNumber=false&paged=false&serverSortingYn=false&lastColumnNoRender=false&_=";


    public ShowGradeTask(TextView txt)
    {
        txtResult=txt;
    }

    @Override
    protected String doInBackground(Void... params) {
        Deb = SessionControl.getUrlContet(gradeUrl);

        //   gradeUrl="http://yes.knu.ac.kr"+gradeUrl;
        //HttpPost httpPost = new HttpPost(gradeUrl);
        //httpClient=SessionControl.getHttpclient();
//                HttpGet get=new HttpGet(gradeUrl);
//                HttpResponse httpResponse = httpClient.execute(get);
//                Deb = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
        Log.v("TAG","Deb 33 : "+Deb);

        publishProgress(Deb);
        GradeParsing gp=new GradeParsing(Deb);

        return Deb;
    }

    protected void onProgressUpdate(String... params)
    {

        txtResult.setText(params[0]);

    }
}
