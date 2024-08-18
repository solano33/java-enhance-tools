package com.solano.attach;


import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author github.com/solano33
 * @date 2024/8/18 22:40
 */
public class AttachMain {

    public static void main(String[] args) throws AttachNotSupportedException, AgentLoadException, AgentInitializationException, IOException {
        System.out.println("args = " + Arrays.toString(args));
//        VirtualMachine vm = VirtualMachine.attach("9909");
//        vm.loadAgent("/Users/solano/Documents/coding/github/java-enhance-tools/time-cost-agent/target/time-cost-agent-1.0-SNAPSHOT-jar-with-dependencies.jar");
    }
}
