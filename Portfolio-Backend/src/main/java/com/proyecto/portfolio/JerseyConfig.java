/**
 * 
 */
package com.proyecto.portfolio;

/**
 * @author santi
 *
 */
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


import com.proyecto.portfolio.resources.UserResource;


@Component
public class JerseyConfig extends ResourceConfig
{
    public JerseyConfig() 
    {
        register(UserResource.class);

    }
}
