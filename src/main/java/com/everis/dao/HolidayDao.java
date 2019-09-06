package com.everis.dao;

import java.util.List;

import com.everis.domain.Holiday;

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

	void deleteHoliday(String holidayRef);

}