package com.moutamid.herbalguide;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

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

    String[] headings1, headings2, headings3, headings4, headings5, headings6, headings7, headings8, headings9, headings10, headings11, headings12, headings13, headings14, headings15, headings16, headings17, headings18, headings19, headings20, headings21, headings22, headings23, headings24, headings25, headings26, headings27;
    String[] firstmsg1, firstmsg2, firstmsg3, firstmsg4, firstmsg5, firstmsg6, firstmsg7, firstmsg8, firstmsg9, firstmsg10, firstmsg11, firstmsg12, firstmsg13, firstmsg14, firstmsg15, firstmsg16, firstmsg17, firstmsg18, firstmsg19, firstmsg20, firstmsg21, firstmsg22, firstmsg23, firstmsg24, firstmsg25, firstmsg26, firstmsg27;
    String[] seondmsg1, seondmsg2, seondmsg3, seondmsg4, seondmsg5, seondmsg6, seondmsg7, seondmsg8, seondmsg9, seondmsg10, seondmsg11, seondmsg12, seondmsg13, seondmsg14, seondmsg15, seondmsg16, seondmsg17, seondmsg18, seondmsg19, seondmsg20, seondmsg21, seondmsg22, seondmsg23, seondmsg24, seondmsg25, seondmsg26, seondmsg27;
    String[] thirdmsg1, thirdmsg2, thirdmsg3, thirdmsg4, thirdmsg5, thirdmsg6, thirdmsg7, thirdmsg8, thirdmsg9, thirdmsg10, thirdmsg11, thirdmsg12, thirdmsg13, thirdmsg14, thirdmsg15, thirdmsg16, thirdmsg17, thirdmsg18, thirdmsg19, thirdmsg20, thirdmsg21, thirdmsg22, thirdmsg23, thirdmsg24, thirdmsg25, thirdmsg26, thirdmsg27;
    String[] fourthmsg1, fourthmsg2, fourthmsg3, fourthmsg4, fourthmsg5, fourthmsg6, fourthmsg7, fourthmsg8, fourthmsg9, fourthmsg10, fourthmsg11, fourthmsg12, fourthmsg13, fourthmsg14, fourthmsg15, fourthmsg16, fourthmsg17, fourthmsg18, fourthmsg19, fourthmsg20, fourthmsg21, fourthmsg22, fourthmsg23, fourthmsg24, fourthmsg25, fourthmsg26, fourthmsg27;
    String[] fifthmsg1, fifthmsg2, fifthmsg3, fifthmsg4, fifthmsg5, fifthmsg6, fifthmsg7, fifthmsg8, fifthmsg9, fifthmsg10, fifthmsg11, fifthmsg12, fifthmsg13, fifthmsg14, fifthmsg15, fifthmsg16, fifthmsg17, fifthmsg18, fifthmsg19, fifthmsg20, fifthmsg21, fifthmsg22, fifthmsg23, fifthmsg24, fifthmsg25, fifthmsg26, fifthmsg27;
    String[] sixthmsg1, sixthmsg2, sixthmsg3, sixthmsg4, sixthmsg5, sixthmsg6, sixthmsg7, sixthmsg8, sixthmsg9, sixthmsg10, sixthmsg11, sixthmsg12, sixthmsg13, sixthmsg14, sixthmsg15, sixthmsg16, sixthmsg17, sixthmsg18, sixthmsg19, sixthmsg20, sixthmsg21, sixthmsg22, sixthmsg23, sixthmsg24, sixthmsg25, sixthmsg26, sixthmsg27;
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
            if (count == 1) {
                pageTwo();
                count = 2;
            } else if (count == 2) {
                pageThree();
                count = 3;
            } else if (count == 3) {
                pageFour();
                count = 4;
            } else if (count == 4) {
                pageFive();
                count = 5;
            } else if (count == 5) {
                pageSix();
                page1.setText("6");
                page2.setText("7");
                page3.setText("8");
                page4.setText("9");
                page5.setText("10");
                enabled = false;
                count = 6;
            } else if (count == 6) {
                pageSeven();
                count = 7;
            } else if (count == 7) {
                pageEight();
                count = 8;
            } else if (count == 8) {
                pageNine();
                count = 9;
            }
        });

        prev.setOnClickListener(v -> {
            if (count == 2) {
                pageOne();
                count = 1;
            } else if (count == 3) {
                pageTwo();
                count = 2;
            } else if (count == 4) {
                pageThree();
                count = 3;
            } else if (count == 5) {
                pageFour();
                count = 4;
            } else if (count == 6) {
                pageFive();
                page1.setText("1");
                page2.setText("2");
                page3.setText("3");
                page4.setText("4");
                page5.setText("5");
                enabled = true;
                count = 5;
            } else if (count == 7) {
                pageSix();
                count = 6;
            } else if (count == 8) {
                pageSeven();
                count = 7;
            } else if (count == 9) {
                pageEight();
                count = 8;
            }
        });

        page1.setOnClickListener(v -> {
            if (enabled) {
                pageOne();
                count = 1;
            } else {
                pageSix();
                count = 6;
            }
        });
        page2.setOnClickListener(v -> {
            if (enabled) {
                pageTwo();
                count = 2;
            } else {
                pageSeven();
                count = 7;
            }
        });
        page3.setOnClickListener(v -> {
            if (enabled) {
                pageThree();
                count = 3;
            } else {
                pageEight();
                count = 8;
            }
        });
        page4.setOnClickListener(v -> {
            if (enabled) {
                pageFour();
                count = 4;
            } else {
                pageNine();
                count = 9;
            }
        });
        page5.setOnClickListener(v -> {
            if (enabled) {
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
        getDetail1();
        getDetail2();
        getDetail3();
        getDetail4();
        getDetail5();
        getDetail6();
        getDetail7();
        getDetail8();
        getDetail9();
        getDetail11();
        getDetail12();
        getDetail13();
        getDetail14();
        getDetail15();
        getDetail16();
        getDetail17();
        getDetail18();
        getDetail19();
        getDetail20();
        getDetail21();
        getDetail22();
        getDetail23();
        getDetail24();
        getDetail25();
        getDetail26();
        getDetail27();


        model1 = new ItemDetailModel(R.drawable.i1, "Matricaria Chamomilla", "البابونج الحقيقي او الالماني", headings1, firstmsg1, seondmsg1, thirdmsg1, fourthmsg1, fifthmsg1, sixthmsg1);
        model2 = new ItemDetailModel(R.drawable.i2, "Nigella sativia", "الحبة السوداء", headings2, firstmsg2, seondmsg2, thirdmsg2, fourthmsg2, fifthmsg2, sixthmsg2);
        model3 = new ItemDetailModel(R.drawable.i3, "Alo vera, Aloe barabadensis, Aloe capennsis", "الصبار", headings3, firstmsg3, seondmsg3, thirdmsg3, fourthmsg3, fifthmsg3, sixthmsg3);

        model4 = new ItemDetailModel(R.drawable.i4, "Origanum syriacum", "البردقوش ", headings4, firstmsg4, seondmsg4, thirdmsg4, fifthmsg4, sixthmsg4);
        model5 = new ItemDetailModel(R.drawable.i5, "Coeffia arabica", "البن (القهوة)", headings5, firstmsg5, seondmsg5, thirdmsg5, fourthmsg5, fifthmsg5);
        model6 = new ItemDetailModel(R.drawable.i6, "Salvia officinalis", "المريمية", headings6, firstmsg6, seondmsg6, thirdmsg6, fourthmsg6, fifthmsg6, sixthmsg6);

        model7 = new ItemDetailModel(R.drawable.i7, "Rosmarinus officinalis", "اكليل الجبل", headings7, firstmsg7, seondmsg7, thirdmsg7, fourthmsg7, fifthmsg7);
        model8 = new ItemDetailModel(R.drawable.i8, "Glycyrrhiza glabra", "عرق السوس", headings8, firstmsg8, seondmsg8, thirdmsg8, fourthmsg8, fifthmsg8);
        model9 = new ItemDetailModel(R.drawable.i9, "Zingiber officinalle", "الزنجبيل", headings9, firstmsg9, seondmsg9, thirdmsg9, fourthmsg9, fifthmsg9);

        model11 = new ItemDetailModel(R.drawable.i11, "Senna alexandrina", "السنا", headings11, firstmsg11, seondmsg11, thirdmsg11, fourthmsg11);
        model12 = new ItemDetailModel(R.drawable.i12, "Camellia sinesis", "الشاي الاخضر", headings12, firstmsg12, seondmsg12, thirdmsg12, fourthmsg12);
        model13 = new ItemDetailModel(R.drawable.i13, "Panax quinquefol", "الجنسنغ( الامريكي )", headings13, firstmsg13, seondmsg13, thirdmsg13, fourthmsg13, fifthmsg13);

        model14 = new ItemDetailModel(R.drawable.i14, "Mellisa officinalis", "المليسة", headings14, firstmsg14, seondmsg14, thirdmsg14, fourthmsg14);
        model15 = new ItemDetailModel(R.drawable.i15, "Hibiscus sabdariffa", "الكركديه",  headings15, firstmsg15, seondmsg15, thirdmsg15, fourthmsg15);
        model16 = new ItemDetailModel(R.drawable.i16, "Calendula officinalis", "الاقحوان",  headings16, firstmsg16, seondmsg16, thirdmsg16, fourthmsg16);

        model17 = new ItemDetailModel(R.drawable.i17, "Thymus vulgaris", "الزعتر", headings17, firstmsg17, seondmsg17, thirdmsg17, fourthmsg17, fifthmsg17);
        model18 = new ItemDetailModel(R.drawable.i18, "Myrtus communis", "الاس (الريحان)", headings18, firstmsg18, seondmsg18, thirdmsg18, fourthmsg18, fifthmsg18);
        model19 = new ItemDetailModel(R.drawable.i19, "Lavandula angustifolia", "الخزامى", headings19, firstmsg19, seondmsg19, thirdmsg19, fourthmsg19, fifthmsg19);

        model20 = new ItemDetailModel(R.drawable.i20, "Pimpinella anisum", "اليانسون", headings20, firstmsg20, seondmsg20, thirdmsg20, fourthmsg20);
        model21 = new ItemDetailModel(R.drawable.i21, "Taraxacum officinale", "الهندباء ", headings21, firstmsg21, seondmsg21, thirdmsg21, fourthmsg21);
        model22 = new ItemDetailModel(R.drawable.i22, "Eucalyptus camaldulensis", "الاوكاليبتوس ( الكافور)",  headings22, firstmsg22, seondmsg22, thirdmsg22, fourthmsg22, fifthmsg22);

        model23 = new ItemDetailModel(R.drawable.i23, "Trigonella foenum -graecum", "الحلبة", headings23, firstmsg23, seondmsg23, thirdmsg23, fourthmsg23);
        model24 = new ItemDetailModel(R.drawable.i24, "Curcuma longa", "الكركم", headings24, firstmsg24, seondmsg24, thirdmsg24, fourthmsg24, fifthmsg24);
        model25 = new ItemDetailModel(R.drawable.i25, "Equisetaceaearvense", "ذنب الخيل", headings25, firstmsg25, seondmsg25, thirdmsg25, fourthmsg25, fifthmsg25);

        model26 = new ItemDetailModel(R.drawable.i26, "Ammi visnaga", "الخلة",  headings26, firstmsg26, seondmsg26, thirdmsg26, fourthmsg26, fifthmsg26);
        model27 = new ItemDetailModel(R.drawable.i27, "Paronychia argentea", "زهرة الالماسة",  headings27, firstmsg27, seondmsg27, thirdmsg27, fourthmsg27, fifthmsg27);
    }

    private void getDetail26() {
        headings26 = new String[] {
                "الاسم العلمي:",
                "الجزء المستخدم من النبات:ا",
                "الخصائص والاستخداماتالطبية:",
                "الاثار الجانبية وموانع الاستحدام والتداخلات الدوائية:",
                "الاستخدام اثناء الحمل:"
        };
        firstmsg26 = new String[] { "Ammi visnaga" };
        seondmsg26 = new String[] { "لثمار والزيت الطيار المستخرج منها." };
        thirdmsg26 = new String[] {
                " تتمتع الخلة بخصائص مقوية لعضلة القلب وللاوعية الدموية التاجية وخصائص مضادة لتشنج العضلات الملساء اضافة الى خصائص مدرة للبول وكذلك  فعالية مضادة للبكتريا والفيروسات كما تتمتع بفعالية خافضة لمستوى السكر في الدم.",
               "اضافة الى  فعاليتها  في زيادة مستوى الكولسترول الجيد في الجسم ",
                "تستخدم لعلاج القصور القلبي وتسرع ضربات القلب وبسبب خصائصها المضادة للتشنج والمدرة للبول تستخدم لعلاج تشنج الجهاز البولي وتساعد في خروج حصوات  الكلى و الحالب كما انها تقلل من تشكل الحصيات البولية لانها تقلل من ترسب اوكسالات الكالسيوم في الكلى .",
                "كما انها تساعد في علاج الصدفية."
        };
        fourthmsg26 = new String[] {
                "ان استخدام هذا العقار قد يزيد من حساسية الجلد  لاشعة الشمس لذا ينصح بعدم التعرض لاشعة الشمس اثناء استخدامه كما ان استخدام الخلة لفترات طويلة يسبب تراكم مركب الخلين في الجسم ويسبب ظهور اثار جانبية كالاقياء  والغثيان والارق  والصداع وزيادة مستوى انزيمات الكبد في الدم.",
                "التداخلات الدوائية : ينصح بعدم استهلاك الخلة مع بعض المستحضرات الدوائية : ",
                "الديجوكسين: قد يسبب استهلاك الخلة مع الديجوكسين انخفاض في فعالية هذا الدواء بسبب التاثير المتعاكس لكل منهما.",
                "الادوية التي تسبب اذية للكبد: كالاسيتامينوفين والاميودارون ميثوتريكسات اريثرومايسين وغيرها يمكن ان يسبب استهلاك الخلة مع هذه الادوية من زيادة الاصابة بتلف للكبد.",
                "الادوية التي تزيد من الحساسية لاشعة الشمس: النورفلوكساسين والسيبروفلوكساسين سلفاميثوكسازول تتراسكلين وغيرها  استخدام الخلة مع هذه الادوية قد يزيد من خطر الاصابة بالحروق او الطفح الجلدي المسبب باشعة الشمس."
        };
        fifthmsg26 = new String[] {
                "يعتبر هذا العقار غير امن اثناء الحمل وذلك يرجع لوجود مركب الخلين الذي يمكن ان يسبب  تقلصات للرحم مما يزيد من خطر حدوث اجهاض."
        };
    }

    private void getDetail27() {
        headings27 = new String[] {
            "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg27 = new String[] { "Paronychia argentea" };
        seondmsg27 = new String[] { "جميع اجزاء النبات" };
        thirdmsg27 = new String[] {
                " يتمتع هذا النبات بخصائص مدرة للبول  وخصائص واقية ومنشطة للكلى  اضافة الى فعاليتها في تفتيت الحصيات في الكلى وتنظيفها من ترسبات الرمل.",
                "تتمتع بفعالية خافضة لمستوى الدهون في الجسم.",
                "لها فعالية مضادة للاسهال وطاردة للديدان وطاردة للغازات اضافة الى فعاليتها في علاج القروح والبثور .",
        };
        fourthmsg27 = new String[] {
                "ان استهلاك هذا النبات بكميات كبيرة ولفترات طويلة قد يسبب اضطرابات في الجهاز الهضمي وتسبب حدوث الاسهال والغثيان والاقياء.",
                "لا توجد ادلة ومعلومات عن تداخلات هذا العقار مع المستحضرات الدوائية."
        };
        fifthmsg27 = new String[] { "يعتبر هذا العقار غير امن خلال الحمل لانه يحرض انقباضات الرحم مما يزيد من خطر الاجهاض او الولادة المبكرة." };
    }

    private void getDetail25() {
        headings25 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدائية:",
                "الاستخدام اثناء الحمل"
        };
        firstmsg25 = new String[] { "Equisetaceaearvense" };
        seondmsg25 = new String[] { "الرؤوس المزهرة والنبات العشبي" };
        thirdmsg25 = new String[] {
              " يتمتع هذا النبات بخصائص مدرة للبول وخافضة للضغط وخافضة لحمض اليوريك وحالة للتشنج  وخصائص مغذية للشعر وخصائص مضادة للالتهاب.",
              "يستخدم للوقاية من هشاشة العظام وذلك لمحتواه العالي من السيلكا والمعادن.",
               "يستخدم لعلاج التهابات الجهاز البولي   وحصى الكلى والمثانة ولعلاج الوذمة.",
                "يستخدم لعلاج الام المفاصل والروماتيزم.",
                "له فعالية في تسريع التئام الجروح والقروح. "
        };
        fourthmsg25 = new String[] {
                "قد يسبب بعض الاثار الجانبية اهمها  زيادة التبول نقص فيتامين الثيامينB1  ))  نقص مستوى البوتاسيوم في الدم  عدم انتظام ضربات القلب التهاب جلدي تحسسي.",
                "يمنع استخدام هذا النبات من قبل الاشخاص الذين يتناولون الكحول بكثرة لان كل منهما يسبب نقص في فيتامين الثيامين.",
                "يمنع استخدامه من قبل الاشخاص الذين يعانون من حساسية اتجاه النيكوتين نظرا لاحتواءه على هذا المركب.",
               "الاشخاص الذين يعانون من حساسية تجاه الجزر غالبا ما يعانون من حساسية تجاه هذا النبات لذا ينصح بعدم استهلاكه من قبل هؤلاء الاشخاص.",
                "التداخلات الدوائية : ينصح بعدم استخدام هذا النبات مع مجموعة من المستحضرات الدوائية:",
                "المدرات( هيدوكلورتيازيد فوروسيميد كلورتاليدون ) : قد يسبب الاستخدام مع هذه الادوية انخفاض في مستويات البوتاسيوم في الدم .",
                "الديجوكسين: يسبب استهلاك  هذا النبات معالديجوكسين من ظهور الاثار الجانبية للديجوكسين نظرا لفعالية النبات المدرة للبول والتي تسبب انخفاض في مستوى البوتاسيوم في الدم.",
               "الادوية الخافضة للسكر:(الانسولين بيوغبيتازون غليمبريميد وغيرها ) يمكن ان يسبب استهلاك النبات مع هذه الادوية انخفاض في مستوى السكر في الدم.",
                "الادوية التي يدخل في تركيبها الليثيوم استخدام النبات مع هذه الادوية يمكن ان يسبب في تراكم الليثيوم في الجسم وظهور اثاره الجانبية."
        };
        fifthmsg25 = new String[] {
                "ينصح بعدم استخدم هذا النبات اثناء الحمل لعدم توفر ادلة كافية عن امان استخدامه خلال هذه الفترة."
        };
    }

    private void getDetail24() {
        headings24 = new String[] {
                "•\tالاسم العلمي",
                "•\tالجزء المستخدم من النبات",
                "•\tالخصائص والاستخدامات الطبية",
                "•\tالاثارالجانبية وموانع الاستخدام والتداخلات الدوائية",
                "•\tالاستخدام اثناء الحمل"
        };
        firstmsg24 = new String[] { "Curcuma longa" };
        seondmsg24 = new String[] { "جذامير النبات" };
        thirdmsg24 = new String[] {
                "يتمتع الكركم بتاثير مضاد للالتهاب ومحفز للجهاز المناعي كما انه يتمتع بفعالية مضادة للاكتئاب الشديد اضافة الى فعاليته لعلاج اعراض متلازمة القولون العصبي والتهاب القولون التقرحي كما يتمتع بخصائصمضادة للاكسدة ومضادة للسرطان والاورام اضافة الى فعاليته في علاج التهاب المفاصل كما انه يتمتع بفعالية خافضة للسكر في الدم  ويتمتع بفعالية في علاج امراض الكبد."
        };
        fourthmsg24 = new String[] {
                " قد يسبب استخدام الكركم  بجرعات كبيرة  اضطرابات في الجهاز الهضمي ,التهاب جلدي تحسسي , التهاب كبد, فقر دم , انخفاض في تعداد الكريات البيض.",
                "ينصح المرضى الذين يعانون من حصوات الكلى او لديهم استعداد لتتكون لديهم بعدم استخدام الكركم وذلك بسبب احتواءه على نسبة كبيرة من الاوكسالات.",
                "ينصح بعدم مشاركة الكركم مع بعض المستحضرات الدوائية:",
                "مضادات التخثر ومضادات الصفيحات المشاركة مع الكركم قد تسبب زيادة في خطر حدوث النزيف.",
                "الادوية المستخدمة في علاج بعض انواع السرطان: الكامبتوثيسين, ميكلوريثامين, باكليتاكسيل, دوكسوروبسين, سيكلوفوسفاميد قد يسبب استخدام الكركم مع هذه الادوية نقص في فعاليتها.",
                "الاسيتامينوفين والايبوبروفين قد يسبب استخدام هذه الادوية مع الكركم ظهوراثار غير مرغوبة لها.",
                "الامفوتريسين ب: المشاركة مع الكركم قد تسبب في زيادة تاثير هذا الدواء.",
                "السيليبرولول والميدازولام:  قد يسبب الاستخدام مع الكركم زيادة في تركيز هذه الادوية ممايسبب في ظهور اثارها الجانبية.",
                "فيراباميل: يمكن ان يسبب الاستخدام مع الكركم زيادة في تركيز هذا ",
                "الدواء.",
                "تاكروليموس: يمكن ان يسبب  تناول الكركم  مع هذه الدواء تغير في تركيزه مما يؤثر على فعاليته في تثبيط مناعة الجسم ورفض الجسم للعضو المزروع."
        };
        fifthmsg24 = new String[] {
                "يوصى بعدم استهلاك عقار الكركم اثناء الحمل حيث اظهرت دراسة اجريت علي الحيوانات ان استهلاك الكركم قد سبب نقص في وزن المواليد كما ان الكركم يمكن ان يحرض انقباض عضلات الرحم بسبب تاثيراته المشابهة للاستروجين مما يسبب الاجهاض او الولادة المبكرة. "
        };
    }

    private void getDetail23() {
        headings23 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات ",
                "الخصائص والاستخدامات الطبية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg23 = new String[] { "Trigonella foenum -graecum" };
        seondmsg23 = new String[] { "البذور" };
        thirdmsg23 = new String[] {
            " تتمتع الحلبة بتاثيرات خافضة للكولسترول والدهون الثلاثية لذلك فهي تساعد في الوقاية من الاصابة بامراض القلب والاوعية الدموية وكذلك تتمتع بفعالية خافضة للسكر ومضادة للجراثيم اضافة الى فعاليتها في الوقاية من امراض الكبد ولها فعالية كمضاد للسرطان.",
            "تستخدم لعلاج اعراض انقطاع الطمث ومتلازمة المبيض المتعدد الكيسات ولعلاج التقرحات الجلدية ",
            "تتمتع الحلبة بتاثير مشابه لتاثير الاستروجين.",
             "اظهرت بعض الدراسات ان الحلبة تساعد على زيادة مستويات السيروتونين.",
              "تستخدم الحلبة بشكل شائع لزيادة ادرار الحليب الا ان الادلة حول هذه الفعالية محدودة.",
               "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية: ان استهلاك الحلبة قد يسبب اعراض تحسسية (الطفح الجلدي  سيلان الانف صعوبة التنفس وتورم بالوجه) ويمكن ان تسبب الاسهال والام في المعدة .",
               "تناول كميات كبيرة من الحلبة قد يزيد من خطر الاصابة بالنزيف .",
             "ينصح بعدم مشاركة الحلبة مع بعض المستحضرات الدوائية:",
               "الوارفارين قد تسبب المشاركة زيادة في تاثير الوارفارين مما يزيد من خطر الاصابة بالنزف.",
               "مضادات الاكتئاب من فئة SSRI ( مثبطات اعادة قبض السيروتونين) المشاركة مع الحلبة يمكن ان يزيد من خطر الاصابة بمتلازمة السيروتونين.",
                "الثيوفيللين: يمكن ان تسبب الحلبة نقص في امتصاص هذا الدواء مما يؤثر على فعاليته.",
               "الادوية الخافضة للسكر تسبب  الاستخدام المتزامن للحلبة مع هذه الادوية انخفاض في مستوى السكرفي الدم."
        };
        fourthmsg23 = new String[] { " يجب تجنب استهلاك الحلبة اثناء الحمل لانها قد تسبب تشوهات خلقية للاجنة وكذلك يمكن ان تسبب حدوث تقلصات للرحم مما يسبب الاجهاض او الولادة المبكرة." };
    }

    private void getDetail22() {
        headings22 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg22 = new String[] { "Eucalyptus camaldulensis " };
        seondmsg22 = new String[] { "الاوراق والزيت المستخرج منها ومن الاغصان الفتية."  };
        thirdmsg22 = new String[] {
                " يتمتع الاوكاليبوس بخصائص مضادة للجراثيم والفطريات وكذلك له فعالية مقشعة فهو يزيد من الافرازات القصبية وكخافض للسكر الدموي ومدر للبول وكمضاد التهاب ومضاد للاكسدة.",
                "السعال يستخدم لعلاج وله تاثير ايجابي على وظائف الرئتين.",
                "يمكن استخدامه بشكل خارجي لعلاج الروماتيزم ولعلاج حب الشباب.",
                "يستخدم لعلاج امراض البرد والتهاب القصبات وكذلك لعلاج امراض الكبد والمرارة والتهابات الجهاز البولي."
        };
        fourthmsg22 = new String[] {
            "استخدامه بكميات كبيرة او استخدام الزيت من غير تخفيف يسبب اعراض تسمم تشمل الالام في البطن ,تشنج القصبات الهوائية ,ازرقاق ,هذيان ,دوخة اقياء , تسرع في التنفس ضعف في العضلات والشعور بالاختناق.",
             "ان زيت الاوكاليبتوس غير المخفف يعتبر سام ويمنع استخدامه داخليا من غير تخفيف حيث تعتبر جرعة 3.5 مل منه مميتة .",
             "يجب عدم استخدام هذا العقار من قبل المرضى المصابين بامراض الكبد والمجاري الصفراوية.",
             "ينصح بعدم مشاركة الاوكاليبتوس مع بعض المستحضرات الدوائية:",
              "الادوية الخافضة للسكر الدموي الاستخدام المتزامن يمكن ان يسبب انخفاض في مستوى السكر في الدم.",
              "الامفيتامين المشاركة بينهما قد تسبب انخفاض في فعالية الامفيتامين.",
                "الادوية التي يتم استقلابها بواسطة خمائر الكبد سيتوكروم (CYP1A2 P450) من هذه الادوية بروبرانالول,تيوفيللين, هالوبيردول فيراباميل وغيرها",
                "الادوية التي يتم استقلابها بواسطة  خمائر الكبد سيتوكروم P450 CYP2C19)) منها لانسوبرازول, ديازيبام, اومبيرازول وغيرها",
               "الادوية التي يتم استقلابها بواسطة خمائر الكبد سيتوكروم P450 CYP3A4)) منها كيتوكونازول فيكسوفينادين, لوفاستاتين وغيرها "

        };
        fifthmsg22 = new String[] {
            " ينصح بعدم استهلاك الاوكاليبتوس خاصة الزيت اثناء الحمل والارضاع الطبيعي لعدم وجود ادلة كافية حول امان استخدمه خلال هذه الفترة."
        };
    }

    private void getDetail21() {
        headings21 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية"
        };
        firstmsg21 = new String[] { "Taraxacum officinale" };
        seondmsg21 = new String[] { "النبات كاملا." };
        thirdmsg21 = new String[] {
                " تتمتع الهنباء بخصائص مدرة للبول وخصائص مضادة للروماتيزم  ومضادة للالتهاب وفاتحة للشهية كما انها تتمتع بتاثير واقي للكبد  اضافة الى فعاليتها كخافض للدهون .",
                "تتمتع بتاثير مضاد للاكسدة ومضاد لبعض انواع السرطانات كسرطان الجلد وسرطان الدم وسرطان القولون والمستقيم."
        };
        fourthmsg21 = new String[] {
              " استخدام الهندباء قد يسبب عسر هضم ,حموضة معدية ,التهاب جلدي تحسسي ,اسهال وانخفاض مستوى السكر في الدم .",
               "ينصح بعدم تناول الهندباء مع بعض المستحضرات الدوائية:",
              "المدرات قد تسبب الاستخدام المتزامن زيادة فعالية هذه الادوية بسبب التاثير المدر للبول الذي تتمتع به الهندباء.",
              "الادوية الخافضة للسكر يمكن ان تسبب المشاركة بينهما انخفاض مستوى السكر الدموي وذلك يرجع لفعالية الهندباء الخافضة للسكر.",
             "الادوية التي تستقلب بخمائر السيتوكروم P450(CYP)1 وذلك يرجع لتاثير الهندباء على عمل هذه الخمائر مما يسبب زيادة في تركيز هذه الادوية وظهور اثارها الجانبية."
        };
    }

    private void getDetail20() {
        headings20 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات ",
                "الخصائص والاستخدامات الطبية",
               "الاستخدام اثناء الحمل"
        };
        firstmsg20 = new String[] { "Pimpinella anisum" };
        seondmsg20 = new String[] { "الثمار الجافة والزيت العطري المستخرج منها." };
        thirdmsg20 = new String[] {
                "يتمتع اليانسون بخصائص فاتحة للشهية وخصائص مقشعة ومضادة للجراثيم والفطريات وكذلك خصائص مضادة للاكسدة اضافة الى فعاليته كطارد للغازات وكمضاد للتشنج والمغص ويساعد في تخفيف اعراض عسر الهضم.",
                "يستعمل زيت اليانسون لعلاج امراض الجهاز التنفسي (السعال الجاف التهاب الحنجرة سيلان",
                "يتمتع هذا العقار بتاثير مشابه لهرمون الاستروجين.",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائبة: يعتبر البانسون امن عند استخدامه بشكل معتدل الا ان استهلاكه بشكل مفرط ولفترات طويلة قد يسبب اعراض تحسسية لذ لك يجب تجنب استخدامه لدى الاشخاص الذين لديهم حساسية  لاحد مكوناته او  لديهم حساسية لبعض الاعشاب كالشمر والكراوية والكمون .",
                "يوصى بعدم استخدامه من قبل المرضى المصابين بانواع من السرطان الحساسة للهرمونات (الاستروجين) كسرطان الثدي والرحم والمبايض وذلك يرجع لفعاليته المشابهة لهرمون الاستروجين.",
                "التداخلات الدوائية: ينصح بعدم استخدام اليانسون بشكل متزامن مع بعض المستحضرات الدوائية:",
                "مانعات الحمل التي يدخل في تركيبها الاستروجين(استراديول ايتنيل استراديول وغيرها) ",
                "الادوية المستخدمة لعلاج السرطان الهرموني  ( الثدي المبايض الرحم) :  تاموكسيفين تورمفين اكسيميستان وغيرها",

        };
        fourthmsg20 = new String[] { "ينصح بعدم استخدام  عقار اليانسون اثناء الحمل والارضاع الطبيعي لعدم وجود ادلة كافية حول امان استخدامه خلال هذه الفترة." };
    }

    private void getDetail19() {
        headings19 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg19 = new String[] { "Lavandula angustifolia" };
        seondmsg19 = new String[] { "الاوراق والازهار والزيت المستخرج منها." };
        thirdmsg19 = new String[] {
             "يتمتع عقار الخزامى بخصائص مهدئة ومزيلة للقلق ومضادة للاكتئاب كما انه يساعد في تحسين جودة ",
              "كما يتمتع بخصائص مضادة للالتهابات ومضادة للبكتريا وخصائص مضادة للاكسدة اضافة الى ذلك فهو يساعد في التخفيف من متلازمة التوتر العصبي ما قبل الحيض.",
               "يتمتع الخزامى بخصائص مضادة للسرطان.",
               "زيت الخزامى يساعد على التئام الجروح ."
        };
        fourthmsg19 = new String[] {
               " قد يسبب الاستهلاك بكميات كبيرة ولفترات طويلة من الخزامى ظهور بعض الاعراض الجانبية كالغثيان والتجشؤ وكذلك قد يسبب اضطرابات هرمونية ويمكن ان  يسبب الاستخدام الموضعي لزيت الخزامى التهاب جلد تحسسي.",
               "قد يسبب الاستخدام زيت خزامى للاطفال الذكور لفترات طويلة قبل سن البلوغ  تضخم الثدي(التثدي)  وقد تراجعت هذه الاعراض عند التوقف عن استهلاك الخزامى.",
               "يجب تجنب استخدام هذا العقار لدى الاشخاص الذين يعانون من حساسية تجاه الخزامى او احد مكوناته.",
                "يجب تجنب استخدامه عند المرضى المصابين بالسرطان الهرموني كسرطان الثدي وسرطان المبيض.",
                "ينصح بعدم مشاركة الخزامى مع بعض المستحضرات الدوائية:",
                "الادوية المهدئة ( الفينوباربيتال , البنزوديازبينات) قد يسبب عقار الخزامى زيادة فعالية هذة الادوية.",
                "مثبطات الجهاز العصبي المركزي( هيدرات الكلورال) يمكن ان يسبب الاعطاء المتزامن مع الخزامى زيادة الفعالية المهدئة والمخدرة لهذه الادوية."
        };
        fifthmsg19 = new String[] {
                "ينصح بتجنب استخدام  الخزامى  داخليا بشكل مفرط اثناء الحمل والارضاع الطبيعي لعدم توفر ادلة كافية حول امان العقار خلال هذه الفترة."
        };
    }

    private void getDetail18() {
        headings18 = new String[] {
               "الاسم العلمي",
               "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg18 = new String[] { "Myrtus communis" };
        seondmsg18 = new String[] { "الاوراقوالفروع المزهرة والثماروالزيت العطري المستخرج منها." };
        thirdmsg18 = new String[] {
               "يتمتععقارالاس بخصائص مضادة للبكتريا والفطريات والفيروس كما ان  له تاثير ايجابي على دورة النوم  يخفف من  اعراض الانفلونز اضافة الى خصائصه الخافضة للسكر الدموي.",
               "له فعالية في علاج التهابات الجهاز البولي والتهابات الامعاء ",
               "الزيت الطيار يستخدم لتطهير الجروح  وازالة البثور و يساعد في علاج الصدفية والبواسير .",
               "يستخدم الاس  لعلاج  التهاب القصبات الهوائية المزمن والتهاب الجيوب والسعال الديكي .",
                "تتمتع اوراق الاس بتاثير ايجابي على نمو وتقوية الشعر والحد من تساقطه.",
                "تتمتع ثمار الاس بتاثير فاتح للشهية وتساعد في علاج الاسهال."
        };
        fourthmsg18 = new String[] {
                "قد يسبب هذا العقار حساسية ووجفاف للجلد والتقيؤ والكميات الكبيرة منه تسبب الاسهال والغثيان وقد يهدد مقدار 10 غرام من زيت الاس الحياة بسبب محتواه العالي من مركب السينول والتسمم به يسبب اضطرابات في الدورة الدموية وانخفاض في الضغط الدموي وفشل تنفسي.",
                "يمنع استخدام زيت الاس للاطفال لانه يسبب نوبات شبيهة بالربو وتشنج بالقصبات الهوائية وفشل تنفسي.",
                "لم تعرف حتى الان تداخلات دوائية لهذا النبات مع المستحضرات الدوائية."
        };
        fifthmsg18 = new String[] {
                "يعتبر الاس غير امن خلال فترة الحمل والارضاع لذلك يوصى بعدم استخدمه خلال الحمل والارضاع الطبيعي."
        };
    }

    private void getDetail17() {
        headings17 = new String[] {
               "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg17 = new String[] { "Thymus vulgaris" };
        seondmsg17 = new String[] { "النبات المزهر" };
        thirdmsg17 = new String[] {
                "يتمتع الزعتر بفعالية مضادة للبكتريا والفطور وفعالية كمضاد للاكسدة",
                "يتمتع بتاثير مطهر للامعاء من الديدان والطفيليات.",
                "يستخدم لعلاج التهابات الجهاز التنفسي والسعال الديكي  والربو كما انه يتمتع بخصائص مقوية لجهاز المناعة اضافة الى فعاليته المضادة للتخثر."
        };
        fourthmsg17 = new String[] {
               " يعتبر من الاعشاب الامنة اذا استهلك بكميات معتدلة الا ان استخدامه لفترات طويلة وبكميات كبيرة قد يسبب ظهور بعض الاعراض الجانبية كالصداع .",
               "ينصح بعدم استخدام الزعتر مع بعض المستحضرات الدوائية",
               "حبوب منع الحمل التي تحوي الاستروجين ( الاستراديول اتينيل استراديول) قد يقلل الزعتر من فعالية هذه الادوية.",
               "الادوية المستخدمة لعلاج مرض الزهايمر الاستخدام المتزامن يمكن ان يسبب في زيادة الاثار الجانبية لهذه الادوية.",
               "الادوية المضادة للتخثر(الوارفارين) والادوية المضادة للصفيحات( كلوبيوغريل) يمكن ان يسبب الزعتر في زيادة فعاليتها مما يزيد من خطر التعرض للنزبف."
        };
        fifthmsg17 = new String[] {
             " لا تتوافر ادلة كافية حول امان الزعتر خلال فترة الحمل والرضاعة الطبيعية الا انه يمكن استخدامه بصورة معتدلة كمنه للطعام."
        };
    }

    private void getDetail16() {
        headings16 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg16 = new String[] { "Calendula officinalis" };
        seondmsg16 = new String[] { "الازهار المجففة." };
        thirdmsg16 = new String[] {
                "يتمتع بخصائص مضادة للالتهاب وفعالية كمضاد اكسدة ومضاد للبكتريا ومضاد للفيروسات.",
                "يساعد على التئام الجروح والحروق وقرحة الساق الوريدية والقدم السكرية وكذلك يخفف من الالتهاب الفم الناتج عن العلاج الكيميائي.",
                "الزيت العطري المستخرج منه يتمتع بفعالية تقي من اشعة الشمس.",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية: يمكن لهذا النبات ان يسبب اعراض تحسسية.",
                "ينصح بعدم مشاركة الاقحوان مع بعض المستحضرات الدوائية ",
                "الادوية المهدئة المشاركة بينهما قد تسبب فرط النعاس ومشاكل في التنفس."
        };

        fourthmsg16 = new String[] {
                "ينصح بعدم استخدامها اثناء الحمل وخلال الارضاع الطبيعي لعدم وجود ادلة كافية حول امان استخدامها خلال هذه الفترة."
        };
    }

    private void getDetail15() {
        headings15 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg15 = new String[] { "Hibiscus sabdariffa" };
        seondmsg15 = new String[] { "سبلات وكوؤس الازهار." };
        thirdmsg15 = new String[] {
                " يتمتع هذا النبات بخصائص مضادة للالتهاب وفعالية خافضة لضغط الدم  وفعالية خافضة للسكر من النمط الثاني وكذلك خافضة للكولسترول  والشحوم الثلاثية كما اظهرت بعض الدراسات ان مستخلص الكركديه  له تاثير ايجابي على فقدان الوزن كما انه يتمتع بخصائص مضادة للاكسدة اضافة الى خصائصه الوقائية للكبد.",
                "ملين وطارد للبلغم من الطرق التنفسية كما انه بساعد في التخفيف من اعراض الرشح والتهابات الجهاز التنفسي العلوي.",
                "كما بينت بعض الابحاث فعالية زيت الكركديه في تحسين نمو الشعر.",
                "يتمتع شراب الكركديه بخصائص منشطة للهضم وخصائص مرطبة للجسم.",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية: يعتير شراب الكركديه امن اذا استهلك بكميات معتدلة دون الافراط في استخدامه",
                "نظرا لاحتوائه على نسبة عالية من اوكسالات الكالسيوم يمنع استخدامه من قبل مرضى الكلى والجهاز البولي.",
                "يوصى بعدم استخدامه من قبل الاشخاص ذوي الضغط الدموي المنخفض بسبب فعاليته الخافضة للضغط الدموي.",
                "يجب التوقف عن استهلاك الكركديه قبل العمليات الجراحية باسبوعين بسبب تاثيره الخافض للسكر.",
                "التتداخلات الدوائية: يوصى بعدم مشاركة الكركديه مع بعض الادوية:",
                "الاسيتامينوفين: المشاركة بينهما قد تسرع تخلص الجسم من الاسيتامينوفين",
                "الادوية الخافضة للضغط(فيراباميل املودبين ديلتيازيم وغيرها )",
                "المشاركة بينهما قد تسبب هبوط في الضغط الدموي.",
                "الادوية الخافضة للسكر ( انسولين خافضات سكر فموية) المشاركة بينهما قد تسبب هبوط في سكر الدم.",
                "الكلووكين يقلل الكركديه من فعالية هذا الدواء لذلك ينصح مرضى الملاريا المستخدمين لهذا الدواء بعدم استخدام الكركديه."
        };
        fourthmsg15 = new String[] {
                " يعتبر هذا النبات غير امن خلال فترة الحمل لانه قد يسبب تقلصات في الرحم وحدوث اجهاض او ولادة مبكرة.",
                "ينصح بعدم استهلاكه خلال الرضاعة الطبيعية لعدم توفر ادلة كافية عن امان استخدامه خلال هذه الفترة."
        };
    }

    private void getDetail14() {
        headings14 = new String[] {
               "tالاسم العلمي",
                "الجزء المستخدم من النبات ",
                "الخصائص والاستخدامات الطبية",
                "الامان اثناء الحمل"
        };
        firstmsg14 = new String[] { "Mellisa officinalis" };
        seondmsg14 = new String[] { "الاوراق والساق تستخدم هذه الاجزاء قبل ان يزهر النبات وتتميز باحتوائها على زيت عطري." };
        thirdmsg14 = new String[] {
                " تتمتع اوراق المليسة بفعالية مهدئة للجهاز العصبي المركزي وتاثير مضاد للتشنج المرافق للقلق والارق لذلك تستخدم لعلاج اضطرابات النوم والقلق اضافة الى فعاليتها كمضاد اكسدة .",
                "يستخدم الزيت الطيار المستخرج منها لعلاج التهاب الاغشية المخاطية في الجهاز الهضمي والجهاز التنفسي وذلك لخصائصه المضادة للبكتريا والفيروسات اضافة الى فعاليته كطارد للديدان المعوية.",
                "تخفف  المليسة من اعراض عسر الهضم والتلبك المعوي.",
                "تساعد المليسة في تهدئة التشنجات والام الحيض.",
                "يستخدم زيت المليسة موضعيا بشكل كمادات لعلاج الام الروماتيزم.",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية: ان استهلاك المليسة بكميات كبيرة قد يسبب التهاب الجلد وظهور اعراض تحسسية.",
                " يوصى بالتوقف عن استهلاك المليسة قبل الخضوع للعمليات الجراحية لان مشاركتها مع الادوية المستخدمة اثناء الجراحة وبعدها قد يسبب الخمول والنعاس الشديد.",
                "ينصح بعدم تناول المليسة مع بعض المستحضرات الدوائية:",
                "يوصى بعدم مشاركة المليسة مع ادوية الغدة الدرقية( الليفوتركسين) لان الاستهلاك المتزامن لهما قد يمنع امتصاص هذه الادوية",
                "الادوية المهدئة(الورازيبام الفينوباربيتال وغيرها) المشاركة بينهما قد تزيد من التائير المهدئ لهذه الادوية."
        };
        fourthmsg14 = new String[] {
                "ينصح عدم استهلاك المليسة اثناء الحمل والارضاع الطبيعي لعدم وجود ادلة كافية حول امان هذا النبات اثناء الحمل والارضاع."
        };
    }

    private void getDetail13() {
        headings13 = new String[] {
                "الاسم العلمي للنوع الامريكي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الامان اثناء الحمل"
        };
        firstmsg13 = new String[] { "Panax quinquefol" };
        seondmsg13 = new String[] { "الجذور" };
        thirdmsg13 = new String[] { " يتمتع الجنسنغ بخصائص مضادة للسرطان ولمرض السكري  وويستخدم ايضا لتحسين الاداء لدى الرياضيين وزيادة القدرة لديهم على التحمل كما ان له تاثيرات محفزة واخرى مثبطة للجهاز العصبي المركزي اضافة الى فعاليته في تحفيز جهاز المناعة  حيث انه  يسبب زيادة  في الخلايا التائية المساعدة واللمفاوية وكذلك يزيد من  الخلايا القاتلة الطبيعية ويحسن من الاستجابة المناعية ويحسن  الذاكرة لدى الاصحاء ولدى مرضى المصابين بالفصام ومرضى الزهايمر كما اشارت بعض الدراسات ان الجنسنغ قد يساعد في تخفيف من اعراض سن الياس وله فعالية مضادة لارتفاع الضغط الدموي كما انه يخفف من التعب المزمن مجهول السبب." };
        fourthmsg13 = new String[] {
                " ان استهلاك الجنسنغ بكميات كبيرة قد يسبب  الارق يجب استخدام هذا العقار بحذر لدى المصابين بسرطان الثدي لانه قد يحفز نمو خلايا سرطان الثدي.",
                "يوصى بعدم مشاركة الجنسنغ مع بعض المستحضرات الدوائية:",
                "الوارفارين حيث ان له فعالية مضادة لتاثير الوارفارين.",
                "الخمائر الكبدية السيتوكروم (CYP3A4) حيث انه يزيد من فعالية هذه الخمائر مما يؤثر على تركيز الادوية التي يتم استقلابها بواسطة هذه الخمائر."
        };
        fifthmsg13 = new String[] {
                "يعتبر هذا العقار غير امن اثناء الحمل لانه قد يسبب تشوهات للجنين اضافة الى اضرار للحامل كانخفاض في مستوى السكر الدموي ونزيف مهبلي.",
               "ينصح بعدم استخدامه اثناء الرضاعة الطبيعية لعدم وجود ادلة كافية عن امان استخدامه خلال هذه الفترة."
        };
    }

    private void getDetail12() {
        headings12 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الامان اثناء الحمل"
        };
        firstmsg12 = new String[] { "Camellia sinesis" };
        seondmsg12 = new String[] { "الاوراق" };
        thirdmsg12 = new String[] {
            "بينت بعض الدراسات ان استهلاك الشاي الاخضر قد يقلل من خطر الاصابة بالخرف وارتفاع الضغط الدموي وامراض القلب والاوعية الدموية كما يتمتع بفعالية خافضة للكولسترول السيء كما انه يقلل من مستويات السكر في الدم .",
            "الاستخدام الموضعي لمستخلصالشاي الاخضر يتمتع بفعالية مضادة للثاليل التناسلية الخارجية وكذلك الثاليل المتواجدة حول الشرج وتتمتع خلاصة الشاي الاخضر ايضا بتاثيرات مفيدة لعلاج حب الشباب.",
            "يتمتع الشاي الاخضر بفعالية مضادة للخلايا السرطانية كما ان له فعالية في الوقاية من الاصابة بسرطان الفم وكذلك  بخصائص وقائية للمرضى المعرضين للاصابة بسرطان الكبد وسرطان القولون والمستقيم اضافة الى فعاليته المضادة لسرطان الدم الليمفاوي المزمن.",
            "كما انه يساعد في تخفيف التهاب الجلد الناتج عن العلاج الاشعاعي لدى مرضى سرطان الثدي وكذلك في تخفيف التهاب المري الحاد الناتج عن العلاج الاشعاعي لمرضى سرطان الرئة.",
            "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية: يعتبر الشاي الاخضر امنا  عند استهلاكه بكميات معتدلة الا ان استهلاكه بكميات كبيرة  وبصورة مفرطة قد يسبب اضطرابات بالنوم , صداع  وذلك يرجع لوجود الكافيئين , سمية كبدية عند الاستهلاك المفرط من خلاصة الشاي الاخضر وكذلك قد يسبب نقص في صفيحات الدم وقد بينت الدراسات ان هذه الاثار تختفي  عند معالجتها  والتوقف عن استهلاك الشاي الاخضر بصورة مفرطة.",
            " بينت بعض الدراسات  ان استهلاك الشاي الاخضر بكميات كبيرة  من قبل المرضى المصابين بانواع معينة من السرطانات (ابياض الدم اللمفوي الحاد, سرطان الثدي ) يمكن ان يسبب الغثيان ,اضطرابات في وظائف الكبد ,عسر هضم, ارق.",
            "التداخلات الدوائية: ينصح بعدم المشاركة الشاي الاخضر مع بعض المستحضرات الدوائية",
            "المستحضرات الحاوية على الحديد  والادوية الحاوية على  حمض الفوليك  حيث وجد ان المشاركة بين هذه الادوية والشاي الاخضر قد يسبب نقص في التوافر الحيوي لها  وبالتالي نقص في فعاليتها لذلك ينصح بتناول الشاي الاخضرقبل تناول هذه المستحضرات بساعتين او بعد تناول هذه الادوية ب 4 ساعات.",
            "فيراباميل: الاعطاء المتزامن له مع الشاي الاخضر قد يسبب زيادة في التوافر الحيوي لهذا الدواء ممايزيد من احتمالية ظهور الاثار الجانبية له .",
            "الاسيتامينوفين ( الباراسيتامول) بينت بعض الدراسات التي اجريت على الحيوانات ان استهلاك الشاي الاخضر بعد استخدام الاسيتامينوفين قد سبب زيادة في السمية الكبدية لهذا الدواء.",
            "الادوية الخافضة للضغط الدموي ( حاصرات بيتا) كالنادولول تبين ان الاستخدام المتزامن لها مع الشاي الاخضر قد يسبب نقص في امتصاصها وفي  توافرها الحيوي وبالتالي يخفض من فعاليتها.",
            "مضادات التخثر( الوارفارين) والادية المضادة للصفيحات(كلوبيدوغريل ) استهلاك الشاي بالتزامن مع هذه الادوية يخفض من تاثيرالمضاد للتخثر الذي تتمتع به وذلك يعود لاحتواء الشاي الاخضر على فيتامين K.",
            "التاموكسيفين: المشاركة بينهما يمكن ان تسبب زيادة في امتصاص التاموكسيفين ممايزيد من ظهور الاثار الجانبية لهذا الدواء.",
            "الاتروبين:  قد يقلل الاعطاء المتزامن للمستحضرات الحاوية على الاتروبين والشاي الاخضر من امتصاص الاتروبين .",
            "الكودائين: يمكن ان تسبب المشاركة بينهما انخفاض في امتصاص الكودائين.",
            "خمائر السيتوكروم( P4503A4) يثبط الشاي الاخضر هذه الخمائر مما يؤثر على تركيز الادوية التي يتم استقلابها بواسطة هذه الخمائر.",
            "الادوية المضادة للسرطان (بورتيزوميب): قد تسبب المشاركة بينهما تثبيط  لفعالية هذا الدواء.",
            "الادينوزين: الاستخدام المتزامن بينهما يثبط تاثير الادينوزين المستخدم في اختبار جهد القلب لذلك يوصى بالتوقف عن استهلاك الشاي الاخضر قبل اجراء هذا الاختبار ب24 ساعة.",
            "المضادات الحيوية من فئة الكينولون: المشاركة بينهما قد تسبب بظهور الاثار الجانبية للكافيئين المتواجد في الشاي الاخضركالصداع وزيادة معدل ضربات القلب لان هذه الادوية تقلل من سرعة تفكك الكافيئين."
        };
        fourthmsg12 = new String[] {
                " على الرغم من ان هيئة الغذاء والدواء الامريكيةFDAتعتبر الشاي الاخضر من المواد امنة الاستخدام الا انه يوصى بعدم استهلاكه بكميات كبيرة اثناء الحمل لاحتوائة على الكافيئين  اضافة الى احتوائه على مركبات تقلل من امتصاص حمض الفوليك الضروري لمنع حدوث تشوهات عصبية لدى الجنين.",
                "وكذلك الامر بالنسبة للارضاع الطبيعي وذلك لان الشاي ينتقل الى حليب الثدي مما يسبب اضطرابات بالنوم لدى الرضع."
        };
    }

    private void getDetail11() {
        headings11 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الامان اثناء الحمل"
        };
        firstmsg11 = new String[] { "Senna alexandrina" };
        seondmsg11 = new String[] { "الثمار والاوراق المجففة." };
        thirdmsg11 = new String[] {
                " تعتبر السنا من افضل الملينات حيث اثبتت الدراسات ان اوراق وثمار هذا العقارتعتبر ملين لطيف اذا استخدم بجرعات معتدلة وترجع هذه الفعالية لاحتوائه على مركبات انتراكينونية ويتميز هذا العقار بعدم تاثيره على المعدة والامعاء الدقيقة انما تاثيره ينحصر فقط على الامعاء الغليظة ولذلك فهو لا يؤثر على امتصاص المواد الغذائية بعد الاسهال ولا يسبب خمول بحركة الامعاء وبالتالي لا يصاب مستخدمي هذا العقار بالامساك بعد الاسهال كما هو الحال في باقي الملينات.",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية: ",
                "ينصح بعدم استخدام اوارق السنا الجافة بشكل مسحوق لان ذلك قد يسبب مغص قوي.",
                "استخدام السنا بصورة غيرمتكررة وبحرعات معتدلة لا يسبب ظهور اثار جانبية الا ان استمرار استخدامه لفترات طويلة  او استهلاكه بكميات كبيرة يمكن ان يسبب مشاكل في القولون  واسهال شديد الذي يؤدي للجفاف .",
                "لا ينصح باستخدامه في حال وجود التهاب امعاء او التهاب زائدة دودية او انسداد في الامعاء او في حال وجود مشاكل في الكبد.",
                "ينصح بعدم مشاركة عقار السنا مع بعض المستحضرات الدوائية :",
                "الديجوكسين  قد يسبب استخدامهما بشكل متزامن بظهور الاثار الجانبية للديجوكسين وذلك برجع لتاثير السنا المخفض لمستوى البوتاسيوم في الدم.",
                "المدرات البولية قد يسبب مشاركتهما معا انخفاض كبير في مستوى البوتاسيوم في الدم لان كل منهما يملك تاثير خافض للبوتاسيوم.",
                "الادوية المميعة للدم (الوارفارين) يمكن ان يسبب المشاركة بينهما من خطر التعرض للنزيف.",
                "مانعات الحمل الفموية التي تحوي الاستروجين المشاركة بينهما قد يخفض من فعالية هذه الادوية."
        };
        fourthmsg11 = new String[] {
                "يجب عدم استخدام  عقارالسنا اثناء الحمل لعدم توفر ادلة كافية حول امان استخدامه خلال هذه الفترة."
        };
    }

    private void getDetail9() {
        headings9 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الامان اثناء الحمل"
        };
        firstmsg9 = new String[] { "Zingiber officinalle" };
        seondmsg9 = new String[] { "الجذامير والزيت المستخرج منها." };
        thirdmsg9 = new String[] {
                "يتمتع الزنجبيل بخصائص مضادة للقيء والغثيان لذلك يستخدم في تخفيف القيء لدى المرضى الخاضعين للجراحة وكذلك يساعد في تخفيف القيء المرتبط بالعلاج الكيميائي وكذلك  يتمتع بخصائص مضادة للالتهاب وله فعالية كمضاد اكسدة  كما انه يتمتع بخصائص مضادة للصفيحات  ومضادة للتخثرفهويمنع تجمع الصفيحات الدموية ويمنع تشكل الخثراتوله فعالية في تخفيض مستوى الدهون والكولسترول السيء في الجسم وكذلك يتمتع بفعالية خافضة لسكر الدم لدى الاشخاص المصابين بالنمط الثاني من السكري وكذلك ييمتع بفعالية مضادة لالتهاب المفاصل والام اسفل الظهر. ",
                "اثبتت بعض الدراسات ان الزنجبيل يساعد على تخفيض الوزن  وذلك يرجع لتاثيره في تخفيض تراكم الدهون  في الجسم وكذلك يقلل من مؤشر كتلة الجسم ومن مستويات الانسولين في الدم.",
                "يستخدم كمسكن فعال  لالام الطمث وكذلك مسكن لالام الصداع النصفي.",
                "تتمتع المستحضرات الحاوية على الزنجبيل بتاثيرات وقائية للاشخاص المعرضين للاصابة بسرطان القولون"
        };
        fourthmsg9 = new String[] {
                "من الاثار الجانبية الشائعة للزنجبيل هي الحرقة المعدية والتهاب الجلد.",
                "يوصى بعدم استخدام الزنجبيل والمستحضرات الحاوية عليه قبل اجراء العمليات الجراحية وذلك لخصائصه المضادة للتخثر",
                "كذلك يجب تجنب استخدام هذا العقار من قبل المرضى المصابين باضطرابات نزفية.",
                "ويوصى بتجنب استخدامه من قبل المصابين بحصوات في المرارة.",
                "يوصى بتجنب استهلاك الزنجبيل والمستحضرات التي يدخل في تركيبها مع مجموعة من الادوية:",
                "مضادات الالتهاب غير الاستروئيدية: (الايبوبروفين ديكلوفيناك وغيرها) الجمع بينهما قد يزيد من خطر النزيف.",
                "مضادات التخثر مضادات الصفيحات: ان الاستخدام المتزامن مع هذه الادوية قد يزيد من خطر النزيف.",
                "الادوية الخافضة لسكر الدم (الانسولين) : الجمع بينهما يمكن ان يسبب انخفاض في مستوى السكر في الدم",
                "السيكلوسبورين: استهلاك الزنجبيل بالتزامن مع السيكلوسبورين يسبب انخفاض في تركيز هذا الدواء وبالتالي يخفض من فعاليته.",
                "تاكروليموس: استخدام الزنجبيل مع هذا الدواء قد تسبب زيادة في تركيزالدواء في الدم."
        };
        fifthmsg9 = new String[] {
                " يوصى بتجنب استخدام المستحضرات التي تحوي الزنجبيل اثناء الحمل والارضاع الطبيعي  بسبب نقص في المعلومات حول تاثيراته على تطور الجنين في الدراسات التي اجريت على الحيوانات ."
        };
    }

    private void getDetail8() {
        headings8 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الامان اثناء الحمل"
        };
        firstmsg8 = new String[] { "Glycyrrhiza glabra" };
        seondmsg8 = new String[] { "الجذور المجففة غير المقشورة." };
        thirdmsg8 = new String[] {
                " يتمتع هذا العقار بفعالية مضادة لتقرحات المعدة المسببة (Helicobacter pylori) وكذلك فعالية مضادة للاورام ويمتلك كذلك خصائص مضادة للوذمات وله تاثير مضاد للمركبات الحالة للدم وكذلك له فعالية خافضة لشحوم الدم كما اثبتت الدراسات فعاليته المضادة لبعض انواع الفيروسات منها فيروس التهاب الكبد B لذلك يستخدم في علاج التهاب الكبد الفيروسي المزمن وكذلك فيروس Herpes) simplex ) المسبب لتقرحات المناطق التناسلية كما انه يتمتع بتاثير مضاد لفطور(Candida alibicans) المسببة للالتهابات النسائية التناسلية ويتمتع ايضا تاثيرات استروجينية.",
                "يستخدم السوس لعلاج التهابات الجهاز التنفسي  كما انه يزيد من المادة المخاطية التي تقي جدار المعدة ويقلل من افراز الحمض المعدي ويساهم في التئام القرحة.",
                "يتمتع بفعالية مميعة للدم ومانعة لتجلطه لوجود مركبات كومارينية اي انه يقلل من الجلطات الدموية وجلطات الدماغ.",
                "لهذا العقار فعالية في ايقاف تطور سرطان الثدي وسرطان البروستات وذلك لوجود مركب فينولي يعرف ب(BHP) الذي يثبط نشاط البروتين المسوؤل عن تكاثر الخلايا السرطانية."
        };
        fourthmsg8 = new String[] {
                " قد يسبب هذا العقار الام في الراس, و احتباس الصوديوم والماء مما يسبب وذمة كما ان استهلاكه بكميات كبيرة قد يسبب فشل قلبي ,ورجفان بطيني عدم انتظام في ضربات القلب ,قلة الصفيحات ,اعتلال كلوي واعتلال لشبكية العين .",
                "كما اثبتت بعض الدراسات ان استهلاكه بكميات معتدلة بصورة متكررة قد يسبب ارتفاع في الضغط الدموي و ونقص مستوى البوتاسيوم في الدم.",
                "الاستهلاك المفرط من السوس يمكن ان يسبب نزيف دموي في المخ وكذلك السكتات القلبية ويزيد من معدل حدوث الولادة المبكرة .",
                "يوصى بدم تناول السوس مع بعض المستحضرات الدوائية:",
                " مضادات التخثر( الوارفارين) : السوس يقلل من فعالية الوارفارين لانه يسرع من تحطمهداخل الجسم  ممايزيد من خطر تشكل الجلطات.",
                "الغليكوزيدات القلبية (الديجوكسين) الجمع بينهما قد يسبب ظهور اثار سامة للديجوكسين وذلك لان السوس يسبب انخفاض في مستوى البوتاسيوم.",
                "المدرات الطارحة للبوتاسيوم : الجمع بينهما قد يسبب نقص كبير في مستوى البوتاسيوم الدموي ممايزيد من فعالية هذه المدرات.",
                "المدرات الحافظة للبوتاسيوم (سبيرونولاكتون) : الجمع بينهما يسبب نقص في فعالية هذه المدرات.",
                "الادوية الخافضة لضغط الدم وذلك بسبب تاثيرها المعاكس لتاثير السوس.",
                "اسيتات الكورتيزون المستخدم لدى المرضى المصابين بداء اديسون قد يسبب الجمع بينهما من زيادة التوافر الحيوي لاسيتات الكورتيزول.",
                "مثبطات الاوكسيداز احادي الامين(MAOIs ) الجمع بينهما قد يزيد من فعالية هذه الادوية وبالتالي يزيد من ظهور الاثار الجانبية لها كالصداع والرعاش.",
                " له تاثير على خمائر الكبد السيتوكروم p450 (CYP3A, CYP2D6) ممايزيد من فعالية بعض الادوية التي تستقلب عن طريق هذه الخمائر ويزيد من احتمال ظهور اثارها الجانبية من هذه الادوية الفينوباربيتال ديكساميتازون الايبوبروفين لوزارتان لوفاستاتين وغيرها .",
                "السيكلوسبورين : قد يقلل  الجمع بينهمامن التوافر الحيوي للسيكلوسبورين وذلك بسبب تاثير السوس المنشط للخمائر الكبديةCYP3A) ) المسوؤلة عن استقلاب السيكوسبورين."
        };
        fifthmsg8 = new String[] {
                "يوصى بتجنب استخدام عقار السوس اثناء الحمل وذلك لاحتواءه على كميات كبيرة من مركب الجليسرزين الذي قد يسبب اثار ضارة للجنين وكذلك يوصى بتجنب استهلاكه اثناء الرضاعة الطبيعية لعدم وجود دراسات كافية حول امان استخدامه اثناء هذه الفترة."
        };
    }

    private void getDetail7() {
        headings7 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات مع المستحضرات الدوائية",
                "الامان اثناء الحمل"
        };
        firstmsg7 = new String[] { "Rosmarinus officinalis" };
        seondmsg7 = new String[] { "القمم المزهرة واوراق النبات المجففة وكذلك الزيت المستخرج منها." };
        thirdmsg7 = new String[] {
                "يتمتع هذا العقار بخصائص حالة لتشنجات المرارة وخصائص واقية للكبد وخصائص مثبطة لنمو الاورام اضافة الى فعاليته كمضاد اكسدة .",
                "يستخدم لعلاج ارتفاع ضغط الدم واضطرابات الجهاز الهضمي  وذلك يرجع لفعاليته الحالة لتشنجات العضلات الملساء في الجهاز الهضمي وكذلك يستخدم لعلاج مرض الزهايمر لاحتوائه على مركبات تمنع تخرب الاستيل كولين في الدماغ.",
                "يمكن استخدام الزيت بشكل موضعي لعلاج الام المفاصل والروماتيزم وعرق النسا  وكذلك لتطهير الجروج على شكل كمادات كما انه يساعد في ترميم الانسجة الجلدية وتسكين الالام العضلية.",
                "يتمتع بقعالية مضادة لتساقط الشعر ويزيد من نموه لانه يزيد من تدفق الدم الى فروة الراس."
        };
        fourthmsg7 = new String[] {
                "يتمتع اكليل الجبل بهامش امان جيد وذلك عند استخدامه بصورة معتدلة اذ ان الافراط في تناول هذا العقار قد يسبب القيء, تهيج الجلد, نزيف الرحم, الارق ,التهاب الامعاء.",
                "يوصى بعدم الجمع بين اكليل الجبل وبعض المستحضرات الدوائية",
                "الادوية المضادة للتخثر والمضادة للصفيحات ( الوارفارين الاسبرين)",
                "الادوية الخافضة للضغط الدموي من فئة مثبطات الانزيم المحول للانجبوتنسين.",
                "مدرات البول.",
                "الادوية المضادة للاكتئاب التي يدخل في تركيبها الليثيوم."
        };
        fifthmsg7 = new String[] { "ان استهلاك اكليل الجبل بكميات كبيرة خلال الحمل غير امن وقد يسبب نزيف بالرحم والاجهاض." };
    }

    private void getDetail6() {
        headings6 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات مع المستحضرات الدوائية",
                "الامان اثناء الحمل ",
                "يجب عدم استخدامها اثناء الارضاع الطبيعي  لانها تقلل من افراز الحليب"
        };
        firstmsg6 = new String[]{ "Salvia officinalis" };
        seondmsg6 = new String[]{ "الاوراق والازهار والزيت  الطيارالمستخرج منهما." };
        thirdmsg6 = new String[]{
                " يتمتع زيت المريمية  بفعالية مضادة للجراثيم والفطور والفيروسات وخصائص مضادة لارتفاع ضغط الدم وكذلك فعالية مضادة للتعرق  الزائد و فعالية مضادة لارتفاع سكر الدم وكذلك فعالية مزيلة لتشنجات العضلات الملساء اضافة الى فعاليته كمضاد للوذمة.",
                "يمكن استخدام  الزيت بشكل غرغرة لعلاج التهاب الاغشية المخاطية للثة والفم والبلعوم ."
        };
        fourthmsg6 = new String[]{
                "يمكن ان يسبب هذا العقار نوبات صرع وتهيج للجلد.",
                "يمنع استخدام المريمية من قبل الاشخاص المصابين بالصرع لان الكميات الكبيرة من مركب الثوجون تسبب حدوث نوبات صرع.",
                "يوصى بعدم تناول المريمية مع بعض الادوية",
                "الادوية الخافضة لسكر الدم (الانسولين وخافضات السكر الفموية)",
                "الادوية المستخدمة لعلاج الصرع ( الفينوباربيتال , كاربامازبين , فالبريك اسيد , جابابنتين ) وذلك لان المريمية تؤثر على النواقل الكيميائية في المخ  بشكل معاكس لهذه الادوية.",
                "الادوية المهدئة والحالة للقلق (لورازيبام, الفينوباربيتال, زولبيديم) وذلك لان الجمع بينهما يسبب الافراط في النعاس كما انها تزيد من تائيرالمهدئ لهذه الادوية. "
        };
        fifthmsg6 = new String[]{ "يمنع استخدام المريمية اثناء الحمل لانها قد تسبب الاجهاض لوجود مركب الثوجون." };
        sixthmsg6 = new String[] {""};
    }

    private void getDetail5() {
        headings5 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية ",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الامان الاثناء الحمل"
        };
        firstmsg5 = new String[]{"Coeffia arabica"};
        seondmsg5 = new String[]{"البذور"};
        thirdmsg5 = new String[]{
                " تتمتع بذور القهوة بتاثير منشط للجهاز العصبي المركزي وذلك لاحتوائها على الكافيئين وكذلك بخصائص مدرة للبول وذلك يرجع لاحتوائها على مركب الثيوبرومين اضافة الى فعاليتها المنشطة للهضم وذلك لاحتوائها على حمض الكلوروجينيك.",
                "اثبتت الدراسات ان الكافيئين يساعد مرضى الزكام على الشعور بنشاط اكبر وكذلك يساعد الاشخاص المسنين على التقليل من  اصابتهم بانخفاض الضغط الدمويبعد تناول الطعام."
        };
        fourthmsg5 = new String[]{
                " قد يكون تناول القهوة غير مناسب لبعض الاشخاص كالحوامل والمرضعات ومرضى ارتفاع ضغط الدم ومرضى ارتفاع الكوليسترول والمصابين بالقرحة المعديةو الاشخاص الذين يعانون من عدم انتظام ضربات القلب والمصابين بفرط نشاط الغدة الدرقية لذلك هؤلاء الاشخاص يجب ان يكون استهلاكهم للقهوة بصورة خفيفة.",
                "من ابرز الاثار الجانبية للقهوة زيادة التبول ,صداع بسبب ارتفاع الضغط الدموي وتسرع بضربات القلب وكذلك قد يسبب استهلاك القهوة رجفان عضلي وكذلك يمكن ان تسبب قلص مريئي معدي وقلق.",
                "يجب عدم مشاركة الكافيئين مع بعض المستحضرات الدوائية حيث انها تؤثر على امتصاص بعض الادوية حيث تسبب زيادة امتصاص بعضها وتقلل من امتصاص ادوية اخرى ممايؤثر على فعالية الادوية اويزيد من احتمال ظهور الاثار الجانبية لهذه الادوية اهمها: الاسبرين , البنزوديازبينات, الباراسيتامول الادوية الخافضة لسكر الدم, الافدرين, مركبات بيتا ادرينيرجيك كالتالينول, الثيوفيللين, الليثيوم , المستحضرات الحاوية على الحديد وكذلك مانعات الحمل الفموية حيث ان الجمع بينهما قد يسبب في تعزيز الاثار السلبية لهذه الادوية او تقلل من فعاليتها .",

        };
        fifthmsg5 = new String[]{
                " ان الكميات المعتدلة من الكافيئين ( 200- 300 ملليجرام) ما يعادل من فنجان الى فنجانين قهوة يوميا  لا تضر بالجنين اما الجرعات العالية  منه ما يعادل سبعة فناجين من القهوة  يوميا  له تاثيرات سلبية على الجنين حيثيسبب انخفاض وزن الجنين ويمكن ان يسبب موت الجنين داخل الرحم ."
        };
    }

    private void getDetail4() {
        headings4 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية ",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "ينصح بعدم استخدام البردقوش مع بعض المستحضرات الدوائية",
                "الاستخدام اثناء الحمل "
        };
        firstmsg4 = new String[] {"Origanum syriacum"};
        seondmsg4 = new String[] {"جميع الاجزاء الهوائية للنبات المزهر النامية فوق سطح التربة وكذلك الزيت العطري المستخرج منها."};
        thirdmsg4 = new String[] {
                "ان زيت البردقوش الطيار له فعالية كمضاد للجراثيم والفطور والفيروسات , ويستخدم هذا الزيت موضعيا لعلاج التهابات الجلد والجروح والحروق والتهابات المفاصل .",
                "اما مستخلص النبات فيتمتع بخواص كمضاد اكسدة وخواص محفزة لجهاز المناعة ومزيل للارق ومسكن لالام الطمث ومنظما للدورة الشهرية, كما ان مغلي النبات  يتمتع بخواص مقشعة ومهدئة للربو ومسكنة للسعال ومضادة لتشنج المعدة وطاردة للغازات وكذلك يستخدم لعلاج التهاب الاغشية المخاطية للجهازين الهضمي والتنفسي والتهاب الجهاز البولي.",
        };
        fourthmsg4 = new String[] {
                "الاستخدام لفترات طويلة يمكن ان يسبب التهاب في الجلد والعين",
                "ينصح الالشخاص الذين يعانون من حساسية تجاه بعض الاعشاب كالمريمية والنعناع والخزامي بعدم استخدام البردقوش."
        };
        fifthmsg4 = new String[] {
                "الادوية الخافضة لسكر الدم المشاركة مع البردقوش قد تسبب انخفاض في مستوى سكر الدم.",
                "الادوية المضادة للتخثر تناول البردقوش مع هذه الادوية يمكن ان يسبب زيادة احتمال حدوث خطر النزيف",
                "الادوية المضادة للكولين(الاتروبين سكوبولامين) التي تستخدم لعلاج مرض الغلوكوما والزهايمر استخدام البردقوش مع هذه الادوية قد يسبب ظهور الاثار الجانبية لهذه الادوية."
        };
        sixthmsg4 = new String[] { " يعتبر هذا العقار غير امن اثناء الحمل  لعدم توفر دراسات وابحاث كافية تثبت امان استخدامه خلال هذه الفترة." };
    }

    private void getDetail3() {
        headings3 = new String[] {"الاسم العلمي", "الجزء المستخدم من النبات", "الخصائص والاستخدامات الطبية", "الاثار الجانبية وموانع الاستخدام", "التداخلات الدوائية", "الاستخدام اثناء الحمل"};
        firstmsg3 = new String[] {"Alo vera, Aloe barabadensis, Aloe capennsis))"};
        seondmsg3 = new String[] {"الاوراق والهلام المستخرج من الاوراق."};
        thirdmsg3 = new String[] {
            "تتمتع عصارة الصبر بفعالية ملينة لذلك تعتبر من اهم العقاقير التي تستخدم لعلاج الامساك بجرعات خفيفة وكذلك لها فعالية مطهرة للجهاز الهضمي ومحسنة لعملية الهضم.",
            "الانزيمات والفيتامينات المتواجدة في هذا العقار تسرع عمليات الاستقلاب وحرق الدهون وتخفض معدل الكوليسترول وتنشط وظائف الكبد وانتاج الكريات البيضاء وبذلك  فهي تحفزجهاز المناعة.",
                "اشارت بعض الدراسات ان خلاصة الصبر الهلامية لها خصائص مضادة للالتهاب الناتجة عن بعض انواع البكتريا والفيروسات والفطور وقد ثبتت فعاليتها في علاج التهابات الجيوب والحنجرة والملتحمة وذلك يرجع لمركب الو-ايمودين(aloe-emodin) المتواجد فيها.",
                "كما يتمتع هذا العقار بخصائص مضادة للاكسدة ترجع لوجود الفيتامينات والاحماض الامينية.",
                "اضافة الى فعاليته في تخفيض الوزن ومقاومة الانسولين لدى المصابين بالسمنة المفرطة والذين يعانون من مرض السكر.",
                "مستخلص نبات الصبارفعال لعلاج التهاب اللثة وتشكل الجير السني .",
                "كما يتمتع هذا العقار في فعالية مضادة لنمو  بعض انواع من الخلايا السرطانية.",
                "يمكن استخدام هلام الصبار موضعيا لخصائصه المحفزة والمسرعة لالتئام الجروح والحروق السطحية ولذلك تستخدم مستحضرات هذا العقار لتسريع شفاء الجروح بعد عمليات التجميل الجراحية اضافة الى فعاليتها المرطبة للبشرة الجافة وتستخدم ايضا لعلاج الكثير من الامراض الجلدية كحب الشباب والاكزيما وتستخدم المستحضرات التي تحتوي هذا العقار لعلاج تساقط الشعر."
        };
        fourthmsg3 = new String[] {
          "يسبب تشنج للجهاز الهضمي لذلك ينبغي تخفيض الجرعة في هذه الحالة.",
          "يجب عدم استخدام هذا العقار من قبل المرضى المصابين بداء كراون او التهاب الزائدة الدودية.",
                "الاستخدام لفترات طويلة قد يسبب التهاب الجلد , اكزيما , نقص البوتاسيوم, بيلة الالبومين وكذلك قد يسبب تصبغ الاغشية المخاطية المعويةوهذا ما يعرف بالورم الميلاني الكاذب الذي يمكن التخلص منه بالتوقف عن تناول العقار وكذلك قد يسبب سمية لانسجة الكبد و ضعف في الغدة الدرقية.",
                "ادرجت هيئة الغذاء والدواء الامريكية (FDA) بان عقار الصبار غير امن كملين منبه للامعاء."
        };
        fifthmsg3 = new String[]{
          "يوصى بعدم الجمع بين عقار الصبار وبعض المستحضرات الدوائية",
          "الملينات المنبهة للامعاء قد يسبب الجمع بينهما فرط في تحفيز الامعاء ممايؤدي الى الاصابة بالاسهال الحاد والجفاف.",
          "المدرات البولية قد يسبب  الجمع بينهما انخفاض في مستوى البوتاسيوم في الدم .",
          "سيفوفلوران قد يسبب استخدامهما معا من خطر حدوث نزف لان كل منهما له تاثير مبطئ لتخثر الدم.",
          "الادوية الخافضة لسكر الدم يمكن ان يسبب الجمع بينهما انخفاض في مستوى السكر في الدم بشكل غير طبيعي",
          "له تاثير على خمائر السيتوكروم P450(CYP3A4, CYP2D6) مما يؤثر على امتصاص الجسم لبعض الادوية الفموية  التي يتم استقلابها بواسطة هذه الخمائر وكذلك على تركيز هذه الادوية في الجسم مما يؤثرعلى فعاليتها.",
          "الديجوكسين الجمع بينهما يمكن ان يسبب بظهور الاثار الجانبية للديجوكسين بسبب تاثير الخافض للبوتاسيوم الذي يسببه هذا العقار. "
        };
        sixthmsg3 = new String[] {
          " يعتبر هذا العقار غير امن اثناء الحمل."
        };
    }

    private void getDetail2() {
        headings2 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الاستخدامات والخصائص الطبية",
                "tالاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "الاستخدام اثناء الحمل ",
                "يوصى بعدم تناول الحبة السوداء مع الادوية التالية"
        };
        firstmsg2 = new String[] {
                "Nigella sativia"
        };
        seondmsg2 = new String[]{
          "البذور الناضجة والزيت العطري المستخرج منها."
        };
        thirdmsg2 = new String[]{
          "ان لحبة البركة خواص محفزة لجهاز المناعة فهي تزيد من عدد الخلايا  اللمفاوية التائية والخلايا القاتلة الطبيعية وتتمتع بخواص مضادة للفيروسات والبكترياوخاصة بكتريا الجهاز التنفسي والهضمي والبولي.",
                "كما يتمتع الزيت الطيار بخواص مضادة للاكسدة وله فعالية مثبطة لنمو خلايا سرطان الثدي.",
                "اثبتت الدراسات فعالية مركب النيجلون المتواجد في الحبة السوداءفي حماية الجسم من سموم المركبات التي قد يتعرض لها.",
                "الثيموكينون الذي يعتبر المركب الفعال في الحبة السوداء  له تاثيرفي حماية القلب والشرايين من التاثيرات الضارة لارتفاع مركب الهموسيستسن (homosystein) الذي يسبب ارتفاعه ازدياد نسبة حدوث امراض القلب والشرايينكما يرفع الثيموكينون من مستوى الكولسترول المفيد في الجسم.",
                "ويتمتع الثيموكينون بتاثير واقي من الاعتلال الكلوي لانه يثبط طرح الالبومين والبروتين في البول وله ايضا خصائص وقائية في حماية غشاء المعدة من التاثيرات المخرشة.",
                " كما اثبتت العديد من الدراسات التي اجريت على الحيوانات فعالية حبة البركة في العلاج والوقاية من  الربو والسعال وذلك بسبب تاثيرها المرخي لعضلات الرغامى.",
                "بينت دراسات اجريت على الحيوانات فعاليتها في خفض مستوى السكر في الدم وزيادة افراز الانسولين.",
                "الاحماض الدهنية في حبة البركة تتمتع بتاثيرات ايجابية على صحة الجلد والشعر والاغشية المخاطية."
        };
        fourthmsg2 = new String[] {
                "تم تاكيد السمية المنخفضة وهامش امان واسع للحبة السوداء في العديد من الدراسات التي اجريت على الحيوانات ووفقا لهذه الدراسات يجب مراعاة التغيرات في استقلاب الهيموغلوبين وانخفاض تعداد الكريات البيضاء والصفائح الدموية",
                "الجرعات الكبيرة منها لها تاثيرات سامة على التركيب النسيجي للكلى وبدرجة اقل على الكبد ويجب استخدامها بجرعات مناسبة.",
                "يجب عدم استخدامها عند الاشخاص الذين يعانون من الحساسية لاحد المركبات المتواجدة في الحبة السوداء."
        };
        fifthmsg2 = new String[] {
            "تستخدم بحذز خلال فترة الحمل والارضاع  فهي تعتبر غير امنة خلال الحمل والارضاع "
        };
        sixthmsg2 = new String[] {
            "لها تاثير على الخمائرالكبديةالسيتوكروم(CYP450 )  حيث انها تثبط (CYP3A4, CYP2D6)مما يؤثر على تركيز وفعالية الادوية التي تستقلب بواسطة هذه الخمائر.",
            "الادوية الخافضة للسكر( انسولين ميتفورمين وغيرها) المشاركة مع الحبة السوداء قد يسبب اخفاض في مستوى السكر في الدم.",
            "الادوية المضادة لتخثر الدم والمضادة للصفيحات(الوارفرين, الهيبارين كلوبيدوغريل وغيرها) الاستخدام مع الحبة السوداء قد يزيد من احتمالية حدوث النزيف.",
            "الادوية الخافضة للضغط الدموي( فيراباميل ,نيفيدبين وغيرها)"
        };
    }

    private void getDetail1() {
        headings1 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم",
                "الاستخدامات  والخصائص الطبية",
                "الاثار الجانبية وموانع الاستخدام والتداخلات الدوائية",
                "ينصحبعدم مشاركته مع بعض الاصناف الدوائية",
                "الاستخدام اثناء الحمل"
        };
        firstmsg1 = new String[]{"(MatricariaChamomilla)"};
        seondmsg1 = new String[]{"الرؤوس المزهرة والزيت العطري المستخرج منها"};
        thirdmsg1 = new String[]{
                "الازهار والزيت العطري يتمتعان بخواص مضادة للالتهاب,مزيلة لتشنجات العضلات الملساء,يساعد على ترميم الجروح والتقرحات,مضاد للبكتريا ومثبط لنموها.",
                "يمكن ان يستخدم داخليا لعلاج تشنجات الجهاز الهضمي ولعلاج تخرش الاغشية المخاطية للفم والبلعوم والطرق التنفسية العلوية ويتمتع بفعالية لعلاج التهاب القصبات الهوائية المزمن والسعال الديكي ويستخدم لعلاج الحمى بسبب فعاليته كخافض للحرارة.",
                "كذلك يمكن ان يستخدم موضعيا بشكل غرغرة لعلاج التهاب اللثة او بشكل نشوق لعلاج التهابات الجهاز التنفسي او بشكل غسول لعلاج التهابات المسالك التناسلية والتهاب الجلد والاغشية المخاطية وكذلك يمكن ان يستخدم بشكل حمامات للتخفيف من الام البواسيرولعلاج الامراض النسائية الالتهابية.",
                "كما يستخدم كمهدئ ومزيل للقلق ."
        };
        fourthmsg1 = new String[]{
                "التهاب الملتحمة الارجي, تهيج الجلد, اعراض تحسسية حادة (ضيق نفس حكة, طفح جلدي, ازيز).",
                "لذلك يجب استخدام البابونج بحذر لدى الاشخاص الذين يعانون من حساسية لمكونات الزيت العطري وكذلك لدى الاشخاص الذين يعانون من حساسية شديدة من بعض الاعشاب كعشبة الرجيد(Ragweed)."
        };
        fifthmsg1 = new String[]{
                "البنزوديزبينات حيث يطيل البابونج من التاثير المهدئ لهذه المركبات.",
                "مضادات التخثر: قد يزيد تناول البابونج مع هذه الادوية من خطر  الاصابة بالنزيف.",
                "الادوية التي تحوي الحديد في تركيبها:  حيث يقلل البابونج من امتصاص الحديد."
        };
        sixthmsg1 = new String[]{"يجب تجنب استخدام  عقار البابونج اثناء الحمل لانه قد يحرض الاجهاض كما ان بعض مكوناته قد سببت الضرر عند اجنة الحيوانات."};

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