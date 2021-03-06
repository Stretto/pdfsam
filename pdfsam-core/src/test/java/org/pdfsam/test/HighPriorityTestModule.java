/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 27/ago/2014
 * Copyright 2013-2014 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.test;

import static org.pdfsam.module.ModuleDescriptorBuilder.builder;

import java.util.Map;

import org.pdfsam.module.Module;
import org.pdfsam.module.ModuleCategory;
import org.pdfsam.module.ModuleDescriptor;
import org.pdfsam.module.ModuleInputOutputType;
import org.pdfsam.module.ModulePriority;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * @author Andrea Vacondio
 *
 */
public class HighPriorityTestModule implements Module {
    public static final String ID = "high.test.module";

    private ModuleDescriptor descriptor = builder().category(ModuleCategory.SECURITY)
            .description("High priority test module").name("HighPriorityTestModule").priority(ModulePriority.HIGH)
            .inputTypes(ModuleInputOutputType.MULTIPLE_PDF).build();

    @Override
    public String id() {
        return ID;
    }

    @Override
    public ModuleDescriptor descriptor() {
        return descriptor;
    }

    @Override
    public Pane modulePanel() {
        return null;
    }

    @Override
    public Node graphic() {
        return null;
    }

    @Override
    public void onSaveWorkspace(Map<String, String> data) {
        // nothing
    }

    @Override
    public void onLoadWorkspace(Map<String, String> data) {
        // nothing
    }
}
