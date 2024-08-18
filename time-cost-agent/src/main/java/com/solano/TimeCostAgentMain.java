package com.solano;

import java.lang.instrument.Instrumentation;

public class TimeCostAgentMain {

    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("premain执行了...");
    }

    public static void agentmain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("agentmain执行了...");
    }

}