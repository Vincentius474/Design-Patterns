The problem faced by the clients in using the Schedule Server is the complexity brought by the server in order to start and stop
its services. The client wants a simple way to do it. The following is the code that clients required to write to start and stop the
server.

```
ScheduleServer scheduleServer = new ScheduleServer();
```

To start the server, the client needs to create an object of the ScheduleServer class and then need to call the below methods in the
sequence to start and initialize the server.

```
scheduleServer.startBooting();
scheduleServer.readSystemConfigFile();
scheduleServer.init();
scheduleServer.initializeContext();
scheduleServer.initializeListeners();
scheduleServer.createSystemObjects();
System.out.println("Start working......");
System.out.println("After work done.........");
```

To stop the server, the client needs to call the following methods in the same sequence.

```
scheduleServer.releaseProcesses();
scheduleServer.destory();
scheduleServer.destroySystemObjects();
scheduleServer.destoryListeners();
scheduleServer.destoryContext();
scheduleServer.shutdown();
```

This looks a burden to them, they are not interested in doing all these stuffs, and why would they? Even though this might look
interesting to some of the clients who might be interested in the low-level interface of the system, most of them disliked it.

To resolve this, we will create a facade class which will wrap a server object. This class will provide simple interfaces (methods)
for the client. These interfaces internally will call the methods on the server object.