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
public class PassengerMax 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4762956459564685339L;
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private LanguageTypeEnum language = LanguageTypeEnum.EN;
    private GenderTypeEnum gender;
    private String birthday;
    /** GETTER
     * First name of the passenger. Maximum length is 40 characters.
     */
    @JsonGetter("first_name")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * First name of the passenger. Maximum length is 40 characters.
     */
    @JsonSetter("first_name")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * Last name of the passenger. Maximum length is 40 characters.
     */
    @JsonGetter("last_name")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Last name of the passenger. Maximum length is 40 characters.
     */
    @JsonSetter("last_name")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * Mobile phone number of the passenger. It is a unique identifier for passengers in the system. The format is E.164.
     */
    @JsonGetter("mobile")
    public String getMobile ( ) { 
        return this.mobile;
    }
    
    /** SETTER
     * Mobile phone number of the passenger. It is a unique identifier for passengers in the system. The format is E.164.
     */
    @JsonSetter("mobile")
    public void setMobile (String value) { 
        this.mobile = value;
    }
 
    /** GETTER
     * Email address of the passenger.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email address of the passenger.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * The language of the passenger. Possible values are 'en' and 'tr'. Default value is 'en'.
     */
    @JsonGetter("language")
    public LanguageTypeEnum getLanguage ( ) { 
        return this.language;
    }
    
    /** SETTER
     * The language of the passenger. Possible values are 'en' and 'tr'. Default value is 'en'.
     */
    @JsonSetter("language")
    public void setLanguage (LanguageTypeEnum value) { 
        this.language = value;
    }
 
    /** GETTER
     * Gender of the passenger. The possible values are 'female', 'male' or 'unknown'.
     */
    @JsonGetter("gender")
    public GenderTypeEnum getGender ( ) { 
        return this.gender;
    }
    
    /** SETTER
     * Gender of the passenger. The possible values are 'female', 'male' or 'unknown'.
     */
    @JsonSetter("gender")
    public void setGender (GenderTypeEnum value) { 
        this.gender = value;
    }
 
    /** GETTER
     * Birthday of the passenger. The possible values are a date with YYYYMMDD formatted or null.
     */
    @JsonGetter("birthday")
    public String getBirthday ( ) { 
        return this.birthday;
    }
    
    /** SETTER
     * Birthday of the passenger. The possible values are a date with YYYYMMDD formatted or null.
     */
    @JsonSetter("birthday")
    public void setBirthday (String value) { 
        this.birthday = value;
    }
 
}
