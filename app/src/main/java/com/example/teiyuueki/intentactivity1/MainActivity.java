package com.example.teiyuueki.intentactivity1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ウィジェットと結び付ける
        Button btnNext=(Button) findViewById(R.id.buttonStart);
        ViewPager mViewPager = (ViewPager)findViewById(R.id.viewpager);

        PagerAdapter mPagerAdapter = new MyPagerAdapter();

        mViewPager.setAdapter(mPagerAdapter);
        btnNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // インテントの生成
                Intent intent = new Intent(MainActivity.this, SecoundActivity.class);
                // 実行
                startActivity(intent);
            }
        });

    }
    private class MyPagerAdapter extends PagerAdapter {
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // レイアウトファイル名を配列で指定します。
            int[] pages = {R.layout.page1, R.layout.page2, R.layout.page3,R.layout.page4,R.layout.page5};

            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View layout ;
            layout = inflater.inflate(pages[position], null);
            ((ViewPager) container).addView(layout);
            return layout;
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeView((View)object);
        }

        @Override
        public int getCount() {
            // ページ数を返します。
            return 5;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view.equals(object);
        }
    }
}