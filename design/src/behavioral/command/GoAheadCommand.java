package behavioral.command;

public class GoAheadCommand extends Command {

	public GoAheadCommand(ReceiverRobot robot) {
		super(robot);
	}

	@Override
	public void Execute() {
		robot.GoAhead();
	}
    
}
