package chapter_6;

import utils.*;

/**
 * @overview Mobile phone represents every part of a phone
 * @attributes
 *      manName String
 *      model   String
 *      color   Character
 *      year    Integer
 *      guaranteed    Boolean
 * @object A typical mobile phone is phone(manName, model, color, year, guaranteed)
 * @abstract_properties
 *      mutable(manName) = false /\ optional(manName) = false /\ length(manName) <= 15
 *      mutable(model) = true /\ optional(model) = false, length(model) <= 30
 *      model = "M-" + 3 letters + "-" + 3 digits
 *      mutable(color) = false /\ optional(color) = false
 *      mutable(year) = false /\ optional(year) = false /\ min(year) = 1973
 *      mutable(guaranteed) = false /\ optional(guaranteed) = false
 */
public class MobilePhone {
    @DomainConstraint(type = "String", mutable = false, optional = false, length = NAME_LENGTH)
    private String manName;
    @DomainConstraint(type = "String", mutable = true, optional = false, length = MODEL_LENGTH )
    private String model;
    @DomainConstraint(type = "Color", mutable = false, optional = false)
    private Color color;
    @DomainConstraint(type = "int", mutable = false, optional = false, min = MIN_YEAR)
    private int year;
    @DomainConstraint(type = "boolean", mutable = false, optional = false)
    private boolean guaranteed;

    //constant
    private static final int NAME_LENGTH = 15;
    private static final int MODEL_LENGTH = 30;
    private static final int MIN_YEAR = 1973;

    /**
     * @effects
     *      if manName & model & year are valid
     *          initialize this as <manName, model, year>
     *      else
     *          throw NotPossibleException
     */
    public MobilePhone(@AttrRef("manName") String manName, @AttrRef("model") String model, @AttrRef("year") int year)
        throws NotPossibleException{
        if(!validateManName(manName)){
            throw new NotPossibleException("MobilePhone.init: Invalid manufacture name: " + manName);
        }
        this.manName = manName;
        if(!validateModel(model)){
            throw new NotPossibleException("MobilePhone.init: Invalid model: " + model);
        }
        this.model = model;
        if(!validateYear(year)){
            throw new NotPossibleException("MobilePhone.init: Invalid year: " + year);
        }
    }

    /**
     * @effects
     *      if manName is valid
     *          set this.manName to manName
     *          return true
     *      else
     *          return false
     */
    @DOpt(type= OptType.Mutator) @AttrRef("manName")
    public boolean setManName(String manName){
        if(validateManName(manName)){
            this.manName = manName;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @effects
     *      if model is valid
     *          set this.model to model
     *          return true
     *      else
     *          return false
     */
    @DOpt(type = OptType.Mutator) @AttrRef("model")
    public boolean setModel(String model){
        if(validateModel(model)){
            this.model = model;
            return true;
        }   else return false;
    }

    /**
     * @effects
     *      if year is valid
     *          set this.year to year
     *          return true
     *      else
     *          return false
     */
    @DOpt(type=OptType.Mutator) @AttrRef("year")
    public boolean setYear(int year){
        if(validateYear(year)){
            this.year = year;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @effects
     *      return this.manName
     */
    @DOpt(type = OptType.Observer) @AttrRef("manName")
    public String getManName(){
        return this.manName;
    }

    /**
     * @effects
     *      return this.model
     */
    public String getModel(){
        return this.model;
    }

    /**
     * @effects
     *      return this.year
     */
    @DOpt(type = OptType.Observer) @AttrRef("year")
    public int getYear(){
        return this.year;
    }

    /**
     * @effects
     *      return this.color
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * @effects
     *      if manName is valid
     *          return true
     *      else
     *          return false
     */
    public boolean validateManName(String manName){
        return manName.length() <= NAME_LENGTH;
    }

    /**
     * @effects
     *      if model is valid
     *          return true
     *      else
     *          return false
     */
    public boolean validateModel(String model){
        return model.length() <= MODEL_LENGTH;
    }

    /**
     * @effects
     *      if year is valid
     *          return true
     *      else
     *          return false
     */
    public boolean validateYear(int year){
        return year >= 1973;
    }

    @Override
    public String toString(){
        return String.format("MobilePhone:<%d,%s", year, model);
    }

    /**
     * @effects
     *      if this satisfies abstract properties
     *          return true
     *      else
     *          return false
     */
    public boolean repOK(){
        return validateManName(manName) && validateModel(model) && validateYear(year);
    }
}