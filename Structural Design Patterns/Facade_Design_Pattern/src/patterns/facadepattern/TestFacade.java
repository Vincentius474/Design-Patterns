package patterns.facadepattern;

public class TestFacade {

	public static void main(String[] args) {

		System.out.println("Using Facade Design Pattern\n");
		
		ScheduleServer objScheduleServer = new ScheduleServer();
		
		ScheduleServerFacade objScheduleServerFacade = new ScheduleServerFacade(objScheduleServer);
		objScheduleServerFacade.startServer();
		System.out.println("\nStart working......\n");
		System.out.println("After work done.........\n");
		objScheduleServerFacade.stopServer();

	}

}
