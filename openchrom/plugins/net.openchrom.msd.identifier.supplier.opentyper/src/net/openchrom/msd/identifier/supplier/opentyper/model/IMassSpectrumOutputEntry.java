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
 * @author Dr. Philip Wenig
 * 
 */
public interface IMassSpectrumOutputEntry {

	/**
	 * Returns the output folder.
	 * 
	 * @return String
	 */
	String getOutputFolder();

	/**
	 * Returns the converter id.
	 * 
	 * @return String
	 */
	String getConverterId();
}
