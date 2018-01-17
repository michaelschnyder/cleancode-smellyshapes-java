package com.zuehlke.cleancodeworkshop.inttoenum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SystemStateTest {

	@Test
	public void testGetStateAllServicesOk() {
		final SystemState state = new SystemState(SystemState.ALL_SERVICES_OK);
		assertEquals(SystemState.ALL_SERVICES_OK, state.getState());
	}

	@Test
	public void testGetStateCommunicationOk() {
		final SystemState state = new SystemState(SystemState.COMMUNICATION_OK);		
		assertEquals(SystemState.COMMUNICATION_OK, state.getState());
	}

	@Test
	public void testGetStateReportServiceFailure() {
		final SystemState state = new SystemState(SystemState.REPORT_SERVICE_FAILURE);		
		assertEquals(SystemState.REPORT_SERVICE_FAILURE, state.getState());
	}
	
	@Test
	public void testGetDescriptionForStateAllServicesOk() {
		assertEquals("All Services OK", SystemState.getDescriptionForState(SystemState.ALL_SERVICES_OK));
	}

	@Test
	public void testGetDescriptionForStateCommunicationOk() {
		assertEquals("Communication OK", SystemState.getDescriptionForState(SystemState.COMMUNICATION_OK));
	}
	
	@Test
	public void testGetDescriptionForStateReportServiceFailure() {
		assertEquals("ReportService Failure", SystemState.getDescriptionForState(SystemState.REPORT_SERVICE_FAILURE));
	}

	@Test
	public void testGetDescriptionForUnknownState() {
		assertEquals("Unknown state", SystemState.getDescriptionForState(42));
		assertEquals("Unknown state", SystemState.getDescriptionForState(-42));
	}
	
	@Test
	public void testGetDescriptionForCornerCases() {
		assertEquals("Unknown state", SystemState.getDescriptionForState(7));
		assertEquals("Unknown state", SystemState.getDescriptionForState(-1));
	}
}
