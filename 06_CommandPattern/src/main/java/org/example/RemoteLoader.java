package org.example;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light KitchenLight = new Light("Kitchen");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand KitchenLightOn = new LightOnCommand(KitchenLight);
        LightOffCommand KitchenLightOff = new LightOffCommand(KitchenLight);

        CellingFanOnCommand cellingFanOn = new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0 , livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1 , KitchenLightOn, KitchenLightOff);
        remoteControl.setCommand(2 , cellingFanOn, cellingFanOff);
        remoteControl.setCommand(3 , stereoOnWithCDCommand, stereoOffCommand );

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println("================================================================================");
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        remoteControlWithUndo.setCommand(0 , livingRoomLightOn, livingRoomLightOff);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
        remoteControlWithUndo.offButtonWasPushed(0);
        remoteControlWithUndo.onButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();
//
        CellingFan cellingFan1 = new CellingFan("Living Room");

        CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(cellingFan1);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan1);
        CellingFanLowCommand cellingFanLowCommand = new CellingFanLowCommand(cellingFan1);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan1);

        remoteControlWithUndo.setCommand(1 , cellingFanMediumCommand, cellingFanOffCommand);
        remoteControlWithUndo.setCommand(2 , cellingFanHighCommand, cellingFanOffCommand);

        System.out.println("00000000000000000000000000000000000000000000");
        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.offButtonWasPushed(1);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(2);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWasPushed();

//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//
//
//
//        CellingFan ceilingFan = new CellingFan("Living Room");
//
//        CellingFanMediumCommand ceilingFanMedium =
//                new CellingFanMediumCommand(ceilingFan);
//        CellingFanHighCommand ceilingFanHigh =
//                new CellingFanHighCommand(ceilingFan);
//        CellingFanOffCommand ceilingFanOff =
//                new CellingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();


    }
}
