package org.datatables4j.module.ui;

import org.datatables4j.model.HtmlTable;
import org.datatables4j.model.JsResource;
import org.datatables4j.model.Module;

/**
 * Java implementation of the DataTables FixedHeader plugin.
 * 
 * @see <a href="http://datatables.net/extras/fixedheader/">Reference</a>
 * @author Thibault Duchateau
 */
public class FixedHeaderModule extends Module {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getModuleName() {
		return "FixedHeader";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getModuleVersion() {
		return "2.0.6";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setup(HtmlTable table) {
		beforeEndDocumentReady = "new FixedHeader(oTable_" + table.getId() + ");";
		addJsResource(new JsResource("datatables.fixedheader.min.js"));
	}
}
