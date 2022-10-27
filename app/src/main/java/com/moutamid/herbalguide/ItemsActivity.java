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
    String[] seventhmsg1, seventhmsg2, seventhmsg3, seventhmsg4, seventhmsg5, seventhmsg6, seventhmsg7, seventhmsg8, seventhmsg9, seventhmsg10, seventhmsg11, seventhmsg12, seventhmsg13, seventhmsg14, seventhmsg15, seventhmsg16, seventhmsg17, seventhmsg18, seventhmsg19, seventhmsg20, seventhmsg21, seventhmsg22, seventhmsg23, seventhmsg24, seventhmsg25, seventhmsg26, seventhmsg27;


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

    private void getDetail15() {
    }

    private void getDetail14() {
    }

    private void getDetail13() {
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