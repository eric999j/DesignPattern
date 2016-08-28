package behavioral.command;

public class TurnRightCommand extends Command {

	public TurnRightCommand(ReceiverRobot robot) {
		super(robot);
	}

	@Override
	public void Execute() {
		robot.TurnRight();
	}
    
}
