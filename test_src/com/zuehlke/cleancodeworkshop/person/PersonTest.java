package com.zuehlke.cleancodeworkshop.person;

import static org.junit.Assert.assertEquals;

import com.zuehlke.cleancodeworkshop.person.Person;
import org.junit.Test;

public class PersonTest {

	@Test
	public void toString_defaultMode() {
		Person michael = new Person("Ammann", "Simon", "CH");
		assertEquals("Simon Ammann", michael.toString());
	}

	@Test
	public void toString_olympicModeAndCapitalize() {
		Person michael = new Person("Ammann", "Simon", "CH", true, true);
		assertEquals("Simon AMMANN", michael.toString());
	}

	@Test
	public void toString_chineseInNonOlympicNonCapitalize() {
		Person yao = new Person("Yao", "Ming", "CHN", false, false);
		assertEquals("Ming Yao", yao.toString());
	}

	@Test
	public void toString_chineseInOlympicMode() {
		Person yao = new Person("Yao", "Ming", "CHN", true, false);
		assertEquals("Yao Ming", yao.toString());
	}

	@Test
	public void toString_chineseInOlympicModeAndCapitalize() {
		Person yao = new Person("Yao", "Ming", "CHN", true, true);
		assertEquals("YAO Ming", yao.toString());
	}

}
