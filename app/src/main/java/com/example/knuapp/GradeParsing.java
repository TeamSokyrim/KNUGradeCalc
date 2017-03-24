package com.example.knuapp;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 함상혁입니다 on 2017-03-24.
 */

public class GradeParsing {
    String[] splitArray;

    gradeBlock[] subjects=new gradeBlock[100];

    GradeParsing(String raw)
    {
        Log.v("TAG","start parse");
        Pattern pattern = Pattern.compile("data\">");
        String[] splitArray=pattern.split(raw);

        for(int i=0;i<splitArray.length-2;i++)
        {
            subjects[i]=splitParsing(splitArray[i+2]);
            Log.v("Parsing Complete","학기 : "+subjects[i].semester+" 분류 : "+subjects[i].type+ " 코드 : "+subjects[i].subCode+" 이름 : "+subjects[i].subName
            +" 학점 : "+subjects[i].point+ " 등급  : "+subjects[i].grade+" 점수  : "+subjects[i].gradePoint);
        }
    }

    class gradeBlock
    {
        String semester;
        String type;
        String subCode;
        String subName;

        String point;
        String grade;
        String gradePoint;

        public gradeBlock(String s,String t,String c,String sn,String p,String g,String gp)
        {
            semester=s;
            type=t;
            subCode=c;
            subName=sn;
            //point=Integer.parseInt(p);
            point=p;
            grade=g;
           // gradePoint=Float.parseFloat(gp);
            gradePoint=gp;
        }

    }

    gradeBlock splitParsing(String split)
    {
        String[] values=new String[7];
        Pattern p=Pattern.compile("originalValue[^>]*>([^<]*)<");
        Matcher m=p.matcher(split);

        int i=0;
        while(m.find()){
            values[i++]=m.group(1);
        }


        gradeBlock gb=new gradeBlock(values[0],values[1],values[2],values[3],values[4],values[5],values[6]);

        return gb;
       // return gb;
    }


}
