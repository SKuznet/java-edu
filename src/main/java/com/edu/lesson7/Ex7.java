package com.edu.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Ex7<T> {
    public static void main(String[] args) {
    }

    public void getInfo(){
        List<? super T> list = new ArrayList<>();

        // error
//        List<? extends Doctor> list1 = new ArrayList<MedicalStaff>();
        List<? extends Doctor> list1 = new ArrayList<Doctor>();
        List<? extends Doctor> list2 = new ArrayList<HeadDoctor>();

        List<? super Doctor> list3 = new ArrayList<Doctor>();
        List<? super Doctor> list4 = new ArrayList<MedicalStaff>();
        // error
//        List<? super Doctor> list5 = new ArrayList<HeadDoctor>();
    }

    class MedicalStaff{}

    class Doctor extends MedicalStaff{}

    class HeadDoctor extends Doctor {}

    class Nurse extends MedicalStaff{}


}
