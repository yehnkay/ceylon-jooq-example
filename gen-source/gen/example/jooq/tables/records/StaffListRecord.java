/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.tables.records;


import ceylon.language.String;

import gen.example.jooq.tables.StaffList;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffListRecord extends TableRecordImpl<StaffListRecord> implements Record8<UByte, String, String, String, String, String, String, UByte> {

	private static final long serialVersionUID = 521556992;

	/**
	 * Setter for <code>sakila.staff_list.ID</code>.
	 */
	public void setId(UByte value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.ID</code>.
	 */
	public UByte getId() {
		return (UByte) getValue(0);
	}

	/**
	 * Setter for <code>sakila.staff_list.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.staff_list.address</code>.
	 */
	public void setAddress(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.address</code>.
	 */
	public String getAddress() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sakila.staff_list.zip code</code>.
	 */
	public void setZip_code(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.zip code</code>.
	 */
	public String getZip_code() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sakila.staff_list.phone</code>.
	 */
	public void setPhone(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.phone</code>.
	 */
	public String getPhone() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sakila.staff_list.city</code>.
	 */
	public void setCity(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.city</code>.
	 */
	public String getCity() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>sakila.staff_list.country</code>.
	 */
	public void setCountry(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.country</code>.
	 */
	public String getCountry() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sakila.staff_list.SID</code>.
	 */
	public void setSid(UByte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sakila.staff_list.SID</code>.
	 */
	public UByte getSid() {
		return (UByte) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<UByte, String, String, String, String, String, String, UByte> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<UByte, String, String, String, String, String, String, UByte> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UByte> field1() {
		return StaffList.staffList.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return StaffList.staffList.name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return StaffList.staffList.address;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return StaffList.staffList.zip_code;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return StaffList.staffList.phone;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return StaffList.staffList.city;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return StaffList.staffList.country;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UByte> field8() {
		return StaffList.staffList.sid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UByte value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getZip_code();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UByte value8() {
		return getSid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value1(UByte value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value3(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value4(String value) {
		setZip_code(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value5(String value) {
		setPhone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value6(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value7(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord value8(UByte value) {
		setSid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StaffListRecord values(UByte value1, String value2, String value3, String value4, String value5, String value6, String value7, UByte value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StaffListRecord
	 */
	public StaffListRecord() {
		super(StaffList.staffList);
	}

	/**
	 * Create a detached, initialised StaffListRecord
	 */
	public StaffListRecord(UByte id, String name, String address, String zip_code, String phone, String city, String country, UByte sid) {
		super(StaffList.staffList);

		setValue(0, id);
		setValue(1, name);
		setValue(2, address);
		setValue(3, zip_code);
		setValue(4, phone);
		setValue(5, city);
		setValue(6, country);
		setValue(7, sid);
	}
}
