package com.hllbr.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello Worl")
        println("Hello Hllbr")

        println(4*5)

        println(12/3)
        println(12*3)


        //Variables == Değişkenler

        //Bir değeri kod içerisinde birden fazla yerde yazmak gibi bir ihtiyaç doğduğunda bu bizim için inanılmaz bir kolaylık sağlıyor.

        //Kullanıcıdan alınan verilerle işlemler yapılması gerekn durumlarda internetten verilerin getirilip stoklanması işlenmesi vb durumlarda harika bir çözüm yolu olarak karşımıza çıkıyor.

        //var ifadesi variable'ın kısaltılmış halidir.

        var x = 5
        var y = 4

        println(x*y)//buradaki işlemin 4 ve 5 i çarpmaktan farklı yok

        //Buradaki tek fark ben bu x ve y değerlerimi farklı bir alanda tekrar çağırmak istersem bunu kolaylıkla yapabilirim

        var age = 35

        //Kullanıcı kişinin 35 yaşında olduğu standart bir senaryomuz olsun bunu 7 ile bölen 5 ile çarpan bir program yazdığımı varsayıyorum

        println("user age operation : "+age/7*5)
        //x ve y yada age ifadelerim değişken ismini almıştır bunun sebebi alt satırlarda bu ifadelerin değerleriyle istediğim noktalarda değişiklik yapabiliyor olmama kodlar çağrıldıkları sıraya göre değer alır üst satırda x ifademin değeri 5 ve işlemlerim buna göre yapılıyorken ben alt satırda ifademin değerini 7 yaparak işlemlerime devam edebilirim

        x = 7

        println(x*y)
        //Kullanıcı yaşı için tasarladğımı işlemi şimdi x ve y ile birlikte gerçekleştiriyorum
        println("user age opetation 2 : "+age/x*y)
        //eğer şimdi y ifadesinide güncellersem ve 5 yaparsam ilk age işleminin sonucunu tekrarlamış olacağım
        y = 5
        println("user age operation 3 : "+age/x*y)

        //Kodlamada değişkenler oluşturabildiğim gibi birde sabitler oluşturabilirim

        //Constains == Sabitler

        //Program boyunca değerimin değiştirilmesine izin vermeyen bir yapıya sahip bu yapı


        //var ifadesi yerine val yazarsam bu ifade değişken değil sabit olarak anlaşılır derleyicimde

        val name = "hllbr"

        //name = "hbr" yapı değşikliğe izin vermiyor

        val a = 5

        //a = 65 yine değer değişikliği yapılamaz bir şekilde tanımlandı hatası alıyorum





    }

}