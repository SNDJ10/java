package com.xworkz.software.external;

import com.xworkz.software.internal.AiTools;
import com.xworkz.software.internal.JavaTool;
import com.xworkz.software.internal.Jdk;

public class AiToolRunner {
    public static void main(String[] args) {
        AiTools ai=new Jdk("chatgpt","generativeAi");
        JavaTool javaTool=new JavaTool();


        String softwareTool="Elipse";
        String nameOfArchitecture="JVM Architecture";
        System.out.println(softwareTool+nameOfArchitecture);
        javaTool.displayJavaTool();
        ai.displayChatBot();
    }
}
