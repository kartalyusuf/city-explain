package com.example.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //static Bitmap resimsec ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);
        ArrayList<String> isim = new ArrayList<>() ;

        isim.add("Topkapı Sarayı") ;
        isim.add("Dolmabahçe Sarayı");
        isim.add("Süleymaniye Camii");
        isim.add("Galata Kulesi");
        isim.add("Yerebatan Sarnıcı");




        ArrayList<String> aciklama = new ArrayList<>();
        aciklama.add(" Topkapı Sarayı; Fatih Sultan Mehmet, İstanbul’u fethettikten sonra 1460 yılında yapılmaya başlanmış ve 1478 yılında da tamamlanmıştır. Saray, İstanbul Boğazı ve Haliç arasında, İstanbul yarımadasının ucundaki Sarayburnu’nda yer alan Doğu Roma yerleşkesinin üzerinde 700.000 metrekarelik bir arazi üzerine inşa edilmiştir. Fatih Sultan Mehmet başta olmak üzere Sultan Abdülmecid’e kadar dört yüz yıl imparatorluğun; eğitim, idare ve sanat merkezi olan Topkapı Sarayı, yapılış gününden itibaren günümüze kadar önemini korumayı başarmıştır.\n" +
                "\n" +
                "Cumhuriyetin ilanından sonra 3 Nisan 1924 yılında, müze olarak kullanılmaya başlanan ve Cumhuriyet’in ilk müzesi olan Topkapı Sarayı, 400.000 metrekarelik bir alana sahiptir. Koleksiyonları, mimari yapıları ve yaklaşık 300.000 arşiv belgesi bulunan Topkapı Sarayı, dünyanın en büyük saray müzelerindendir. Pek çok farklı eseri çatısı altında bulunduran Saray, her yıl hem yerli hem de yabancı ziyaretçilerin akınına uğruyor. ");

        aciklama.add(" Dolmabahçe Sarayı, otuz birinci Osmanlı padişahı Sultan Abdülmecid tarafından yaptırılmış. Osmanlı’nın modernleşme hedefine uygun olarak Batı anlayışı ile tasarlanan Dolmabahçe Sarayı, 7 Haziran 1856 tarihinde kullanıma açılmış. İnşasına 13 Haziran 1843 yılında başlanan bu görkemli sarayın yapımı 13 yıl sürmüş. \n" +
                "\n" +
                "Dolmabahçe Sarayı, Garabet Amira Balyan ve oğlu Nikogos Balyan mimarlığında inşa edilmiş. Batı mimarisi baz alınarak yapılan bu saray; Abdülmecid, Abdülaziz, V. Murad, II. Abdülhamid, V. Mehmed Reşad, VI. Mehmed (Vahdeddin) dönemlerinde devlet işlerini yönetme amacıyla kullanılmış. Mustafa Kemal Atatürk de son yıllarını bu sarayda geçirdikten sonra buradaki yatak odasında vefat etmiş. \n" +
                "\n" +
                "Günümüzde Saray Koleksiyonları Müzesi olarak kullanılan görkemli saray, tarih meraklılarını İstanbul’da bir araya getiriyor. Burada görülebilecek birçok değerli eser var. Osmanlı’nın son dönemlerini merak ediyorsan Dolmabahçe Sarayı’nın gizemlerini mutlaka keşfetmelisin! ");

        aciklama.add(" İstanbul’un Fatih semtinde bulunan Süleymaniye Camii dini bakımdan büyük bir önem taşımaktadır. Cami, Mısır Çarşısı ve Kapalı Çarşı’ya yakınlığı ile dikkat çekmektedir. Osmanlı Devleti döneminde yapılan önemli mimari yapılardan biridir.\n" +
                "\n" +
                "İnşaatı 1550 yılında başlamış olan Süleymaniye Camii, 1557 yılında halka sunulmuştur. Caminin yapım emri bizzat Kanuni Sultan Süleyman tarafından verilmiştir. Süleymaniye Camii halk arasında ”sonsuza kadar yıkılmayacak cami” unvanıyla bilinir.\n" +
                "\n" +
                "Bu unvan, mimari yapının son derece sağlam bir yapı olduğunu bizlere göstermektedir. Yapı, dini açıdan farklı olarak eğitim açısından da önemli bir yere sahiptir. O dönemde külliye görevi görmüş bir yapıdır. ");


        aciklama.add(" Kule ilk olarak 507 yılında Bizans İmparatoru Anastasius tarafından inşa edildi. Fener kulesi olarak tamamen ahşaptan yapılan kule yüzlerce yıl hizmet verdikten sonra eskiyerek yok oldu. Bizans İmparatorluğu’nun himayesi altındaki Cenevizliler 14. yüzyılda, Galata semtinin çevresini 2 metre kalınlığında ve 3 kilometre uzunluğunda surlarla çevirdiler. 1348 yılında eski fener kulesinin yerine yığma taştan gözetleme kulesi inşa ettiler. Sur içine yaptıkları kuleden İstanbul’un büyük bir kısmını ve boğaz rahatlıkla görülebildiğinden düşmanlara karşı stratejik bir üstünlük sağladılar. O tarihte Cenevizliler kulenin adını İsa Kulesi koymuşlardı, Bizanslılar ise Büyük Burç olarak adlandırmaktaydı. 1453 yılında Fatih Sultan Mehmet’in İstanbul’u fethetmesiyle bölgenin tamamı Osmanlıların eline geçti. Osmanlılar da kuleyi bir süre boyunca gözetleme amaçlı ve hapishane olarak kullandılar.\n"
                 ) ;


        aciklama.add(" İstanbul'un görkemli tarihsel yapılarından birisi de Ayasofya’nın güneybatısında bulunan Bazilika Sarnıcı’dır. Bizans İmparatoru I. Justinianus (527-565) tarafından yaptırılan bu büyük yeraltı sarnıcı, suyun içinden yükselen ve sayısız gibi görülen mermer sütunlar sebebiyle halk arasında “Yerebatan Sarayı” olarak isimlendirilmiştir. Sarnıcın bulunduğu yerde daha önce bir Bazilika bulunduğundan, Bazilika Sarnıcı olarak da anılır.\n" +
                "\n" +
                "Sarnıç, uzunluğu 140 metre, genişliği 70 metre olan dikdörtgen biçiminde bir alanı kaplayan, dev bir yapıdır. Toplam 9.800 m2 alanı kaplayan bu sarnıç, yaklaşık 100.000 ton su depolama kapasitesine sahiptir. 52 basamaklı taş bir merdivenle inilen bu sarnıcın içerisinde her biri 9 metre yüksekliğinde 336 sütun bulunmaktadır. Birbirine 4.80 metre aralıklarla dikilen bu sütunlar, her biri 28 sütun içeren 12 sıra meydana getirirler.  Çoğunluğu daha eski yapılardan toplandığı anlaşılan ve çeşitli mermer cinslerinden yontulmuş sütunların büyük bir kısmı tek parçadan, bir kısmı da iki parçadan oluşmaktadır. Bu sütunların başlıkları, yer yer farklı özellikler taşır. Bunlardan 98 adedi Corint üslûbu yansıtırken bir bölümü de Dor üslûbunu yansıtmaktadır.  Sarnıçtaki sütunların köşeli veya yivli biçimde olan birkaç tanesi hariç büyük bir çoğunluğu silindir biçimindedir. Sarnıcın ortasına doğru kuzeydoğu duvarı önünde yer alan 8 sütun, 1955-1960 yıllarında yapılan bir inşaat sırasında kırılma tehlikesine maruz kaldıklarından, bunların her biri, kalın bir beton tabaka içine alınarak dondurulmuş ve bu yüzden eski özelliklerini kaybetmişlerdir. Sarnıcın tavan aralığı kemerler vasıtasıyla sütunlara aktarılmıştır. Sarnıcın tuğladan örülmüş 4.80 metre kalınlığındaki duvarları ve tuğla döşeli zemini, Horasan harcından kalın bir tabakayla sıvanarak su geçmez hale getirilmiştir. \n" +
                "\n" +
                "Bizans döneminde bu çevrede geniş bir sahayı kaplayan ve imparatorların ikamet ettiği büyük sarayın ve bölgedeki diğer sakinlerin su ihtiyacını karşılayan Yerebatan Sarnıcı, İstanbul’un Osmanlılar tarafından 1453 yılında fethinden sonra bir müddet daha kullanılmış ve padişahların oturduğu Topkapı Sarayı’nın bahçelerine buradan su verilmiştir. ");


        Bitmap topkapi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.topkapi);
        Bitmap dolmabahce = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.dolmabahce);
        Bitmap suleymaniye = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.suleymaniye);
        Bitmap galata = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.galata);
        Bitmap sarnic = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sarnic);


        ArrayList<Bitmap> resim = new ArrayList<>();
        resim.add(topkapi);
        resim.add(dolmabahce);
        resim.add(suleymaniye);
        resim.add(galata);
        resim.add(sarnic);






        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,isim);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //System.out.println(isim.get(position));
                //System.out.println(aciklama.get(position));


                Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra("isim",isim.get(position));
                intent.putExtra("aciklama",aciklama.get(position));

                Singleton singleton = Singleton.getInstance();
                singleton.setResimsec(resim.get(position));





                startActivity(intent);



            }
        });



    }
}