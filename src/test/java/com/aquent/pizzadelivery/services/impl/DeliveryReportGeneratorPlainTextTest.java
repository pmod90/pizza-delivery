package com.aquent.pizzadelivery.services.impl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mockito;

public class DeliveryReportGeneratorPlainTextTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Test
	public void testNewFileCreation() throws IOException {
		File file = folder.newFile("foo.txt");
		FileWriter writer = mock(FileWriter.class);
	}
}
