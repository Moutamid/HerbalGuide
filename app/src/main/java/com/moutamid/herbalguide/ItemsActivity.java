package com.moutamid.herbalguide;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.herbalguide.adapter.ItemAdapter;
import com.moutamid.herbalguide.model.ItemDetailModel;

import java.util.ArrayList;

public class ItemsActivity extends AppCompatActivity {

  //  TextView page1, page2, page3, page4, page5;
  //  ImageView next, prev;
    boolean enabled = true;
    int count = 1;
    RecyclerView recyclerView;
    ItemDetailModel model1, model2, model3, model4, model5, model6, model7, model8, model9,
            model10, model11, model12,
            model13, model14, model15, model16, model17, model18, model19, model20,
            model21, model22, model23,
            model24, model25, model26, model27,model28,model29,model30,model31,model32,model33;
    ArrayList<ItemDetailModel> list;
    ItemAdapter adapter;
    SearchView searchView;

    String[] headings1, headings2, headings3, headings4, headings5, headings6, headings7, headings8, headings9, headings11, headings12, headings13, headings14, headings15, headings16, headings17, headings18, headings19, headings20, headings21, headings22, headings23, headings24, headings25, headings26, headings27, headings28, headings29, headings30, headings31, headings32, headings33;
    String[] firstmsg1, firstmsg2, firstmsg3, firstmsg4, firstmsg5, firstmsg6, firstmsg7, firstmsg8, firstmsg9, firstmsg11, firstmsg12, firstmsg13, firstmsg14, firstmsg15, firstmsg16, firstmsg17, firstmsg18, firstmsg19, firstmsg20, firstmsg21, firstmsg22, firstmsg23, firstmsg24, firstmsg25, firstmsg26, firstmsg27, firstmsg28, firstmsg29, firstmsg30, firstmsg31, firstmsg32, firstmsg33;
    String[] seondmsg1, seondmsg2, seondmsg3, seondmsg4, seondmsg5, seondmsg6, seondmsg7, seondmsg8, seondmsg9, seondmsg11, seondmsg12, seondmsg13, seondmsg14, seondmsg15, seondmsg16, seondmsg17, seondmsg18, seondmsg19, seondmsg20, seondmsg21, seondmsg22, seondmsg23, seondmsg24, seondmsg25, seondmsg26, seondmsg27, seondmsg28, seondmsg29, seondmsg30, seondmsg31, seondmsg32, seondmsg33;
    String[] thirdmsg1, thirdmsg2, thirdmsg3, thirdmsg4, thirdmsg5, thirdmsg6, thirdmsg7, thirdmsg8, thirdmsg9, thirdmsg11, thirdmsg12, thirdmsg13, thirdmsg14, thirdmsg15, thirdmsg16, thirdmsg17, thirdmsg18, thirdmsg19, thirdmsg20, thirdmsg21, thirdmsg22, thirdmsg23, thirdmsg24, thirdmsg25, thirdmsg26, thirdmsg27, thirdmsg28, thirdmsg29, thirdmsg30, thirdmsg31, thirdmsg32, thirdmsg33;
    String[] fourthmsg1, fourthmsg2, fourthmsg3, fourthmsg4, fourthmsg5, fourthmsg6, fourthmsg7, fourthmsg8, fourthmsg9, fourthmsg11, fourthmsg12, fourthmsg13, fourthmsg14, fourthmsg15, fourthmsg16, fourthmsg17, fourthmsg18, fourthmsg19, fourthmsg20, fourthmsg21, fourthmsg22, fourthmsg23, fourthmsg24, fourthmsg25, fourthmsg26, fourthmsg27, fourthmsg28, fourthmsg29, fourthmsg30, fourthmsg31, fourthmsg32, fourthmsg33;
    String[] fifthmsg1, fifthmsg2, fifthmsg3, fifthmsg4, fifthmsg5, fifthmsg6, fifthmsg7, fifthmsg8, fifthmsg9, fifthmsg11, fifthmsg12, fifthmsg13, fifthmsg14, fifthmsg15, fifthmsg16, fifthmsg17, fifthmsg18, fifthmsg19, fifthmsg20, fifthmsg21, fifthmsg22, fifthmsg23, fifthmsg24, fifthmsg25, fifthmsg26, fifthmsg27, fifthmsg28,fifthmsg29, fifthmsg30, fifthmsg31, fifthmsg32,fifthmsg33;
    String[] sixthmsg1, sixthmsg2, sixthmsg3, sixthmsg4, sixthmsg5, sixthmsg6, sixthmsg7, sixthmsg8, sixthmsg9, sixthmsg11, sixthmsg12, sixthmsg13, sixthmsg14, sixthmsg15, sixthmsg16, sixthmsg17, sixthmsg18, sixthmsg19, sixthmsg20, sixthmsg21, sixthmsg22, sixthmsg23, sixthmsg24, sixthmsg25, sixthmsg26, sixthmsg27, sixthmsg29, sixthmsg30,  sixthmsg32;
    String[] sevenmsg1, sevenmsg2, sevenmsg3, sevenmsg4, sevenmsg5, sevenmsg6, sevenmsg7, sevenmsg8, sevenmsg9, sevenmsg11, sevenmsg12, sevenmsg13, sevenmsg14, sevenmsg15, sevenmsg16, sevenmsg17, sevenmsg18, sevenmsg19, sevenmsg20, sevenmsg21, sevenmsg22, sevenmsg23, sevenmsg24, sevenmsg25, sevenmsg26, sevenmsg27,  sevenmsg29, sevenmsg30, sevenmsg32;
    String[]  eightmsg2, eightmsg3,  eightmsg5,  eightmsg8, eightmsg9, eightmsg11, eightmsg12, eightmsg13,  eightmsg17, eightmsg18, eightmsg20, eightmsg22, eightmsg32;
    String[]  ninthmsg3,  ninthmsg9,  ninthmsg11, ninthmsg18;
    String[] tenthmsg11;

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

       // listAdd();

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
        list.add(model28);
        list.add(model29);
        list.add(model30);
        list.add(model31);
        list.add(model32);
        list.add(model33);
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
                        /*
        getDetail10();   THIS IS ADDED automatically*/
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

        getDetail28();
        getDetail29();
        getDetail30();
        getDetail31();
        getDetail32();
        getDetail33();

        model1 = new ItemDetailModel(R.drawable.i1, "Matricaria Chamomilla", "البابونج الحقيقي او الالماني"
                , headings1, firstmsg1, seondmsg1, thirdmsg1, fourthmsg1,
                fifthmsg1, sixthmsg1,
                sevenmsg1);
        model2 = new ItemDetailModel(R.drawable.i2, "Nigella sativia", "الحبة السوداء",
                headings2, firstmsg2, seondmsg2, thirdmsg2, fourthmsg2, fifthmsg2, sixthmsg2
                ,sevenmsg2,
                eightmsg2);
        model3 = new ItemDetailModel(R.drawable.i3, "Alo vera, Aloe barabadensis, Aloe capennsis",
                "الصبار", headings3, firstmsg3, seondmsg3, thirdmsg3, fourthmsg3, fifthmsg3,
                sixthmsg3,sevenmsg3,
                eightmsg3, ninthmsg3);

        model4 = new ItemDetailModel(R.drawable.i4, "Origanum syriacum", "البردقوش ",
                headings4, firstmsg4, seondmsg4, thirdmsg4,fourthmsg4, fifthmsg4,
                sixthmsg4, sevenmsg4);
        model5 = new ItemDetailModel(R.drawable.i5, "Coeffia arabica", "البن (القهوة)",
                headings5, firstmsg5, seondmsg5, thirdmsg5, fourthmsg5, fifthmsg5,
                sixthmsg5,sevenmsg5,
                eightmsg5);

        model6 = new ItemDetailModel(R.drawable.i6, "Salvia officinalis", "المريمية",
                headings6, firstmsg6, seondmsg6, thirdmsg6, fourthmsg6, fifthmsg6, sixthmsg6,
                sevenmsg6);

        model7 = new ItemDetailModel(R.drawable.i7, "Rosmarinus officinalis",
                "اكليل الجبل"

                , headings7, firstmsg7, seondmsg7, thirdmsg7, fourthmsg7,
                fifthmsg7, sixthmsg7,
                sevenmsg7);
        model8 = new ItemDetailModel(R.drawable.i8, "Glycyrrhiza glabra", "عرق السوس",
                headings8, firstmsg8, seondmsg8, thirdmsg8, fourthmsg8,
                fifthmsg8, sixthmsg8, sevenmsg8, eightmsg8, ninthmsg18);
        model9 = new ItemDetailModel(R.drawable.i9, "Zingiber officinalle", "الزنجبيل",
                headings9, firstmsg9, seondmsg9, thirdmsg9, fourthmsg9,
                fifthmsg9, sixthmsg9, sevenmsg9, eightmsg9,
                ninthmsg9);
        model10 = new ItemDetailModel(R.drawable.i30, "Linum usitatissimum", "الكتان",
                headings30, firstmsg30, seondmsg30, thirdmsg30, fourthmsg30,
                fifthmsg30, sixthmsg30, sevenmsg30);

        model11 = new ItemDetailModel(R.drawable.i11, "Senna alexandrina", "السنا",
                headings11, firstmsg11, seondmsg11, thirdmsg11,
                fourthmsg11, fifthmsg11, sixthmsg11, sevenmsg11, eightmsg11, ninthmsg11, tenthmsg11);
        model12 = new ItemDetailModel(R.drawable.i12, "Camellia sinesis",
                "الشاي الاخضر", headings12, firstmsg12, seondmsg12,
                thirdmsg12,
                fourthmsg12, fifthmsg12, sixthmsg12, sevenmsg12, eightmsg12);
        model13 = new ItemDetailModel(R.drawable.i13, "Panax quinquefol",
                "الجنسنغ( الامريكي )", headings13, firstmsg13, seondmsg13, thirdmsg13,
                fourthmsg13,
                fifthmsg13, sixthmsg13, sevenmsg13, eightmsg13);

        model14 = new ItemDetailModel(R.drawable.i14, "Mellisa officinalis",
                "المليسة", headings14, firstmsg14, seondmsg14, thirdmsg14,
                fourthmsg14, fifthmsg14, sixthmsg14, sevenmsg14);
        model15 = new ItemDetailModel(R.drawable.i15, "Hibiscus sabdariffa",
                "الكركديه",  headings15, firstmsg15, seondmsg15, thirdmsg15,
                fourthmsg15, fifthmsg15, sixthmsg15, sevenmsg15);
        model16 = new ItemDetailModel(R.drawable.i16, "Calendula officinalis",
                "الاقحوان",  headings16, firstmsg16, seondmsg16,
                thirdmsg16,
                fourthmsg16, fifthmsg16, sixthmsg16, sevenmsg16);

        model17 = new ItemDetailModel(R.drawable.i17, "Thymus vulgaris",
                "الزعتر", headings17, firstmsg17, seondmsg17, thirdmsg17,
                fourthmsg17,
                fifthmsg17, sixthmsg17, sevenmsg17, eightmsg17);
        model18 = new ItemDetailModel(R.drawable.i18, "Myrtus communis",
                "الاس (الريحان)", headings18, firstmsg18, seondmsg18,
                thirdmsg18, fourthmsg18,
                fifthmsg18, sixthmsg18, sevenmsg18, eightmsg18, ninthmsg18);
        model19 = new ItemDetailModel(R.drawable.i19, "Lavandula angustifolia",
                "الخزامى", headings19, firstmsg19, seondmsg19, thirdmsg19,
                fourthmsg19,
                fifthmsg19, sixthmsg19, sevenmsg19);

        model20 = new ItemDetailModel(R.drawable.i20, "Pimpinella anisum",
                "اليانسون", headings20, firstmsg20, seondmsg20,
                thirdmsg20,
                fourthmsg20, fifthmsg20, sixthmsg20, sevenmsg20, eightmsg20);
        model21 = new ItemDetailModel(R.drawable.i21, "Taraxacum officinale",
                "الهندباء ", headings21, firstmsg21, seondmsg21,
                thirdmsg21,
                fourthmsg21, fifthmsg21, sixthmsg21, sevenmsg21);
        model22 = new ItemDetailModel(R.drawable.i22, "Eucalyptus camaldulensis",
                "الاوكاليبتوس ( الكافور)",  headings22, firstmsg22,
                seondmsg22, thirdmsg22, fourthmsg22,
                fifthmsg22, sixthmsg22, sevenmsg22, eightmsg22);

