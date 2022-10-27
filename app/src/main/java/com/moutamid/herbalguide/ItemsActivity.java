package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemsActivity extends AppCompatActivity {

    /*CircleImageView image1, image2, image3;
    TextView title1, title2, title3;*/
    TextView page1, page2, page3, page4, page5;
    ImageView next, prev;
    boolean enabled = true;
    int count = 1;
    RecyclerView recyclerView;
    ItemDetailModel model;
    ArrayList<ItemDetailModel> list;
    ItemAdapter adapter;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        /*image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);

        title1 = findViewById(R.id.name1);
        title2 = findViewById(R.id.name2);
        title3 = findViewById(R.id.name3);*/

        list = new ArrayList<>();

        recyclerView = findViewById(R.id.itemsRC);
        searchView = findViewById(R.id.search_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);

        list.add(new ItemDetailModel(R.drawable.i1, "Matricaria Chamomilla", "البابونج الحقيقي او الالماني"));
        list.add(new ItemDetailModel(R.drawable.i2, "Nigella sativia", "الحبة السوداء"));
        list.add(new ItemDetailModel(R.drawable.i3, "Alo vera, Aloe barabadensis, Aloe capennsis", "الصبار"));
        list.add(new ItemDetailModel(R.drawable.i4, "Origanum syriacum", "البردقوش "));
        list.add(new ItemDetailModel(R.drawable.i5, "Coeffia arabica", "البن (القهوة)"));
        list.add(new ItemDetailModel(R.drawable.i6, "Salvia officinalis", "المريمية"));
        list.add(new ItemDetailModel(R.drawable.i7, "Rosmarinus officinalis", "اكليل الجبل"));
        list.add(new ItemDetailModel(R.drawable.i8, "Glycyrrhiza glabra", "عرق السوس"));
        list.add(new ItemDetailModel(R.drawable.i9, "Zingiber officinalle", "الزنجبيل"));
        list.add(new ItemDetailModel(R.drawable.i11, "Senna alexandrina", "السنا"));
        list.add(new ItemDetailModel(R.drawable.i12, "Camellia sinesis", "الشاي الاخضر"));
        list.add(new ItemDetailModel(R.drawable.i13, "Panax quinquefol", "الجنسنغ( الامريكي )"));
        list.add(new ItemDetailModel(R.drawable.i14, "Mellisa officinalis", "المليسة"));
        list.add(new ItemDetailModel(R.drawable.i15, "Hibiscus sabdariffa", "الكركديه"));
        list.add(new ItemDetailModel(R.drawable.i16, "Calendula officinalis", "الاقحوان"));
        list.add(new ItemDetailModel(R.drawable.i17, "Thymus vulgaris", "الزعتر"));
        list.add(new ItemDetailModel(R.drawable.i18, "Myrtus communis", "الاس (الريحان)"));
        list.add(new ItemDetailModel(R.drawable.i19, "Lavandula angustifolia", "الخزامى"));
        list.add(new ItemDetailModel(R.drawable.i20, "Pimpinella anisum", "اليانسون"));
        list.add(new ItemDetailModel(R.drawable.i21, "Taraxacum officinale", "الهندباء "));
        list.add(new ItemDetailModel(R.drawable.i22, "Eucalyptus camaldulensis", "الاوكاليبتوس ( الكافور)"));
        list.add(new ItemDetailModel(R.drawable.i23, "Trigonella foenum -graecum", "الحلبة"));
        list.add(new ItemDetailModel(R.drawable.i24, "Curcuma longa", "الكركم"));
        list.add(new ItemDetailModel(R.drawable.i25, "Equisetaceaearvense", "ذنب الخيل"));
        list.add(new ItemDetailModel(R.drawable.i26, "Ammi visnaga", "الخلة"));
        list.add(new ItemDetailModel(R.drawable.i27, "Paronychia argentea", "زهرة الالماسة"));

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        page1 = findViewById(R.id.p1);
        page2 = findViewById(R.id.p2);
        page3 = findViewById(R.id.p3);
        page4 = findViewById(R.id.p4);
        page5 = findViewById(R.id.p5);

        next = findViewById(R.id.nextBtn);
        prev = findViewById(R.id.backbtn);

        pageOne();

        next.setOnClickListener(v -> {
            if (count == 1){
                pageTwo();
                count = 2;
            } else if (count == 2){
                pageThree();
                count = 3;
            } else if (count == 3){
                pageFour();
                count = 4;
            } else if (count == 4){
                pageFive();
                count = 5;
            } else if (count == 5){
                pageSix();
                page1.setText("6");
                page2.setText("7");
                page3.setText("8");
                page4.setText("9");
                page5.setText("10");
                enabled = false;
                count = 6;
            } else if (count == 6){
                pageSeven();
                count = 7;
            } else if (count == 7){
                pageEight();
                count = 8;
            } else if (count == 8){
                pageNine();
                count = 9;
            }
        });

        prev.setOnClickListener(v -> {
            if (count == 2){
                pageOne();
                count = 1;
            } else if (count == 3){
                pageTwo();
                count = 2;
            } else if (count == 4){
                pageThree();
                count = 3;
            } else if (count == 5){
                pageFour();
                count = 4;
            } else if (count == 6){
                pageFive();
                page1.setText("1");
                page2.setText("2");
                page3.setText("3");
                page4.setText("4");
                page5.setText("5");
                enabled = true;
                count = 5;
            } else if (count == 7){
                pageSix();
                count = 6;
            } else if (count == 8){
                pageSeven();
                count = 7;
            } else if (count == 9){
                pageEight();
                count = 8;
            }
        });

        page1.setOnClickListener(v -> {
            if (enabled){
                pageOne();
                count = 1;
            } else {
                pageSix();
                count = 6;
            }
        });
        page2.setOnClickListener(v -> {
            if (enabled){
                pageTwo();
                count = 2;
            } else {
                pageSeven();
                count = 7;
            }
        });
        page3.setOnClickListener(v -> {
            if (enabled){
                pageThree();
                count = 3;
            } else {
                pageEight();
                count = 8;
            }
        });
        page4.setOnClickListener(v -> {
            if (enabled){
                pageFour();
                count = 4;
            } else {
                pageNine();
                count = 9;
            }
        });
        page5.setOnClickListener(v -> {
            if (enabled){
                pageFive();
                count = 5;
            }
        });
    }

    private void pageNine() {

        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.blue));
        page5.setTextColor(getResources().getColor(R.color.blue));
        page5.setVisibility(View.GONE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page5.setBackground(getResources().getDrawable(R.drawable.border_blue));
    }

    private void pageEight() {

        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.blue));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.black));
        page5.setVisibility(View.GONE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }

    private void pageSeven() {

        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.blue));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.black));
        page5.setVisibility(View.GONE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }

    private void pageSix() {

        page1.setTextColor(getResources().getColor(R.color.blue));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.black));
        page5.setVisibility(View.GONE);

        page1.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }

    private void pageFive() {

        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.blue));
        page5.setVisibility(View.VISIBLE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.border_blue));
    }

    private void pageFour() {


        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.blue));
        page5.setTextColor(getResources().getColor(R.color.black));
        page5.setVisibility(View.VISIBLE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }

    private void pageThree() {

        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.blue));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.black));
        page5.setVisibility(View.VISIBLE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }

    private void pageTwo() {

        page1.setTextColor(getResources().getColor(R.color.black));
        page2.setTextColor(getResources().getColor(R.color.blue));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.black));
        page5.setVisibility(View.VISIBLE);

        page1.setBackground(getResources().getDrawable(R.drawable.edittext));
        page2.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }

    private void pageOne() {

        page1.setTextColor(getResources().getColor(R.color.blue));
        page2.setTextColor(getResources().getColor(R.color.black));
        page3.setTextColor(getResources().getColor(R.color.black));
        page4.setTextColor(getResources().getColor(R.color.black));
        page5.setTextColor(getResources().getColor(R.color.black));

        page1.setBackground(getResources().getDrawable(R.drawable.border_blue));
        page2.setBackground(getResources().getDrawable(R.drawable.edittext));
        page3.setBackground(getResources().getDrawable(R.drawable.edittext));
        page4.setBackground(getResources().getDrawable(R.drawable.edittext));
        page5.setBackground(getResources().getDrawable(R.drawable.edittext));
    }
}