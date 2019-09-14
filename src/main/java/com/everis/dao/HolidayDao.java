package com.everis.dao;

import java.util.List;

import com.everis.domain.Holiday;
import com.everis.domain.HolidayStatus;

/**
 * 
 * @author barrouh
 *
 */
public interface HolidayDao {

	void addHoliday(Holiday holiday);

	void updateHoliday(Holiday holiday);

	Holiday getHolidayByRef(String holidayRef);

	List<Holiday> getAllHolidays();
	
	List<Holiday> getHolidaysByStatus(HolidayStatus holidayStatus);

	void deleteHoliday(String holidayRef);

}