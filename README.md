# 練習  
## 目的
packageを複数用意し、アクセスの範囲を制限する意味を掴む。  
Enumの使用例。
## 概要  
productパッケージとMainでの構成。  
パッケージ内は定数宣言用のEnumProductとその定数を使用したProductクラスを用意。
Mainクラスにて呼び出し。

## package  
### product  
#### EnumProduct  
product内で使用する定数の設定。  
drink,foodの2種類のenumの作成。  
それぞれのアクセスの範囲をパッケージ内に設定し、パッケージ外からの使用を制限。  

#### Product  
**import static main.java.product.EnumFood.;**  
**import static main.java.product.EnumDrink.;**  

にて使用するEnumをインポート(複数回使用するコーディング記述省略の為)  

drink型で指定された変数drinkFindにdrink型の定数Colaを代入  

privateで制限されたswitch文の引数にdrinkFindを指定し、定数の条件に合ったメソッドを呼び出し。  

getterにて取得。

## Main
インスタンスを生成し、呼び出し。

## 修正  
enum内にfood,drinkを作っていたが分ける。  
UPPER_SNAKE_CASEに変更。

