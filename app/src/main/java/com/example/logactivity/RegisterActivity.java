package com.example.logactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {


    private ArrayAdapter adapter;
    private Spinner spinner;

//    스피너1
//    String[] dodo ={
//      "충남","서울","경기도"
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


//       스피너 사용할때 스피너1처럼 배열로 만들어서 사용해도 되고 지금 방법처럼 values에 파일로 따로 빼서 사용해도됨
        spinner= (Spinner) findViewById(R.id.majorSpinner);
        adapter =ArrayAdapter.createFromResource(this,R.array.major, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

//        스피너1
//        spinner= (Spinner) findViewById(R.id.majorSpinner);
//        adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dodo);
//        spinner.setAdapter(adapter);



    }
}