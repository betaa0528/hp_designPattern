package org.example;

public class CellingFanOffCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {

        if(prevSpeed == CellingFan.HIGH){
            cellingFan.high();
        } else if(prevSpeed == CellingFan.MEDIUM){
            cellingFan.medium();
        } else if(prevSpeed == CellingFan.LOW){
            cellingFan.low();
        } else if(prevSpeed == CellingFan.OFF){
            cellingFan.off();
        }

    }
}
