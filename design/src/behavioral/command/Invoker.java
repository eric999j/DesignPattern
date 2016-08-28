package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command>  cmds = new ArrayList<Command>();
	
	public void SetCommand(Command command){
		cmds.add(command);
	}
	
	public void Run(){
		for(Command cmd: cmds){
			cmd.Execute();
		}
	}

}
