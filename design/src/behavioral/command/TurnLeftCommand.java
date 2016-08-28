package behavioral.command;

public class TurnLeftCommand extends Command {

	public TurnLeftCommand(ReceiverRobot robot) {
		super(robot);
	}

	@Override
	public void Execute() {
		robot.TurnLeft();
	}
    
}
