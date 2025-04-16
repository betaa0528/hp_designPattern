package org.example;

public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(36);
		hottub.off();
	}
	public void undo() {
		hottub.on();
	}
}
