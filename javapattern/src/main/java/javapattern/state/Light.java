package javapattern.state;

public class Light implements LightState {

	protected LightState lightState;
	
	private LightState offState = new LightState() {
		
		public void on() {
			System.out.println("Light On");
			lightState = onState;
		}
		
		public void off() {
			System.out.println("Nothing");
		}
	};

	private LightState onState = new LightState() {
		
		public void on() {
			System.out.println("Light On");
		}
		
		public void off() {
			System.out.println("Light Off");
			lightState = offState;
		}
	};
	
	public Light () {
		lightState = offState;
	}

	@Override
	public void on() {
		lightState.on();
		
	}

	@Override
	public void off() {
		lightState.off();
		
	}
	
}
