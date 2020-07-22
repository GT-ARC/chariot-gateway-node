# Chariot Gateway Node

CHARIOT agent are constructed on JIAC Agent Framework and consumes all functionalities provided by JIAC.
Agent communication is easily performed by JIAC framework, however, the inter-networking agent communication
does require a special effort to ensure agent-to-agent communication in different network domains.
In order to tackle this issue, JIAC  introduced the Gateway Agent (GA), which enables agent communications among
agents that runs on the different network domains.

CHARIOT middleware employs the same approach to alleviate this issue. All IoT agents being executed on distinct networks
can reach to each other through the GA.

The configuration file of GA is located in `resources/GatewayNode.xml` file. All other agents aiming to communicate over this agent
should access to this agent.

## Usage

- Start the GA via `./startChariotGatewayNode`
- Stop the GA via `./stopChariotGatewayNode`

If the aforementioned scripts cannot be executed on your platform, you should run
`/target/appassembler/bin/GatewayNode` for unix OSes or `/target/appassembler/bin/GatewayNode.bat` for Windows OS

## Contacts

The following persons can answer your questions: 

- Frederic Abraham: [mail@fabraham.dev](mailto://mail@fabraham.dev)
- Cem Akpolat: [akpolatcem@gmail.com](mailto://akpolatcem@gmail.com)

 
