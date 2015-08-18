/**
 * This class is generated by jOOQ
 */
package gen.example.jooq;


import gen.example.jooq.tables.Actor;
import gen.example.jooq.tables.Address;
import gen.example.jooq.tables.Category;
import gen.example.jooq.tables.City;
import gen.example.jooq.tables.Country;
import gen.example.jooq.tables.Customer;
import gen.example.jooq.tables.Film;
import gen.example.jooq.tables.FilmActor;
import gen.example.jooq.tables.FilmCategory;
import gen.example.jooq.tables.FilmText;
import gen.example.jooq.tables.Inventory;
import gen.example.jooq.tables.Language;
import gen.example.jooq.tables.Payment;
import gen.example.jooq.tables.Rental;
import gen.example.jooq.tables.Staff;
import gen.example.jooq.tables.Store;
import gen.example.jooq.tables.records.ActorRecord;
import gen.example.jooq.tables.records.AddressRecord;
import gen.example.jooq.tables.records.CategoryRecord;
import gen.example.jooq.tables.records.CityRecord;
import gen.example.jooq.tables.records.CountryRecord;
import gen.example.jooq.tables.records.CustomerRecord;
import gen.example.jooq.tables.records.FilmActorRecord;
import gen.example.jooq.tables.records.FilmCategoryRecord;
import gen.example.jooq.tables.records.FilmRecord;
import gen.example.jooq.tables.records.FilmTextRecord;
import gen.example.jooq.tables.records.InventoryRecord;
import gen.example.jooq.tables.records.LanguageRecord;
import gen.example.jooq.tables.records.PaymentRecord;
import gen.example.jooq.tables.records.RentalRecord;
import gen.example.jooq.tables.records.StaffRecord;
import gen.example.jooq.tables.records.StoreRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * A class modelling foreign key relationships between tables of the <code>sakila</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<ActorRecord, UShort> IDENTITY_actor = Identities0.IDENTITY_actor;
	public static final Identity<AddressRecord, UShort> IDENTITY_address = Identities0.IDENTITY_address;
	public static final Identity<CategoryRecord, UByte> IDENTITY_category = Identities0.IDENTITY_category;
	public static final Identity<CityRecord, UShort> IDENTITY_city = Identities0.IDENTITY_city;
	public static final Identity<CountryRecord, UShort> IDENTITY_country = Identities0.IDENTITY_country;
	public static final Identity<CustomerRecord, UShort> IDENTITY_customer = Identities0.IDENTITY_customer;
	public static final Identity<FilmRecord, UShort> IDENTITY_film = Identities0.IDENTITY_film;
	public static final Identity<InventoryRecord, UInteger> IDENTITY_inventory = Identities0.IDENTITY_inventory;
	public static final Identity<LanguageRecord, UByte> IDENTITY_language = Identities0.IDENTITY_language;
	public static final Identity<PaymentRecord, UShort> IDENTITY_payment = Identities0.IDENTITY_payment;
	public static final Identity<RentalRecord, Integer> IDENTITY_rental = Identities0.IDENTITY_rental;
	public static final Identity<StaffRecord, UByte> IDENTITY_staff = Identities0.IDENTITY_staff;
	public static final Identity<StoreRecord, UByte> IDENTITY_store = Identities0.IDENTITY_store;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ActorRecord> keyActorPrimary = UniqueKeys0.keyActorPrimary;
	public static final UniqueKey<AddressRecord> keyAddressPrimary = UniqueKeys0.keyAddressPrimary;
	public static final UniqueKey<CategoryRecord> keyCategoryPrimary = UniqueKeys0.keyCategoryPrimary;
	public static final UniqueKey<CityRecord> keyCityPrimary = UniqueKeys0.keyCityPrimary;
	public static final UniqueKey<CountryRecord> keyCountryPrimary = UniqueKeys0.keyCountryPrimary;
	public static final UniqueKey<CustomerRecord> keyCustomerPrimary = UniqueKeys0.keyCustomerPrimary;
	public static final UniqueKey<FilmRecord> keyFilmPrimary = UniqueKeys0.keyFilmPrimary;
	public static final UniqueKey<FilmActorRecord> keyFilmActorPrimary = UniqueKeys0.keyFilmActorPrimary;
	public static final UniqueKey<FilmCategoryRecord> keyFilmCategoryPrimary = UniqueKeys0.keyFilmCategoryPrimary;
	public static final UniqueKey<FilmTextRecord> keyFilmTextPrimary = UniqueKeys0.keyFilmTextPrimary;
	public static final UniqueKey<InventoryRecord> keyInventoryPrimary = UniqueKeys0.keyInventoryPrimary;
	public static final UniqueKey<LanguageRecord> keyLanguagePrimary = UniqueKeys0.keyLanguagePrimary;
	public static final UniqueKey<PaymentRecord> keyPaymentPrimary = UniqueKeys0.keyPaymentPrimary;
	public static final UniqueKey<RentalRecord> keyRentalPrimary = UniqueKeys0.keyRentalPrimary;
	public static final UniqueKey<RentalRecord> keyRentalRentalDate = UniqueKeys0.keyRentalRentalDate;
	public static final UniqueKey<StaffRecord> keyStaffPrimary = UniqueKeys0.keyStaffPrimary;
	public static final UniqueKey<StoreRecord> keyStorePrimary = UniqueKeys0.keyStorePrimary;
	public static final UniqueKey<StoreRecord> keyStoreIdxUniqueManager = UniqueKeys0.keyStoreIdxUniqueManager;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<AddressRecord, CityRecord> fkAddressCity = ForeignKeys0.fkAddressCity;
	public static final ForeignKey<CityRecord, CountryRecord> fkCityCountry = ForeignKeys0.fkCityCountry;
	public static final ForeignKey<CustomerRecord, StoreRecord> fkCustomerStore = ForeignKeys0.fkCustomerStore;
	public static final ForeignKey<CustomerRecord, AddressRecord> fkCustomerAddress = ForeignKeys0.fkCustomerAddress;
	public static final ForeignKey<FilmRecord, LanguageRecord> fkFilmLanguage = ForeignKeys0.fkFilmLanguage;
	public static final ForeignKey<FilmRecord, LanguageRecord> fkFilmLanguageOriginal = ForeignKeys0.fkFilmLanguageOriginal;
	public static final ForeignKey<FilmActorRecord, ActorRecord> fkFilmActorActor = ForeignKeys0.fkFilmActorActor;
	public static final ForeignKey<FilmActorRecord, FilmRecord> fkFilmActorFilm = ForeignKeys0.fkFilmActorFilm;
	public static final ForeignKey<FilmCategoryRecord, FilmRecord> fkFilmCategoryFilm = ForeignKeys0.fkFilmCategoryFilm;
	public static final ForeignKey<FilmCategoryRecord, CategoryRecord> fkFilmCategoryCategory = ForeignKeys0.fkFilmCategoryCategory;
	public static final ForeignKey<InventoryRecord, FilmRecord> fkInventoryFilm = ForeignKeys0.fkInventoryFilm;
	public static final ForeignKey<InventoryRecord, StoreRecord> fkInventoryStore = ForeignKeys0.fkInventoryStore;
	public static final ForeignKey<PaymentRecord, CustomerRecord> fkPaymentCustomer = ForeignKeys0.fkPaymentCustomer;
	public static final ForeignKey<PaymentRecord, StaffRecord> fkPaymentStaff = ForeignKeys0.fkPaymentStaff;
	public static final ForeignKey<PaymentRecord, RentalRecord> fkPaymentRental = ForeignKeys0.fkPaymentRental;
	public static final ForeignKey<RentalRecord, InventoryRecord> fkRentalInventory = ForeignKeys0.fkRentalInventory;
	public static final ForeignKey<RentalRecord, CustomerRecord> fkRentalCustomer = ForeignKeys0.fkRentalCustomer;
	public static final ForeignKey<RentalRecord, StaffRecord> fkRentalStaff = ForeignKeys0.fkRentalStaff;
	public static final ForeignKey<StaffRecord, AddressRecord> fkStaffAddress = ForeignKeys0.fkStaffAddress;
	public static final ForeignKey<StaffRecord, StoreRecord> fkStaffStore = ForeignKeys0.fkStaffStore;
	public static final ForeignKey<StoreRecord, StaffRecord> fkStoreStaff = ForeignKeys0.fkStoreStaff;
	public static final ForeignKey<StoreRecord, AddressRecord> fkStoreAddress = ForeignKeys0.fkStoreAddress;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<ActorRecord, UShort> IDENTITY_actor = createIdentity(Actor.actor, Actor.actor.actorId);
		public static Identity<AddressRecord, UShort> IDENTITY_address = createIdentity(Address.address, Address.address.addressId);
		public static Identity<CategoryRecord, UByte> IDENTITY_category = createIdentity(Category.category, Category.category.categoryId);
		public static Identity<CityRecord, UShort> IDENTITY_city = createIdentity(City.city, City.city.cityId);
		public static Identity<CountryRecord, UShort> IDENTITY_country = createIdentity(Country.country, Country.country.countryId);
		public static Identity<CustomerRecord, UShort> IDENTITY_customer = createIdentity(Customer.customer, Customer.customer.customerId);
		public static Identity<FilmRecord, UShort> IDENTITY_film = createIdentity(Film.film, Film.film.filmId);
		public static Identity<InventoryRecord, UInteger> IDENTITY_inventory = createIdentity(Inventory.inventory, Inventory.inventory.inventoryId);
		public static Identity<LanguageRecord, UByte> IDENTITY_language = createIdentity(Language.language, Language.language.languageId);
		public static Identity<PaymentRecord, UShort> IDENTITY_payment = createIdentity(Payment.payment, Payment.payment.paymentId);
		public static Identity<RentalRecord, Integer> IDENTITY_rental = createIdentity(Rental.rental, Rental.rental.rentalId);
		public static Identity<StaffRecord, UByte> IDENTITY_staff = createIdentity(Staff.staff, Staff.staff.staffId);
		public static Identity<StoreRecord, UByte> IDENTITY_store = createIdentity(Store.store, Store.store.storeId);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ActorRecord> keyActorPrimary = createUniqueKey(Actor.actor, Actor.actor.actorId);
		public static final UniqueKey<AddressRecord> keyAddressPrimary = createUniqueKey(Address.address, Address.address.addressId);
		public static final UniqueKey<CategoryRecord> keyCategoryPrimary = createUniqueKey(Category.category, Category.category.categoryId);
		public static final UniqueKey<CityRecord> keyCityPrimary = createUniqueKey(City.city, City.city.cityId);
		public static final UniqueKey<CountryRecord> keyCountryPrimary = createUniqueKey(Country.country, Country.country.countryId);
		public static final UniqueKey<CustomerRecord> keyCustomerPrimary = createUniqueKey(Customer.customer, Customer.customer.customerId);
		public static final UniqueKey<FilmRecord> keyFilmPrimary = createUniqueKey(Film.film, Film.film.filmId);
		public static final UniqueKey<FilmActorRecord> keyFilmActorPrimary = createUniqueKey(FilmActor.filmActor, FilmActor.filmActor.actorId, FilmActor.filmActor.filmId);
		public static final UniqueKey<FilmCategoryRecord> keyFilmCategoryPrimary = createUniqueKey(FilmCategory.filmCategory, FilmCategory.filmCategory.filmId, FilmCategory.filmCategory.categoryId);
		public static final UniqueKey<FilmTextRecord> keyFilmTextPrimary = createUniqueKey(FilmText.filmText, FilmText.filmText.filmId);
		public static final UniqueKey<InventoryRecord> keyInventoryPrimary = createUniqueKey(Inventory.inventory, Inventory.inventory.inventoryId);
		public static final UniqueKey<LanguageRecord> keyLanguagePrimary = createUniqueKey(Language.language, Language.language.languageId);
		public static final UniqueKey<PaymentRecord> keyPaymentPrimary = createUniqueKey(Payment.payment, Payment.payment.paymentId);
		public static final UniqueKey<RentalRecord> keyRentalPrimary = createUniqueKey(Rental.rental, Rental.rental.rentalId);
		public static final UniqueKey<RentalRecord> keyRentalRentalDate = createUniqueKey(Rental.rental, Rental.rental.rentalDate, Rental.rental.inventoryId, Rental.rental.customerId);
		public static final UniqueKey<StaffRecord> keyStaffPrimary = createUniqueKey(Staff.staff, Staff.staff.staffId);
		public static final UniqueKey<StoreRecord> keyStorePrimary = createUniqueKey(Store.store, Store.store.storeId);
		public static final UniqueKey<StoreRecord> keyStoreIdxUniqueManager = createUniqueKey(Store.store, Store.store.managerStaffId);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<AddressRecord, CityRecord> fkAddressCity = createForeignKey(gen.example.jooq.Keys.keyCityPrimary, Address.address, Address.address.cityId);
		public static final ForeignKey<CityRecord, CountryRecord> fkCityCountry = createForeignKey(gen.example.jooq.Keys.keyCountryPrimary, City.city, City.city.countryId);
		public static final ForeignKey<CustomerRecord, StoreRecord> fkCustomerStore = createForeignKey(gen.example.jooq.Keys.keyStorePrimary, Customer.customer, Customer.customer.storeId);
		public static final ForeignKey<CustomerRecord, AddressRecord> fkCustomerAddress = createForeignKey(gen.example.jooq.Keys.keyAddressPrimary, Customer.customer, Customer.customer.addressId);
		public static final ForeignKey<FilmRecord, LanguageRecord> fkFilmLanguage = createForeignKey(gen.example.jooq.Keys.keyLanguagePrimary, Film.film, Film.film.languageId);
		public static final ForeignKey<FilmRecord, LanguageRecord> fkFilmLanguageOriginal = createForeignKey(gen.example.jooq.Keys.keyLanguagePrimary, Film.film, Film.film.originalLanguageId);
		public static final ForeignKey<FilmActorRecord, ActorRecord> fkFilmActorActor = createForeignKey(gen.example.jooq.Keys.keyActorPrimary, FilmActor.filmActor, FilmActor.filmActor.actorId);
		public static final ForeignKey<FilmActorRecord, FilmRecord> fkFilmActorFilm = createForeignKey(gen.example.jooq.Keys.keyFilmPrimary, FilmActor.filmActor, FilmActor.filmActor.filmId);
		public static final ForeignKey<FilmCategoryRecord, FilmRecord> fkFilmCategoryFilm = createForeignKey(gen.example.jooq.Keys.keyFilmPrimary, FilmCategory.filmCategory, FilmCategory.filmCategory.filmId);
		public static final ForeignKey<FilmCategoryRecord, CategoryRecord> fkFilmCategoryCategory = createForeignKey(gen.example.jooq.Keys.keyCategoryPrimary, FilmCategory.filmCategory, FilmCategory.filmCategory.categoryId);
		public static final ForeignKey<InventoryRecord, FilmRecord> fkInventoryFilm = createForeignKey(gen.example.jooq.Keys.keyFilmPrimary, Inventory.inventory, Inventory.inventory.filmId);
		public static final ForeignKey<InventoryRecord, StoreRecord> fkInventoryStore = createForeignKey(gen.example.jooq.Keys.keyStorePrimary, Inventory.inventory, Inventory.inventory.storeId);
		public static final ForeignKey<PaymentRecord, CustomerRecord> fkPaymentCustomer = createForeignKey(gen.example.jooq.Keys.keyCustomerPrimary, Payment.payment, Payment.payment.customerId);
		public static final ForeignKey<PaymentRecord, StaffRecord> fkPaymentStaff = createForeignKey(gen.example.jooq.Keys.keyStaffPrimary, Payment.payment, Payment.payment.staffId);
		public static final ForeignKey<PaymentRecord, RentalRecord> fkPaymentRental = createForeignKey(gen.example.jooq.Keys.keyRentalPrimary, Payment.payment, Payment.payment.rentalId);
		public static final ForeignKey<RentalRecord, InventoryRecord> fkRentalInventory = createForeignKey(gen.example.jooq.Keys.keyInventoryPrimary, Rental.rental, Rental.rental.inventoryId);
		public static final ForeignKey<RentalRecord, CustomerRecord> fkRentalCustomer = createForeignKey(gen.example.jooq.Keys.keyCustomerPrimary, Rental.rental, Rental.rental.customerId);
		public static final ForeignKey<RentalRecord, StaffRecord> fkRentalStaff = createForeignKey(gen.example.jooq.Keys.keyStaffPrimary, Rental.rental, Rental.rental.staffId);
		public static final ForeignKey<StaffRecord, AddressRecord> fkStaffAddress = createForeignKey(gen.example.jooq.Keys.keyAddressPrimary, Staff.staff, Staff.staff.addressId);
		public static final ForeignKey<StaffRecord, StoreRecord> fkStaffStore = createForeignKey(gen.example.jooq.Keys.keyStorePrimary, Staff.staff, Staff.staff.storeId);
		public static final ForeignKey<StoreRecord, StaffRecord> fkStoreStaff = createForeignKey(gen.example.jooq.Keys.keyStaffPrimary, Store.store, Store.store.managerStaffId);
		public static final ForeignKey<StoreRecord, AddressRecord> fkStoreAddress = createForeignKey(gen.example.jooq.Keys.keyAddressPrimary, Store.store, Store.store.addressId);
	}
}
