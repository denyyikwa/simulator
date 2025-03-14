package routing;

import core.Connection;
import core.DTNHost;
import core.Message;

public class SprayAndWaitDecisonEngine implements RoutingDecisionEngine {

/** identifier for the initial number of copies setting ({@value})*/ 
public static final String NROF_COPIES = "nrofCopies";
/** identifier for the binary-mode setting ({@value})*/ 
public static final String BINARY_MODE = "binaryMode";
/** SprayAndWait router's settings name space ({@value})*/ 
public static final String SPRAYANDWAIT_NS = "SprayAndWaitDecisonEngine";
/** Message property key */
public static final String MSG_COUNT_PROPERTY = SPRAYANDWAIT_NS + "." +
    "copies";

protected int initialNrofCopies;
protected boolean isBinary;

    @Override
    public void connectionUp(DTNHost thisHost, DTNHost peer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectionUp'");
    }

    @Override
    public void connectionDown(DTNHost thisHost, DTNHost peer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectionDown'");
    }

    @Override
    public void doExchangeForNewConnection(Connection con, DTNHost peer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doExchangeForNewConnection'");
    }

    @Override
    public boolean newMessage(Message m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newMessage'");
    }

    @Override
    public boolean isFinalDest(Message m, DTNHost aHost) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFinalDest'");
    }

    @Override
    public boolean shouldSaveReceivedMessage(Message m, DTNHost thisHost) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shouldSaveReceivedMessage'");
    }

    @Override
    public boolean shouldSendMessageToHost(Message m, DTNHost otherHost) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shouldSendMessageToHost'");
    }

    @Override
    public boolean shouldDeleteSentMessage(Message m, DTNHost otherHost) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shouldDeleteSentMessage'");
    }

    @Override
    public boolean shouldDeleteOldMessage(Message m, DTNHost hostReportingOld) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shouldDeleteOldMessage'");
    }

    @Override
    public RoutingDecisionEngine replicate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'replicate'");
    }



   
    
}
