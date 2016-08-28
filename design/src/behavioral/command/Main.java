package behavioral.command;

/**
 * 
 * @author eric
 * java 菜單  http://airu.iteye.com/blog/1453666
 */

public class Main {
	public static void main(String[] args) {
     Invoker invoker = new Invoker();
     
     ReceiverRobot robot = new ReceiverRobot();
     
     GoAheadCommand cmd_go_ahead = new GoAheadCommand(robot); 
     TurnLeftCommand cmd_turn_left = new TurnLeftCommand(robot); 
     TurnRightCommand cmd_turn_right = new TurnRightCommand(robot);

     invoker.SetCommand(cmd_go_ahead);
     invoker.SetCommand(cmd_go_ahead);
     invoker.SetCommand(cmd_turn_left);
     invoker.SetCommand(cmd_go_ahead);
     invoker.SetCommand(cmd_turn_right);
     invoker.Run();
	}
}