        model23 = new ItemDetailModel(R.drawable.i23, "Trigonella foenum -graecum",
                "الحلبة", headings23, firstmsg23, seondmsg23,
                thirdmsg23,
                fourthmsg23, fifthmsg23, sixthmsg23, sevenmsg23);
        model24 = new ItemDetailModel(R.drawable.i24, "Curcuma longa",
                "الكركم", headings24, firstmsg24, seondmsg24, thirdmsg24,
                fourthmsg24,
                fifthmsg24, sixthmsg24, sevenmsg24);
        model25 = new ItemDetailModel(R.drawable.i25, "Equisetaceaearvense",
                "ذنب الخيل", headings25, firstmsg25, seondmsg25,
                thirdmsg25, fourthmsg25,
                fifthmsg25, sixthmsg25, sevenmsg25);

        model26 = new ItemDetailModel(R.drawable.i26, "Ammi visnaga",
                "الخلة",  headings26, firstmsg26, seondmsg26,
                thirdmsg26, fourthmsg26,
                fifthmsg26, sixthmsg26, sevenmsg26);
        model27 = new ItemDetailModel(R.drawable.i27, "Paronychia argentea",
                "زهرة الالماسة",  headings27, firstmsg27,
                seondmsg27, thirdmsg27, fourthmsg27,
                fifthmsg27, sixthmsg27, sevenmsg27);


        model28 = new ItemDetailModel(R.drawable.i28, "Avena sativa",
                "قشور الشوفان",
                headings28, firstmsg28, seondmsg28, thirdmsg28,
                fourthmsg28, fifthmsg28);
        model29 = new ItemDetailModel(R.drawable.i29, "Fucus vesiculosus",
                "مشرات الفوقس البحري",
                headings29, firstmsg29, seondmsg29, thirdmsg29,
                fourthmsg29, fifthmsg29, sixthmsg29,
                sevenmsg29);
        model30 = new ItemDetailModel(R.drawable.i30, "Linum usitatissimum", "الكتان",
                headings30, firstmsg30, seondmsg30, thirdmsg30, fourthmsg30,
                fifthmsg30, sixthmsg30, sevenmsg30);

        model31 = new ItemDetailModel(R.drawable.i31, "Mentha piperita", "النعناع البري",
                headings31, firstmsg31, seondmsg31, thirdmsg31, fourthmsg31,
                fifthmsg31);
        model32 = new ItemDetailModel(R.drawable.i32, "Plantago ovata forssk",
                "البسيلليوم",
                headings32, firstmsg32, seondmsg32, thirdmsg32, fourthmsg32, fifthmsg32
        , sixthmsg32, sevenmsg32, eightmsg32);
        model33 = new ItemDetailModel(R.drawable.i33, "Cuminum cyminum", "الكمون",
                headings33, firstmsg33, seondmsg33, thirdmsg33,
                fourthmsg33, fifthmsg33);

