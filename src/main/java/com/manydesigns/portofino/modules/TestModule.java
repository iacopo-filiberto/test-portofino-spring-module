package com.manydesigns.portofino.modules;

import com.manydesigns.portofino.ResourceActionsModule;
import org.apache.commons.vfs2.FileObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestModule implements Module {

    @Autowired
    @Qualifier(ResourceActionsModule.ACTIONS_DIRECTORY)
    public FileObject actionsDirectory;
    protected ModuleStatus status = ModuleStatus.CREATED;

    @Override
    public String getModuleVersion() {
        return Module.getPortofinoVersion();
    }

    @Override
    public String getName() {
        return "Dime";
    }

    @Override
    public ModuleStatus getStatus() {
        return status;
    }

    @PreDestroy
    public void destroy() {
        status = ModuleStatus.DESTROYED;
    }

    @PostConstruct
    public void init() throws Exception {
        status = ModuleStatus.ACTIVE;

//        ActionLogic.mount(actionsDirectory, "test", TestAction.class);
//        ActionLogic.mount(actionsDirectory, "cars", CarsAction.class);
    }

}
