package com.moutamid.herbalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemsActivity extends AppCompatActivity {

    CircleImageView image1, image2, image3;
    TextView title1, title2, title3;
    TextView page1, page2, page3, page4, page5;
    ImageView next, prev;
    boolean enabled = true;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);

        title1 = findViewById(R.id.name1);
        title2 = findViewById(R.id.name2);
        title3 = findViewById(R.id.name3);

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
            }
            if (count == 2){
                pageThree();
                count = 3;
            }
            if (count == 3){
                pageFour();
                count = 4;
            }
            if (count == 4){
                pageFive();
                count = 5;
            }
            if (count == 5){
                pageSix();
                page1.setText("6");
                page2.setText("7");
                page3.setText("8");
                page4.setText("9");
                page5.setText("10");
                enabled = false;
                count = 6;
            }
            if (count == 6){
                pageSeven();
                count = 7;
            }
            if (count == 7){
                pageEight();
                count = 8;
            }
            if (count == 8){
                pageNine();
                Toast.makeText(this, ""+count, Toast.LENGTH_SHORT).show();
            }
        });

        prev.setOnClickListener(v -> {
            if (count == 2){
                pageOne();
                count = 1;
            }
            if (count == 3){
                pageTwo();
                count = 2;
            }
            if (count == 4){
                pageThree();
                count = 3;
            }
            if (count == 5){
                pageFour();
                count = 4;
            }
            if (count == 6){
                pageFive();
                page1.setText("1");
                page2.setText("2");
                page3.setText("3");
                page4.setText("4");
                page5.setText("5");
                enabled = true;
                count = 5;
            }
            if (count == 7){
                pageSix();
                count = 6;
            }
            if (count == 8){
                pageSeven();
                count = 7;
            }
            if (count == 9){
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
        image1.setImageResource(R.drawable.i26);
        image2.setImageResource(R.drawable.i27);
        image3.setImageResource(0);

        title1.setText("Ammi visnaga");
        title2.setText("Paronychia argentea");
        title3.setText("");

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
        image1.setImageResource(R.drawable.i23);
        image2.setImageResource(R.drawable.i24);
        image3.setImageResource(R.drawable.i25);

        title1.setText("Trigonella foenum -graecum");
        title2.setText("Curcuma longa");
        title3.setText("Equisetaceaearvense");

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
        image1.setImageResource(R.drawable.i20);
        image2.setImageResource(R.drawable.i21);
        image3.setImageResource(R.drawable.i22);

        title1.setText("Pimpinella anisum");
        title2.setText("Taraxacum officinale");
        title3.setText("Eucalyptus camaldulensis ");

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
        image1.setImageResource(R.drawable.i17);
        image2.setImageResource(R.drawable.i18);
        image3.setImageResource(R.drawable.i19);

        title1.setText("Thymus vulgaris");
        title2.setText("Myrtus communis");
        title3.setText("Lavandula angustifolia");

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
        image1.setImageResource(R.drawable.i14);
        image2.setImageResource(R.drawable.i15);
        image3.setImageResource(R.drawable.i16);

        title1.setText("Mellisa officinalis");
        title2.setText("Hibiscus sabdariffa");
        title3.setText("Calendula officinalis");

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
        image1.setImageResource(R.drawable.i11);
        image2.setImageResource(R.drawable.i12);
        image3.setImageResource(R.drawable.i13);

        title1.setText("Senna alexandrina");
        title2.setText("Camellia sinesis");
        title3.setText("Panax quinquefol");

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
        image1.setImageResource(R.drawable.i7);
        image2.setImageResource(R.drawable.i8);
        image3.setImageResource(R.drawable.i9);

        title1.setText("Rosmarinus officinalis");
        title2.setText("Glycyrrhiza glabra");
        title3.setText("Zingiber officinalle");

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
        image1.setImageResource(R.drawable.i4);
        image2.setImageResource(R.drawable.i5);
        image3.setImageResource(R.drawable.i6);

        title1.setText("Origanum syriacum");
        title2.setText("Coeffia arabica");
        title3.setText("Salvia officinalis");

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
        image1.setImageResource(R.drawable.i1);
        image2.setImageResource(R.drawable.i2);
        image3.setImageResource(R.drawable.i3);

        title1.setText("Matricaria Chamomilla");
        title2.setText("Nigella sativia");
        title3.setText("Alo vera, Aloe barabadensis, Aloe capennsis");

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