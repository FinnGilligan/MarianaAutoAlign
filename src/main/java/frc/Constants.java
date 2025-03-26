package frc;

import com.ctre.phoenix6.configs.Slot0Configs;

public class Constants {
    public static class OperatorConstants {

        public static final Slot0Configs armConfigs = new Slot0Configs()
        .withKP(1).withKI(0).withKD(0);

        // Motor IDs
        public static final int intakeMotorID = 14;
        public static final int crossbowMotorID = 15;
        public static final int climbingMotorID1 = 16;
        public static final int climbingMotorID2 = 17;
        public static final int intakeAngleID = 25; // used to be 13 but that's cursed apparently??

        // Intake constants 
        public static final double intakerMotorSpd = 0.6;
        public static final double intakeAngle = 58.0;
        public static final double coralAngle = 58.0;
        public static final double stowAngle = 0.0;
        public static final double baseAngle = 0;
        public static final double topSwitchPosition = -20;
        public static final double bottomSwitchPosition = 59.5;
        public static final double maxPosition = 65;
        public static final double dereefAngle = 25;

        // Crossbow constants
        public static final double topCrossbow = 25;
        public static final double bottomCrossbow = 0;
        public static final double crossbowMarginOfError = 1;
        public static final double crossbowSpeed = 0.4;
        // Sensor IDs
        public static final int crossbowMagLimitSwitchID = 3;
        public static final int crossbowLimitSwitchID = 0;     
        

        // Climber constants
        public static final double climberAngle = 90;
        public static final double increaseAmount = 1;

        // Auto constants
        public static final int drive_kP = 10;
        public static final int drive_kI = 0;
        public static final int drive_kD = 0;

        public static final int rotation_kP = 7;
        public static final int rotation_kI = 0;
        public static final int rotation_kD = 0;

    public static final int idsLength = 16;

    //Near station
    //Far station
    //Amp
    //Center speaker
    //Right speaker
    //Far stage
    //Left stage
    //Right stage
    public static final Double[] id_Blue = {1.0, 2.0, 6.0, 7.0, 8.0, 14.0, 15.0, 16.0};
    public static final Double[] id_Red = {10.0, 9.0, 5.0, 4.0, 3.0, 13.0, 12.0, 11.0};

    public static final double yDisplace = 38;
    public static final double llAngle = 0;

    public static final double[] aprilTagX = {593.68, 637.21, 652.73, 652.73, 578.77, 72.5, -1.5, -1.5, 14.02, 57.54, 468.69, 468.69, 441.74, 209.48, 182.73, 182.73};
    public static final double[] goalX = {-12, -12, -12, -12, -12, -12, 12, 12, -12, -12, -12, -12, -12, -12, -12, -12};
    public static final double[] aprilTagY = {9.68, 34.79, 196.17, 218.42, 323, 323, 218.42, 196.17, 34.79, 9.68, 146.19, 177.1, 161.62, 161.62, 177.1, 146.19};
    public static final double[] aprilTagZ = {53.38, 53.38, 57.13, 57.13, 53.38, 53.38, 57.13, 57.13, 53.38, 53.38, 52, 52, 52, 52, 52, 52};
    public static final double[] aprilTagYaw = {120, 120, 180, 180, 270, 270, 0, 0, 60, 60, 300, 60, 180, 0, 120, 240};
    }
}
