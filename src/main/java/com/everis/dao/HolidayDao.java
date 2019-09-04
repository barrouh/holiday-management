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

	Holiday getHolidayById(Integer holidayId);

	List<Holiday> getAllHolidays();

	void deleteHoliday(Integer holidayId);

}