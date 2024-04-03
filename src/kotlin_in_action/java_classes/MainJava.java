package kotlin_in_action.java_classes;

import kotlin_in_action.java_classes.kotlin_classes.StringHelper;
import kotlin_in_action.java_classes.kotlin_classes.strings.StringFunctions;
//import kotlin_in_action.java_classes.kotlin_classes.FunctionKt;

import java.util.Arrays;
import java.util.List;

public class MainJava {
    public static void main(String[] args /*млжно и так String... args*/) {

        retriveKotlinStringFunction();
    }

    private static void retriveKotlinStringFunction() {

        List list= Arrays.asList(1,14,23);
        StringHelper stringHelper=new StringHelper();
        String answ=stringHelper.joinToStringWithDefaultValues(list,"*");
        System.out.println(answ);
        //Можно обращаться по имени файла, до того как в исходнике рпименена была аннотация @file:JvmName("StringFunctions")
        // String answ2=FunctionKt.joinToStringWithOutClass(list); //можно обратиться к функции без класса, но указать файл обязательно
        String answ2= StringFunctions.joinToStringWithOutClass(list);
        String unixSeparator=StringFunctions.getUNIX_LINE_SEPARATOR();
    }
}
