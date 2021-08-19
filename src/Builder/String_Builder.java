package Builder;

public class String_Builder {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();		// bos bir sb1 creat ettik

        // SB' e eleman ekleme ===> obj.appent(obj);

        sb1.append("faruk");

        System.out.println("sb1 ilk hali : " + sb1);		// faruk yazdirir

        sb1.append(" efehan");

        System.out.println("sb1 efehan eklenmis hali : " + sb1);		// faruk efehan yazdirir

        System.out.println("sb1 uzunluk : " + sb1.length());		// 12 yazdirir

        System.out.println("sb1 kapasitesi : " + sb1.capacity());		// 16 yazdirir

        System.out.println("sb1 son hali : " + sb1.append(" guzel insan"));		// faruk efehan
        // guzel insan yazdirir

        System.out.println("sb1 son hali. kapasite : " + sb1.capacity());

        // faruk efehan guzel insan

        // Fazladan ayirilan kapasiteyi silme ===> obj.trimToSize();

        sb1.trimToSize();

        System.out.println(sb1.capacity()); 		// 24 yazdirir

        // Istenen character' in index' ini alma ===> obj.indexOf();

        System.out.println(sb1.indexOf("e"));		// 6 yazdirir

        System.out.println(sb1.lastIndexOf("e")); 		// 16 yazdirir

        // Istenen bir character' i index' ine gore alma ===> obj.charAt();

        System.out.println("sb 7. karakter : " + sb1.charAt(7));		// f yazdirir

        // Belirli bir araliktaki character' leri alma ===> obj.subSequence

        System.out.println("sb' nin 7 dahil 1 haric karakterleri : " + sb1.subSequence(7, 12));	// fehan yazdirir

        System.out.println("sb' nin 5 dahil tum karakterleri : " + sb1.toString().substring(5));	// efehan guzel insan yazdirir

        System.out.println("sb' nin 5 dahil tum karakterleri : " + sb1.subSequence(5, sb1.length()));	// efehan guzel insan yazdirir

        // sb' deki belirli bir index' teki karakteri silme ===> obj.delete(a,b); a dahil b haric
        // arasi siler. obj.deleteCharAt olursa ===> sadece a karakterini siler

        sb1.delete(3, 7);

        System.out.println("3-7 arası karakter silinmis hali : " + sb1); 		// farfehan guzel
        // insan yazdirir

        sb1.deleteCharAt(2);

        System.out.println("2. karakter silinmis hali : " + sb1);

        sb1.insert(2 ,"1");
        System.out.println(sb1);


        String s ="hayat";
        StringBuilder sbBuilder =new StringBuilder();
        sbBuilder.append("hayat");
        System.out.println(s==sbBuilder.toString());
        System.out.println(s.equals(sbBuilder.toString()));






    }


}
