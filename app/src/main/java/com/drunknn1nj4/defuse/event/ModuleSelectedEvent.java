package com.drunknn1nj4.defuse.event;

import com.drunknn1nj4.defuse.model.Module;

/**
 * @author Sean Kleinjung
 */
public class ModuleSelectedEvent {
    private Module module;

    public ModuleSelectedEvent(Module module) {
        this.module = module;
    }

    public Module getModule() {
        return module;
    }
}
