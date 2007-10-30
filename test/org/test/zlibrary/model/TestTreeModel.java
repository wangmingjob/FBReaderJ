package org.test.zlibrary.model;

import org.zlibrary.text.model.ZLTextTreeModel;
import org.zlibrary.text.model.impl.ZLModelFactory;

import junit.framework.TestCase;

public class TestTreeModel extends TestCase {
    private ZLModelFactory factory = new ZLModelFactory(); 
	
    public void testCreateParagraph() {
    	ZLTextTreeModel model = factory.createZLTextTreeModel();
    	model.createParagraph(factory.createTreeParagraph());
    }
}