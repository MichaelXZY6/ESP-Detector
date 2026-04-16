package com.detector.esp.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 语言管理器 — 中英双语切换
 */
public class Lang {

    private static boolean isEnglish = false;
    private static final String PREFS = "esp_settings";

    public static void load(Context ctx) {
        isEnglish = ctx.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                .getBoolean("lang_en", false);
    }

    public static void setEnglish(Context ctx, boolean en) {
        isEnglish = en;
        ctx.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
                .putBoolean("lang_en", en).apply();
    }

    public static boolean isEnglish() { return isEnglish; }

    // ====== 检测标签 ======
    private static final String[] LABELS_ZH = {
        "人物", "自行车", "汽车", "摩托车", "飞机", "公交车", "火车", "卡车",
        "船", "红绿灯", "消防栓", "停车标志", "停车计时器", "长椅", "鸟", "猫",
        "狗", "马", "羊", "牛", "大象", "熊", "斑马", "长颈鹿",
        "背包", "雨伞", "手提包", "领带", "手提箱", "飞盘", "滑雪板", "单板",
        "球", "风筝", "棒球棒", "棒球手套", "滑板", "冲浪板", "网球拍", "瓶子",
        "酒杯", "杯子", "叉子", "刀", "勺子", "碗", "香蕉", "苹果",
        "三明治", "橙子", "西兰花", "胡萝卜", "热狗", "披萨", "甜甜圈", "蛋糕",
        "椅子", "沙发", "盆栽", "床", "餐桌", "马桶", "电视", "笔记本电脑",
        "鼠标", "遥控器", "键盘", "手机", "微波炉", "烤箱", "烤面包机", "水槽",
        "冰箱", "书", "时钟", "花瓶", "剪刀", "泰迪熊", "吹风机", "牙刷"
    };

    private static final String[] LABELS_EN = {
        "Person", "Bicycle", "Car", "Motorcycle", "Airplane", "Bus", "Train", "Truck",
        "Boat", "Traffic Light", "Fire Hydrant", "Stop Sign", "Parking Meter", "Bench", "Bird", "Cat",
        "Dog", "Horse", "Sheep", "Cow", "Elephant", "Bear", "Zebra", "Giraffe",
        "Backpack", "Umbrella", "Handbag", "Tie", "Suitcase", "Frisbee", "Skis", "Snowboard",
        "Ball", "Kite", "Baseball Bat", "Baseball Glove", "Skateboard", "Surfboard", "Tennis Racket", "Bottle",
        "Wine Glass", "Cup", "Fork", "Knife", "Spoon", "Bowl", "Banana", "Apple",
        "Sandwich", "Orange", "Broccoli", "Carrot", "Hot Dog", "Pizza", "Donut", "Cake",
        "Chair", "Couch", "Potted Plant", "Bed", "Dining Table", "Toilet", "TV", "Laptop",
        "Mouse", "Remote", "Keyboard", "Cell Phone", "Microwave", "Oven", "Toaster", "Sink",
        "Refrigerator", "Book", "Clock", "Vase", "Scissors", "Teddy Bear", "Hair Dryer", "Toothbrush"
    };

    public static String[] getLabels() { return isEnglish ? LABELS_EN : LABELS_ZH; }

    // ====== UI 文本 ======
    public static String settings()     { return isEnglish ? "ESP Detection Settings" : "ESP 检测设置"; }
    public static String person()       { return isEnglish ? "Person" : "人物"; }
    public static String vehicle()      { return isEnglish ? "Vehicles (Car/Motorcycle/Bus/Truck/Bicycle/Boat)" : "车辆 (汽车/摩托/公交/卡车/自行车/船)"; }
    public static String animal()       { return isEnglish ? "Animals (Cat/Dog/Bird/Horse/Cow...)" : "动物 (猫/狗/鸟/马/牛...)"; }
    public static String objects()      { return isEnglish ? "Objects (Phone/Backpack/Bottle/Chair...)" : "物品 (手机/背包/瓶子/椅子...)"; }
    public static String enableAll()    { return isEnglish ? "Enable All" : "全部开启"; }
    public static String disableAll()   { return isEnglish ? "Disable All" : "全部关闭"; }
    public static String satellite()    { return isEnglish ? "Satellite Monitor" : "卫星实时监控"; }
    public static String language()     { return isEnglish ? "Language: English → 切换中文" : "语言: 中文 → Switch to English"; }
    public static String ok()           { return isEnglish ? "OK" : "确定"; }
    public static String cancel()       { return isEnglish ? "Cancel" : "取消"; }
    public static String locked()       { return isEnglish ? "LOCKED" : "锁定"; }
    public static String targets()      { return isEnglish ? "Targets" : "目标"; }
}
