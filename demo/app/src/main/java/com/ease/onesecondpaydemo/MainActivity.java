package com.ease.onesecondpaydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

 	int a=1;

int i=0;
//测试第一次提交 feel good

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNormal = (Button) findViewById(R.id.btn_normal);
        Button btnFrontActivity = (Button) findViewById(R.id.btn_front_activity);
        Button btnFrontDialog = (Button) findViewById(R.id.btn_front_dialog);
        btnNormal.setOnClickListener(this);
        btnFrontActivity.setOnClickListener(this);
        btnFrontDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn_normal:
                intent = new Intent(getApplicationContext(), NormalActivity.class);
                break;
            case R.id.btn_front_activity:
                intent = new Intent(getApplicationContext(), CustomPayActivity.class);
                break;
            case R.id.btn_front_dialog:
//                intent = new Intent(getApplicationContext(), CustomPayDialogActivity.class);
                break;
        }
        startActivity(intent);
    }
}
