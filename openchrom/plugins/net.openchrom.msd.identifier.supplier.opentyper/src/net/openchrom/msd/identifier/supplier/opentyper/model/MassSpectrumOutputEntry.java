/*******************************************************************************
 * Copyright (c) 2010, 2017 Lablicate GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package net.openchrom.msd.identifier.supplier.opentyper.model;

/**
 * @author Matthias Mailänder
 * 
 */
public class MassSpectrumOutputEntry implements IMassSpectrumOutputEntry {

	private String outputFolder = "";
	private String converterId = "";

	/**
	 * Set the output file path and the converter id.
	 * 
	 * @param outputFile
	 * @param converterId
	 */
	public MassSpectrumOutputEntry(String outputFolder, String converterId) {
		if(outputFolder != null && converterId != null) {
			this.outputFolder = outputFolder;
			this.converterId = converterId;
		}
	}

	@Override
	public String getOutputFolder() {

		return outputFolder;
	}

	@Override
	public String getConverterId() {

		return converterId;
	}
}
