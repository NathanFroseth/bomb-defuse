package com.drunknn1nj4.defuse.view;

import com.drunknn1nj4.defuse.model.Module;

import java.util.List;

/**
 * @author Sean Kleinjung
 */
public interface ModuleListView extends BaseView {
    void setModules(List<Module> modules);
}
