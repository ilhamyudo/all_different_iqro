package com.iqro.agung.projectiqro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

public class MetodeIqro1 extends FragmentActivity {


    public PageIndicator mIndicator;
    private ViewPager awesomePager;
    private PagerAdapter pm;

    ArrayList<Category1> codeCategory;

    String deviceNames[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
            "24", "25", "26","27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
            "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
            "50", "51", "52","53", "54", "55", "56", "57", "58", "59", "60", "61", "62",
            "63", "64", "65", "66", "67", "68", "69", "70", "71", "72","73", "74", "75", "76", "77", "78", "79", "80", "81",
            "82", "83", "84", "85", "86", "87", "88", "89", "90" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqro1);
        awesomePager = (ViewPager) findViewById(R.id.pager);
        mIndicator = (PageIndicator) findViewById(R.id.pagerIndicator);

        ArrayList<String> a = new ArrayList<String>();

        Category1 m = new Category1();
        for (int i = 0; i < deviceNames.length; i++) {
            a.add(i, deviceNames[i]);
            m.name = a.get(i);
        }

        codeCategory = new ArrayList<Category1>();
        codeCategory.add(m);

        Iterator<String> it = a.iterator();

        List<GridFragment1> GridFragments = new ArrayList<GridFragment1>();
        it = a.iterator();

        int i = 0;
        while (it.hasNext()) {
            ArrayList<GridItems1> itmLst = new ArrayList<GridItems1>();

            GridItems1 itm = new GridItems1(0, it.next());
            itmLst.add(itm);
            i = i + 1;

            if (it.hasNext()) {GridItems1 itm1 = new GridItems1(1, it.next());itmLst.add(itm1);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm2 = new GridItems1(2, it.next());itmLst.add(itm2);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm3 = new GridItems1(3, it.next());itmLst.add(itm3);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm4 = new GridItems1(4, it.next());itmLst.add(itm4);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm5 = new GridItems1(5, it.next());itmLst.add(itm5);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm6 = new GridItems1(6, it.next());itmLst.add(itm6);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm7 = new GridItems1(7, it.next());itmLst.add(itm7);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm8 = new GridItems1(8, it.next());itmLst.add(itm8);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm9 = new GridItems1(9, it.next());itmLst.add(itm9);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm10 = new GridItems1(10, it.next());itmLst.add(itm10);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm11 = new GridItems1(11, it.next());itmLst.add(itm11);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm12 = new GridItems1(12, it.next());itmLst.add(itm12);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm13 = new GridItems1(13, it.next());itmLst.add(itm13);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm14 = new GridItems1(14, it.next());itmLst.add(itm14);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm15 = new GridItems1(15, it.next());itmLst.add(itm15);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm16 = new GridItems1(16, it.next());itmLst.add(itm16);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm17 = new GridItems1(17, it.next());itmLst.add(itm17);i = i + 1;}
            if (it.hasNext()) {GridItems1 itm18 = new GridItems1(18, it.next());itmLst.add(itm18);i = i + 1;}
            if (it.hasNext()) { GridItems1 itm19 = new GridItems1(19, it.next()); itmLst.add(itm19); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm20 = new GridItems1(20, it.next()); itmLst.add(itm20); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm21 = new GridItems1(21, it.next()); itmLst.add(itm21); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm22 = new GridItems1(22, it.next()); itmLst.add(itm22); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm23 = new GridItems1(23, it.next()); itmLst.add(itm23); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm24 = new GridItems1(24, it.next()); itmLst.add(itm24); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm25 = new GridItems1(25, it.next()); itmLst.add(itm25); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm26 = new GridItems1(26, it.next()); itmLst.add(itm26); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm27 = new GridItems1(27, it.next()); itmLst.add(itm27); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm28 = new GridItems1(28, it.next()); itmLst.add(itm28); i = i + 1;}
            if (it.hasNext()) { GridItems1 itm29 = new GridItems1(29, it.next()); itmLst.add(itm29); i = i + 1;}


            GridItems1[] gp = {};
            GridItems1[] gridPage = itmLst.toArray(gp);
            GridFragments.add(new GridFragment1(gridPage, MetodeIqro1.this));
        }

        pm = new PagerAdapter(getSupportFragmentManager(), GridFragments);
        awesomePager.setAdapter(pm);
        mIndicator.setViewPager(awesomePager);

    }


    private class PagerAdapter extends FragmentStatePagerAdapter {
        private List<GridFragment1> fragments;

        public PagerAdapter(FragmentManager fm, List<GridFragment1> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }
    public void OnClickSlideIqro1(View v){
        if(v.getId() == R.id.btnBackHome) {
            Intent i = new Intent(MetodeIqro1.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }
    }
}
