package com.juaracoding.utils;

public enum TestCases {

    T1("User dapat berhasil login dengan menggunakan kredensial yang valid"),
    T2("User dapat berhasil ke menu New");
//    T3("User dapat berhasil mencari data nama kandidat"),
//    T4("User dapat berhasil mencari data nomor kandidat"),
//    T5("User dapat berhasil mencari data kota kandidat"),
//    T6("User dapat berhasil mencari data asal kandidat"),
//    T7("User dapat berhasil mencari data tujuan kandidat");

    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}