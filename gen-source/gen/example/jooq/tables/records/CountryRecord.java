/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables.records;


import ceylon.language.String;

import gen.example.jooq.tables.Country;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record3<UShort, String, Timestamp> {

	private static final long serialVersionUID = 503348246;

	/**
	 * Setter for <code>sakila.country.country_id</code>.
	 */
	public void setCountryId(UShort value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.country.country_id</code>.
	 */
	public UShort getCountryId() {
		return (UShort) getValue(0);
	}

	/**
	 * Setter for <code>sakila.country.country</code>.
	 */
	public void setCountry(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.country.country</code>.
	 */
	public String getCountry() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.country.last_update</code>.
	 */
	public void setLastUpdate(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.country.last_update</code>.
	 */
	public Timestamp getLastUpdate() {
		return (Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UShort> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UShort, String, Timestamp> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UShort, String, Timestamp> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UShort> field1() {
		return Country.country.countryId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Country.country.country_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Country.country.lastUpdate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UShort value1() {
		return getCountryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord value1(UShort value) {
		setCountryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord value2(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord value3(Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountryRecord values(UShort value1, String value2, Timestamp value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CountryRecord
	 */
	public CountryRecord() {
		super(Country.country);
	}

	/**
	 * Create a detached, initialised CountryRecord
	 */
	public CountryRecord(UShort countryId, String country, Timestamp lastUpdate) {
		super(Country.country);

		setValue(0, countryId);
		setValue(1, country);
		setValue(2, lastUpdate);
	}
}
