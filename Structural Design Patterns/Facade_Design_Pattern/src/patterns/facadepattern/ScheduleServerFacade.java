package patterns.facadepattern;

public class ScheduleServerFacade {
	
	// Attributes
	private final ScheduleServer scheduleServer;
	
	public ScheduleServerFacade(ScheduleServer objScheduleServer) {
		this.scheduleServer = objScheduleServer;
	}
	
	// Method to start the server
	public void startServer() {
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
	}
	
	// Method to stop the server 
	public void stopServer() {
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
	}

}
