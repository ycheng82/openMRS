/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.usagestatistics668;

/**
 * Enumeration of the how usages can be filtered by action in a query
 */
public enum ActionCriteria {
	ANY_OR_NONE,
	ANY,
	VIEWED,
	EDITED;
	
	/**
	 * Bean-property wrapper for the ordinal method so it can be used in EL
	 */
	public int getOrdinal() {
		return ordinal();
	}
}
