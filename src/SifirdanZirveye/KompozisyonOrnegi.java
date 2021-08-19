package SifirdanZirveye;

public class KompozisyonOrnegi {

    public void main(String[] args) {

       Araba myAraba = new Araba();


    }


    class  Motor {


        private String isim;
        private int beygirGucu;

        public Motor() {
            isim = "Honda";
            beygirGucu = 135;
        }


        public void calistir() {
            System.out.println("Motor caliştirildi");
        }

        public void durdur() {
            System.out.println("Motor durduruldu ");
        }

    }

        class Araba{


            private Motor arabaMotoru;
            private String renk;
            private  String marka;
            private  int uretimYili;



            public Araba(){
                arabaMotoru= new Motor();
                renk ="Kirmizi";
                marka ="Toyota";
                uretimYili =2019;
            }



         public void hareketeGec (){
             System.out.println("ARABA HAREKETE GETİR");
         }





        }
    }

