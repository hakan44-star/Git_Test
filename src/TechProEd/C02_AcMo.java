package TechProEd;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class C02_AcMo {
    public static void main(String[] args) {

        CO1_AcMo obj1 = new CO1_AcMo();
        System.out.println(obj1.defaultAge);
        System.out.println(obj1.protectedAge);
        System.out.println(obj1.publicAge);
        System.out.println("******************\n\n");
        CO3_AcMo obj2 = new CO3_AcMo();
        System.out.println(obj2.defaultName);
        System.out.println(obj2.protectedName);
        System.out.println(obj2.publicName);

    }

}
