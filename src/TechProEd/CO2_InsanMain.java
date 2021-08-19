package TechProEd;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CO2_InsanMain {
    public static void main(String[] args) {

        CO1_AdemOglu insan1= new CO1_AdemOglu();
        //insan1.age =-47;
        insan1.name ="Onur";
        insan1.SurName ="Enes";


        System.out.println(insan1.name  + " "+  insan1.SurName);
        System.out.println(insan1.getAge());




    }



}
