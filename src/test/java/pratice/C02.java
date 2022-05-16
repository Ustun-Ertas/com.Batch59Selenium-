package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        //  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
//  8-Ardindan "gittigidiyor.com" adresine gidelim
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
//  10-Bi onceki web sayfamiza geri donelim
//  11-sayfayi yenileyelim
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim


        //  1-driver olusturalim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        //  2-java class'imiza chromedriver.exe'yi tanitalim
        WebDriver driver = new ChromeDriver();

        //3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();

        //  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");

        //  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String sahibindenTitle= driver.getTitle();
        System.out.println("sahibindetitle" +sahibindenTitle);

        String sahibindenUrl= driver.getCurrentUrl();
        System.out.println("sahibindenUrl" +sahibindenUrl);

        //  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim

        if (sahibindenTitle.contains("Oto") && sahibindenUrl.contains("Oto")){
            System.out.println("oto yazisi vardir");

        }else {
            System.out.println("oto yazisi yoktur");
        }

        //  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.gittigidiyor.com");

        boolean isTrue =driver.getTitle().contains("Sitesi");

        if (isTrue)
        {
            System.out.println("tes PASSED");
        }else {
            System.out.println("test FAILED");
        }

        System.out.println();
        //  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
        //  11-sayfayi yenileyelim
        driver.navigate().refresh();

        //  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();

        //  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.close();
        driver.quit();

    }

}
