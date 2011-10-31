package org.jboss.byteman.eclipse.ui.config;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.xtext.ui.editor.preferences.AbstractPreferencePage;
import org.jboss.byteman.eclipse.BytemanRuntimeModule;
import org.jboss.byteman.eclipse.ui.BytemanUiModule;

public class DownloadPreferencePage extends AbstractPreferencePage {

	/**
	 * create a directory field editor to allow the BYTEMAN_HOME directory to be set
	 */
	@Override
	protected void createFieldEditors() {
		DirectoryFieldEditor editor = new DirectoryFieldEditor(BytemanUiModule.BYTEMAN_HOME_PREFERENCE_KEY, "BYTEMAN_HOME = ", getFieldEditorParent());
		addField(editor);
		getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if (event.getProperty().equals(BytemanUiModule.BYTEMAN_HOME_PREFERENCE_KEY)) {
					BytemanRuntimeModule.setBytemanHome((String)event.getNewValue());
				}
			}
		});
	}	
}
