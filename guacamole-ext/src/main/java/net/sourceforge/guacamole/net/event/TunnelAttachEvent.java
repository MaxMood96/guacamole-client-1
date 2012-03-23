package net.sourceforge.guacamole.net.event;

import net.sourceforge.guacamole.net.GuacamoleTunnel;
import net.sourceforge.guacamole.net.auth.Credentials;

/**
 * An event which is triggered whenever a tunnel is being attached to a
 * session. The tunnel being attached can be accessed through getTunnel(),
 * and the set of all credentials available from the request which is
 * attaching the tunnel can be retrieved using getCredentials().
 * 
 * @author Michael Jumper
 */
public class TunnelAttachEvent implements CredentialEvent, TunnelEvent {
    
    /**
     * The credentials associated with the request that is attaching the
     * tunnel, if any.
     */
    private Credentials credentials;

    /**
     * The tunnel being attached.
     */
    private GuacamoleTunnel tunnel;

    /**
     * Creates a new TunnelAttachEvent which represents the attaching of the
     * given tunnel via a request associated with the given credentials.
     * 
     * @param credentials The credentials associated with the request
     *                    attaching the tunnel.
     * @param tunnel The tunnel being attached.
     */
    public TunnelAttachEvent(Credentials credentials, GuacamoleTunnel tunnel) {
        this.credentials = credentials;
        this.tunnel = tunnel;
    }

    @Override
    public Credentials getCredentials() {
        return credentials;
    }

    @Override
    public GuacamoleTunnel getTunnel() {
        return tunnel;
    }

}
