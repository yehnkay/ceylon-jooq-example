/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables;


import ceylon.language.String;

import example.jooqconverters.StringConverter;

import gen.example.jooq.Keys;
import gen.example.jooq.Sakila;
import gen.example.jooq.tables.records.FilmRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
import org.jooq.types.UByte;
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
public class Film extends TableImpl<FilmRecord> {

	private static final long serialVersionUID = 494663969;

	/**
	 * The reference instance of <code>sakila.film</code>
	 */
	public static final Film film = new Film();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FilmRecord> getRecordType() {
		return FilmRecord.class;
	}

	/**
	 * The column <code>sakila.film.film_id</code>.
	 */
	public final TableField<FilmRecord, UShort> filmId = createField("film_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.film.title</code>.
	 */
	public final TableField<FilmRecord, String> title = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "", new StringConverter());

	/**
	 * The column <code>sakila.film.description</code>.
	 */
	public final TableField<FilmRecord, java.lang.String> description = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sakila.film.release_year</code>.
	 */
	public final TableField<FilmRecord, Date> releaseYear = createField("release_year", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>sakila.film.language_id</code>.
	 */
	public final TableField<FilmRecord, UByte> languageId = createField("language_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sakila.film.original_language_id</code>.
	 */
	public final TableField<FilmRecord, UByte> originalLanguageId = createField("original_language_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

	/**
	 * The column <code>sakila.film.rental_duration</code>.
	 */
	public final TableField<FilmRecord, UByte> rentalDuration = createField("rental_duration", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sakila.film.rental_rate</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> rentalRate = createField("rental_rate", org.jooq.impl.SQLDataType.DECIMAL.precision(4, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sakila.film.length</code>.
	 */
	public final TableField<FilmRecord, UShort> length = createField("length", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this, "");

	/**
	 * The column <code>sakila.film.replacement_cost</code>.
	 */
	public final TableField<FilmRecord, BigDecimal> replacementCost = createField("replacement_cost", org.jooq.impl.SQLDataType.DECIMAL.precision(5, 2).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sakila.film.rating</code>.
	 */
	public final TableField<FilmRecord, java.lang.String> rating = createField("rating", org.jooq.impl.SQLDataType.VARCHAR.length(5).defaulted(true), this, "");

	/**
	 * The column <code>sakila.film.special_features</code>.
	 */
	public final TableField<FilmRecord, java.lang.String> specialFeatures = createField("special_features", org.jooq.impl.SQLDataType.VARCHAR.length(54), this, "");

	/**
	 * The column <code>sakila.film.last_update</code>.
	 */
	public final TableField<FilmRecord, Timestamp> lastUpdate = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sakila.film</code> table reference
	 */
	public Film() {
		this("film", null);
	}

	/**
	 * Create an aliased <code>sakila.film</code> table reference
	 */
	public Film(java.lang.String alias) {
		this(alias, film);
	}

	private Film(java.lang.String alias, Table<FilmRecord> aliased) {
		this(alias, aliased, null);
	}

	private Film(java.lang.String alias, Table<FilmRecord> aliased, Field<?>[] parameters) {
		super(alias, Sakila.sakila, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<FilmRecord, UShort> getIdentity() {
		return Keys.IDENTITY_film;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<FilmRecord> getPrimaryKey() {
		return Keys.keyFilmPrimary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<FilmRecord>> getKeys() {
		return Arrays.<UniqueKey<FilmRecord>>asList(Keys.keyFilmPrimary);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<FilmRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<FilmRecord, ?>>asList(Keys.fkFilmLanguage, Keys.fkFilmLanguageOriginal);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Film as(java.lang.String alias) {
		return new Film(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Film rename(java.lang.String name) {
		return new Film(name, null);
	}
}