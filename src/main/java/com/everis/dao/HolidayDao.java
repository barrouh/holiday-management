package com.everis.dao;

import java.util.List;

import com.everis.domain.Holiday;

/**
 * 
 * @author barrouh
 *
 */
public interface HolidayDao {

	int addHoliday(Holiday holiday);

	int updateHoliday(Holiday holiday);

	Holiday getHolidayById(String holidayId);

	List<Holiday> getAllHolidays();

	int deleteHoliday(String holidayId);

}