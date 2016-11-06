package com.drunknn1nj4.defuse.service.impl;

import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.service.ModuleService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sean Kleinjung
 */
public class ModuleServiceDefaultImpl implements ModuleService {
    @Override
    public List<Module> getAllModules() {
        List<Module> result = new ArrayList<>(3);
        Module module = new Module();
        module.setName("Wires");
        result.add(module);

        module = new Module();
        module.setName("Morse Code");
        result.add(module);

        module = new Module();
        module.setName("Complicated Wires");
        result.add(module);

        return result;
    }
}
