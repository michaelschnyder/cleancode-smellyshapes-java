package com.zuehlke.cleancodeworkshop.flagparameter;

/**
 * Demonstration of Flag Parameters
 * 
 * @author min
 */
public class FileWriter {

	private String content = "";
	private boolean isInAppendMode = false;
	private boolean isContentFlushed = false;

	public FileWriter(final String newContent, final boolean useAppendMode) {

		this.content = newContent;
		this.isInAppendMode = useAppendMode;
		this.isContentFlushed = false;
	}

	public void write(final String contentToWrite, final boolean doFlushContent) {

		isContentFlushed = false;

		if (isInAppendMode) {
			content += contentToWrite;
		} else {
			content = contentToWrite;
		}

		if (doFlushContent) {
			flushContent();
		}
	}

	public void flushContent() {
		isContentFlushed = true;
	}

	public String getContent() {
		return content;
	}

	public boolean isInAppendMode() {
		return isInAppendMode;
	}

	public boolean isContentFlushed() {
		return isContentFlushed;
	}
}
