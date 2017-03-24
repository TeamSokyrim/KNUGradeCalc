package com.example.knuapp;

import android.util.Log;

import java.util.regex.Pattern;

/**
 * Created by 함상혁입니다 on 2017-03-24.
 */

public class GradeParsing {
    String[] splitArray;

    GradeParsing(String raw)
    {
        Log.v("TAG","start parse");
        Pattern pattern = Pattern.compile("data\">");
        String[] splitArray=pattern.split(raw);

        int i=0;
        for(String s:splitArray)
        {
            Log.v("TAG",i+":"+s);
            i++;
        }
        splitParsing(splitArray[2]);
    }

    class gradeBlock
    {
        String semester;
        String type;
        String subName;
        int point;
        String grade;
        float gradePoint;

        public gradeBlock(String s,String t,String sn,String p,String g,String gp)
        {
            semester=s;
            type=t;
            subName=sn;
            point=Integer.parseInt(p);
            grade=g;
            gradePoint=Float.parseFloat(gp);
        }

    }

    void splitParsing(String split)
    {
        Pattern pattern = Pattern.compile("<.*currentValue.*>");

        String[] value=pattern.split(split);

        for(String s:value)
        {
            Log.v("SPLIT",s);
        }

        //gradeBlock gb=new gradeBlock(value[0],value[1],value[2],value[3],value[4],value[5]);

       // return gb;
    }


}
