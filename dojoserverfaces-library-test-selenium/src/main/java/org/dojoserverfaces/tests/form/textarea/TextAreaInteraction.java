/*******************************************************************************
 * 	Copyright (c) 2011, The Dojo Foundation All Rights Reserved.
 * 	Available via Academic Free License >= 2.1 OR the modified BSD license.
 * 	see: http://dojotoolkit.org/license for details
 *******************************************************************************/
package org.dojoserverfaces.tests.form.textarea;

import org.dojoserverfaces.tests.widget.interaction.AbstractSingleValuedWidgetInteraction;
import org.dojoserverfaces.tests.widget.values.WidgetValues;

public class TextAreaInteraction extends AbstractSingleValuedWidgetInteraction {
    public TextAreaInteraction(WidgetValues widgetValues) {
        super(widgetValues);
        this.TAG_NAME = "textarea";
    }
}