package com.udemy.design.composite;

import com.udemy.design.iterator.*;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("パンケーキハウスメニュー", "朝食");
        MenuComponent dinerMenu = new Menu("食堂メニュー", "昼食");
        MenuComponent cafeMenu = new Menu("カフェメニュー", "夕食");
        MenuComponent dessertMenu = new Menu("デザートメニュー", "もちろんデザート!");

        MenuComponent allMenus = new Menu("すべてのメニュー", "すべてを統合したメニューー");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&Bのパンケーキ朝食", "スクランブルエッグとトースト付きパンケーキ", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("いつものパンケーキ朝食", "卵焼きとソーセージ付きパンケーキ", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("ブルーベリーパンケーキ", "新鮮なブルーベリーを使ったパンケーキ", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("ワッフル", "ブルーベリーか苺の好きなほうをのせたパンケーキ", true, 3.59));

        dinerMenu.add(new MenuItem("ベジタリアンBLT", "サンドイッチ1", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "サンドイッチ2", false, 2.99));
        dinerMenu.add(new MenuItem("本日のスープ", "ポテトサラダを添えた本日のスープ", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "ホットドッグ", false, 3.05));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
        "アップルパイ",
        "バニラアイスクリーム",
        true,
        1.59
        ));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
