package de.gtarc.gatewaynode;

import de.dailab.jiactng.agentcore.SimpleAgentNode;
import de.dailab.jiactng.agentcore.lifecycle.LifecycleException;
import org.springframework.context.ApplicationContext;

public class GatewayNodeStarter {

    public static void main(String[] args) {
        startNewEntityAgent();
    }

    private static void startNewEntityAgent() {
        ApplicationContext context = SimpleAgentNode.startAgentNode("classpath:GatewayNode.xml", "jiactng_log4j.properties");
        SimpleAgentNode node = (SimpleAgentNode) context.getBean("GatewayNode");
        try {
            node.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }

}
