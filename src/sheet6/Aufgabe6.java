package sheet6;

import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.ST;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;

public final class Aufgabe6 {
    private Aufgabe6() { }

    public static void main(String[] args) throws Exception {
        ClassInfo[] classes = new ClassInfo[]{new ClassInfo(Class.forName("java.lang.String")),
                new ClassInfo(Class.forName("java.util.Iterator")), new ClassInfo(Class.forName("java.time.Month"))};
        ST templ = new STGroupFile("src/sheet6/aufgabe6.stg").getInstanceOf("aufgabe6");
        templ.add("k", classes);
        String result = templ.render();
        System.out.println(result);
    }
}

final class ClassInfo {
    public String name;
    public String type;
    public InterfaceInfo[] interfaces;
    public boolean isInterface;
    public ClassInfo(Class<?> c) {
        this.name = c.getName();
        if(c.isInterface()) {
            this.interfaces = new InterfaceInfo[]{new InterfaceInfo(c)};
            this.type = "interface";
            this.isInterface = true;
        } else {
            this.interfaces = Arrays.stream(c.getInterfaces()).map(InterfaceInfo::new).toArray(InterfaceInfo[]::new);
            this.type = "class";
            this.isInterface = false;
        }
    }
}

final class InterfaceInfo {
    public String name;
    public String[] methods;
    public InterfaceInfo(Class<?> c) {
        this.name = c.getName();
        this.methods = new String[c.getMethods().length];
        for(int i = 0; i < c.getMethods().length; i++) {
            Method tmp_meth = c.getMethods()[i];
            this.methods[i] = tmp_meth.getReturnType().getName() + " " + tmp_meth.getName() + "(";
            for(int j = 0; j < tmp_meth.getParameterTypes().length; j++) {
                this.methods[i] += tmp_meth.getParameterTypes()[j].getName();
                if(j < tmp_meth.getParameterTypes().length - 1) {
                    this.methods[i] += ", ";
                }
            }
            this.methods[i] += ")";
        }
    }
}