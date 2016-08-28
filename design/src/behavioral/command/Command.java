package behavioral.command;

abstract class Command {
	
	ReceiverRobot robot;
	
	public Command(ReceiverRobot robot){
		this.robot = robot;
	}
	abstract public void Execute();
}
