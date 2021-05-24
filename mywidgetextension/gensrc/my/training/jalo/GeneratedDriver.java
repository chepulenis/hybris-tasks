/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 24 трав. 2021 р., 17:12:50                  ---
 * ----------------------------------------------------------------
 */
package my.training.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import my.training.constants.MywidgetextensionConstants;
import my.training.jalo.Car;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Driver}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDriver extends GenericItem
{
	/** Qualifier of the <code>Driver.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Driver.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	/** Qualifier of the <code>Driver.car</code> attribute **/
	public static final String CAR = "car";
	/** Relation ordering override parameter constants for Drivers2Cars from ((mywidgetextension))*/
	protected static String DRIVERS2CARS_SRC_ORDERED = "relation.Drivers2Cars.source.ordered";
	protected static String DRIVERS2CARS_TGT_ORDERED = "relation.Drivers2Cars.target.ordered";
	/** Relation disable markmodifed parameter constants for Drivers2Cars from ((mywidgetextension))*/
	protected static String DRIVERS2CARS_MARKMODIFIED = "relation.Drivers2Cars.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public String getBirthDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public String getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final String value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.car</code> attribute.
	 * @return the car
	 */
	public Set<Car> getCar(final SessionContext ctx)
	{
		final List<Car> items = getLinkedItems( 
			ctx,
			true,
			MywidgetextensionConstants.Relations.DRIVERS2CARS,
			"Car",
			null,
			false,
			false
		);
		return new LinkedHashSet<Car>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.car</code> attribute.
	 * @return the car
	 */
	public Set<Car> getCar()
	{
		return getCar( getSession().getSessionContext() );
	}
	
	public long getCarCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MywidgetextensionConstants.Relations.DRIVERS2CARS,
			"Car",
			null
		);
	}
	
	public long getCarCount()
	{
		return getCarCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.car</code> attribute. 
	 * @param value the car
	 */
	public void setCar(final SessionContext ctx, final Set<Car> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MywidgetextensionConstants.Relations.DRIVERS2CARS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERS2CARS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.car</code> attribute. 
	 * @param value the car
	 */
	public void setCar(final Set<Car> value)
	{
		setCar( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to car. 
	 * @param value the item to add to car
	 */
	public void addToCar(final SessionContext ctx, final Car value)
	{
		addLinkedItems( 
			ctx,
			true,
			MywidgetextensionConstants.Relations.DRIVERS2CARS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERS2CARS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to car. 
	 * @param value the item to add to car
	 */
	public void addToCar(final Car value)
	{
		addToCar( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from car. 
	 * @param value the item to remove from car
	 */
	public void removeFromCar(final SessionContext ctx, final Car value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MywidgetextensionConstants.Relations.DRIVERS2CARS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERS2CARS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from car. 
	 * @param value the item to remove from car
	 */
	public void removeFromCar(final Car value)
	{
		removeFromCar( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Car");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVERS2CARS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
