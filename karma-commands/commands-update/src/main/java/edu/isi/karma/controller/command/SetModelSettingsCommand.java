package edu.isi.karma.controller.command;

import java.io.File;
import java.io.PrintWriter;
import java.util.prefs.Preferences;
import java.io.PrintWriter;
import org.json.JSONStringer;
import org.json.JSONWriter;

import org.json.JSONObject;

import edu.isi.karma.controller.update.AbstractUpdate;
import edu.isi.karma.controller.update.InfoUpdate;
import edu.isi.karma.controller.update.UpdateContainer;
import edu.isi.karma.rep.Workspace;
import edu.isi.karma.view.VWorkspace;
import edu.isi.karma.webserver.ContextParametersRegistry;
import edu.isi.karma.webserver.ServletContextParameterMap;
import edu.isi.karma.webserver.ServletContextParameterMap.ContextParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetModelSettingsCommand extends Command {

    private String modelUri;
    private String ontologyType;
    private static Logger logger = LoggerFactory.getLogger(SetModelSettingsCommand.class);

    enum PreferenceKeys {
        modelUri, ontologyType
    }

    protected SetModelSettingsCommand(String id, String model, String modelUri, String ontologyType) {
        super(id, model);
        this.modelUri = modelUri;
        this.ontologyType = ontologyType;
    }

    @Override
    public String getCommandName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getTitle() {
        return "Set Model Settings";
    }

    @Override
    public String getDescription() {
        return this.modelUri;
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.notInHistory;
    }

    @Override
    public UpdateContainer doIt(Workspace workspace) throws CommandException {
        final ServletContextParameterMap contextParameters = ContextParametersRegistry.getInstance().getContextParameters(workspace.getContextId());
        contextParameters.setParameterValue(ContextParameter.MODEL_URI, modelUri);
        contextParameters.setParameterValue(ContextParameter.USE_ONTOLOGY_TYPE, ontologyType);       

        return new UpdateContainer();
    }

    @Override
    public UpdateContainer undoIt(Workspace workspace) {
        // TODO Auto-generated method stub
        return null;
    }

}
