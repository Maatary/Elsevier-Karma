package edu.isi.karma.controller.command;

import javax.servlet.http.HttpServletRequest;

import edu.isi.karma.rep.Workspace;

public class SetModelSettingsCommandFactory extends CommandFactory {

	private enum Arguments {
		modelUri, ontologyType
	}
	
	@Override
	public Command createCommand(HttpServletRequest request, Workspace workspace) {
		SetModelSettingsCommand comm = new SetModelSettingsCommand(getNewId(workspace), 
				Command.NEW_MODEL,
				request.getParameter(Arguments.modelUri.name()), request.getParameter(Arguments.ontologyType.name()));
		
		return comm;
	}

	@Override
	public Class<? extends Command> getCorrespondingCommand() {
		return SetModelSettingsCommand.class;
	}

}
