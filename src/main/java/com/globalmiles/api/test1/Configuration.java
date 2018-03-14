/*
 * GlobalMilesAirlineAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.globalmiles.api.test1;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import com.globalmiles.api.test1.models.*;

public class Configuration {
    /**
     * Current API environment
     */
    public static Environments environment = Environments.TEST;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5562448596210505731L;
            {
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.DEFAULT);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = 5352632002803325249L;
        {
            put(Environments.TEST , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5730593006345458598L;
                {
                    put(Servers.DEFAULT, "https://test1.api.globalmiles.com");
                }
            });
        }
    };
}