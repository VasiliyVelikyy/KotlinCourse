package kotlin_in_action.java_classes;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

import java.util.Collection;
import java.util.Iterator;

/**Класс сгенерированый декомпиляцией байткода файла kotlin_in_action.java_classes.kotlin_classes/function.kt*/

public class Function {
    @JvmOverloads
    public static final String joinToStringWithOutClass( Collection collection,String separator,  String prefix,  String postfix) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        Intrinsics.checkParameterIsNotNull(separator, "separator");
        Intrinsics.checkParameterIsNotNull(prefix, "prefix");
        Intrinsics.checkParameterIsNotNull(postfix, "postfix");
        StringBuilder result = new StringBuilder(prefix);
        int index = 0;

        for(Iterator var7 = ((Iterable)collection).iterator(); var7.hasNext(); ++index) {
            Object element = var7.next();
            if (index > 0) {
                result.append(separator);
            }

            result.append(element);
        }

        result.append(postfix);
        String var10000 = result.toString();
        Intrinsics.checkExpressionValueIsNotNull(var10000, "result.toString()");
        return var10000;
    }

    // $FF: synthetic method
    public static String joinToStringWithOutClass$default(Collection var0, String var1, String var2, String var3, int var4, Object var5) {
        if ((var4 & 2) != 0) {
            var1 = ",";
        }

        if ((var4 & 4) != 0) {
            var2 = " ";
        }

        if ((var4 & 8) != 0) {
            var3 = " ";
        }

        return joinToStringWithOutClass(var0, var1, var2, var3);
    }

    @JvmOverloads
    public static final String joinToStringWithOutClass( Collection collection, String separator,  String prefix) {
        return joinToStringWithOutClass$default(collection, separator, prefix, (String)null, 8, (Object)null);
    }

    @JvmOverloads
    public static final String joinToStringWithOutClass( Collection collection,  String separator) {
        return joinToStringWithOutClass$default(collection, separator, (String)null, (String)null, 12, (Object)null);
    }

    @JvmOverloads
    public static final String joinToStringWithOutClass( Collection collection) {
        return joinToStringWithOutClass$default(collection, (String)null, (String)null, (String)null, 14, (Object)null);
    }
}
