package com.jaiky.publishpopup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout llBtnMenu;

    PublishDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llBtnMenu = (LinearLayout) findViewById(R.id.llBtnMenu);
        llBtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pDialog == null) {
                    pDialog = new PublishDialog(MainActivity.this);
                    pDialog.setArticleBtnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                        }
                    });
                    pDialog.setMiniBlogBtnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                        }
                    });
                    pDialog.setPhotoBtnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                        }
                    });
                    pDialog.setLetterBtnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, "显示相册发布界面", Toast.LENGTH_LONG).show();
                        }
                    });
                }
                pDialog.show();
            }
        });
    }
}
