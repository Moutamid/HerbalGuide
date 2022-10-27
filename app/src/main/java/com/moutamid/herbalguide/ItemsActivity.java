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

    TextView page1, page2, page3, page4, page5;
    ImageView next, prev;
    boolean enabled = true;
    int count = 1;
    RecyclerView recyclerView;
    ItemDetailModel model1, model2, model3, model4, model5, model6, model7, model8, model9, model11, model12,
    model13, model14, model15, model16, model17, model18, model19, model20, model21, model22, model23, model24, model25, model26, model27;
    ArrayList<ItemDetailModel> list;
    ItemAdapter adapter;
    SearchView searchView;
    String[] headings1,	headings2,	headings3,	headings4,	headings5,	headings6,	headings7,	headings8,	headings9,	headings10,	headings11,	headings12,	headings13,	headings14,	headings15,	headings16,	headings17,	headings18,	headings19,	headings20,	headings21,	headings22,	headings23,	headings24,	headings25,	headings26,	headings27;
    String[] firstmesg, secondmsg, thirdmsg, fourthmsg, fifthmsg, sixthmsg, sevnthmsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        list = new ArrayList<>();

        recyclerView = findViewById(R.id.itemsRC);
        searchView = findViewById(R.id.search_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);

        modelsAdd();

        listAdd();

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

    private void listAdd() {
        list.add(model1);
        list.add(model2);
        list.add(model3);
        list.add(model4);
        list.add(model5);
        list.add(model6);
        list.add(model7);
        list.add(model8);
        list.add(model9);
        list.add(model11);
        list.add(model12);
        list.add(model13);
        list.add(model14);
        list.add(model15);
        list.add(model16);
        list.add(model17);
        list.add(model18);
        list.add(model19);
        list.add(model20);
        list.add(model21);
        list.add(model22);
        list.add(model23);
        list.add(model24);
        list.add(model25);
        list.add(model26);
        list.add(model27);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);
    }

    private void modelsAdd() {
        headings1 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم",
                "الاستخدامات  والخصائص الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "ينصحبعدم مشاركته مع بعض الاصناف الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmesg = new String[]{"(MatricariaChamomilla)"};
        secondmsg = new String[]{"الرؤوس المزهرة والزيت العطري المستخرج منها"};
        thirdmsg = new String[]{
                "الازهار والزيت العطري يتمتعان بخواص مضادة للالتهاب,مزيلة لتشنجات العضلات الملساء,يساعد على ترميم الجروح والتقرحات,مضاد للبكتريا ومثبط لنموها.",
                "يمكن ان يستخدم داخليا لعلاج تشنجات الجهاز الهضمي ولعلاج تخرش الاغشية المخاطية للفم والبلعوم والطرق التنفسية العلوية ويتمتع بفعالية لعلاج التهاب القصبات الهوائية المزمن والسعال الديكي ويستخدم لعلاج الحمى بسبب فعاليته كخافض للحرارة.",
                "كذلك يمكن ان يستخدم موضعيا بشكل غرغرة لعلاج التهاب اللثة او بشكل نشوق لعلاج التهابات الجهاز التنفسي او بشكل غسول لعلاج التهابات المسالك التناسلية والتهاب الجلد والاغشية المخاطية وكذلك يمكن ان يستخدم بشكل حمامات للتخفيف من الام البواسيرولعلاج الامراض النسائية الالتهابية.",
                "كما يستخدم كمهدئ ومزيل للقلق ."
        };
        fourthmsg = new String[]{
                "التهاب الملتحمة الارجي, تهيج الجلد, اعراض تحسسية حادة (ضيق نفس حكة, طفح جلدي, ازيز).",
                "لذلك يجب استخدام البابونج بحذر لدى الاشخاص الذين يعانون من حساسية لمكونات الزيت العطري وكذلك لدى الاشخاص الذين يعانون من حساسية شديدة من بعض الاعشاب كعشبة الرجيد(Ragweed)."
        };
        fifthmsg = new String[]{
                "البنزوديزبينات حيث يطيل البابونج من التاثير المهدئ لهذه المركبات.",
                "مضادات التخثر: قد يزيد تناول البابونج مع هذه الادوية من خطر  الاصابة بالنزيف.",
                "الادوية التي تحوي الحديد في تركيبها:  حيث يقلل البابونج من امتصاص الحديد."
        };
        sixthmsg = new String[]{"يجب تجنب استخدام  عقار البابونج اثناء الحمل لانه قد يحرض الاجهاض كما ان بعض مكوناته قد سببت الضرر عند اجنة الحيوانات."};

        model1 = new ItemDetailModel(R.drawable.i1, "Matricaria Chamomilla", "البابونج الحقيقي او الالماني", headings1, firstmesg, secondmsg, thirdmsg, fourthmsg, fifthmsg, sixthmsg);
        model2 = new ItemDetailModel(R.drawable.i2, "Nigella sativia", "الحبة السوداء");
        model3 = new ItemDetailModel(R.drawable.i3, "Alo vera, Aloe barabadensis, Aloe capennsis", "الصبار");

        model4 = new ItemDetailModel(R.drawable.i4, "Origanum syriacum", "البردقوش ");
        model5 = new ItemDetailModel(R.drawable.i5, "Coeffia arabica", "البن (القهوة)");
        model6 = new ItemDetailModel(R.drawable.i6, "Salvia officinalis", "المريمية");

        model7 = new ItemDetailModel(R.drawable.i7, "Rosmarinus officinalis", "اكليل الجبل");
        model8 = new ItemDetailModel(R.drawable.i8, "Glycyrrhiza glabra", "عرق السوس");
        model9 = new ItemDetailModel(R.drawable.i9, "Zingiber officinalle", "الزنجبيل");

        model11 = new ItemDetailModel(R.drawable.i11, "Senna alexandrina", "السنا");
        model12 = new ItemDetailModel(R.drawable.i12, "Camellia sinesis", "الشاي الاخضر");
        model13 = new ItemDetailModel(R.drawable.i13, "Panax quinquefol", "الجنسنغ( الامريكي )");

        model14 = new ItemDetailModel(R.drawable.i14, "Mellisa officinalis", "المليسة");
        model15 = new ItemDetailModel(R.drawable.i15, "Hibiscus sabdariffa", "الكركديه");
        model16 = new ItemDetailModel(R.drawable.i16, "Calendula officinalis", "الاقحوان");

        model17 = new ItemDetailModel(R.drawable.i17, "Thymus vulgaris", "الزعتر");
        model18 = new ItemDetailModel(R.drawable.i18, "Myrtus communis", "الاس (الريحان)");
        model19 = new ItemDetailModel(R.drawable.i19, "Lavandula angustifolia", "الخزامى");

        model20 = new ItemDetailModel(R.drawable.i20, "Pimpinella anisum", "اليانسون");
        model21 = new ItemDetailModel(R.drawable.i21, "Taraxacum officinale", "الهندباء ");
        model22 = new ItemDetailModel(R.drawable.i22, "Eucalyptus camaldulensis", "الاوكاليبتوس ( الكافور)");

        model23 = new ItemDetailModel(R.drawable.i23, "Trigonella foenum -graecum", "الحلبة");
        model24 = new ItemDetailModel(R.drawable.i24, "Curcuma longa", "الكركم");
        model25 = new ItemDetailModel(R.drawable.i25, "Equisetaceaearvense", "ذنب الخيل");

        model26 = new ItemDetailModel(R.drawable.i26, "Ammi visnaga", "الخلة");
        model27 = new ItemDetailModel(R.drawable.i27, "Paronychia argentea", "زهرة الالماسة");
    }

    private void pageNine() {
        list.remove(model26);
        list.remove(model27);

        list.add(0, model26);
        list.add(1, model27);
        list.add(2, new ItemDetailModel(0, "", ""));

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model23);
        list.remove(model24);
        list.remove(model25);

        list.add(0, model23);
        list.add(1, model24);
        list.add(2, model25);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model20);
        list.remove(model21);
        list.remove(model22);

        list.add(0, model20);
        list.add(1, model21);
        list.add(2, model22);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model17);
        list.remove(model18);
        list.remove(model19);

        list.add(0, model17);
        list.add(1, model18);
        list.add(2, model19);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model14);
        list.remove(model15);
        list.remove(model16);

        list.add(0, model14);
        list.add(1, model15);
        list.add(2, model16);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model11);
        list.remove(model12);
        list.remove(model13);

        list.add(0, model11);
        list.add(1, model12);
        list.add(2, model13);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model7);
        list.remove(model8);
        list.remove(model9);

        list.add(0, model7);
        list.add(1, model8);
        list.add(2, model9);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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
        list.remove(model4);
        list.remove(model5);
        list.remove(model6);

        list.add(0, model4);
        list.add(1, model5);
        list.add(2, model6);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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

        list.remove(model1);
        list.remove(model2);
        list.remove(model3);

        list.add(0, model1);
        list.add(1, model2);
        list.add(2, model3);

        adapter = new ItemAdapter(ItemsActivity.this, list);
        recyclerView.setAdapter(adapter);

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