/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import ceylon.language.String;

import example.jooqconverters.StringConverter;

import gen.example.jooq.Keys;
import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.CityRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class City extends TableImpl<CityRecord> {

	private static final long serialVersionUID = 1167446085;

	/**
	 * The reference instance of <code>sakila.city</code>
	 */
	public static final City city = new City();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CityRecord> getRecordType() {
		return CityRecord.class;
	}

	/**
	 * The column <code>sakila.city.city_id</code>.
	 */
	public final TableField<CityRecord, UShort> cityId = createField("city_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.city.city</code>.
	 */
	public final TableField<CityRecord, String> city_ = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.city.country_id</code>.
	 */
	public final TableField<CityRecord, UShort> countryId = createField("country_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.city.last_update</code>.
	 */
	public final TableField<CityRecord, Timestamp> lastUpdate = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sakila.city</code> table reference
	 */
	public City() {
		this("city", null);
	}

	/**
	 * Create an aliased <code>sakila.city</code> table reference
	 */
	public City(java.lang.String alias) {
		this(alias, city);
	}

	private City(java.lang.String alias, Table<CityRecord> aliased) {
		this(alias, aliased, null);
	}

	private City(java.lang.String alias, Table<CityRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CityRecord, UShort> getIdentity() {
		return Keys.IDENTITY_city;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CityRecord> getPrimaryKey() {
		return Keys.keyCityPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CityRecord>> getKeys() {
		return Arrays.<UniqueKey<CityRecord>>asList(Keys.keyCityPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<CityRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<CityRecord, ?>>asList(Keys.fkCityCountry);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public City as(java.lang.String alias) {
		return new City(alias, this);
	}

	/**
	 * Rename this table
	 */
	public City rename(java.lang.String name) {
		return new City(name, null);
	}
}
