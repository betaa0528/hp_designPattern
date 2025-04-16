package org.example;

public class MacroCommandTest {
    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("거실");
        Stereo stereo = new Stereo("거실");
        Hottub hottub = new Hottub();
        TV tv = new TV("거실");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnCommand = new MacroCommand(partyOn);
        MacroCommand partyOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnCommand, partyOffCommand);
        System.out.println(remoteControl);

        System.out.println("---- 매크로 켜는중 ----");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---- 매크로 끄는중 ----");
        remoteControl.offButtonWasPushed(0);

    }
}