        listAdd();

    }

    private void getDetail26() {
        headings26 = new String[] {
                "الاسم العلمي:",
                "الجزء المستخدم من النبات:ا",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg26 = new String[] { "Ammi visnaga" };
        seondmsg26 = new String[] { "لثمار والزيت الطيار المستخرج منها." };
        thirdmsg26 = new String[] {
                "تتمتع الخلة بالخصائص الطبية التالية: \n" +
                        "• تاثير ايجابي خفيف في تعزيز الدورة الدموية التاجية وتقوية عضلة القلب \n" +
                        "• مضاد تشنج للعضالت الملساء\n" +
                        "• استخدمت استخدامات غير مثبتة لعالج الذبحة الصدرية, قصور القلب, عدم انتظام ضربات القلب,زيادة االنقباضات, \n" +
                        "الربو,السعال الديكي. "
        };
        fourthmsg26 = new String[] {
                "االستخدام لفترات طويلة او جرعات زائدة من الخلة قد يسبب الدوار , فقدان الشهية, \n" +
                        "اضطرابات في النوم , الجرعات العالية جدا تسبب ارتفاع في مستوي انريمات الكبد في بالزما الدم وفي حاالت نادرة \n" +
                        "تسبب النبات بحدوث يرقببان ركودي, اضافة الى حساسية ضوئية الشعة الشمس. "
        };
        fifthmsg26 = new String[] {
                "ال يوجد معلومات وادلة مثبتة عن تداخل عقار الخلة مع المستحضرات الدوائية"
        };
        sixthmsg26 = new String[] {
                " ينصح بعدم استخدام الخلة اثناء الحمل لعدم وجود ادلة كافية عن امان استخدامه خالل هذه الفترة."
        };
        sevenmsg26 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, \n" +
                        "4\n" +
                        "thedition, p (81-82)\n"
        };

    }

    private void getDetail29() {
        headings29 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخداماتالطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg29 = new String[] { "Fucus vesiculosus" };
        seondmsg29 = new String[] { "جميع اجزاء النبات" };
        thirdmsg29 = new String[] {
                " يتمتع هذا العقار بالخصائص الطبية التالية",
                "مضاد للبكتريا",
                "يؤثر على مستوى السكر في الدم",
                "يستخدم لعلاج اضطرابات الغدة الدرقية بسبب محتواه العالي من اليود",
                "يمتلك فعالية في تخفيض الوزن وعلاج السمنة."
        };
        fourthmsg29 = new String[] {
                "بسبب محتواه العالي والمتغير(0.03-1%) من اليود قد يسبب تحريض او فرط نشاط الغدة الدرقية ايضا لوحظ  انه من الممكن حدوت تفاعلات تحسسية."
        };
        fifthmsg29 = new String[] {
                "ينصح بعدم استخدام مشرات الفوقس البحري مع الادوية الخافضة لمستوى السكر في الدم."
        };
        sixthmsg29 = new String[] {
                "يمنع استخدام مشرات الفوقس البحري اثناء الحمل لانه يعتبر غير امن خلال هذه الفترة."
        };
        sevenmsg29 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p (357-358)\n"
        };

    }

    private void getDetail30() {
        headings30 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "االستخدامات والخصائص الطبية",
                "موانع االستخدام واالثار الجانبية",
                "استخدام الكتان",
                "التداخالت الدوائية",
                "المراجع"
        };
        firstmsg30 = new String[] { "Linum usitatissimum" };
        seondmsg30 = new String[] { "البذور  والزيت المستخرج منها" };
        thirdmsg30 = new String[] {
                " يتمتع هذا العقار بالخصائص الطبية التالية",
                "ملين",
                "خافض لمستوى الكولسترول في الدم",
                "خافض لمستوى السكر في الدم",
                "مضاد للاورام",
                "مضاد للاكسدة",
                "مضاد للفطريات",
                "يستخدم لعلاج الامساك",
                "يستخدم لعلاج التهاب الجلد",
                "يمكن ان تستخدم بذور الكتان  خارجيا لاخراج الاجسام الغريبة من العين"
        };
        fourthmsg30 = new String[] {
                "يمنع استخدام الكتان في حال وجود امراض التهابية حادة في المري او المعدة او الامعاء ."
        };
        fifthmsg30 = new String[] {
                "بالجرعات العلاجية لم يسجل اثار جانبية الا انه استهلاكه بكميات كبيرة يمكن ان يسبب ضعف في حركة الامعاء"
        };
        sixthmsg30 = new String[] {
                "استخدام الكتان مع الادوية في وقت واحد قد يؤخر امتصاص الادوية."
        };
        sevenmsg30 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition ,p (313-315)\n"
        };

    }

    private void getDetail31() {
        headings31 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "االستخدامات والخصائص الطبية",
                "موانع االستخدام واالثار الجانبية",
                "المراجع"
        };
        firstmsg31 = new String[] { "Mentha piperita" };
        seondmsg31 = new String[] { "النبات المجفف." };
        thirdmsg31 = new String[] {
                " يتمتع النعناع البري بالخصائص الطبية التالية: ",
                "طارد للريح",
                "منشط",
                "يستخدم لعلاج اضطرابات الجهاز الهضمي خاصة الانتفاخ."
        };
        fourthmsg31 = new String[] {
                "لا توجد اثار جانبية او مخاطر من استخدام النعناع  البري بالجرعات العلاجية دون الافراط باستخدامه."
        };
        fifthmsg31 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition ,p (258-259)\n"
        };


    }

    private void getDetail32() {
        headings32 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "قد يسبب استخدام البسيلليوم اثار جانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg32 = new String[] { "Plantago ovata forssk" };
        seondmsg32 = new String[] { "البذور الناضجة" };
        thirdmsg32 = new String[] {
                "يتمتع البسيللوم بالخصائص الطبية التالية:",
                "ملين لمعالجة حالات الامساك",
                "وكذلك يستخدم لعلاج الاسهال"
        };
        fourthmsg32 = new String[] {
                "يمنع استخدام البسيلليوم في حال وجود امراض التهابية في الجهاز الهضمي وكذلك من قبل \n" +
                        "مرضى السكري الذين مستوى السكر في الدم لديهم متغير بشدة."
        };

        fifthmsg32 = new String[] {
                "ردود فعل تحسسية ) التهاب انف,ربو شرى, التهاب ملتحمة( يمكن ان يسبب \n" +
                        "استخدام البسيلليوم في حال عدم تناول كميات كافية من السوائل انسداد في المري او االمعاء خاصة لدى كبار السن."
        };
        sixthmsg32 = new String[] {
                "قد يسبب استخدام البسيلليوم مع االدوية في نفس الوقت نقص في امتصاص االدوية."
        };
        sevenmsg32 = new String[] {
                "ينصح بعدم استخدامه اثناء الحمل لعدم توفر معلومات وادلة مثبتة عن امان استخدامه اثناء هذه \n" +
                        "الفترة. "
        };
        eightmsg32 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, \n" +
                        "4\n" +
                        "thedition ,p (612 -614)"
        };

    }

    private void getDetail33() {
        headings33 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع الاستخدام والاثار الجانبية",
                "المراجع"
        };
        firstmsg33 = new String[] { "Cuminum cyminum" };
        seondmsg33 = new String[] { "الثمارالناضجة والزيت المستخرج منها" };
        thirdmsg33 = new String[] {
                "مضاد للميكروبات",
                "مضاد لتخثر الدم",
                "تاثير مشابه لتاثير هرمون الاستروجين",
                "طارد للريح",
                "منشط ومسكن",
                "اضافة الى تاثيرات اخرى لكن لا توجد نتائج تجريبية لها( مدر للبول مثير للشهوة الجنسية, مضاد للتشنج)"
        };
        fourthmsg33 = new String[] {
                "يعتبر الكمون امن اذا استخدم بالجرعات العلاجية دون الافراط باستخدامه."
        };
        fifthmsg33 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p (488-489)\n"
        };

    }

    private void getDetail28() {
        headings28 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم:",
                "الخصائص والاستخدامات الطبية",
                "موانع الاستخدام والاثار الجانبية",
                "المراجع"
        };
        firstmsg28 = new String[] { "Avena sativa" };
        seondmsg28 = new String[] { "القشور التي تغطي الثمار" };
        thirdmsg28 = new String[] {
                "يستخدم  قشور الشوفان لعلاج التهاب الجلد والبثور"
        };
        fourthmsg28 = new String[] {
                "لم تسجل اثار جانبية او مخاطر لقشور الشوفان في حال استخدمت بالجرعات العلاجية دون الافراط بالاستخدام"
        };
        fifthmsg28 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p (551-552)\n"
        };

    }

    private void getDetail27() {
        headings27 = new String[] {
            "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg27 = new String[] { "Paronychia argentea" };
        seondmsg27 = new String[] { "جميع اجزاء النبات" };
        thirdmsg27 = new String[] {
                "تتمتع زهرة االلماسة بالخصائص الطبية التالية: \n" +
                        "• مضاد لالكسدة. \n" +
                        "• يتمتع بتاثيرات واقية للخاليا البطانية الكلوية لذلك تستخدم لعالج امراض الكلى. \n" +
                        "• اضافة الى فعاليتها في تفتيت الحصيات في الكلى وتنظيفها من ترسبات الرمل.",
        };
        fourthmsg27 = new String[] {
                "االكثار من زهرة االلماسة يمكن ان يسبب اضطرابات في الجهاز الهضمي كالغثيان \n" +
                        "واالقياء واالسهال"
        };
        fifthmsg27 = new String[] { "ال تتوفر معلومات وادلة حول التداخالت الدوائية لزهرة االلماسة" };
        sixthmsg27 = new String[] { "ينصح بعدم استخدامها اثناء الحمل خاصة خالل الثلث االول من الحمل النها قد تسبب زيادة في نشاط \n" +
                "الرحم. " };
        sevenmsg27 = new String[] { "• L.A Hamitouche, ……….O.M Palamino, ‘’Paronychia argentea Lam. Protects renal endothelial \n" +
                "cells against oxidative injury’’\n" +
                "J Ethno Pharmacol. 2020 Feb. [ PubMed]\n" +
                "• S. Bouanani, ……, M.Lecouvey ‘’Pharmacologic and toxicological effects of paronychia \n" +
                "argentea in experimental calcium oxalate nephrolithiasis in rats’’ Ethnopharmacol. 2010 May, \n" +
                "4, 129(1): 38-45. [ PubMed]\n" +
                "• S. Sait, …., F.Pellati ‘’HPLC-UV/DAD and ESI-MS(n) analysis of flavonoids and antioxidant \n" +
                "activity of an Algerian medicinal plant: paronychia argentea Lam’’ J Pharm Biomed Anal. 2015, \n" +
                "111: 231-40. [PubMed]\n" };
    }

    private void getDetail25() {
        headings25 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل:",
                "المراجع"
        };
        firstmsg25 = new String[] { "Equisetaceae arvense" };
        seondmsg25 = new String[] { "الرؤوس المزهرة والنبات العشبي" };
        thirdmsg25 = new String[] {
                "يتمتع ذنب الخيل بتاثيرات الطبية التالية: \n" +
                        "• تاثيرات مدرة للبول \n" +
                        "• تاثيرات مضادة للتشنج \n" +
                        "• يستخدم لعالج التهابات المسالك البولية \n" +
                        "• يستخدم لعالج حصوات الكلى والمثانة \n" +
                        "• يستخدم لعالج الجروح والحروق"
        };
        fourthmsg25 = new String[] {
                "يمنع استخدام من قبل االشخاص الذين يعانون من وذمة بسبب قصور في وظائف القلب \n" +
                        "والكلى, وارتفاع الضغط الدموي واالشخاص المصابين بامراض وافات جلدية شديدة."
        };
        fifthmsg25 = new String[] {
                "ينصح بعدم استخدام ذنب الخيل مع بعض المستحضرات الدوائية \n" +
                        "• المدرات البولية \n" +
                        "• الغليكوزيدات القلبية \n" +
                        "• االدوية الخافضة للسكر \n" +
                        "• االدوية التي يدخل في تركيبها الليثيوم \n" +
                        "• االدوية المستخدمة في عالج فيروس نقص المناعة البشرية المكتسب من فئة مثبطات النسخ العكسي للنكليوزيد NR"
        };
        sixthmsg25 = new String[] {
                "ينصح بعدم استخدام ذنب الخيل اثناء الحمل لعدم توفر ادلة كافية عن امان استخدامه خالل هذه الفترة"
        };
        sevenmsg25 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p (560-561)\n" +
                        "• D.M Carnerio……, L.C Cunha, ‘’ Randomized, double-blind clinical trial to assess the acute \n" +
                        "diuretic effect of equisetum arvense (field horsetail) in healthy volunteers’’\n" +
                        "Evidence-Based Complementary and Alternative Medicine. 2014, Mar. [Google Scholar]\n" +
                        "• D.Pyevich, M P. Bogensschutz ‘’ Herbal diuretics and lithium toxicity’’\n" +
                        "Puplished online. 2001 Aug, 158(8): 1329 .https//doi.org/10.117/appi.ajp.\n" +
                        "• Assessment report on Equisetum arvense L. herba.\n" +
                        "• E. Cordova, L. Morganti, C. Rodrigues, ‘’Possible drug-herb interaction between herbal \n" +
                        "supplement containing horsetail (Equisetum arvense) and antiretroviral drugs’’\n" +
                        "J Int Assoc Provid Aids Care. 2017 Jan,16(1): 11-13. [PubMed]\n" +
                        "• European Medicine Agency. 2016 Feb.\n"
        };

    }

    private void getDetail24() {
        headings24 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم:",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg24 = new String[] { "Curcuma longa" };
        seondmsg24 = new String[] { "جذامير النبات المجففة " };
        thirdmsg24 = new String[] {
                "يتمتع الكركم بالخصائص الطبية التالية: \n" +
                        "• مضاد لتسمم الكبد \n" +
                        "• خافض لمستوى الشحوم في الدم\n" +
                        "• مضاد لالكسدة\n" +
                        "• مضاد لاللتهاب \n" +
                        "• مضاد لالورام \n" +
                        "• مضاد للميكروبات \n" +
                        "• يستخدم لعالج عسر الهضم وفقدان الشهية"
        };
        fourthmsg24 = new String[] {
                "يجب عدم استخدام الكركم من قبل االشخاص المصابين بانسداد القنوات الصفراوية والذين \n" +
                        "يعانون من حصوات المرارة\n"
        };
        fifthmsg24 = new String[] {
                " ينصح بعدم استخدام الكركم مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• مضادات التخثر ومضادات الصفيحات الدموية \n" +
                        "• االدوية المستخدمة لعالج بعض انواع السرطانات الكامبتوثيسين. ميكلورثيامين, دوكسوروبسين, سيكلوفوسفاميد االستخدام \n" +
                        "مع الكركم قد يسبب نقص في فعاليتها. \n" +
                        "• االسيتامينوفين وااليبوبروفين \n" +
                        "• االمفوتريسين ب \n" +
                        "• السيليبرولول والميدازوالم \n" +
                        "• تاكروليموس: استخدام الكركم مع هذا الدواء يقلل من فعالية الدواء في تثبيط مناعة الجسم ممايسبب رفض الجسم للعضو \n" +
                        "المزروع."
        };
         sixthmsg24 = new String[] {
                " يجب عدم استخدام الكركم اثناء الحمل يعتبر غير امن خالل هذه الفترة"
        };
         sevenmsg24 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p-(775-777)\n" +
                        "• P. Prakash, et al. ‘’ Anti-platelat effects of curcuma oil in experimental models of myocardial \n" +
                        "ischemia-reperfusion and thrombosis’’\n" +
                        "Thromb Res. 2011 Feb, 127(2): 111-8. [PubMed]\n" +
                        "• A. Daveluy, et al. ‘’Probable interaction between an oral vitamin k antagonist and turmeric \n" +
                        "(Curcuma longa)’’\n" +
                        "Therapie. 2014 Nov, 69(6): 510-20. [PubMed]\n" +
                        "• S. Somasundaram, et al. ‘’Dietary curcuma inhibits chemotherapy-induced apoptosis in models \n" +
                        "of human breast cancer’’\n" +
                        "Cancer Res. 2002 Jul, 62(13): 3868-75. [PubMed]\n" +
                        "• W. Zhang,et al . ‘’ Impact of curcuma -induced changes in p-glycoprotein and CYP3A expression \n" +
                        "on the pharmacokinetics of peroral celiprolol and midazolam in rats’’\n" +
                        "Drug Metab Dispos. 2007 Jan, 35(1): 110-5. [PubMed]\n" +
                        "• H.A Choi,et al . ‘’Interaction of over-the-counter drugs with curcuma: influence on stability and \n" +
                        "bioactivities in intestinal cells’’\n" +
                        "J Agric Food Chem. 2012 Oct, 60(42): 10578-84. [PubMed]\n" +
                        "• A.K Kudva, et al. ‘’Complexation of amphotericin B and curcuma with serum albumines: \n" +
                        "solubility and effect on erythrocyte membrane damage’’ \n" +
                        "J Exp PHamacol. 2010 Des, 31(3): 1-6. [PubMed]\n" +
                        "• K.Egashira, et al . ‘’Food- drug interaction of tacrolimus with pomelo, ginger, and turmeric \n" +
                        "juice in rats’’\n" +
                        "Drug Metab Pharmacokinet. 2012, 27(2): 242-7. [PubMed]"
        };

    }

    private void getDetail23() {
        headings23 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجدانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع: "
        };
        firstmsg23 = new String[] { "Trigonella foenum -graecum" };
        seondmsg23 = new String[] { "البذور" };
        thirdmsg23 = new String[] {
               "تتمتع الحلبة بالخصائص الطبية التالية: \n" +
                       "• خافضة لمستوى السكر في الدم\n" +
                       "• خافضة لمستوى الكولسترول والدهون الثالثية في الدم \n" +
                       "• تستخدم كفاتح للشهية \n" +
                       "• تستخدم لعالج التهاب الجلد \n" +
                       "• تستخدم الحلبة بشكل شائع لزيادة ادرار الحليب اال انه ال تتوفر ادلة ودراسات مثبة حول ذلك"
        };
        fourthmsg23 = new String[] { "ان استخدام الحلبة يمكن ان يسبب اعراض تحسسية كالطفح الجلدي وسيالن االنف وقد \n" +
                "يسبب االم في المعدة واسهال." };
        fifthmsg23 = new String[] { "ينصح بعدم مشاركة الحلبة مع بعض المستحضرات الدوائية اهمها: \n" +
                "• االدوية الخافضة لمستوى السكر في الدم \n" +
                "• االدوية المضادة للتخثر) الوارفارين( \n" +
                "• التيوفيللين \n" +
                "• مضادات االكتئاب من فئة مثبطات اعادة قبض السيروتونين) SSRI " };
        sixthmsg23 = new String[] { "يجب عدم استخدام الحلبة اثناء الحمل النها تعتبر غير امنة" };
        sevenmsg23 = new String[] { "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                "edition ,p (304-306)\n" +
                "• J.P Lambert, J. Cormier ‘’ Potential interaction between warfarin and boldo-fenugreek’’ \n" +
                "Pharmacotherapy. 2001 Apr, 21(4): 509-12. [PubMed]\n" +
                "• F. I Al-Jenoobi, ……. S. A Al-Suwayeh ‘’ Effect of fenugreek, garden cress, and black seed on \n" +
                "theophylline pharmacokinetics in beagle dogs’’\n" +
                "Pharm Biol. 2015 Feb,53(2): 296-300. [PubMed]\n" +
                "• K. Doolabh, ……S. Farrand ‘’Oral fenugreek seed consumption and serotonin syndrome’’ Aust N \n" +
                "Z J Psychiatry. 2019 Dec,53(12): 1225. [PubMed]\n" };

    }

    private void getDetail22() {
        headings22 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "االستخدامات والخصائص الطبية",
                "موانع االستخدام واالثارالجانبية",
                "الجرعات الزائدة",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg22 = new String[] { "Eucalyptus camaldulensis " };
        seondmsg22 = new String[] { "االوراق والزيت المستخرج منها ومن االغصان الفتية"  };
        thirdmsg22 = new String[] {
                "يتمتع زيت االوكاليبتوس بالخصائص الطبية التالية: \n" +
                        "• مضاد للجراثيم \n" +
                        "• مضاد للفطريات \n" +
                        "• طارد للبلغم ومقشع \n" +
                        "• مضاد لاللتهاب \n" +
                        "• مضاد للتشنج ومضاد احتقان موضعي خفيف \n" +
                        "• يستخدم زيت االوكاليبتوس لعالج السعال والتهاب الشعب الهوائية \n" +
                        "• يستخدم زيت االوكاليبتوس لعالج الروماتيزم بشكل خارجي. \n" +
                        "• اوراق االوكاليبتوس ت تمتع بفعالية مقشعة ومضادة لالللتهاب ومضادة للتشنج ومدرة للبول ومزيلة للروائح الكريهة\n" +
                        "• اوراق االوكاليبتوس تستخدم لعالج السعال والتهاب الشعب الهوائية \n" +
                        "• ويمكن ان تستخدم االوراق داخليا لعالج نزالت البرد "
        };
        fourthmsg22 = new String[] {
               "قد يسبب زيت واوراق االوكاليبتوس الغثيان والقيء واالسهال, يمنع استخدام الزيت \n" +
                       "واالوراق داخليا من قبل االشخاص الذين يعانون من التهابات في الجهاز الهضمي والقنوات الصفراوية والتهابات الكبد \n" +
                       "الشديدة كما يمنع استخدام االوكاليبتوس للرضع واالطفال الصغار النه قد يسبب تشنجات في القصبات الهوائية ونوبات تشبه \n" +
                       "الربو وقد يسبب الوفاة بسبب االختناق."

        };
        fifthmsg22 = new String[] {
            "من زيت االوكاليبتوس تؤدي الى تسمم يهدد الحياة بضع قطرات منه لدى االطفال ومقدار 4 -5 مل للبالغين \n" +
                    "وتشمل اعراض التسمم انخفاض في الضغط الدموي والدورة الدموية واالختناق. "
        };
        sixthmsg22 = new String[] {
            "ينصح بعد مشاركة االوكاليبتوس مع بعض المستحضرات الدوائية اهمها: \n" +
                    "• االمفيتامين \n" +
                    "• االدوية الخافضة للسكر في الدم\n" +
                    "• البينتوباربيتال \n" +
                    "• االدوية التي يتم استقالبها بالخمائر الكبدية سيتوكروم CPY450( CYP2C9,CYP2C19, CYP1A2 )مما يسبب نقص فعالية \n" +
                    "هذه االدوية او ظهور االثار الجانبية غير المرغوبة لها) التيوفيللين ,البروبرانول, النسوبرازول اومبيرازول,كيتوكونازول, \n" +
                    "لوفاستاتين وغيرها("
        };
        sevenmsg22 = new String[] {
            "ينصح بعدم استخدام االوكاليبتوس وخاصة الزيت اثناء الحمل لعدم توفر ادلة كافية عن امان \n" +
                    "استخدامه خالل هذه الفترة"
        };
        eightmsg22 = new String[] {
            "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                    "edition p (283-285)\n" +
                    "• M.Unger, et al. ‘’Simulaneous determination of the inhibitory potency of herbal extracts on \n" +
                    "the activity of six major cytochrome P450 enzymes using liquid chromatography/mass \n" +
                    "spectrometry and automated online extraction’’\n" +
                    "Rapid Commun Mass Spectrom. 2004, 18(19): 2273-81. [PubMed]\n" +
                    "• A. Jori….S.Garattini, ‘’Effect of eucalyptol(1,8-cineole) on the metabolism of other drugs in rats \n" +
                    "and in man’’\n" +
                    "Eur J Pharmacol. 1970 Mar, 9(3): 362-6. [PubMed]\n" +
                    "• E. Kato, K. Kawakami, ‘’Macrocarpal C isolated from eucalyptus globulus inhibits dipeptidyl \n" +
                    "peptidase 4 in aggregated form’’\n" +
                    "J Enzyme Inhib Med Chem. 2018 Dec, 33(1): 106-109. [PubMed]\n"
        };

    }

    private void getDetail21() {
        headings21 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "لوحظت بعض ",
                "التداخالت الدوائية",
                "المراجع"
        };
        firstmsg21 = new String[] { "Taraxacum officinale" };
        seondmsg21 = new String[] { "النبات كامال يحصد قبل موسم التزهير" };
        thirdmsg21 = new String[] {
                " تتمتع الهندباء بالخصائص الطبية التالية: \n" +
                        "• مدرة ومنشطة الفراز الصفراء\n" +
                        "• تستخدم لعالج التهابات المسالك البولية \n" +
                        "• تستخدم كفاتح للشهية \n" +
                        "• تستخدم لعالج اضطرابات الكبد والمرارة \n" +
                        "• تستخدم لعالج اضطرابات عسر الهضم"
        };
        fourthmsg21 = new String[] {
             "يمنع استخدام الهندباء في حال وجود التهاب او انسداد في القنوات الصفراوية. "
        };
        fifthmsg21 = new String[] {
             "االثار الجانبية نادرة الحدوث اضطرابات وحموضة في المعدة والتهاب جلد تحسسي."
        };
        sixthmsg21 = new String[] {
             "ينصح بعدم مشاركة الهندباء مع بعض المستحضرات الدوائية اهمها: \n" +
                     "• المدرات البولية. \n" +
                     "• االدوية الخافضة لمستوى السكر في الدم. \n" +
                     "• االدوية التي تستقلب بخمائر الكبد السيتوكروم P450(CYP3A4, CYP1A2)"
        };
        sevenmsg21 = new String[] {
             "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                     "edition ,p (367-369)\n" +
                     "• B. A Clare, …., K.Spelman ‘’The diuretic effect in human subjects of an extract of Taraxacum \n" +
                     "officinale folium over a single day’’\n" +
                     "J Altern Complement Med. 2009 Aug, 15(8): 929-34. [PubMed]\n" +
                     "• M.Martinez, ……G.Ruzi ‘’Taraxacum officinale and related species-An ethnopharmacological \n" +
                     "review and its potential as a commercial medicinal plant’’ J Ethnopharmacol. 2015 Jul, 1, 169: \n" +
                     "244-62. [PubMed]\n" +
                     "• P. P Maliakal, S.Wanwimolruk ‘’Effect of herbal teas on hepatic drug metabolizing enzymes in \n" +
                     "rats’’ J Pharm Pharmacol. 2001 Oct, 53(10): 1323-9. [PubMed]\n"
        };

    }

    private void getDetail20() {
        headings20 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
               "موانع االستخدام واالثار الجانبية",
               "يعتبر اليانسون",
               "التداخالت الدوائية",
               "االستخدام اثناء الحمل",
               "المراجع"
        };
        firstmsg20 = new String[] { "Pimpinella anisum" };
        seondmsg20 = new String[] { "الثمار الجافة والزيت العطري المستخرج منها" };
        thirdmsg20 = new String[] {
                "يتمتع اليانسون بالخصائص الطبية التالية: \n" +
                        "• طارد للبلغم \n" +
                        "• مضاد للتشنج \n" +
                        "• زيت اليانسون يتمتع بتاثير مضاد للجراثيم والفيروسات وطارد للديدان كما انه مقشع ومزيل للتشنج ويمتلك تاثيرا مشابها \n" +
                        "لتاثير هرمون االستروجين. \n" +
                        "• يستخدم لعالج نزالت البرد الشائعة \n" +
                        "• يستخدم لعالج السعال والتهاب الشعب الهوائية \n" +
                        "• يستخدم لعالج الحمى والزكام \n" +
                        "• يستخدم لعالج التهاب الفم والبلعوم \n" +
                        "• يستخدم كفاتح للشهية \n" +
                        "• يستخدم لعالج اضطرابات عسر الهضم",

        };
        fourthmsg20 = new String[] { "يمنع استخدام اليانسون من قبل االشخاص الذين يعانون من الحساسية تجاه اليانسون او احد \n" +
                "المركبات التي يحتويها ) االنثول(" };
        fifthmsg20 = new String[] { "من االعشاب االمنة اذا استخدم بصورة معتدلة دون االفراط في استخدامه وقد لوحظ حدوث حساسية نادرة \n" +
                "جدا." };
        sixthmsg20 = new String[] { "ينصح بعدم استخدام اليانسون مع بعض المستحضرات الدوائية اهمها: \n" +
                "• االدوية التي تؤثرعلى الجهاز العصبي المركزي) الكودايين, البنتوباربيتال, الميدازوالم, الفلوكستين وغيرها( " };
        sevenmsg20 = new String[] { "ينصح بعدم استخدامه اثناء الحمل لعدم وج ود ادلة مثبتة عن امان اليانسون خالل هذه الفترة" };
        eightmsg20 = new String[] { "Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                "edition ,p (35-36)\n" +
                "I.Samojlik……, B.Bozin ‘’The influence of essential oil of anised(Pimpinella anisum,L) on drug \n" +
                "effects on the central nervous system’’\n" +
                "Fitoterapia. 2012 Dec, 83(8): 1466-73. [PubMed]\n" };
    }

    private void getDetail19() {
        headings19 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "الاستخدام اثناء الحمل",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg19 = new String[] { "Lavandula angustifolia" };
        seondmsg19 = new String[] { "االزهار والزيت المستخرج منها" };
        thirdmsg19 = new String[] {
               "تتمتع الخزامى بالخصائص الطبية التالية: \n" +
                       "• خصائص مهدئة ومزيلة للقلق\n" +
                       "• يقلل من التوتر العصبي \n" +
                       "• يحسن من جودة النوم \n" +
                       "• مضاد للميكروبات \n" +
                       "• منشط الفراز العصارات الصفراوية \n" +
                       "• يستخدم كفاتح الشهية \n" +
                       "• يستخدم لعالج االرق والعصبية \n" +
                       "• لعالج عسر الهضم"
        };
        fourthmsg19 = new String[] {
                "لم يالحظ ظهور اثار جانبية اذا استخدم بالجرعات العالجية اال ان االستهالك بكميات \n" +
                        "كبيرة ولفترات طويلة من الخزامى قد يسبب ظهور بعض االعراض الجانبية كالغثيان والتجشؤ تهيج عصبي للمعدة \n" +
                        "واضطراب عصبي لالمعاء ويمكن ان يسبب االستخدام الموضعي لزيت الخزامى التهاب جلد تحسسي وحساسية ضوئية"
        };
        fifthmsg19 = new String[] {
                "ينصح بعدم استخدام الخزامى مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• االدوية المهدئة ) الفينوباربيتال , البنزوديازبينات( قد يسبب عقار الخزامى زيادة فعالية هذة االدوية \n" +
                        "• مثبطات الجهاز العصبي المركزي) هيدرات الكلورال( يمكن ان يسبب استخدام الخزامى مع هذه االدوية من زيادة الفعالية \n" +
                        "المخدرة والمهدئة لهذه االدوية"
        };
        sixthmsg19 = new String[] {
                        " يوصى بعدم استهالك الخزامى بكميات كبيرة اثناء الحمل لعدم توفر معلومات وادلة تثبت سالمة \n" +
                                "استخدامها خالل هذه الفترة"
        };
        sevenmsg19 = new String[] {
                        "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                                "edition ,p (394-396)\n" +
                                "• D.Donelli…., F.Firenzuoli ‘’Effect of lavender on anixiety:A systemic review and meta-analysis’’\n" +
                                "Phtomedicine. 2019 Dec,65:153099. [PubMed]\n"
        };

    }

    private void getDetail18() {
        headings18 = new String[] {
               "الاسم العلمي",
               "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "قد تظهر بعض االثار الجانبية",
                "قد يسبب الجرعات الزائدة",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg18 = new String[] { "Myrtus communis" };
        seondmsg18 = new String[] { "االوراق والفروع المزهرة والثماروالزيت العطري المستخرج منها" };
        thirdmsg18 = new String[] {
                "يتمتع زيت االس بالخصائص الطبية التالية: \n" +
                        "• مطهر ومضاد للبكتريا والفطريات \n" +
                        "• تتمتع اوراق االس بالخصائص الطبية التالية: \n" +
                        "• مضاد للبكتريا \n" +
                        "• خافض لمستوى السكر في الدم\n" +
                        "• له تاثيرعلى الجهاز العصبي المركزي فقد وجد انه يزيد مدة النوم \n" +
                        "• خافض لمستوى السكر في الدم\n" +
                        "• مزيل الفرازات الشعب التنفسية \n" +
                        "• يمتلك تاثير في عالج التهابات المصاحبة لنزالت البرد"
        };
        fourthmsg18 = new String[] {
                "يجب عدم استخدام االس داخليا عند وجود التهاب في الجهاز الهضمي او التهاب كبد شديد \n" +
                        "او التهاب في القنوات الصفراوية ويمنع استخدام الزيت لالطفال الصغار النه يسبب نوبات شبيهة بالربو وتشنج بالقصبات \n" +
                        "الهوائية وفشل تنفسي"
        };
        fifthmsg18 = new String[] {
                "عند استخدام االس كالغثيان واالقياء واالسهال"
        };
        sixthmsg18 = new String[] {
                "من زيت االس اكثر من 10 غرام الى تسمم مهدد للحياة بسبب احتوائه على نسبة عالية من \n" +
                        "مركب السينول وتشمل اعراض التسمم اضطرابات في الدورة الدموية وانخفاض الضغط الدموي وفشل تنفسي."
        };
        sevenmsg18 = new String[] {
                "ال تتوفر معلومات وادلة مثبتة عن تداخالت دوائية لالس."
        };
        eightmsg18 = new String[] {
                "ينصح بعدم استخدام االس خالل الحمل النه يعتبر غير امن."
        };
        ninthmsg18 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, \n" +
                        "4\n" +
                        "thedition ,p (536-538)\n"
        };

    }

    private void getDetail17() {
        headings17 = new String[] {
               "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "زيت الزعتر يجب توخي الحذر عند استخدامه",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg17 = new String[] { "Thymus vulgaris" };
        seondmsg17 = new String[] { "النبات المزهر والزيت العطري المستخرج منه" };
        thirdmsg17 = new String[] {
                " يتمتع الزعتر بالخصائص الطبية التالية: \n" +
                        "• مضاد للجراثيم \n" +
                        "• مضاد تشنج \n" +
                        "• مقشع ومضاد لتشنج القصبات الهوائية \n" +
                        "• يستخدم لعالج السعال والتهاب الشعب التنفسية"
        };
        fourthmsg17 = new String[] {
                       "يعتبر الزعتر من االعشاب االمنة اذا استخدم بصورة معتدلة دون االفراط باستخدامه حيث \n" +
                               "يمكن ان يسبب التهاب جلد تحسسي"
        };
        fifthmsg17 = new String[] {
                     "وال ينبغي تناوله عن طريق الفم ويجب تخفيفه عند االستخد ام الموضعي \n" +
                             "استخدمه بجرعات كبيرة يسبب اعراض سمية وذلك وفقا لدراسات اجريت على الحيوانات وتشمل اعراض التسمم الغثيان \n" +
                             "تسرع التنفس ,نوبات صرع."
        };
        sixthmsg17 = new String[] {
                     "ينصح بعدم استخدام الزعتر مع بعض المستحضرات الدوائية اهمها: \n" +
                             "• االدوية المستخدمة لعالج اضطرابات الغدة الدرقية \n" +
                             "• فلورويوراسيل عند استخدامه موضعيا مع زيت الزعتر لوحظ ازدياد امتصاص الدواء. "
        };
        sevenmsg17 = new String[] {
                     "ال تتوفر ادلة كافية حول امان استخدامه خالل الحمل لذلك ينصح بعدم استخدامه خالل هذه الفترة"
        };
        eightmsg17 = new String[] {
                     "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                             "edition ,p (761-762)\n" +
                             "• E. Basch……. D. Sollars ‘’Thyme (Thymus vulgaris L.), thymol’’\n" +
                             "J Herb Pharmacother. 2004, 4(1): 49-67. [PubMed]\n"
        };

    }

    private void getDetail16() {
        headings16 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg16 = new String[] { "Calendula officinalis" };
        seondmsg16 = new String[] { "االزهار" };
        thirdmsg16 = new String[] {
                "يتمتع االقحوان بالخصائص الطبية التالية: \n" +
                        "• تاثيرات مضادة للميكروبات كالمكورات العنقودية الذهبية\n" +
                        "• تاثيرات مضادة لفيروس نقص المناعة المكتسب \n" +
                        "• تاثيرات مضادة لفيروس الفم الحويصلي \n" +
                        "• تاثيرات مضادة لاللتهاب \n" +
                        "• يستخدم لعالج الجروح والقروح وتقرحات الساق \n" +
                        "• يستخدم لعالج التهاب الفم والبلعوم"
        };

        fourthmsg16 = new String[] {
                "قد يسبب االقحوان التهاب للجلد"
        };
        fifthmsg16 = new String[] {
                "ينصح بتجنب استخدام االقحوان مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• االدوية المهدئة التي تؤثر على الجهاز العصبي المركزي )هيكسوباربيتال( "
        };
        sixthmsg16 = new String[] {
                " ينصح بعدم استخدام االقحوان خالل الحمل لعدم توفر ادلة كافية حول امان استخدامه خالل هذه \n" +
                        "الفترة."
        };
        sevenmsg16 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, \n" +
                        "4\n" +
                        "thedition, p (497-499)\n" +
                        "• B. Ethan, S. Bent, S.Haskim…….S.Yong ’’Marigold(Calendula officinalis L.):an evidence-based \n" +
                        "systematic review by the natural standard research collboration’’ Journal of Herbal \n" +
                        "Pharmacotherapy, Vol. 6(3\\4)2006.{Google Scholar]\n"
        };

    }

    private void getDetail15() {
        headings15 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "المراجع"
        };
        firstmsg15 = new String[] { "Hibiscus sabdariffa" };
        seondmsg15 = new String[] { "االزهار" };
        thirdmsg15 = new String[] {
                " يتمتع الكركديه بالخصائص الطبية التالية: \n" +
                        "• خافض للضغط الدموي \n" +
                        "• مرخي لعضالت الرحم \n" +
                        "• ملين الحتوائه على احماض الفاكهة \n" +
                        "• خافض لمستوى السكر والدهون في الدم \n" +
                        "• يتمتع بخصائص منشطة للهضم و مرطبة للجسم "
        };
        fourthmsg15 = new String[] {
                " يعتير شراب الكركديه امن اذا استهلك بكميات معتدلة دون االفراط في استخدامه من \n" +
                        "االثار الجانبية النادرة جدا اضطرابات بالمعدة وغازات."
        };
