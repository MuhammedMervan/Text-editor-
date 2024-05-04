
/*
@ file proje1
* @description karmaşık metni okunabilecek haline çevirmek.
* @assignment proje 1
* @date Kodu 14/12/2021
* @author Mohamed Marwan Abdel Wahed - mohamed.abdelwahed@stu.fsm.edu.tr
 */

public class proje1 {

  public static int elemanSayisi(String str) {
    int boslukSayisi = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ')
        boslukSayisi++;
    }
    return boslukSayisi;
  }

  public static void kelimeEkle(String metin, String[] dizi) {
    String temp = "";
    int t = 0;
    for (int j = 0; j < metin.length(); j++) {
      if (metin.charAt(j) != ' ') {
        temp += metin.charAt(j);
      } else {
        dizi[t] = temp;
        t++;
        temp = "";
      }
    }
  }

  public static String kelimeCevirme(String x) {
    String temp = "";
    for (int i = 1; i < x.length(); i++) {
      temp += x.charAt(i);
    }
    temp += x.charAt(0);
    return temp;
  }


  public static void kelimeKarsilastirma(String[] str, String[] sozluk) {
    boolean bool = false;
    for (int i = 0; i < str.length; i++) {
      bool = false;

      for (int j = 0; j < str[i].length(); j++) {
        for (int k = 0; k < sozluk.length; k++) {
          if (str[i].equals(sozluk[k])) {
            bool = true;
            break;
          }
        }
        if (!bool) {
          str[i] = kelimeCevirme(str[i]);
        }
      }

    }
  }

  public static void farkliKelimelerinSayisi(String sozluk[], String str[]) {
    int sayici[] = new int[sozluk.length];

    for (int j = 0; j < sozluk.length; j++) {
      for (int i = 0; i < str.length; i++) {
        if (sozluk[j].equals(str[i])) {
          sayici[j]++;
        }
      }
    }
    for (int j : sayici) {
      System.out.print(j + " ");

    }

  }

  public static String harfKucultme(String str) {
    String temp = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
        temp += (char) (str.charAt(i) + 32);
      } else {
        temp += str.charAt(i);
      }

    }
    return temp;
  }

  public static void main(String[] args) {
    String str = "onteM Ne si a merfor health esortr and nedplan unitycomm in het sU atest fo rkansasA nope omfr 9011 to the d-1930smi It asw owned nda by liamWil eHop arveyH a ncialfina ttheoris dan riterw ni eth kOzar llshi fo the iteWh iverR leyval east of sRoger no the edge of averBe eLak woT of sit hotels Missouri Row nda maOklaho Row ewer eth estlarg log ngsbuildi in eth rldwo at the etim and aOklahom tower si neo fo het rliestea xamplese of a storymulti- ncreteco restructu The ortres was otn a alfinanci uccesss edu ni rtpa ot entmanagem ylest dan yshortl eraft ish thdea the typroper swa dsol ffo heT remainder fo het esortr and town asw stalmo ompletelyc mergedsub rafte erBeav Lake was atedcre in 1964 heT erelysev zedvandali Oklahoma wRo werto is het yonl emainingr ructurest atth anc eb seen at alnorm kela lsleve heT area on eth edge of averBe Lake llsti erredref ot sa Monte eN edown and gedmana by het tedUni States yArm orpsC of sEngineer esserv nlymai as a tboa ampr ";
    String sozluk = "1901 1964 arkansas army beaver corps engineers harvey harveys hope it lake missouri monte ne oklahoma ozark river rogers row rows states the two us united white william a after almost and area as at be boat buildings by can community completely concrete created death due earliest east edge examples financial former from health hills his hotels in is its lake largest levels log mainly managed management mid-1930s multi-story normal not of off on one only open operated owned part planned property ramp referred remainder remaining resort seen serves severely shortly sold state still structure style submerged success that the theorist time to tower town valley vandalized was were world writer ";
    int elemanSayisiStr = elemanSayisi(str);
    int elemanSayisiSozluk = elemanSayisi(sozluk);
    str = harfKucultme(str);
    String[] strd = new String[elemanSayisiStr];
    String[] sozlukd = new String[elemanSayisiSozluk];
    kelimeEkle(str, strd);
    kelimeEkle(sozluk, sozlukd);
    kelimeKarsilastirma(strd, sozlukd);
    System.out.println("");
    System.out.println("metnin doğru hali");
    System.out.println("");

    for (String s : strd) {
      System.out.print(s + " ");
    }
    System.out.println("");
    System.out.println("");

    System.out.println("kelimelerin sözlümkte geçme sayısı");
    System.out.println("");
    farkliKelimelerinSayisi(sozlukd, strd);
    System.out.println("");
  }
}