/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class User 
        implements java.io.Serializable {
    private static final long serialVersionUID = -2256152048229407527L;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private LanguageTypeEnum language;
    private GenderTypeEnum gender;
    private String birthday;
    private String nationality;
    private String nationalIdNumber;
    private String academicTitle;
    private String address;
    private String country;
    private String city;
    private String area;
    private String zipCode;
    private String password;
    /** GETTER
     * First name of the user. Maximum length is 40 characters.
     */
    @JsonGetter("first_name")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * First name of the user. Maximum length is 40 characters.
     */
    @JsonSetter("first_name")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * Last name of the user. Maximum length is 40 characters.
     */
    @JsonGetter("last_name")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Last name of the user. Maximum length is 40 characters.
     */
    @JsonSetter("last_name")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * Mobile phone number of the user It is a unique identifier for users in the system. The format is E.164.
     */
    @JsonGetter("mobile")
    public String getMobile ( ) { 
        return this.mobile;
    }
    
    /** SETTER
     * Mobile phone number of the user It is a unique identifier for users in the system. The format is E.164.
     */
    @JsonSetter("mobile")
    public void setMobile (String value) { 
        this.mobile = value;
    }
 
    /** GETTER
     * Email address of the user.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email address of the user.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * The language of the user. Possible values are 'en' and 'tr'.
     */
    @JsonGetter("language")
    public LanguageTypeEnum getLanguage ( ) { 
        return this.language;
    }
    
    /** SETTER
     * The language of the user. Possible values are 'en' and 'tr'.
     */
    @JsonSetter("language")
    public void setLanguage (LanguageTypeEnum value) { 
        this.language = value;
    }
 
    /** GETTER
     * Gender of the user. The possible values are 'female', 'male' or 'unknown'.
     */
    @JsonGetter("gender")
    public GenderTypeEnum getGender ( ) { 
        return this.gender;
    }
    
    /** SETTER
     * Gender of the user. The possible values are 'female', 'male' or 'unknown'.
     */
    @JsonSetter("gender")
    public void setGender (GenderTypeEnum value) { 
        this.gender = value;
    }
 
    /** GETTER
     * Birthday of the user. The possible values are a date with YYYYMMDD formatted or null.
     */
    @JsonGetter("birthday")
    public String getBirthday ( ) { 
        return this.birthday;
    }
    
    /** SETTER
     * Birthday of the user. The possible values are a date with YYYYMMDD formatted or null.
     */
    @JsonSetter("birthday")
    public void setBirthday (String value) { 
        this.birthday = value;
    }
 
    /** GETTER
     * Nationality
     */
    @JsonGetter("nationality")
    public String getNationality ( ) { 
        return this.nationality;
    }
    
    /** SETTER
     * Nationality
     */
    @JsonSetter("nationality")
    public void setNationality (String value) { 
        this.nationality = value;
    }
 
    /** GETTER
     * National ID Number
     */
    @JsonGetter("national_id_number")
    public String getNationalIdNumber ( ) { 
        return this.nationalIdNumber;
    }
    
    /** SETTER
     * National ID Number
     */
    @JsonSetter("national_id_number")
    public void setNationalIdNumber (String value) { 
        this.nationalIdNumber = value;
    }
 
    /** GETTER
     * Academic Title
     */
    @JsonGetter("academic_title")
    public String getAcademicTitle ( ) { 
        return this.academicTitle;
    }
    
    /** SETTER
     * Academic Title
     */
    @JsonSetter("academic_title")
    public void setAcademicTitle (String value) { 
        this.academicTitle = value;
    }
 
    /** GETTER
     * Address
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
    }
 
    /** GETTER
     * Country
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Country
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * City
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * City
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * State/County/Province/Region
     */
    @JsonGetter("area")
    public String getArea ( ) { 
        return this.area;
    }
    
    /** SETTER
     * State/County/Province/Region
     */
    @JsonSetter("area")
    public void setArea (String value) { 
        this.area = value;
    }
 
    /** GETTER
     * Zip Code
     */
    @JsonGetter("zip_code")
    public String getZipCode ( ) { 
        return this.zipCode;
    }
    
    /** SETTER
     * Zip Code
     */
    @JsonSetter("zip_code")
    public void setZipCode (String value) { 
        this.zipCode = value;
    }
 
    /** GETTER
     * Password
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * Password
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
}
