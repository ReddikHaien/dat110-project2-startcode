package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
		System.out.println("Temperature device starting");
		
		client.connect();
		for (int i = 0; i < COUNT; i++) {
			int temp = sn.read();
			client.publish("temperature", Integer.toString(temp));
		}

		client.disconnect();
		System.out.println("Temperature device stopping ... ");

	}
}
