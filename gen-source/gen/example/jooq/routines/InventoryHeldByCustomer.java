/**
 * This class is generated by jOOQ
 */
package gen.example.jooq.routines;


import gen.example.jooq.Sakila;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class InventoryHeldByCustomer extends AbstractRoutine<Integer> {

	private static final long serialVersionUID = -1858550852;

	/**
	 * The parameter <code>sakila.inventory_held_by_customer.RETURN_VALUE</code>.
	 */
	public static final Parameter<Integer> returnValue = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>sakila.inventory_held_by_customer.p_inventory_id</code>.
	 */
	public static final Parameter<Integer> pInventoryId = createParameter("p_inventory_id", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public InventoryHeldByCustomer() {
		super("inventory_held_by_customer", Sakila.sakila, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(returnValue);
		addInParameter(pInventoryId);
	}

	/**
	 * Set the <code>p_inventory_id</code> parameter IN value to the routine
	 */
	public void setPInventoryId(Integer value) {
		setValue(pInventoryId, value);
	}

	/**
	 * Set the <code>p_inventory_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPInventoryId(Field<Integer> field) {
		setField(pInventoryId, field);
	}
}
