package com.drunknn1nj4.defuse.service.impl;

import com.drunknn1nj4.defuse.model.Module;
import com.drunknn1nj4.defuse.service.ModuleService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sean Kleinjung
 */
public class ModuleServiceDefaultImpl implements ModuleService {

    private static final String[] MODULE_NAMES = new String[] {
            "Wires",
            "The Button",
            "Keypads",
            "Simon Says",
            "Who's on First",
            "Memory",
            "Morse Code",
            "Complicated Wires",
            "Wire Sequences",
            "Mazes",
            "Passwords"
    };

    private static final String[] NEEDY_MODULE_NAMES = new String[] {
            "Venting Gas",
            "Capacitor Discharge",
            "Knobs",
    };

    @Override
    public List<Module> getAllModules() {
        List<Module> result = new ArrayList<>(MODULE_NAMES.length + NEEDY_MODULE_NAMES.length);

        for (String name : MODULE_NAMES) {
            Module module = new Module();
            module.setName(name);
            result.add(module);
        }

        for (String name : NEEDY_MODULE_NAMES) {
            Module module = new Module();
            module.setName(name);
            result.add(module);
        }

        return result;
    }
}
