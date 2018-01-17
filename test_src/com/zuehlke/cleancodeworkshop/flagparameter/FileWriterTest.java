package com.zuehlke.cleancodeworkshop.flagparameter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FileWriterTest {

	@Test
	public void testWriteContentInOverwriteMode() {
		final FileWriter replacingFileWriter = new FileWriter("Initial Content", false);

		replacingFileWriter.write("New Content", false);

		assertEquals("New Content", replacingFileWriter.getContent());
	}

	@Test
	public void testWriteContentInAppendMode() {
		final FileWriter appendingFileWriter = new FileWriter("Initial Content", true);

        appendingFileWriter.write("New Content", false);

		assertEquals("Initial Content" + "New Content", appendingFileWriter.getContent());
	}

	@Test
	public void testWriteWithoutFlush() {
		final FileWriter appendingFileWriter = new FileWriter("Initial Content", true);

		appendingFileWriter.write("New Content", false);

		assertEquals("Initial Content" + "New Content", appendingFileWriter.getContent());
        assertFalse(appendingFileWriter.isContentFlushed());
	}

	@Test
	public void testWriteWithFlush() {
		final FileWriter appendingFileWriter = new FileWriter("Initial Content", true);

		appendingFileWriter.write("New Content", true);
		
		assertEquals("Initial Content" + "New Content", appendingFileWriter.getContent());
        assertTrue(appendingFileWriter.isContentFlushed());
	}

	@Test
	public void testFlushContent() {
		final FileWriter appendingFileWriter = new FileWriter("Initial Content", true);

		appendingFileWriter.flushContent();

        assertTrue(appendingFileWriter.isContentFlushed());
	}
}
