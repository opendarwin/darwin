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

package com.viglet.darwin.onstartup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.viglet.darwin.onstartup.system.DarConfigVarOnStartup;
import com.viglet.darwin.persistence.repository.system.DarConfigVarRepository;

@Component
public class DarOnStartup implements ApplicationRunner {

	@Autowired
	private DarConfigVarRepository darConfigVarRepository;
	@Autowired
	private DarConfigVarOnStartup darConfigVarOnStartup;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		final String FIRST_TIME = "FIRST_TIME";
	
		if (!darConfigVarRepository.findById(FIRST_TIME).isPresent()) {
			
			System.out.println("First Time Configuration ...");
		
			darConfigVarOnStartup.createDefaultRows();
			
			System.out.println("Configuration finished.");
		}

	}

}
