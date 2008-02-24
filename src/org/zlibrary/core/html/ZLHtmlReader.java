package org.zlibrary.core.html;

public interface ZLHtmlReader {
	public boolean dontCacheAttributeValues();

	public void startDocumentHandler();
	public void endDocumentHandler();

	public void startElementHandler(String tag, ZLStringMap attributes);
	public void endElementHandler(String tag);
	public void characterDataHandler(char[] ch, int start, int length);
	public void characterDataHandlerFinal(char[] ch, int start, int length);
}