# Connect Apache Ignite with Mule 3

_[Apache Ignite®](https://ignite.apache.org) is a memory-centric distributed database, caching, and processing platform for
transactional, analytical, and streaming workloads, delivering in-memory speeds at petabyte scale._

![connector](assets/connector.png)

*All company names, logos, brand names and trademarks are property of their respective owners. All company, product and service names used in this website are for identification purposes only.*

With this connector you can integrate, into your Mule applications, Apache Ignite's features like:

- Distributed synchronization data structures (Lock, Semaphores, CountdowntLatches).
- Distributed atomic data structures (Atomic Long, Atomic Reference, Atomic Sequence and Atomic Stamp).
- Other Apache Ignite's distributed data structures (set, topics, queue and cache).
- Distributed in-memory file system.
- SQL and Lucene based queries over caches' data.
- Transactional and cache scopes.
- Distributed scheduler.
- Distributed batches.
- Topic based Messaging
- Queue based Messaging
- ...

## Requirements

	-  Java >= 1.8.0_65 (OpenJDK and Sun have been tested)
	-  Maven >= 3.3.0
	-  Mule 3.9.0

## Clone

	-  Clone this project: `git clone http://github.com/hawkore/examples-apache-ignite-connector-mule3.git`
	-  Change to directory: `cd examples-apache-ignite-connector-mule3`


## Simple API usage

* `examples-simple-api-usage`: This examples wraps most connector operations and lets you invoke them by
using very simple web forms. See [README.md](examples-simple-api-usage/README.md).

# Additional examples

* `ignite-server-node-test`: Server nodes to test Hawkore's Apache Ignite connector. See [README.md](ignite-server-node-test/README.md) for more info.

* `example-mule3-ignite-connector`: Mule 3 application to test [Hawkore's Apache Ignite connector for Mule 3
](https://docs.hawkore.com/private/apache-ignite-connector-mule3/). See [README.md](example-mule3-ignite-connector/README.md) for more info.

# Other resources

Sign up at [www.hawkore.com](https://www.hawkore.com) to access full documentation.
