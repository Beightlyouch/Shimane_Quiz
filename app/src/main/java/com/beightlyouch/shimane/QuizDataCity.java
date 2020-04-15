package com.beightlyouch.shimane;

public class QuizDataCity {
    private static final String poolcity[] []= new String[][]{
            {"ama", "chibu", "gotsu", "hamada", "iinan", "izumo", "kawamoto", "masuda", "matsue",
             "misato", "nishinoshima", "oda", "okinoshima", "okuizumo", "onan", "tsuwano", "unnan", "yasugi", "yoshika"},

            {"海士町", "知夫村", "江津市", "浜田市", "飯南町", "出雲市", "川本町", "益田市", "松江市",
             "美郷町", "西ノ島町", "大田市", "隠岐の島町", "奥出雲町", "邑南町", "津和野町", "雲南市", "安来市", "吉賀町"}};

    public static String[][] getPoolcity(){
        return QuizDataCity.poolcity;
    }

    public static int getCityNum(){
        return poolcity.length;
    }
}
