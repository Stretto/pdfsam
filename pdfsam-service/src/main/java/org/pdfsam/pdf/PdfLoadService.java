/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 13/giu/2013
 * Copyright 2013 by Andrea Vacondio (andrea.vacondio@gmail.com).
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
package org.pdfsam.pdf;

import java.util.Collection;

import org.pdfsam.module.RequiredPdfData;

/**
 * Service to load pdf documents
 * 
 * @author Andrea Vacondio
 * 
 */
public interface PdfLoadService {

    /**
     * @param toLoad
     *            a list of {@link PdfDocumentDescriptor} the service is requested to load and update.
     * @param datas
     *            what the service should load from the PDF
     */
    void load(Collection<? extends PdfDocumentDescriptor> toLoad, RequiredPdfData... datas);
}
