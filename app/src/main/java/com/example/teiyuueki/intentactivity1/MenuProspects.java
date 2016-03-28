package com.example.teiyuueki.intentactivity1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MenuProspects extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        // ウィジェットと結び付ける
        Button btnSearch = (Button) findViewById(R.id.srh);
        Button btnProspect = (Button) findViewById(R.id.prs);
        Button btnMessage = (Button) findViewById(R.id.msg);
        Button btnPerson = (Button) findViewById(R.id.psn);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // インテントの生成
                Intent intent = new Intent(MenuProspects.this, MenuProspects.class);
                // 実行
                startActivity(intent);
            }
        });
        btnProspect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // インテントの生成
                Intent intent = new Intent(MenuProspects.this, MenuProspects.class);
                // 実行
                startActivity(intent);
            }
        });
        btnMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // インテントの生成
                Intent intent = new Intent(MenuProspects.this, MenuProspects.class);
                // 実行
                startActivity(intent);
            }
        });
        btnPerson.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // インテントの生成
                Intent intent = new Intent(MenuProspects.this, MenuPersonal.class);
                // 実行
                startActivity(intent);
            }
        });
    }


}
