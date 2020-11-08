package com.features;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringsNewMethods {

    public static void main(String[] args) {
        // indent
        String str = "*****\n  Hi\n  \tHello Pankaj\rHow are you?\n*****";
        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));

        // transform
        String s = "Hi,Hello,Howdy";
        List strList = s.transform(s1 -> {
            return Arrays.asList(s1.split(","));
        });
        System.out.println(strList);

        // describeConstable
        String so = "Hello";
        Optional os = so.describeConstable();
        System.out.println(os);
        System.out.println(os.get());

        // resolveConstantDesc
        String so1 = "Hello1";
        String s1 = so1.resolveConstantDesc(MethodHandles.lookup());
        System.out.println(s1);
    }

}
