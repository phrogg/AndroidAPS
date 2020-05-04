package info.nightscout.androidaps.plugins.pump.omnipod_dash.comm;

import android.content.Context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import info.nightscout.androidaps.data.DetailedBolusInfo;
import info.nightscout.androidaps.data.Profile;
import info.nightscout.androidaps.data.PumpEnactResult;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.logging.L;
import info.nightscout.androidaps.plugins.pump.common.data.TempBasalPair;
import info.nightscout.androidaps.plugins.pump.common.hw.rileylink.ble.RFSpy;
import info.nightscout.androidaps.plugins.pump.omnipod.comm.message.response.podinfo.PodInfoRecentPulseLog;
import info.nightscout.androidaps.plugins.pump.omnipod.defs.OmnipodCommunicationManagerInterface;
import info.nightscout.androidaps.plugins.pump.omnipod.defs.PodInitActionType;
import info.nightscout.androidaps.plugins.pump.omnipod.defs.PodInitReceiver;
import info.nightscout.androidaps.plugins.pump.omnipod.defs.state.PodSessionState;
import info.nightscout.androidaps.plugins.pump.omnipod.driver.OmnipodPumpStatus;

/**
 * Created by andy on 4.8.2019
 */
// TODO refactor to use dagger, just commented out errors
public class OmnipodDashCommunicationManager implements OmnipodCommunicationManagerInterface {

    // TODO Dagger

    //private static final Logger LOG = LoggerFactory.getLogger(L.PUMPCOMM);

    private AAPSLogger aapsLogger;

    private static OmnipodDashCommunicationManager omnipodCommunicationManager;
    private String errorMessage;


    public OmnipodDashCommunicationManager(Context context, RFSpy rfspy) {
        omnipodCommunicationManager = this;
//        OmnipodUtil.getPumpStatus().previousConnection = SP.getLong(
//                RileyLinkConst.Prefs.LastGoodDeviceCommunicationTime, 0L);
    }


    private PodSessionState getPodSessionState() {
        return null;
    }


    public static OmnipodDashCommunicationManager getInstance() {
        return omnipodCommunicationManager;
    }


    //@Override
    protected void configurePumpSpecificSettings() {
        //pumpStatus = OmnipodUtil.getPumpStatus();
    }


    public String getErrorResponse() {
        return this.errorMessage;
    }



    @Override
    public PumpEnactResult initPod(PodInitActionType podInitActionType, PodInitReceiver podInitReceiver, Profile profile) {
        return null;
    }

    public PumpEnactResult getPodStatus() {
        return null;
    }


    public PumpEnactResult deactivatePod(PodInitReceiver podInitReceiver) {
        return null;
    }

    public PumpEnactResult setBasalProfile(Profile profile) {
        return null;
    }

    public PumpEnactResult resetPodStatus() {
        return null;
    }

    @Override
    public PumpEnactResult setBolus(DetailedBolusInfo detailedBolusInfo) {
        return null;
    }

    public PumpEnactResult setBolus(Double parameter, boolean isSmb) {
        return null;
    }

    public PumpEnactResult cancelBolus() {
        return null;
    }

    public PumpEnactResult setTemporaryBasal(TempBasalPair tbr) {
        return null;
    }

    public PumpEnactResult cancelTemporaryBasal() {
        return null;
    }

    @Override
    public PumpEnactResult acknowledgeAlerts() {
        return null;
    }

    @Override
    public PumpEnactResult setTime() {
        return null;
    }

    @Override
    public void setPumpStatus(OmnipodPumpStatus pumpStatusLocal) {

    }

    @Override
    public PodInfoRecentPulseLog readPulseLog() {
        return null;
    }

}