fifthmsg15 = new String[] {
                        "ينصح بعدم مشاركة الكركديه مع بعض المستحضرات الدوائية اهمها: \n" +
                                "• الكلوروكين يقلل الكركديه من امتصاص هذا الدواء لذلك يجب على االشخاص الذين يستخدمون الكلوروكين لعالج المالريا \n" +
                                "التوقف عن استخدام الكركديه\n" +
                                "• االدوية الخافضة للضغط الدموي االملودبين وغيرها \n" +
                                "• االدوية الخافضة للسكر في الدم االنسولين وخافضات السكر الفموية \n" +
                                "• الديكلوفيناك"
        };
sixthmsg15 = new String[] {
                        " ينصح بعدم االستخدام اثناء الحمل لعدم توفر معلومات وادلة كافية عن امان استخدامه اثناء الحمل. "
        };
sevenmsg15 = new String[] {
                        "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                                "edition, p(394-396)\n" +
                                "• M.A Alam ………., F.I Al-Jenoobi ‘’ Effect of hibiscus sabdariffa and Zingiber officinale on \n" +
                                "pharmacokinetics and pharmacodynamics of amlodipine’’\n" +
                                "J Pharm Pharmacol. 2021 Aug, 12(9): 1151-1160. [PubMed]\n" +
                                "• T.O Fakeye ……., A.A Famakinde ‘’Effect of water extract of Hibiscus sabdariffa Linn \n" +
                                "(Malvaceae) Roselle on excretion of a diclofenac formulation’’\n" +
                                "Phytother Res, 2007 Jan,21(1): 96-8. [PubMed]\n" +
                                "• B.M Mahmoud……, J.L Bennett ‘’ significant reduction in chloroquine bioavailability following\n" +
                                "coadministration with Sudanese beverages Aradaib, Karkadi and lemon’’\n" +
                                " J Antimicrob Chemother. 1994 May ,33(5):1005-9. [PubMed]\n"
        };

    }

    private void getDetail14() {
        headings14 = new String[] {
               "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "الامان اثناء الحمل",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg14 = new String[] { "Mellisa officinalis" };
        seondmsg14 = new String[] { "االوراق والزيت العطري المستخرج منها" };
        thirdmsg14 = new String[] {
                "تتمتع المليسة بالخصائص الطبية التالية: \n" +
                        "• مهدىء ومزيل للقلق \n" +
                        "• مزيل للتشنج \n" +
                        "• طارد للريح \n" +
                        "• مضاد للجراثيم \n" +
                        "• مضاد للفيروسات \n" +
                        "• مضاد لالكسدة\n" +
                        "• تستخدم لعالج االرق والعصبية واضطرابات النوم"
        };
        fourthmsg14 = new String[] {
                " يعتبر الملسية امنة اذا استهلكت بصورة معتدلة دون االفراط في استخدامها. "
        };
fifthmsg14 = new String[] {
                "ينصح بعدم استخدام المليسة مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• االدوية المهدئة) فينوباربيتال , لورازيبام وغيرها( "
        };
sixthmsg14 = new String[] {
                " ينصح بعدم استخدام المليسة خالل الحمل لعدم وجود ادلة كافية حول سالمة استخدامها اثناء الحمل. "
        };
sevenmsg14 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition ,p (461-463)\n" +
                        "• P. Posadzki, E. Ernest ‘’Herb-drug interactions: an overview of systematic review’’\n" +
                        "Br J Clin Pharmacol.2013 Mar,75(3): 603-18. [PubMed]\n"
        };

    }

    private void getDetail13() {
        headings13 = new String[] {
                "ي ا",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "قد يسبب بعض االثار الجانبية",
                "االستخدام اثناء الحمل واالرضاع",
                "المراجع"
        };
        firstmsg13 = new String[] { "Panax quinquefol" };
        seondmsg13 = new String[] { "الجذور" };
        thirdmsg13 = new String[] { "يتمتع الجنسنع بالخصائص الطبية التالية: \n" +
                "• محفز للجهاز العصبي المركزي \n" +
                "• تاثيرات ايجابية للوقاية من االضطرابات المعرفية المرتبطة بالعمرحيث اثبتت بعض الدراسات فعاليته في تحسين الذاكرة \n" +
                "والتركيز \n" +
                "• مثبط الفراز عدد من النواقل العصبية كاالستيل كولين وغاماامينوبوتريك اسيد لذلك يساهم الجنسنغ في مجموعة متنوعة من \n" +
                "التاثيرات العالجية. \n" +
                "• معزز للمناعة حيث يزيد من انتاج الخاليا اللمفاوية والخاليا القاتلة الطبيعية ويحسن االستجابة المناعية \n" +
                "• مضاد للسرطان حيث اثبتت بعض الدراسات فعاليته في تحريض الموت المبرمج للخاليا السرطانية للمصابين بسرطان الكبد \n" +
                "• مضاد الرتفاع مستوى السكر في الدم ويزيد حساسية مستقبالت االنسولين \n" +
                "• مضاد لالكسدة لذلك يتمتع بتاثيرات واقية النسجة الكبد والقلب من تاثير الجذور الحرة\n" +
                "• يعزز من تصفية الكحول من الجسم النه يتمتع بتاثيرات خافضة لمستوى الكحول في الدم \n" +
                "• يخفض مستوى الدهون الثالثية والكولسترول في الدم \n" +
                "• مضاد للتخ ثر \n" +
                "• مضاد للفيروسات \n" +
                "• يستخدم لتحسين وزيادة القدرة على التحمل ولعالج التعب والوهن وضعف التركيز" };
        fourthmsg13 = new String[] {
                "يجب استخدامه بحذر من قبل مرضى القلب واالوعية الدموية والسكري وقد يسبب \n" +
                        "استخدام الجنسنغ لفترة طويلة وبكميات كبيرة ارتفاع في الضغط الدموي, فرط توتر, االرق, وذمة"
        };
        fifthmsg13 = new String[] {
               "االرق, الرعاف, الصداع, العصبية, القيء, االم في الثدي, نزيف مهبلي. "
        };
        sixthmsg13 = new String[] {
               "ينصح بعدم مشاركة الجنسنغ مع بعض المستحضرات الدوائية اهمها: \n" +
                       "• االدوية الخافضة لمستوى السكر في الدم ) االنسولين وخافضات السكر الفموية( \n" +
                       "• االدوية المضادة للتخث)الوارفارين ( ومضادات الصفيحات \n" +
                       "• مضادات االلتهاب غير الستيروئيدية \n" +
                       "• مضادات االكتئاب من فئة MAOIs (فينيليزين( \n" +
                       "• المدرات البولية ) مدرات العروة("
        };
        sevenmsg13 = new String[] {
               " ينصح بعدم استخدام الجنسنغ اثناء الحمل والرضاعة الطبيعية فهو يعتبر غير امن خالل \n" +
                       "هذه الفترة."
        };
        eightmsg13 = new String[] {
               "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                       "edition ,p (346 -350)\n"
        };


    }

    private void getDetail12() {
        headings12 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "االستخدام اثناء االرضاع الطبيعي",
                "المراجع"
        };
        firstmsg12 = new String[] { "Camellia sinesis" };
        seondmsg12 = new String[] { "الاوراق" };
        thirdmsg12 = new String[] {
            "يتمتع الشاي االخضر بالخصائص الطبية التالية: \n" +
                    "• منشط للجهاز العصبي المركزي \n" +
                    "• مضاد اكتئاب \n" +
                    "• مدر للبول \n" +
                    "• يقلل من مستويات السكر والدهون في الدم \n" +
                    "• مضاد التهاب \n" +
                    "• مضاد للخاليا السرطانية \n" +
                    "• خصائص وقائية من سرطانات البنكرياس,القولون,المستقيم,الثدي,الرئة \n" +
                    "• مضاد للبكتريا \n" +
                    "• تاثير مثبط لترسب البالك وتاثير وقائي من تسوس االسنان"
        };
        fourthmsg12 = new String[] {
                "يعتبر الشاي االخضر امن اذا استهلك بكميات معتدلة اال ان استهالكه بكميات مفرطة يمكن \n" +
                        "ان يسبب فرط حموضة وتهيج المعدة,انخفاض الشهية, قلق,االرق,خفقان,فقدان شهية,دوار,اسهال,صداع,القيء"
        };

        fifthmsg12 = new String[] {
                "ينصح بعد م مشاركة الشاي االخضر مع بعض المستحضرات الدوائية:\n" +
                        "• المستحضرات الحاوية على الحديد واالدوية الحاوية على حمض الفوليك النه قد يسبب نقص في توافرها الحيوي لذلك ينصح \n" +
                        "الشاي االخضر قبل تناول هذه االدوية بساعتين او بعد تناول هذه االدوية ب 4 ساعات.\n" +
                        "• االسيتامينوفين)الباراسيتامول( بينت بعض الدراسات التي اجريت على الحيوانات ان استهالك الشاي االخضر بعد استخدام \n" +
                        "الباراسيتامول قد سبب زيادة في السمية الكبدية لهذا الدواء\n" +
                        "• مضادات التخثر)الوافارين( واالدوية المضادة للصفيحات) كلوبيدوغريل( \n" +
                        "• االدوية الخافضة للضغط الد موي )نادولول( \n" +
                        "• التاموكسيفين \n" +
                        "• االتروبين \n" +
                        "• الكودائين \n" +
                        "• الفيرباميل \n" +
                        "• االدوية المضادة للسرطان)بورتيزوميت( المشاركة مع الشاي االخضرتثبيط لفعالية الدواء\n" +
                        "• االدينوزين: االستخدام مع الشاي االخضر يثبط تاثير االدينوزين المستخدم في اختبار جهد القلب لذلك يوصى بالتوقف عن \n" +
                        "استهالك الشاي االخضر قبل اجراء هذا االختبار ب 24 ساعة \n" +
                        "• المضادات الحيوية من فئة الكينولون: المشاركة بينهما قد تسبب بظهور االثار الجانبية للكافيئين المتواجد في الشاي \n" +
                        "االخضركالصداع وزيادة معدل ضربات القلب الن هذه االدوية تقلل من سرعة تفكك الكافيئين"
        };

        sixthmsg12 = new String[] {
                " ينصح بان ال تزيد الكمية المستهلكة من الشاي االخضر عن 5 اكواب بحيث ال يزيدعن 300 ملغ من \n" +
                        "الكافيئين يوميا اضافة الى احتواء الشاي االخضرعلى مركبات تقلل من امتصاص حمض الفوليك الضروري لمنع حدوث \n" +
                        "تشوهات عصبية لدى الجنين."
        };

        sevenmsg12 = new String[] {
                        "يمكن ان يسبب استهالك الشاي االخضر اضطرابات بالنوم لدى الرضع وذلك الن الشاي \n" +
                                "ينتقل الى حليب الثدي. "
        };
        eightmsg12 = new String[] {
                        "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, \n" +
                                "4\n" +
                                "thedition, p (369-372)\n" +
                                "• F. Brinker, ‘’Herb contractions and drug interactions’’ \n" +
                                "Eclectic Medical Puplications, 2001. [Google Scholar]\n" +
                                "• J. Taylor, V. Wilt ‘’Probable antagonism of warfarin by green tea’’\n" +
                                "Annalas of Pharmacotherapy 33 (4), 426-428, 1999. [Google Scholar]\n" +
                                "• W. F Salmine……. A. A Ali ‘’Green tea extract can potentaite acetaminophen-induced \n" +
                                "hepatotoxicity in mice’’\n" +
                                "Food Chem Toxicol 2012 May, 50(5): 1439-46. [PubMed]\n" +
                                "• E. B Goldeni……, A. H Schonthal ‘’Green tea polyphenols block the anticancer effects of \n" +
                                "bottezomib and other boronic acid-based proteasome inhibitors’’\n" +
                                "Boold (2009) 113(23): 5927-5937. [PubMed]\n" +
                                "• S.C Shin……., J.S Choi ‘’ effects of epigallocatechin gallate on the oral bioavailability and \n" +
                                "pharmacokinetics of tamoxifen and its main metabolite, 4-hydroxytamoxifen, in rats’’\n" +
                                "• J.H Chang…..., J.S Choi ‘’Effect of oral epigallocatechin gallate on the oral pharmacokinetics of \n" +
                                "verapamil in rats’’\n" +
                                "Biopharm Drug Dispos. 2009 May,30(2): 90-3. [PubMed] \n" +
                                "• S. Misaka, ……., J. Kimura ‘’ Green tea ingestion greatly reduces plasma concentrations of \n" +
                                "nadolol in healthy subjects’’\n" +
                                "Clin Pharmacol Ther. 2014 Apr. [PubMed]\n" +
                                "• M.Carbo, ……, J. Cami ‘’ Effect of quinolones on caffeine disposition’’\n" +
                                "Clin Pharmacol Ther. 1989 Mar,45(3): 234-40. [PubMed]\n"
        };

    }

    private void getDetail11() {
        headings11 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "ابرز االثار الجانبية",
                "ينصح بعدم استخدام ",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "ال يستخدم",
                "المراجع"
        };
        firstmsg11 = new String[] { "Senna alexandrina" };
        seondmsg11 = new String[] { "االوراق والثمار واالزهار" };
        thirdmsg11 = new String[] {
                "يتمتع السنا بالخصائص الطبية التالية: \n" +
                        "• ملين منبه \n" +
                        "• يستخدم لعالج االمساك ولتفريغ االمعاء قبل االختبارات التشخيصية للجهاز الهضمي ومنطقة القولون والمستقيم. "
        };
        fourthmsg11 = new String[] {
                "يمنع استخدام السنا في حال وجود انسداد معوي, التهاب زائدة دودية, التهاب امعاء حاد."
        };
        fifthmsg11 = new String[] {
                "اضطرابات معدية معوية تعود لتاثير السنا الملين االستخدام لفترات طويلة يمكن ان يسبب بصورة نادرة \n" +
                        "عدم انتظام ضربات القلب, اعتالل كلية, وذمة, نقص مستوى البوتاسيوم في الدم, بيلة دموية, ضعف بالعضالت"
        };
        sixthmsg11 = new String[] {
                "السنا على اعتباره من الملينات المنبهة الكثر من اسبوعين دون استشارة طبية."
        };
        sevenmsg11 = new String[] {
                "ينصح بعدم استخدام السنا مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• الديجوكسين \n" +
                        "• مضادات االلتهاب الغيرستيرويدية \n" +
                        "• ادوية اضطرابات نظم القلب \n" +
                        "• االدوية التي يدخل في تركيبها االستروجين \n" +
                        "• حاصرات قنوات الكالسيوم) النيفيديبين("
        };
        eightmsg11 = new String[] {
                "يجب عدم استخدام السنا اثناء الحمل واالرضاع الطبيعي النه يعتبر غير امن خالل هذه الفترة."
        };
        ninthmsg11 = new String[] {
                "من قبل االطفال اقل من عامين."
        };
        tenthmsg11 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition ,p (684-686)\n"
        };


    }

    private void getDetail9() {
        headings9 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "من االثار الجانبية",
                "الجرعات الزائدة",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg9 = new String[] { "Zingiber officinalle" };
        seondmsg9 = new String[] { "الجذور" };
        thirdmsg9 = new String[] {
                "يتمتع الزنجبيل بالخصائص الطبية التالية: \n" +
                        "• مضاد للتجلطات الدموية بسبب فعاليته المضادة للتخثر والمضادة لتجمع الصفيحات الدموية. \n" +
                        "• مضاد لالكسدة\n" +
                        "• مضاد للغثيان والقيء \n" +
                        "• مضاد لاللتهاب \n" +
                        "• خافض لمستوى الدهون والكولسترول في الدم \n" +
                        "• مضاد الالم الصداع النصفي \n" +
                        "• يزيد من افراز اللعاب وعصائر المعدة والعصارة الصفراوية \n" +
                        "• يتمتع بتاثير محفزلجهاز المناعة \n" +
                        "• يستخدم لعالج فقدان الشهية \n" +
                        "• يستخدم لعالج دوار السفر\n" +
                        "• يستخدم لعالج اضطرابات عسر الهضم"
        };
        fourthmsg9 = new String[] {
                " يمنع استخدام الزنجبيل لعالج الغثيان الصباحي لدى الحوامل, يمنع استخدامه في حال \n" +
                        "وجود حصيات في المرارة, يمنع استخدامه من قبل االشخاص الذين يعانون من اضطرابات نزفية"
        };
        fifthmsg9 = new String[] {
                "للزنجبيل الحرقة المعدية والتهاب الجلد."
        };
        sixthmsg9 = new String[] {
                "منه قد تسبب تثبيط للجهاز العصبي المركزي وعدم انتظام ضربات القلب"
        };
        sevenmsg9 = new String[] {
                "ينصح بعدم استخدام الزنجبيل مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• االدوية المضادة للتخثر والمضادة للصفيحات \n" +
                        "• االدوية الخافضة لمستوى السكر في الدم \n" +
                        "• مضادات االلتهاب غير الستيروئيدية \n" +
                        "• سيكلوسبورين \n" +
                        "• تاكروليموس"
        };
        eightmsg9 = new String[] {
                "ينصح بعدم استخدام الزنجبيل اثناء الحمل لعدم توفر معلومات وادلة مثبتة عن تاثيراته خالل الحمل."
        };
        ninthmsg9 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition ,p (339-341)\n" +
                        "• S. Shalansky, ………C. Kerr ‘’ Risk of warfarin- related bleeding events and supratherapeutic \n" +
                        "international normalized ratios associated with complementary and alternative medicine: a \n" +
                        "longitudinal analysis’’\n" +
                        "Pharmacotherapy. 2007 Sep, 27(9): 1237-47. [PubMed]\n" +
                        "• P.J Hodges, P C A Kam ‘’ The peri- operative implications of herbal medicines’’ Anaesthesia. \n" +
                        "2002 Sep,57(9): 889-99. [ PubMed]\n" +
                        "• K. Egashira……, I.Ieiri ‘’ Food-drug interactions of tacrolimus with pomelo, ginger, and turmeric \n" +
                        "juice in rats’’ Drug Metab Pharmacokinte. 2012,27(2): 242-7. [PubMed]\n" +
                        "• D. Colombo, L. Lunaradon, G. Bellia ‘’ Cyclosporin and herbal supplement interactions’’ J \n" +
                        "Toxicol. 2014, 2014:145325. [PubMed] \n"
        };


    }

    private void getDetail8() {
        headings8 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "االثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg8 = new String[] { "Glycyrrhiza glabra" };
        seondmsg8 = new String[] { "الجذور المجففة غير المقشورة." };
        thirdmsg8 = new String[] {
                "يتمتع عرق السوس بالخصائص الطبية التالية: \n" +
                        "• مضاد لاللتهاب \n" +
                        "• مميع ومضاد لتخثر الدم\n" +
                        "• تاثيرات وقائية ضد القرحات المعدية كما يسرع من التئام القرح \n" +
                        "• مضاد للفيروسات كفيروس التهاب الكبد الوبائي B وفيروس الهربسsimplex Herpes\n" +
                        "• مضاد للفطريات كفطور المبيضات alibicans Candida\n" +
                        "• تاثيرات مشابهة لتاثير االلدوستيرون حيث يسبب احتباس الماء وارتفاع الضغط الدموي \n" +
                        "• تاثيرات مضادة لالورام \n" +
                        "• يستخدم لعالج السعال والتهاب الشعب الهوائية \n" +
                        "• يستخدم لعالج التهاب المعدة"
        };
        fourthmsg8 = new String[] {
                "يمنع استخدام عرق السوس من قبل المرضى المصابين بالتهاب الكبد المزمن, امراض \n" +
                        "الكبد الصفراوية, تليف الكبد, التهاب الكلى الحاد,مرضى السكر وارتفاع ضغط الدم, والمصابين بنقص البوتاسيوم في الدم , \n" +
                        "الحمل"
        };
        fifthmsg8 = new String[] {
                "قد يسبب استخدام عرق السوس لفترة طويلة نقص مستوى البوتاسيوم في الدم, ارتفاع مستوى الصوديوم في \n" +
                        "الدم وذمة وارتفاع الضغط الدموي اضطرابات قلبية ,و اعتالل كلوي حاد وترسب للكالسيوم في الكلى وفشل قلبي. "
        };
        sixthmsg8 = new String[] {
                "ينصح بعدم مشاركة عرق السوس مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• المدرات البولية الحافظة للبوتاسيوم والطارحة للبوتاسيوم) فوروسيميد, هيدروكلوروتيازيد( \n" +
                        "• مضادات التخثر)الوارفارين(\n" +
                        "• الغليكوزيدات القلبية) الديجوكسين( \n" +
                        "• االدوية المضادة الضطرابات نظم القلب \n" +
                        "• الكورتيكوستيرويدات"
        };
        sevenmsg8 = new String[] {
                "يوصى بتجنب استخدام عرق السوس اثناء الحمل لعدم توفر معلومات وادلة كافية حول سالمة \n" +
                        "استخدامه اثناء هذه الفترة."
        };
        eightmsg8 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p (469-473)\n"
        };
    }

    private void getDetail7() {
        headings7 = new String[] {
                "الاسم العلمي ",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg7 = new String[] { "Rosmarinus officinalis" };
        seondmsg7 = new String[] { "القمم المزهرة واوراق النبات المجففة وكذلك الزيت المستخرج منها." };
        thirdmsg7 = new String[] {
                "يتمتع اكليل الجبل بالخصائص الطبية التالية: \n" +
                        "• يتمتع بتاثير قابض \n" +
                        "• مضاد للميكروبات وللفطريات \n" +
                        "• مضاد تشنج \n" +
                        "• مزيل للقلق ومقوي للذاكرة وقد اثبتت بعض الدراسات فعاليته في عالج مرض الزهايمر. \n" +
                        "• مضاد لالكسدة\n" +
                        "• مضاد للتشنج \n" +
                        "• يستخدم لعالج التهاب الفم والبلعوم \n" +
                        "• يتمتع بفعالية مضادة لتساقط الشعر ويزيد من نموه النه يزيد من تدفق الدم الى فروة الراس"
        };
        fourthmsg7 = new String[] {
                "يتمتع اكليل الجبل بهامش امان جيد اال ان استخدامه بكميات كبيرة ولفترات طويلة قد \n" +
                        "يسبب اقياء, التهاب جلد ,ارق",
        };
        fifthmsg7 = new String[] { "ال توجد ادلة ومعلومات عن تداخالت دوائية الكليل الجبل" };
        sixthmsg7 = new String[] { "ينصح بعدم استهالك اكليل الجبل بكميات كبيراثناء الحمل لعدم توفر ادلة مثبتة عن امان استخدامه \n" +
                "خالل هذه الفترة" };
        sevenmsg7 = new String[] { "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                "edition ,p (645-647)\n" +
                "• S.Habtemmariam ‘’The therapeutic of rosemary (Rosmarinus officinalis) diterpenes for \n" +
                "Alzheimer’s disease’’\n" +
                "Evid Based Complement Alternt Med.2016. [PubMed] \n" +
                "• M.Ghasemzadeh, …., H.Hosseinzadeh ‘’Therapeutic effects of rosemary (Rosmarinus officinalis \n" +
                "L.) and its active constituents on nervous system disorders’’\n" +
                "Iran J Basic Med Sci. 2020, Sep, 23(9): 1100-1112. [PubMed]\n"};

    }

    private void getDetail6() {
        headings6 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع: "
        };
        firstmsg6 = new String[]{ "Salvia officinalis" };
        seondmsg6 = new String[]{ "الاوراق والازهار والزيت  الطيارالمستخرج منهما." };
        thirdmsg6 = new String[]{
                "يتمتع عقارالميريمية بالخصائص الطبية التالية: \n" +
                        "• مضاد للجراثيم والفطريات والفيروسات \n" +
                        "• منشط الفراز الصفراء \n" +
                        "• مثبط الفراز العرق \n" +
                        "• له تاثيرات على الجهاز العصبي المركزي ويسبب للتشنج \n" +
                        "• يستخدم لعالج التهاب الفم والبلعوم \n" +
                        "• يستخدم كفاتح للشهية \n" +
                        "• يستخدم لعالج فرط التعرق \n" +
                        "• يستخدم لعالج اضطرابات عسر الهضم \n" +
                        "• يمكن ان يستخدم خارجيا لعالج التهاب االغشية المخاطية لالنف والحنجرة",
        };
        fourthmsg6 = new String[]{
                "تعتبر المريمية امنة اذا استخدمت بصورة معتدلة دون االفراط في استخدامها وقد تظهر \n" +
                        "بعض االثار الناتجة عن استخدام كميات كبيرة منها عدم انتظام ضربات القلب, الشعور بالدوار, تشنجات صرعية.",
        };
        fifthmsg6 = new String[]{ "ال تتوفر معلومات وادلة موثوقة حول التداخالت الدوائية لعقار المريمية." };
        sixthmsg6 = new String[] {" ينصح بعدم استخدام المريمية خالل الحمل النها تعتبر غير امنة خالل هذه الفترة."};
        sevenmsg6 = new String[] {"• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbl medicines. Thomson, Reuters, 2007, 4th\n" +
                "edition ,p (367-369)\n"};
    }

    private void getDetail5() {
        headings5 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص والاستخدامات الطبية ",
                "موانع االستخدام واالثار الجانبية",
                "ابرز االثار الجانبية",
                "التداخالت الدوائية:",
                "االستخدام اثناء الحمل واالرضاع",
                "المراجع"
        };
        firstmsg5 = new String[]{"Coeffia arabica"};
        seondmsg5 = new String[]{"البذور"};
        thirdmsg5 = new String[]{
                " تتمتع بذور القهوة الخضراء بالخصائص الطبية التالية والتي ترجع الى احتواءها على \n" +
                        "الكافيين: \n" +
                        "• تاثيرات منشطة للجهاز العصبي المركزي \n" +
                        "• تاثير ايجابي على القلب \n" +
                        "• تاثير مرخي للعضالت الملساء في االوعية الدموية \n" +
                        "• تاثيرات مدرة للبول \n" +
                        "• تاثيرات منشطة الفرازات المعدة\n" +
                        "• اثبتت الدراسات فعالية الكافيين في المساعدة لعالج الزكام كما يساعد في عالج الصداع",
        };
        fourthmsg5 = new String[]{
                "ينصح بعدم االفراط بتناول القهوة لدى بعض االشخاص كالحوامل والمرضعات ومرضى \n" +
                        "ارتفاع ضغط الدم ومرضى القلب واالوعية الدموية وفرط نشاط الغدة الدرقية والمصابين بالقرحة المعدية وتشمل االثار \n" +
                        "الجانبية فرط الحموضة تهيج المعدة ,اسهال ,قلة الشهية ,االرق, الخفقان و الدوخة.",

        };
        fifthmsg5 = new String[]{
                "لالفراط في استهالك القهوة اكثر من 5.1 غرام من الكافيئين يوميا تصلب وتشنجات وعدم انتظام \n" +
                        "ضربات القلب. "
        };

        sixthmsg5 = new String[] {
                "ينصح بعدم مشاركة القهوة مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• االفدرين \n" +
                        "• االدينوزين \n" +
                        "• مانعات الحمل الفموية \n" +
                        "• الليثيوم \n" +
                        "• االدوية المضادة لالكتئاب من فئة ) MAOIs )\n" +
                        "• المضادات الحيوية من فئة الكينولون \n" +
                        "• االدوية المستخدمة لعالج الربو من فئة ) agonist adrenergic-B ( \n" +
                        "• االدوية المضادة للتخثر والمضادة للصفيحات \n" +
                        "• المستحضرات الدوائية التي تحوي على الحديد ",
        };

        sevenmsg5 = new String[] {
                " يجب على الحامل تجنب الكميات الكبيرة من الكافيئين والتي تتجاوز 300 ملغ يوميا اي \n" +
                        "ما يعادل 3 اكواب من القهوة على مدار اليوم وينصح بعد م االكثار من القهوة اثناء االرضاع الطبيعي الن الكافيئين ينتقل عن \n" +
                        "طريق الحليب ويسبب اضطرابات في النوم لدى الرضع. "
        };
        eightmsg5 = new String[] {
                "• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition, p-(453-455)\n" +
                        "• M.Carbo, ……, J. Cami ‘’ Effect of quinolones on caffeine disposition’’\n" +
                        "Clin Pharmacol Ther. 1989 Mar,45(3): 234-40. [PubMed]\n" +
                        "• R. Mester, ……, P.Toren ‘’Caffeine withdrawal increase lithium blood levels’’\n" +
                        "Biol Psychiatry 1995, 37: 348-350. [PubMed]\n" +
                        "• S. Hagg, …., R. Dahlqvist ‘’Effect of caffeine on clozapine pharmacokinetics in healthy \n" +
                        "volunteers’’\n" +
                        "Br J Clin Phamacol.2000 Jan, 49(1): 59-63. [PubMed]\n" +
                        "• S. J Stohs, V. Badmaev ‘’A review of natural stimulants and non-stimulant thermogenic agents’’\n" +
                        "Phytother Res. 2016 May, 30(5): 732-740. [PubMed]\n" +
                        "• A. H Staib, ……., C. Beer ‘’Interactions between quinolones and caffeine’’\n" +
                        "Drugs. 1987, 34Suppl 1:170-174. [PubMed]\n" +
                        "• J.A Carrillo, J. Benitez ‘’Clinically significant pharmacokinetics interactions between dietary \n" +
                        "caffeine and medication’’\n" +
                        "Clin Pharmacokinet. 2000 Aug, 39(2):127-53. [ PubMed]\n" +
                        "• D.R. Abernethy, E.L.Todd ‘’Impairment of caffeine clearance by chronic use of low-dose \n" +
                        "oestrogen-containing oral contraceptive’’\n" +
                        "European journal of clinical pharmacology. 28,425-428. [PubMed]\n" +
                        "• R. F Hurrell, M. Reddy, J.D Cook ‘’Inhibition of non-haem iron absorption in man by \n" +
                        "polyphenolic-containing beverages’’\n" +
                        "Br J Nutr. 1999 Apr, 81(4): 289-95. [PubMed]\n"
        };

    }

    private void getDetail4() {
        headings4 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية ",
                "موانع االستخدام واالثار الجانبية",
                "التداخلات الدوائية",
                "الاستخدام اثناء الحمل ",
                "المراجع"
        };
        firstmsg4 = new String[] {"Origanum syriacum"};
        seondmsg4 = new String[] {"جميع اجزاء النبات المزهر والزيت العطري المستخرج منها"};
        thirdmsg4 = new String[] {
                " يتمتع بالخصائص الطبية التالية: \n" +
                        "• تاثير قابض \n" +
                        "• مضاد اكسدة\n" +
                        "• خصائص مهدئة للمعدة وطارد للريح ومضاد تشنج \n" +
                        "• مضاد للبكتريا والفطريات \n" +
                        "• مضاد التهاب \n" +
                        "• تاثير واقي للكبد والقلب \n" +
                        "• مضاد تخثر \n" +
                        "• مضاد للقرحة و ويتمتع بتاثيرات واقية في لالغشية المخاطية في الجهازين الهضمي والتنفسي \n" +
                        "• يستخدم لعالج االضطرابات الهضمية والتهابات الجهاز التنفسي بسبب فعاليته المضادة للميكروبات \n" +
                        "• يساعد على تنظيم الدورة الشهرية واستعادة توازن الهرمونات لدى النساء غير الحوامل. \n" +
                        "• يساعد في عالج متالزمة المبيض متعدد الكيسات",
        };
        fourthmsg4 = new String[] {
                "اثبتت الدراسات هامش امان كبير للبردقوش اال ان استخدامه بصورة مفرطة قد يسبب \n" +
                        "التهاب للجلد, يجب عدم استخدامه للرضع واالطفال الصغار.",
        };
        fifthmsg4 = new String[] {
                "ينصح بعدم استخدام البردقوش مع بعض المستحضرات الدوائية اهمها: \n" +
                        "• مميعات الدم ومضادات التخثر \n" +
                        "• االدوية الخافضة لمستوى السكر في الدم ",
        };
        sixthmsg4 = new String[] {
                " يجب عدم استخدامه اثناء الحمل خاصة زيت البردقوش النه يعتبر غير امن."
        };
        sevenmsg4 = new String[]{"• Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
        "edition ,p (746 -748)\n" +
        "• I.Haj-Husein, S. Tukan, F. Alkazaleh ‘’The effect of Origanum majorana tea on the hormonal \n" +
        "profile of women with polycystic ovary syndrome: a randomized controlled pilot study’’\n" +
        "• PMID:25662759. 2015. [PubMed]\n" +
        "• F. Bina, …., R. Rahimi ‘’Sweet Marjoram: a review of ethnopharmacology, phytochemistry, and \n" +
        "biological activities’’ PMID: 27231340 2016 May. [PubMed]\n" +
        "• H.F Yen, ……. C. K Wang,’’ In vitro anti diabetic effect and chemical component analysis of 29 \n" +
        "essential oils products’’\n" +
        "Food Drug Anal. 2015 Mar 23(1): 124-129. [PubMed]\n"};
    }

    private void getDetail3() {
        headings3 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم من النبات",
                "الخصائص والاستخدامات الطبية",
                "موانع الاستخدام",
                "الاثار الجانبية",
                "التداخلات الدوائية",
                "الاستخدام اثناء الحمل",
                "الاستخدام لدى الاطفال",
                "المراجع"
        };
        firstmsg3 = new String[] {"Alo vera, Aloe barabadensis, Aloe capennsis))"};
        seondmsg3 = new String[] {"االوراق والهالم المستخرج منها."};
        thirdmsg3 = new String[] {
            "يتمتع الصباربالعديد من الخصائص الطبية اهمها :",
            "• تاثيرات ملينة لذلك يستخدم لعالج االمساك. \n" +
                    "• تاثيرات مضادة للبكتريا \n" +
                    "• تاثيرات مضادة للفيروسات ) فيروس الهربس البسيط وفيروس الحماق النطاقي, فيروس االنفلونزا( \n" +
                    "• تاثرات مضادة لالورام. \n" +
                    "• تاثيرات محفزة لجهاز المناعة \n" +
                    "• تاثيرات مضادة لاللتهاب \n" +
                    "• يستخدم لعالج االمراض الناتجة عن نقص التروية الدموية كقضمة الصقيع. \n" +
                    "• يستخدم هالم الصبار موضعيا لتاثيره المسرع اللتئام الجروح والحروق السطحية",
        };
        fourthmsg3 = new String[] {
          "يمنع استخدام الصبار في حاالت اال نسداد المعوي والتهاب القولون التقرحي داء كراون والتهاب الزائدة \n" +
                  "الدودية .",
         };
        fifthmsg3 = new String[]{
          "استخدام الصبار لفترات طويلة وبكميات كبيرة قد يسبب االسهال, تثبيط حركة االمعاء, عدم انتظام ضربات \n" +
                  "القلب, اعتالل الكلية, وذمة , تصبغ الغشاء المخاطي المعوي)الورم الميالني الكاذب( الذي يزول عند التوقف عن االستخدام, \n" +
                  "بول دموي,بيلة االلبومين , نقص البوتاسيوم , فرط الحساسية الذي يظهر بشكل التهاب جلد واكزيما, ضرر باالنسجة \n" +
                  "المعوية .",
        };
        sixthmsg3 = new String[] {
          " يوصى بعدم استخدام الصبار مع بعض المستحضرات الدوائية: \n" +
                  "• الغليكوزيدات القلبية)الديجوكسين( . \n" +
                  "• االدوية المضادة الضطرابات النظم. \n" +
                  "• المدرات البولية. \n" +
                  "• الكورتيكوستيرويدات."
        };
        sevenmsg3 = new String[] {
                " يمنع استخدام الصبار اثناء الحمل فهو يعتبر غير امن خالل هذه الفترة "
        };

        eightmsg3 = new String[] {
                "يمنع االستخدام لدى االطفال دون 12 عام."
        };
        ninthmsg3 = new String[] {
                "Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition p (16-19)\n"
        };

    }

    private void getDetail2() {
        headings2 = new String[] {
                "الاسم العلمي",
                "الجزء المستخدم",
                "الاستخدامات والخصائص الطبية",
                "موانع الاستخدام والاثار الجانبية",
                "يوصى بعدم تناول الحبة السوداء مع الادوية التالية",//todo:change 2(e)
                "التداخالت الدوائية",
                "الاستخدام اثناء الحمل ",
                "المراجع: "
        };
        firstmsg2 = new String[] {
                "Nigella sativia"
        };
        seondmsg2 = new String[]{
          "البذور"
        };
        thirdmsg2 = new String[]{
          "تتمتع الحبة السوداء بالخصائص الطبية التالية: ",
          " مضادة لالكسدة",
          "محفزة للمناعة",
          "مضادة للطفيليات",
          "تاثيرات مضادة للصرع",
          "تاثيرات خافضة لمستوى السكر والدهون في الدم",
          "خصائص مضادة للسرطان ",
          "تستخدم مستخلصات حبة البركة لعالج الربو والسعال وامراض الحساسية",
          "تستخدم لعالج امراض المفاصل",
          "اثبتت بعض الد راسات التي اجريت على الحيوانات فعاليتها في وقاية االنسجة من التلف الناتج من التعرض لالشعاع",
            };
        fourthmsg2 = new String[] {
                "قد يسبب زيت حبة البركة التهاب جلد تحسسي",
        };
        fifthmsg2 = new String[] {
            "تستخدم بحذز خلال فترة الحمل والارضاع  فهي تعتبر غير امنة خلال الحمل والارضاع "//todo:change 2(e)
        };
        sixthmsg2 = new String[] {
            "ينصح بعدم مشاركة الحبة السوداء مع عدد من المستحضرات الدوائية اهمها:",
            "لها تاثير على الخمائر الكبدية )CYP2D6, CYP3A4 )م ما يؤثر على تركيز وفعالية االدوية التي تستقلب بواسطة هذه \n" +
                    "الخمائر."
        };
        sevenmsg2 = new String[] {
                " ينصح بعدم استخدامها اثناء الحمل واالرضاع لعدم وجود ادلة كافية حول امان استخدامها خالل هذه \n" +
                        "الفترة."
        };
        eightmsg2 = new String[] {
                "F. I Al-Jenoobi……., S. Jamil ‘’Effect of black seed on dextromethorphan O-and N-demethylation \n" +
                        "in human liver microsomes and healthy human subject’’\n" +
                        "Drug Metab Lett. 2010 Jan, (4): 51-5. [PubMed]\n" +
                        "M.Ebrahim, ……, F. Anwar ‘’Nigella sativa L. (Black Cumin): a promising natural remedy for wide \n" +
                        "range of illness’’ PMCID. 2019 May 12; 2019:1528635.\n"
        };

    }

    private void getDetail1() {
        headings1 = new String[]{
                "الاسم العلمي",
                "الجزء المستخدم",
                "الخصائص واالستخدامات الطبية",
                "موانع االستخدام واالثار الجانبية",
                "التداخالت الدوائية",
                "االستخدام اثناء الحمل",
                "المراجع"
        };
        firstmsg1 = new String[]{"(MatricariaChamomilla)"};
        seondmsg1 = new String[]{"االزهار"};
        thirdmsg1 = new String[]{
                " يتمتع البابونج بالخصائص الطبية التالية",
                "تاثيرات واقية للمعدة",
                "مضاد لاللتهاب",
                "مضاد لالكسدة",
                "مضاد لالورام ",
                "مضاد للميكروبات",
                "مهدىء ومزيل للقلق",
                " يساعد ويسرع في التئام الجروح والقروح",
                "يستخدم لعالج السعال والتهاب الشعب التنفسية والحمى والزكام",
                "يستخدم لعالج التهاب الفم والبلعوم",
                "يستخدم لعالج التهاب الجلد ولعالج الجروح والقروح",
                " يستخدم البابونج داخليا لعالج التهابات االغشية المخاطية في الجهازين الهضمي والتنفسي",
                " يستخدم البابونج خارجيا لعالج التهاب اللثة ولب االسنان ولعالج التهاب الجلد واالغشية المخاطية والتهاب الشرج.",
        };
        fourthmsg1 = new String[]{
                " يمنع استخدام البابونج من قبل االشخاص الذين لديهم ردود فعل تحسسية تجاه البابونج او \n" +
                        "احد مكوناته او احد االعشاب التي تنتمي لنفس الفصيلة النباتية كعشبة زهرة العطاس وحشيشة الدود وغيرها وتشمل االثار \n" +
                        "التهاب ملتحمة تحسسي تهيج الجلد و اعراض تحسسية حادة ) ضيق نفس حكة, طفح جلدي, ازيز( "
        };
        fifthmsg1 = new String[]{
                "ينصح بعد استخدام ال بابونج مع بعض المستحضرات الدوائية اهمها",
                "مضادات التخثر)الوارفارين(",
                "االدوية المهدئة)البينزوديازبينات(",
                "سيكلوسبورين"
        };
        sixthmsg1 = new String[]{" ينصح بعدم استخدام البابونج اثناء الحمل لعدم توفر ادلة تثبت سالمة وامان استخدامه خالل هذه \n" +
                "الفترة."};
        sevenmsg1 = new String[]{
                "Gruenwald, Joerg, Thomas Brendler, and Christof Jaenicke. PDR for herbal medicines. Thomson, Reuters, 2007, 4th\n" +
                        "edition ,p (331-333)\n",
                "R Segal, L Pilote ‘’Warfarin interaction with Matricaria chamomilla’’\n" +
                        "CMAJ. 2006 Apr, 174(9): 1281-2. [PubMed]",
                "D Colombo, L Lunardon, G Bellia ‘’Cyclosporine and herbal supplement interactions’’\n" +
                        "J Toxiol. 2014, 2014:145325. [PubMed]\n",
        };
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}