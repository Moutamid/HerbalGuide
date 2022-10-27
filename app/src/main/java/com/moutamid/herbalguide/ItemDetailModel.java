package com.moutamid.herbalguide;

import java.util.ArrayList;

public class ItemDetailModel {
    int img;
    String name, arabic_name;
    ArrayList<String> headings;
    String[] firstlist, secondList, thirdlist, fourthlist, fifthlist, sixthlist, seventhlst;

    public ItemDetailModel(int img, String name, String arabic_name) {
        this.img = img;
        this.name = name;
        this.arabic_name = arabic_name;
    }

    public ItemDetailModel(int img, String name, ArrayList<String> headings, String[] firstlist, String[] secondList, String[] thirdlist, String[] fourthlist, String[] fifthlist, String[] sixthlist, String[] seventhlst) {
        this.img = img;
        this.name = name;
        this.headings = headings;
        this.firstlist = firstlist;
        this.secondList = secondList;
        this.thirdlist = thirdlist;
        this.fourthlist = fourthlist;
        this.fifthlist = fifthlist;
        this.sixthlist = sixthlist;
        this.seventhlst = seventhlst;
    }

    public ItemDetailModel(int img, String name, ArrayList<String> headings, String[] firstlist, String[] secondList, String[] thirdlist, String[] fourthlist, String[] fifthlist, String[] sixthlist) {
        this.img = img;
        this.name = name;
        this.headings = headings;
        this.firstlist = firstlist;
        this.secondList = secondList;
        this.thirdlist = thirdlist;
        this.fourthlist = fourthlist;
        this.fifthlist = fifthlist;
        this.sixthlist = sixthlist;
    }

    public ItemDetailModel(int img, String name, ArrayList<String> headings, String[] firstlist, String[] secondList, String[] thirdlist, String[] fourthlist, String[] fifthlist) {
        this.img = img;
        this.name = name;
        this.headings = headings;
        this.firstlist = firstlist;
        this.secondList = secondList;
        this.thirdlist = thirdlist;
        this.fourthlist = fourthlist;
        this.fifthlist = fifthlist;
    }

    public ItemDetailModel(int img, String name, String[] firstlist, String[] secondList, String[] thirdlist, String[] fourthlist) {
        this.img = img;
        this.name = name;
        this.firstlist = firstlist;
        this.secondList = secondList;
        this.thirdlist = thirdlist;
        this.fourthlist = fourthlist;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getHeadings() {
        return headings;
    }

    public void setHeadings(ArrayList<String> headings) {
        this.headings = headings;
    }

    public String[] getFirstlist() {
        return firstlist;
    }

    public void setFirstlist(String[] firstlist) {
        this.firstlist = firstlist;
    }

    public String[] getSecondList() {
        return secondList;
    }

    public void setSecondList(String[] secondList) {
        this.secondList = secondList;
    }

    public String[] getThirdlist() {
        return thirdlist;
    }

    public void setThirdlist(String[] thirdlist) {
        this.thirdlist = thirdlist;
    }

    public String[] getFourthlist() {
        return fourthlist;
    }

    public void setFourthlist(String[] fourthlist) {
        this.fourthlist = fourthlist;
    }

    public String[] getFifthlist() {
        return fifthlist;
    }

    public void setFifthlist(String[] fifthlist) {
        this.fifthlist = fifthlist;
    }

    public String[] getSixthlist() {
        return sixthlist;
    }

    public void setSixthlist(String[] sixthlist) {
        this.sixthlist = sixthlist;
    }

    public String[] getSeventhlst() {
        return seventhlst;
    }

    public void setSeventhlst(String[] seventhlst) {
        this.seventhlst = seventhlst;
    }

    public String getArabic_name() {
        return arabic_name;
    }

    public void setArabic_name(String arabic_name) {
        this.arabic_name = arabic_name;
    }
}
