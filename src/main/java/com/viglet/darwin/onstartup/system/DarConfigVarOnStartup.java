/*
 * Copyright (C) 2016-2018 Alexandre Oliveira <alexandre.oliveira@viglet.com> 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.viglet.darwin.onstartup.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.viglet.darwin.persistence.model.system.DarConfigVar;
import com.viglet.darwin.persistence.repository.system.DarConfigVarRepository;

@Component
public class DarConfigVarOnStartup {

	@Autowired
	private DarConfigVarRepository darConfigVarRepository;

	public void createDefaultRows() {

		final String FIRST_TIME = "FIRST_TIME";

		DarConfigVar darConfigVar = new DarConfigVar();

		if (!darConfigVarRepository.findById(FIRST_TIME).isPresent()) {

			darConfigVar.setId(FIRST_TIME);
			darConfigVar.setPath("/system");
			darConfigVar.setValue("true");
			darConfigVarRepository.save(darConfigVar);
		}
	}

}
